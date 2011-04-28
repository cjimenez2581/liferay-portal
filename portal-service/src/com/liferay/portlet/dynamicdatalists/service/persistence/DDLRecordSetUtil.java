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

package com.liferay.portlet.dynamicdatalists.service.persistence;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.dynamicdatalists.model.DDLRecordSet;

import java.util.List;

/**
 * The persistence utility for the d d l record set service. This utility wraps {@link DDLRecordSetPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DDLRecordSetPersistence
 * @see DDLRecordSetPersistenceImpl
 * @generated
 */
public class DDLRecordSetUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(DDLRecordSet ddlRecordSet) {
		getPersistence().clearCache(ddlRecordSet);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<DDLRecordSet> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DDLRecordSet> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DDLRecordSet> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static DDLRecordSet remove(DDLRecordSet ddlRecordSet)
		throws SystemException {
		return getPersistence().remove(ddlRecordSet);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static DDLRecordSet update(DDLRecordSet ddlRecordSet, boolean merge)
		throws SystemException {
		return getPersistence().update(ddlRecordSet, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static DDLRecordSet update(DDLRecordSet ddlRecordSet, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(ddlRecordSet, merge, serviceContext);
	}

	/**
	* Caches the d d l record set in the entity cache if it is enabled.
	*
	* @param ddlRecordSet the d d l record set to cache
	*/
	public static void cacheResult(
		com.liferay.portlet.dynamicdatalists.model.DDLRecordSet ddlRecordSet) {
		getPersistence().cacheResult(ddlRecordSet);
	}

	/**
	* Caches the d d l record sets in the entity cache if it is enabled.
	*
	* @param ddlRecordSets the d d l record sets to cache
	*/
	public static void cacheResult(
		java.util.List<com.liferay.portlet.dynamicdatalists.model.DDLRecordSet> ddlRecordSets) {
		getPersistence().cacheResult(ddlRecordSets);
	}

	/**
	* Creates a new d d l record set with the primary key. Does not add the d d l record set to the database.
	*
	* @param recordSetId the primary key for the new d d l record set
	* @return the new d d l record set
	*/
	public static com.liferay.portlet.dynamicdatalists.model.DDLRecordSet create(
		long recordSetId) {
		return getPersistence().create(recordSetId);
	}

	/**
	* Removes the d d l record set with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param recordSetId the primary key of the d d l record set to remove
	* @return the d d l record set that was removed
	* @throws com.liferay.portlet.dynamicdatalists.NoSuchRecordSetException if a d d l record set with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatalists.model.DDLRecordSet remove(
		long recordSetId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.dynamicdatalists.NoSuchRecordSetException {
		return getPersistence().remove(recordSetId);
	}

	public static com.liferay.portlet.dynamicdatalists.model.DDLRecordSet updateImpl(
		com.liferay.portlet.dynamicdatalists.model.DDLRecordSet ddlRecordSet,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(ddlRecordSet, merge);
	}

	/**
	* Finds the d d l record set with the primary key or throws a {@link com.liferay.portlet.dynamicdatalists.NoSuchRecordSetException} if it could not be found.
	*
	* @param recordSetId the primary key of the d d l record set to find
	* @return the d d l record set
	* @throws com.liferay.portlet.dynamicdatalists.NoSuchRecordSetException if a d d l record set with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatalists.model.DDLRecordSet findByPrimaryKey(
		long recordSetId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.dynamicdatalists.NoSuchRecordSetException {
		return getPersistence().findByPrimaryKey(recordSetId);
	}

	/**
	* Finds the d d l record set with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param recordSetId the primary key of the d d l record set to find
	* @return the d d l record set, or <code>null</code> if a d d l record set with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatalists.model.DDLRecordSet fetchByPrimaryKey(
		long recordSetId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(recordSetId);
	}

	/**
	* Finds all the d d l record sets where uuid = &#63;.
	*
	* @param uuid the uuid to search with
	* @return the matching d d l record sets
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.dynamicdatalists.model.DDLRecordSet> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Finds a range of all the d d l record sets where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param uuid the uuid to search with
	* @param start the lower bound of the range of d d l record sets to return
	* @param end the upper bound of the range of d d l record sets to return (not inclusive)
	* @return the range of matching d d l record sets
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.dynamicdatalists.model.DDLRecordSet> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Finds an ordered range of all the d d l record sets where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param uuid the uuid to search with
	* @param start the lower bound of the range of d d l record sets to return
	* @param end the upper bound of the range of d d l record sets to return (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching d d l record sets
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.dynamicdatalists.model.DDLRecordSet> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Finds the first d d l record set in the ordered set where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param uuid the uuid to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching d d l record set
	* @throws com.liferay.portlet.dynamicdatalists.NoSuchRecordSetException if a matching d d l record set could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatalists.model.DDLRecordSet findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.dynamicdatalists.NoSuchRecordSetException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Finds the last d d l record set in the ordered set where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param uuid the uuid to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching d d l record set
	* @throws com.liferay.portlet.dynamicdatalists.NoSuchRecordSetException if a matching d d l record set could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatalists.model.DDLRecordSet findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.dynamicdatalists.NoSuchRecordSetException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Finds the d d l record sets before and after the current d d l record set in the ordered set where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param recordSetId the primary key of the current d d l record set
	* @param uuid the uuid to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next d d l record set
	* @throws com.liferay.portlet.dynamicdatalists.NoSuchRecordSetException if a d d l record set with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatalists.model.DDLRecordSet[] findByUuid_PrevAndNext(
		long recordSetId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.dynamicdatalists.NoSuchRecordSetException {
		return getPersistence()
				   .findByUuid_PrevAndNext(recordSetId, uuid, orderByComparator);
	}

	/**
	* Finds the d d l record set where uuid = &#63; and groupId = &#63; or throws a {@link com.liferay.portlet.dynamicdatalists.NoSuchRecordSetException} if it could not be found.
	*
	* @param uuid the uuid to search with
	* @param groupId the group ID to search with
	* @return the matching d d l record set
	* @throws com.liferay.portlet.dynamicdatalists.NoSuchRecordSetException if a matching d d l record set could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatalists.model.DDLRecordSet findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.dynamicdatalists.NoSuchRecordSetException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Finds the d d l record set where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid to search with
	* @param groupId the group ID to search with
	* @return the matching d d l record set, or <code>null</code> if a matching d d l record set could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatalists.model.DDLRecordSet fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Finds the d d l record set where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid to search with
	* @param groupId the group ID to search with
	* @return the matching d d l record set, or <code>null</code> if a matching d d l record set could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatalists.model.DDLRecordSet fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Finds all the d d l record sets where groupId = &#63;.
	*
	* @param groupId the group ID to search with
	* @return the matching d d l record sets
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.dynamicdatalists.model.DDLRecordSet> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Finds a range of all the d d l record sets where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group ID to search with
	* @param start the lower bound of the range of d d l record sets to return
	* @param end the upper bound of the range of d d l record sets to return (not inclusive)
	* @return the range of matching d d l record sets
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.dynamicdatalists.model.DDLRecordSet> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Finds an ordered range of all the d d l record sets where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group ID to search with
	* @param start the lower bound of the range of d d l record sets to return
	* @param end the upper bound of the range of d d l record sets to return (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching d d l record sets
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.dynamicdatalists.model.DDLRecordSet> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Finds the first d d l record set in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group ID to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching d d l record set
	* @throws com.liferay.portlet.dynamicdatalists.NoSuchRecordSetException if a matching d d l record set could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatalists.model.DDLRecordSet findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.dynamicdatalists.NoSuchRecordSetException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Finds the last d d l record set in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group ID to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching d d l record set
	* @throws com.liferay.portlet.dynamicdatalists.NoSuchRecordSetException if a matching d d l record set could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatalists.model.DDLRecordSet findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.dynamicdatalists.NoSuchRecordSetException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Finds the d d l record sets before and after the current d d l record set in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param recordSetId the primary key of the current d d l record set
	* @param groupId the group ID to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next d d l record set
	* @throws com.liferay.portlet.dynamicdatalists.NoSuchRecordSetException if a d d l record set with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatalists.model.DDLRecordSet[] findByGroupId_PrevAndNext(
		long recordSetId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.dynamicdatalists.NoSuchRecordSetException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(recordSetId, groupId,
			orderByComparator);
	}

	/**
	* Filters by the user's permissions and finds all the d d l record sets where groupId = &#63;.
	*
	* @param groupId the group ID to search with
	* @return the matching d d l record sets that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.dynamicdatalists.model.DDLRecordSet> filterFindByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByGroupId(groupId);
	}

	/**
	* Filters by the user's permissions and finds a range of all the d d l record sets where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group ID to search with
	* @param start the lower bound of the range of d d l record sets to return
	* @param end the upper bound of the range of d d l record sets to return (not inclusive)
	* @return the range of matching d d l record sets that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.dynamicdatalists.model.DDLRecordSet> filterFindByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByGroupId(groupId, start, end);
	}

	/**
	* Filters by the user's permissions and finds an ordered range of all the d d l record sets where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group ID to search with
	* @param start the lower bound of the range of d d l record sets to return
	* @param end the upper bound of the range of d d l record sets to return (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching d d l record sets that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.dynamicdatalists.model.DDLRecordSet> filterFindByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Filters the d d l record sets before and after the current d d l record set in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param recordSetId the primary key of the current d d l record set
	* @param groupId the group ID to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next d d l record set
	* @throws com.liferay.portlet.dynamicdatalists.NoSuchRecordSetException if a d d l record set with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatalists.model.DDLRecordSet[] filterFindByGroupId_PrevAndNext(
		long recordSetId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.dynamicdatalists.NoSuchRecordSetException {
		return getPersistence()
				   .filterFindByGroupId_PrevAndNext(recordSetId, groupId,
			orderByComparator);
	}

	/**
	* Finds the d d l record set where groupId = &#63; and recordSetKey = &#63; or throws a {@link com.liferay.portlet.dynamicdatalists.NoSuchRecordSetException} if it could not be found.
	*
	* @param groupId the group ID to search with
	* @param recordSetKey the record set key to search with
	* @return the matching d d l record set
	* @throws com.liferay.portlet.dynamicdatalists.NoSuchRecordSetException if a matching d d l record set could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatalists.model.DDLRecordSet findByG_R(
		long groupId, java.lang.String recordSetKey)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.dynamicdatalists.NoSuchRecordSetException {
		return getPersistence().findByG_R(groupId, recordSetKey);
	}

	/**
	* Finds the d d l record set where groupId = &#63; and recordSetKey = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID to search with
	* @param recordSetKey the record set key to search with
	* @return the matching d d l record set, or <code>null</code> if a matching d d l record set could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatalists.model.DDLRecordSet fetchByG_R(
		long groupId, java.lang.String recordSetKey)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByG_R(groupId, recordSetKey);
	}

	/**
	* Finds the d d l record set where groupId = &#63; and recordSetKey = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID to search with
	* @param recordSetKey the record set key to search with
	* @return the matching d d l record set, or <code>null</code> if a matching d d l record set could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatalists.model.DDLRecordSet fetchByG_R(
		long groupId, java.lang.String recordSetKey, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_R(groupId, recordSetKey, retrieveFromCache);
	}

	/**
	* Finds all the d d l record sets.
	*
	* @return the d d l record sets
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.dynamicdatalists.model.DDLRecordSet> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the d d l record sets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of d d l record sets to return
	* @param end the upper bound of the range of d d l record sets to return (not inclusive)
	* @return the range of d d l record sets
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.dynamicdatalists.model.DDLRecordSet> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the d d l record sets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of d d l record sets to return
	* @param end the upper bound of the range of d d l record sets to return (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of d d l record sets
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.dynamicdatalists.model.DDLRecordSet> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the d d l record sets where uuid = &#63; from the database.
	*
	* @param uuid the uuid to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Removes the d d l record set where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid to search with
	* @param groupId the group ID to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.dynamicdatalists.NoSuchRecordSetException {
		getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Removes all the d d l record sets where groupId = &#63; from the database.
	*
	* @param groupId the group ID to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Removes the d d l record set where groupId = &#63; and recordSetKey = &#63; from the database.
	*
	* @param groupId the group ID to search with
	* @param recordSetKey the record set key to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_R(long groupId, java.lang.String recordSetKey)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.dynamicdatalists.NoSuchRecordSetException {
		getPersistence().removeByG_R(groupId, recordSetKey);
	}

	/**
	* Removes all the d d l record sets from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the d d l record sets where uuid = &#63;.
	*
	* @param uuid the uuid to search with
	* @return the number of matching d d l record sets
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Counts all the d d l record sets where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid to search with
	* @param groupId the group ID to search with
	* @return the number of matching d d l record sets
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Counts all the d d l record sets where groupId = &#63;.
	*
	* @param groupId the group ID to search with
	* @return the number of matching d d l record sets
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Filters by the user's permissions and counts all the d d l record sets where groupId = &#63;.
	*
	* @param groupId the group ID to search with
	* @return the number of matching d d l record sets that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterCountByGroupId(groupId);
	}

	/**
	* Counts all the d d l record sets where groupId = &#63; and recordSetKey = &#63;.
	*
	* @param groupId the group ID to search with
	* @param recordSetKey the record set key to search with
	* @return the number of matching d d l record sets
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_R(long groupId, java.lang.String recordSetKey)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_R(groupId, recordSetKey);
	}

	/**
	* Counts all the d d l record sets.
	*
	* @return the number of d d l record sets
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DDLRecordSetPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DDLRecordSetPersistence)PortalBeanLocatorUtil.locate(DDLRecordSetPersistence.class.getName());

			ReferenceRegistry.registerReference(DDLRecordSetUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(DDLRecordSetPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(DDLRecordSetUtil.class,
			"_persistence");
	}

	private static DDLRecordSetPersistence _persistence;
}