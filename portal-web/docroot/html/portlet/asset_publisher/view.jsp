<%--
/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
--%>

<%@ include file="/html/portlet/asset_publisher/init.jsp" %>

<%
AssetEntryQuery assetEntryQuery = new AssetEntryQuery();

long[] allAssetCategoryIds = new long[0];
String[] allAssetTagNames = new String[0];

if (selectionStyle.equals("dynamic")) {
	if (!ArrayUtil.contains(groupIds, scopeGroupId)) {
		assetEntryQuery = AssetPublisherUtil.getAssetEntryQuery(portletPreferences, ArrayUtil.append(groupIds, scopeGroupId));
	}
	else {
		assetEntryQuery = AssetPublisherUtil.getAssetEntryQuery(portletPreferences, groupIds);
	}

	allAssetTagNames = AssetPublisherUtil.getAssetTagNames(portletPreferences, scopeGroupId);

	assetEntryQuery.setClassTypeIds(classTypeIds);

	boolean subtypeFieldsFilterEnabled = GetterUtil.getBoolean(portletPreferences.getValue("subtypeFieldsFilterEnabled", Boolean.FALSE.toString()));

	if (subtypeFieldsFilterEnabled && (classNameIds.length == 1) && (classTypeIds.length == 1)) {
		AssetRendererFactory assetRendererFactory = AssetRendererFactoryRegistryUtil.getAssetRendererFactoryByClassName(PortalUtil.getClassName(classNameIds[0]));

		String ddmStructureFieldName = GetterUtil.getString(portletPreferences.getValue("ddmStructureFieldName", StringPool.BLANK));
		Serializable ddmStructureFieldValue = portletPreferences.getValue("ddmStructureFieldValue", StringPool.BLANK);

		if (Validator.isNotNull(ddmStructureFieldName) && Validator.isNotNull(ddmStructureFieldValue)) {
			Tuple classTypeFieldName = assetRendererFactory.getClassTypeFieldNames(classTypeIds[0], ddmStructureFieldName, locale);

			long ddmStructureId = GetterUtil.getLong(classTypeFieldName.getObject(3));

			assetEntryQuery.setAttribute("ddmStructureFieldName", DDMIndexerUtil.encodeName(ddmStructureId, ddmStructureFieldName, locale));
			assetEntryQuery.setAttribute("ddmStructureFieldValue", ddmStructureFieldValue);
		}
	}

	AssetPublisherUtil.processAssetEntryQuery(user, portletPreferences, assetEntryQuery);
}

long assetCategoryId = ParamUtil.getLong(request, "categoryId");

if (assetCategoryId > 0) {
	if (selectionStyle.equals("dynamic")) {
		allAssetCategoryIds = assetEntryQuery.getAllCategoryIds();

		if (!ArrayUtil.contains(allAssetCategoryIds, assetCategoryId)) {
			assetEntryQuery.setAllCategoryIds(ArrayUtil.append(allAssetCategoryIds, assetCategoryId));
		}
	}
	else if (selectionStyle.equals("manual")) {
		allAssetCategoryIds = ArrayUtil.append(allAssetCategoryIds, assetCategoryId);
	}

	AssetCategory assetCategory = AssetCategoryLocalServiceUtil.getCategory(assetCategoryId);

	assetCategory = assetCategory.toEscapedModel();

	PortalUtil.setPageKeywords(assetCategory.getTitle(locale), request);
}

String assetTagName = ParamUtil.getString(request, "tag");

if (Validator.isNotNull(assetTagName)) {
	long[] assetTagIds = AssetTagLocalServiceUtil.getTagIds(groupIds, allAssetTagNames);

	assetEntryQuery.setAnyTagIds(assetTagIds);

	PortalUtil.setPageKeywords(assetTagName, request);
}

if (showOnlyLayoutAssets) {
	assetEntryQuery.setLayout(layout);
}

if (portletName.equals(PortletKeys.RELATED_ASSETS)) {
	AssetEntry layoutAssetEntry = (AssetEntry)request.getAttribute(WebKeys.LAYOUT_ASSET_ENTRY);

	if (layoutAssetEntry != null) {
		assetEntryQuery.setLinkedAssetEntryId(layoutAssetEntry.getEntryId());
	}
}

assetEntryQuery.setPaginationType(paginationType);
assetEntryQuery.setEnablePermissions(AssetUtil.isEnablePermissions(portletPreferences, portletName));

if (mergeUrlTags || mergeLayoutTags) {
	String[] compilerTagNames = new String[0];

	if (mergeUrlTags) {
		compilerTagNames = ParamUtil.getParameterValues(request, "tags");
	}

	if (mergeLayoutTags) {
		Set<String> layoutTagNames = AssetUtil.getLayoutTagNames(request);

		if (!layoutTagNames.isEmpty()) {
			compilerTagNames = ArrayUtil.append(compilerTagNames, layoutTagNames.toArray(new String[layoutTagNames.size()]));
		}
	}

	String titleEntry = null;

	if (ArrayUtil.isNotEmpty(compilerTagNames)) {
		String[] newAssetTagNames = ArrayUtil.append(allAssetTagNames, compilerTagNames);

		allAssetTagNames = ArrayUtil.distinct(newAssetTagNames, new StringComparator());

		long[] allAssetTagIds = AssetTagLocalServiceUtil.getTagIds(scopeGroupId, allAssetTagNames);

		assetEntryQuery.setAllTagIds(allAssetTagIds);

		titleEntry = compilerTagNames[compilerTagNames.length - 1];
	}

	String portletTitle = HtmlUtil.unescape(portletDisplay.getTitle());

	portletTitle = AssetUtil.substituteTagPropertyVariables(scopeGroupId, titleEntry, portletTitle);

	renderResponse.setTitle(portletTitle);
}
else {
	allAssetTagNames = ArrayUtil.distinct(allAssetTagNames, new StringComparator());
}

for (String curAssetTagName : allAssetTagNames) {
	try {
		AssetTag assetTag = AssetTagLocalServiceUtil.getTag(scopeGroupId, curAssetTagName);

		AssetTagProperty journalTemplateIdProperty = AssetTagPropertyLocalServiceUtil.getTagProperty(assetTag.getTagId(), "journal-template-id");

		String journalTemplateId = journalTemplateIdProperty.getValue();

		request.setAttribute(WebKeys.JOURNAL_TEMPLATE_ID, journalTemplateId);

		break;
	}
	catch (NoSuchTagException nste) {
	}
	catch (NoSuchTagPropertyException nstpe) {
	}
}

if (enableTagBasedNavigation && selectionStyle.equals("manual") && ((allAssetCategoryIds.length > 0) || (allAssetTagNames.length > 0))) {
	selectionStyle = "dynamic";
}

Group scopeGroup = themeDisplay.getScopeGroup();

Map<String, PortletURL> addPortletURLs = null;
%>

<c:if test="<%= showAddContentButton && (scopeGroup != null) && (!scopeGroup.hasStagingGroup() || scopeGroup.isStagingGroup()) && !portletName.equals(PortletKeys.HIGHEST_RATED_ASSETS) && !portletName.equals(PortletKeys.MOST_VIEWED_ASSETS) && !portletName.equals(PortletKeys.RELATED_ASSETS) %>">

	<%
	boolean defaultAssetPublisher = AssetUtil.isDefaultAssetPublisher(layout, portletDisplay.getId(), portletResource);

	addPortletURLs = AssetUtil.getAddPortletURLs(liferayPortletRequest, liferayPortletResponse, classNameIds, classTypeIds, allAssetCategoryIds, allAssetTagNames, null);

	for (long groupId : groupIds) {
	%>

		<div class="lfr-meta-actions add-asset-selector">
			<%@ include file="/html/portlet/asset_publisher/add_asset.jspf" %>
		</div>

	<%
	}
	%>

</c:if>

<div class="subscribe-action">
	<c:if test="<%= !portletName.equals(PortletKeys.HIGHEST_RATED_ASSETS) && !portletName.equals(PortletKeys.MOST_VIEWED_ASSETS) && !portletName.equals(PortletKeys.RECENT_CONTENT) && !portletName.equals(PortletKeys.RELATED_ASSETS) && PortletPermissionUtil.contains(permissionChecker, plid, portletDisplay.getId(), ActionKeys.SUBSCRIBE) && AssetPublisherUtil.getEmailAssetEntryAddedEnabled(portletPreferences) %>">
		<c:choose>
			<c:when test="<%= AssetPublisherUtil.isSubscribed(themeDisplay.getCompanyId(), user.getUserId(), themeDisplay.getPlid(), portletDisplay.getId()) %>">
				<portlet:actionURL var="unsubscribeURL">
					<portlet:param name="struts_action" value="/asset_publisher/edit_subscription" />
					<portlet:param name="<%= Constants.CMD %>" value="<%= Constants.UNSUBSCRIBE %>" />
					<portlet:param name="redirect" value="<%= currentURL %>" />
				</portlet:actionURL>

				<liferay-ui:icon
					image="unsubscribe"
					label="<%= true %>"
					url="<%= unsubscribeURL %>"
				/>
			</c:when>
			<c:otherwise>
				<portlet:actionURL var="subscribeURL">
					<portlet:param name="struts_action" value="/asset_publisher/edit_subscription" />
					<portlet:param name="<%= Constants.CMD %>" value="<%= Constants.SUBSCRIBE %>" />
					<portlet:param name="redirect" value="<%= currentURL %>" />
				</portlet:actionURL>

				<liferay-ui:icon
					image="subscribe"
					label="<%= true %>"
					url="<%= subscribeURL %>"
				/>
			</c:otherwise>
		</c:choose>
	</c:if>

	<%
	boolean enableRSS = !PortalUtil.isRSSFeedsEnabled() ? false : GetterUtil.getBoolean(portletPreferences.getValue("enableRss", null));
	%>

	<c:if test="<%= enableRSS %>">
		<liferay-portlet:resourceURL varImpl="rssURL">
			<portlet:param name="struts_action" value="/asset_publisher/rss" />
		</liferay-portlet:resourceURL>

		<liferay-ui:rss resourceURL="<%= rssURL %>" />
	</c:if>
</div>

<%
PortletURL portletURL = renderResponse.createRenderURL();

SearchContainer searchContainer = new SearchContainer(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, delta, portletURL, null, null);

if (!paginationType.equals("none")) {
	searchContainer.setDelta(delta);
	searchContainer.setDeltaConfigurable(false);
}
%>

<c:if test="<%= showMetadataDescriptions %>">
	<liferay-ui:categorization-filter
		assetType="content"
		portletURL="<%= portletURL %>"
	/>
</c:if>

<%
long portletDisplayDDMTemplateId = PortletDisplayTemplateUtil.getPortletDisplayTemplateDDMTemplateId(displayStyleGroupId, displayStyle);

Map<String, Object> contextObjects = new HashMap<String, Object>();

contextObjects.put(PortletDisplayTemplateConstants.ASSET_PUBLISHER_HELPER, AssetPublisherHelperUtil.getAssetPublisherHelper());

String assetLinkBehavior = GetterUtil.getString(portletPreferences.getValue("assetLinkBehavior", "showFullContent"));

request.setAttribute("view.jsp-viewInContext", new Boolean(assetLinkBehavior.equals("viewInPortlet")));
%>

<c:choose>
	<c:when test='<%= selectionStyle.equals("dynamic") %>'>
		<%@ include file="/html/portlet/asset_publisher/view_dynamic_list.jspf" %>
	</c:when>
	<c:when test='<%= selectionStyle.equals("manual") %>'>
		<%@ include file="/html/portlet/asset_publisher/view_manual.jspf" %>
	</c:when>
</c:choose>

<c:if test='<%= !paginationType.equals("none") && (searchContainer.getTotal() > searchContainer.getResults().size()) %>'>
	<liferay-ui:search-paginator searchContainer="<%= searchContainer %>" type="<%= paginationType %>" />
</c:if>

<%!
private static Log _log = LogFactoryUtil.getLog("portal-web.docroot.html.portlet.asset_publisher.view_jsp");
%>