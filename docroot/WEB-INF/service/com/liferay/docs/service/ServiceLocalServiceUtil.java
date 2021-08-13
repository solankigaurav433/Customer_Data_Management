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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Service. This utility wraps
 * {@link com.liferay.docs.service.impl.ServiceLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author ADMIN
 * @see ServiceLocalService
 * @see com.liferay.docs.service.base.ServiceLocalServiceBaseImpl
 * @see com.liferay.docs.service.impl.ServiceLocalServiceImpl
 * @generated
 */
public class ServiceLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.docs.service.impl.ServiceLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the service to the database. Also notifies the appropriate model listeners.
	*
	* @param service the service
	* @return the service that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.model.Service addService(
		com.liferay.docs.model.Service service)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addService(service);
	}

	/**
	* Creates a new service with the primary key. Does not add the service to the database.
	*
	* @param serviceId the primary key for the new service
	* @return the new service
	*/
	public static com.liferay.docs.model.Service createService(long serviceId) {
		return getService().createService(serviceId);
	}

	/**
	* Deletes the service with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param serviceId the primary key of the service
	* @return the service that was removed
	* @throws PortalException if a service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.model.Service deleteService(long serviceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteService(serviceId);
	}

	/**
	* Deletes the service from the database. Also notifies the appropriate model listeners.
	*
	* @param service the service
	* @return the service that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.model.Service deleteService(
		com.liferay.docs.model.Service service)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteService(service);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.model.impl.ServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.model.impl.ServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.liferay.docs.model.Service fetchService(long serviceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchService(serviceId);
	}

	/**
	* Returns the service with the matching UUID and company.
	*
	* @param uuid the service's UUID
	* @param companyId the primary key of the company
	* @return the matching service, or <code>null</code> if a matching service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.model.Service fetchServiceByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchServiceByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the service matching the UUID and group.
	*
	* @param uuid the service's UUID
	* @param groupId the primary key of the group
	* @return the matching service, or <code>null</code> if a matching service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.model.Service fetchServiceByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchServiceByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the service with the matching UUID and company.
	*
	* @param uuid the service's UUID
	* @param companyId the primary key of the company
	* @return the matching service
	* @throws PortalException if a matching service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.model.Service getServiceByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getServiceByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the service matching the UUID and group.
	*
	* @param uuid the service's UUID
	* @param groupId the primary key of the group
	* @return the matching service
	* @throws PortalException if a matching service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.model.Service getServiceByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getServiceByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the services.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.model.impl.ServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of services
	* @param end the upper bound of the range of services (not inclusive)
	* @return the range of services
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.docs.model.Service> getServices(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getServices(start, end);
	}

	/**
	* Returns the number of services.
	*
	* @return the number of services
	* @throws SystemException if a system exception occurred
	*/
	public static int getServicesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getServicesCount();
	}

	/**
	* Updates the service in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param service the service
	* @return the service that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.model.Service updateService(
		com.liferay.docs.model.Service service)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateService(service);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void clearService() {
		_service = null;
	}

	public static ServiceLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					ServiceLocalService.class.getName());

			if (invokableLocalService instanceof ServiceLocalService) {
				_service = (ServiceLocalService)invokableLocalService;
			}
			else {
				_service = new ServiceLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(ServiceLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(ServiceLocalService service) {
	}

	private static ServiceLocalService _service;
}