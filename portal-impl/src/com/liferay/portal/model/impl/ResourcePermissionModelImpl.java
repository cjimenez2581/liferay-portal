/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
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

package com.liferay.portal.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.ResourcePermission;
import com.liferay.portal.model.ResourcePermissionModel;
import com.liferay.portal.model.ResourcePermissionSoap;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.ArrayList;
import java.util.List;

/**
 * The base model implementation for the ResourcePermission service. Represents a row in the &quot;ResourcePermission&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.portal.model.ResourcePermissionModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ResourcePermissionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ResourcePermissionImpl
 * @see com.liferay.portal.model.ResourcePermission
 * @see com.liferay.portal.model.ResourcePermissionModel
 * @generated
 */
public class ResourcePermissionModelImpl extends BaseModelImpl<ResourcePermission>
	implements ResourcePermissionModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a resource permission model instance should use the {@link com.liferay.portal.model.ResourcePermission} interface instead.
	 */
	public static final String TABLE_NAME = "ResourcePermission";
	public static final Object[][] TABLE_COLUMNS = {
			{ "resourcePermissionId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "name", Types.VARCHAR },
			{ "scope", Types.INTEGER },
			{ "primKey", Types.VARCHAR },
			{ "roleId", Types.BIGINT },
			{ "ownerId", Types.BIGINT },
			{ "actionIds", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table ResourcePermission (resourcePermissionId LONG not null primary key,companyId LONG,name VARCHAR(255) null,scope INTEGER,primKey VARCHAR(255) null,roleId LONG,ownerId LONG,actionIds LONG)";
	public static final String TABLE_SQL_DROP = "drop table ResourcePermission";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.entity.cache.enabled.com.liferay.portal.model.ResourcePermission"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.finder.cache.enabled.com.liferay.portal.model.ResourcePermission"),
			true);

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static ResourcePermission toModel(ResourcePermissionSoap soapModel) {
		ResourcePermission model = new ResourcePermissionImpl();

		model.setResourcePermissionId(soapModel.getResourcePermissionId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setName(soapModel.getName());
		model.setScope(soapModel.getScope());
		model.setPrimKey(soapModel.getPrimKey());
		model.setRoleId(soapModel.getRoleId());
		model.setOwnerId(soapModel.getOwnerId());
		model.setActionIds(soapModel.getActionIds());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<ResourcePermission> toModels(
		ResourcePermissionSoap[] soapModels) {
		List<ResourcePermission> models = new ArrayList<ResourcePermission>(soapModels.length);

		for (ResourcePermissionSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public Class<?> getModelClass() {
		return ResourcePermission.class;
	}

	public String getModelClassName() {
		return ResourcePermission.class.getName();
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.portal.util.PropsUtil.get(
				"lock.expiration.time.com.liferay.portal.model.ResourcePermission"));

	public ResourcePermissionModelImpl() {
	}

	public long getPrimaryKey() {
		return _resourcePermissionId;
	}

	public void setPrimaryKey(long pk) {
		setResourcePermissionId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_resourcePermissionId);
	}

	public long getResourcePermissionId() {
		return _resourcePermissionId;
	}

	public void setResourcePermissionId(long resourcePermissionId) {
		_resourcePermissionId = resourcePermissionId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	public void setName(String name) {
		if (_originalName == null) {
			_originalName = _name;
		}

		_name = name;
	}

	public String getOriginalName() {
		return GetterUtil.getString(_originalName);
	}

	public int getScope() {
		return _scope;
	}

	public void setScope(int scope) {
		if (!_setOriginalScope) {
			_setOriginalScope = true;

			_originalScope = _scope;
		}

		_scope = scope;
	}

	public int getOriginalScope() {
		return _originalScope;
	}

	public String getPrimKey() {
		if (_primKey == null) {
			return StringPool.BLANK;
		}
		else {
			return _primKey;
		}
	}

	public void setPrimKey(String primKey) {
		if (_originalPrimKey == null) {
			_originalPrimKey = _primKey;
		}

		_primKey = primKey;
	}

	public String getOriginalPrimKey() {
		return GetterUtil.getString(_originalPrimKey);
	}

	public long getRoleId() {
		return _roleId;
	}

	public void setRoleId(long roleId) {
		if (!_setOriginalRoleId) {
			_setOriginalRoleId = true;

			_originalRoleId = _roleId;
		}

		_roleId = roleId;
	}

	public long getOriginalRoleId() {
		return _originalRoleId;
	}

	public long getOwnerId() {
		return _ownerId;
	}

	public void setOwnerId(long ownerId) {
		if (!_setOriginalOwnerId) {
			_setOriginalOwnerId = true;

			_originalOwnerId = _ownerId;
		}

		_ownerId = ownerId;
	}

	public long getOriginalOwnerId() {
		return _originalOwnerId;
	}

	public long getActionIds() {
		return _actionIds;
	}

	public void setActionIds(long actionIds) {
		if (!_setOriginalActionIds) {
			_setOriginalActionIds = true;

			_originalActionIds = _actionIds;
		}

		_actionIds = actionIds;
	}

	public long getOriginalActionIds() {
		return _originalActionIds;
	}

	public ResourcePermission toEscapedModel() {
		if (isEscapedModel()) {
			return (ResourcePermission)this;
		}
		else {
			return (ResourcePermission)Proxy.newProxyInstance(ResourcePermission.class.getClassLoader(),
				new Class[] { ResourcePermission.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
					ResourcePermission.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	public Object clone() {
		ResourcePermissionImpl resourcePermissionImpl = new ResourcePermissionImpl();

		resourcePermissionImpl.setResourcePermissionId(getResourcePermissionId());
		resourcePermissionImpl.setCompanyId(getCompanyId());
		resourcePermissionImpl.setName(getName());
		resourcePermissionImpl.setScope(getScope());
		resourcePermissionImpl.setPrimKey(getPrimKey());
		resourcePermissionImpl.setRoleId(getRoleId());
		resourcePermissionImpl.setOwnerId(getOwnerId());
		resourcePermissionImpl.setActionIds(getActionIds());

		resourcePermissionImpl.resetOriginalValues();

		return resourcePermissionImpl;
	}

	public int compareTo(ResourcePermission resourcePermission) {
		long pk = resourcePermission.getPrimaryKey();

		if (getPrimaryKey() < pk) {
			return -1;
		}
		else if (getPrimaryKey() > pk) {
			return 1;
		}
		else {
			return 0;
		}
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		ResourcePermission resourcePermission = null;

		try {
			resourcePermission = (ResourcePermission)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = resourcePermission.getPrimaryKey();

		if (getPrimaryKey() == pk) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (int)getPrimaryKey();
	}

	public void resetOriginalValues() {
		ResourcePermissionModelImpl resourcePermissionModelImpl = this;

		resourcePermissionModelImpl._originalCompanyId = resourcePermissionModelImpl._companyId;

		resourcePermissionModelImpl._setOriginalCompanyId = false;

		resourcePermissionModelImpl._originalName = resourcePermissionModelImpl._name;

		resourcePermissionModelImpl._originalScope = resourcePermissionModelImpl._scope;

		resourcePermissionModelImpl._setOriginalScope = false;

		resourcePermissionModelImpl._originalPrimKey = resourcePermissionModelImpl._primKey;

		resourcePermissionModelImpl._originalRoleId = resourcePermissionModelImpl._roleId;

		resourcePermissionModelImpl._setOriginalRoleId = false;

		resourcePermissionModelImpl._originalOwnerId = resourcePermissionModelImpl._ownerId;

		resourcePermissionModelImpl._setOriginalOwnerId = false;

		resourcePermissionModelImpl._originalActionIds = resourcePermissionModelImpl._actionIds;

		resourcePermissionModelImpl._setOriginalActionIds = false;
	}

	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{resourcePermissionId=");
		sb.append(getResourcePermissionId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", scope=");
		sb.append(getScope());
		sb.append(", primKey=");
		sb.append(getPrimKey());
		sb.append(", roleId=");
		sb.append(getRoleId());
		sb.append(", ownerId=");
		sb.append(getOwnerId());
		sb.append(", actionIds=");
		sb.append(getActionIds());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.liferay.portal.model.ResourcePermission");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>resourcePermissionId</column-name><column-value><![CDATA[");
		sb.append(getResourcePermissionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>scope</column-name><column-value><![CDATA[");
		sb.append(getScope());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>primKey</column-name><column-value><![CDATA[");
		sb.append(getPrimKey());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>roleId</column-name><column-value><![CDATA[");
		sb.append(getRoleId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ownerId</column-name><column-value><![CDATA[");
		sb.append(getOwnerId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>actionIds</column-name><column-value><![CDATA[");
		sb.append(getActionIds());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _resourcePermissionId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private String _name;
	private String _originalName;
	private int _scope;
	private int _originalScope;
	private boolean _setOriginalScope;
	private String _primKey;
	private String _originalPrimKey;
	private long _roleId;
	private long _originalRoleId;
	private boolean _setOriginalRoleId;
	private long _ownerId;
	private long _originalOwnerId;
	private boolean _setOriginalOwnerId;
	private long _actionIds;
	private long _originalActionIds;
	private boolean _setOriginalActionIds;
	private transient ExpandoBridge _expandoBridge;
}