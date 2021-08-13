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

package com.liferay.docs.service.persistence;

import com.liferay.docs.model.Services;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the services service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ADMIN
 * @see ServicesPersistenceImpl
 * @see ServicesUtil
 * @generated
 */
public interface ServicesPersistence extends BasePersistence<Services> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ServicesUtil} to access the services persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the serviceses where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching serviceses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.docs.model.Services> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the serviceses where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.model.impl.ServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of serviceses
	* @param end the upper bound of the range of serviceses (not inclusive)
	* @return the range of matching serviceses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.docs.model.Services> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the serviceses where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.model.impl.ServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of serviceses
	* @param end the upper bound of the range of serviceses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching serviceses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.docs.model.Services> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first services in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching services
	* @throws com.liferay.docs.NoSuchServicesException if a matching services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.model.Services findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.docs.NoSuchServicesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first services in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching services, or <code>null</code> if a matching services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.model.Services fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last services in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching services
	* @throws com.liferay.docs.NoSuchServicesException if a matching services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.model.Services findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.docs.NoSuchServicesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last services in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching services, or <code>null</code> if a matching services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.model.Services fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the serviceses before and after the current services in the ordered set where uuid = &#63;.
	*
	* @param serviceId the primary key of the current services
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next services
	* @throws com.liferay.docs.NoSuchServicesException if a services with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.model.Services[] findByUuid_PrevAndNext(
		long serviceId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.docs.NoSuchServicesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the serviceses where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of serviceses where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching serviceses
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the services where uuid = &#63; and groupId = &#63; or throws a {@link com.liferay.docs.NoSuchServicesException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching services
	* @throws com.liferay.docs.NoSuchServicesException if a matching services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.model.Services findByUUID_G(java.lang.String uuid,
		long groupId)
		throws com.liferay.docs.NoSuchServicesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the services where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching services, or <code>null</code> if a matching services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.model.Services fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the services where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching services, or <code>null</code> if a matching services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.model.Services fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the services where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the services that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.model.Services removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.docs.NoSuchServicesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of serviceses where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching serviceses
	* @throws SystemException if a system exception occurred
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the serviceses where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching serviceses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.docs.model.Services> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the serviceses where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.model.impl.ServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of serviceses
	* @param end the upper bound of the range of serviceses (not inclusive)
	* @return the range of matching serviceses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.docs.model.Services> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the serviceses where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.model.impl.ServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of serviceses
	* @param end the upper bound of the range of serviceses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching serviceses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.docs.model.Services> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first services in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching services
	* @throws com.liferay.docs.NoSuchServicesException if a matching services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.model.Services findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.docs.NoSuchServicesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first services in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching services, or <code>null</code> if a matching services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.model.Services fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last services in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching services
	* @throws com.liferay.docs.NoSuchServicesException if a matching services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.model.Services findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.docs.NoSuchServicesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last services in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching services, or <code>null</code> if a matching services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.model.Services fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the serviceses before and after the current services in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param serviceId the primary key of the current services
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next services
	* @throws com.liferay.docs.NoSuchServicesException if a services with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.model.Services[] findByUuid_C_PrevAndNext(
		long serviceId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.docs.NoSuchServicesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the serviceses where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of serviceses where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching serviceses
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the serviceses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching serviceses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.docs.model.Services> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the serviceses where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.model.impl.ServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of serviceses
	* @param end the upper bound of the range of serviceses (not inclusive)
	* @return the range of matching serviceses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.docs.model.Services> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the serviceses where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.model.impl.ServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of serviceses
	* @param end the upper bound of the range of serviceses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching serviceses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.docs.model.Services> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first services in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching services
	* @throws com.liferay.docs.NoSuchServicesException if a matching services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.model.Services findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.docs.NoSuchServicesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first services in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching services, or <code>null</code> if a matching services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.model.Services fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last services in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching services
	* @throws com.liferay.docs.NoSuchServicesException if a matching services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.model.Services findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.docs.NoSuchServicesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last services in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching services, or <code>null</code> if a matching services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.model.Services fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the serviceses before and after the current services in the ordered set where groupId = &#63;.
	*
	* @param serviceId the primary key of the current services
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next services
	* @throws com.liferay.docs.NoSuchServicesException if a services with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.model.Services[] findByGroupId_PrevAndNext(
		long serviceId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.docs.NoSuchServicesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the serviceses where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of serviceses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching serviceses
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the services in the entity cache if it is enabled.
	*
	* @param services the services
	*/
	public void cacheResult(com.liferay.docs.model.Services services);

	/**
	* Caches the serviceses in the entity cache if it is enabled.
	*
	* @param serviceses the serviceses
	*/
	public void cacheResult(
		java.util.List<com.liferay.docs.model.Services> serviceses);

	/**
	* Creates a new services with the primary key. Does not add the services to the database.
	*
	* @param serviceId the primary key for the new services
	* @return the new services
	*/
	public com.liferay.docs.model.Services create(long serviceId);

	/**
	* Removes the services with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param serviceId the primary key of the services
	* @return the services that was removed
	* @throws com.liferay.docs.NoSuchServicesException if a services with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.model.Services remove(long serviceId)
		throws com.liferay.docs.NoSuchServicesException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.docs.model.Services updateImpl(
		com.liferay.docs.model.Services services)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the services with the primary key or throws a {@link com.liferay.docs.NoSuchServicesException} if it could not be found.
	*
	* @param serviceId the primary key of the services
	* @return the services
	* @throws com.liferay.docs.NoSuchServicesException if a services with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.model.Services findByPrimaryKey(long serviceId)
		throws com.liferay.docs.NoSuchServicesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the services with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param serviceId the primary key of the services
	* @return the services, or <code>null</code> if a services with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.model.Services fetchByPrimaryKey(long serviceId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the serviceses.
	*
	* @return the serviceses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.docs.model.Services> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the serviceses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.model.impl.ServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of serviceses
	* @param end the upper bound of the range of serviceses (not inclusive)
	* @return the range of serviceses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.docs.model.Services> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the serviceses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.model.impl.ServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of serviceses
	* @param end the upper bound of the range of serviceses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of serviceses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.docs.model.Services> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the serviceses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of serviceses.
	*
	* @return the number of serviceses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}