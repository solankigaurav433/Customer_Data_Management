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

package com.liferay.docs.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ServicesLocalService}.
 *
 * @author ADMIN
 * @see ServicesLocalService
 * @generated
 */
public class ServicesLocalServiceWrapper implements ServicesLocalService,
	ServiceWrapper<ServicesLocalService> {
	public ServicesLocalServiceWrapper(
		ServicesLocalService servicesLocalService) {
		_servicesLocalService = servicesLocalService;
	}

	/**
	* Adds the services to the database. Also notifies the appropriate model listeners.
	*
	* @param services the services
	* @return the services that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.docs.model.Services addServices(
		com.liferay.docs.model.Services services)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicesLocalService.addServices(services);
	}

	/**
	* Creates a new services with the primary key. Does not add the services to the database.
	*
	* @param serviceId the primary key for the new services
	* @return the new services
	*/
	@Override
	public com.liferay.docs.model.Services createServices(long serviceId) {
		return _servicesLocalService.createServices(serviceId);
	}

	/**
	* Deletes the services with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param serviceId the primary key of the services
	* @return the services that was removed
	* @throws PortalException if a services with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.docs.model.Services deleteServices(long serviceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _servicesLocalService.deleteServices(serviceId);
	}

	/**
	* Deletes the services from the database. Also notifies the appropriate model listeners.
	*
	* @param services the services
	* @return the services that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.docs.model.Services deleteServices(
		com.liferay.docs.model.Services services)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicesLocalService.deleteServices(services);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _servicesLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.model.impl.ServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _servicesLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.model.impl.ServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicesLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicesLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicesLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.liferay.docs.model.Services fetchServices(long serviceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicesLocalService.fetchServices(serviceId);
	}

	/**
	* Returns the services with the matching UUID and company.
	*
	* @param uuid the services's UUID
	* @param companyId the primary key of the company
	* @return the matching services, or <code>null</code> if a matching services could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.docs.model.Services fetchServicesByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicesLocalService.fetchServicesByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the services matching the UUID and group.
	*
	* @param uuid the services's UUID
	* @param groupId the primary key of the group
	* @return the matching services, or <code>null</code> if a matching services could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.docs.model.Services fetchServicesByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicesLocalService.fetchServicesByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the services with the primary key.
	*
	* @param serviceId the primary key of the services
	* @return the services
	* @throws PortalException if a services with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.docs.model.Services getServices(long serviceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _servicesLocalService.getServices(serviceId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _servicesLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the services with the matching UUID and company.
	*
	* @param uuid the services's UUID
	* @param companyId the primary key of the company
	* @return the matching services
	* @throws PortalException if a matching services could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.docs.model.Services getServicesByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _servicesLocalService.getServicesByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the services matching the UUID and group.
	*
	* @param uuid the services's UUID
	* @param groupId the primary key of the group
	* @return the matching services
	* @throws PortalException if a matching services could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.docs.model.Services getServicesByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _servicesLocalService.getServicesByUuidAndGroupId(uuid, groupId);
	}

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
	@Override
	public java.util.List<com.liferay.docs.model.Services> getServiceses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicesLocalService.getServiceses(start, end);
	}

	/**
	* Returns the number of serviceses.
	*
	* @return the number of serviceses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getServicesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicesLocalService.getServicesesCount();
	}

	/**
	* Updates the services in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param services the services
	* @return the services that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.docs.model.Services updateServices(
		com.liferay.docs.model.Services services)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicesLocalService.updateServices(services);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _servicesLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_servicesLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _servicesLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public com.liferay.docs.model.Services addServices(long userId,
		long groupId, java.lang.String name, java.lang.String description,
		java.lang.String price,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _servicesLocalService.addServices(userId, groupId, name,
			description, price, serviceContext);
	}

	@Override
	public java.util.List<com.liferay.docs.model.Services> getServicessByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicesLocalService.getServicessByGroupId(groupId);
	}

	@Override
	public java.util.List<com.liferay.docs.model.Services> getServicessByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicesLocalService.getServicessByGroupId(groupId, start, end);
	}

	@Override
	public int getServicessCountByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicesLocalService.getServicessCountByGroupId(groupId);
	}

	@Override
	public com.liferay.docs.model.Services updateServices(long userId,
		long serviceId, java.lang.String name, java.lang.String description,
		java.lang.String price,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _servicesLocalService.updateServices(userId, serviceId, name,
			description, price, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ServicesLocalService getWrappedServicesLocalService() {
		return _servicesLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedServicesLocalService(
		ServicesLocalService servicesLocalService) {
		_servicesLocalService = servicesLocalService;
	}

	@Override
	public ServicesLocalService getWrappedService() {
		return _servicesLocalService;
	}

	@Override
	public void setWrappedService(ServicesLocalService servicesLocalService) {
		_servicesLocalService = servicesLocalService;
	}

	private ServicesLocalService _servicesLocalService;
}