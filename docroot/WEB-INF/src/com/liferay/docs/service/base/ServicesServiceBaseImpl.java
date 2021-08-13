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

package com.liferay.docs.service.base;

import com.liferay.docs.model.Services;
import com.liferay.docs.service.ServicesService;
import com.liferay.docs.service.persistence.CustomerPersistence;
import com.liferay.docs.service.persistence.ServicesPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the services remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.docs.service.impl.ServicesServiceImpl}.
 * </p>
 *
 * @author ADMIN
 * @see com.liferay.docs.service.impl.ServicesServiceImpl
 * @see com.liferay.docs.service.ServicesServiceUtil
 * @generated
 */
public abstract class ServicesServiceBaseImpl extends BaseServiceImpl
	implements ServicesService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.liferay.docs.service.ServicesServiceUtil} to access the services remote service.
	 */

	/**
	 * Returns the customer local service.
	 *
	 * @return the customer local service
	 */
	public com.liferay.docs.service.CustomerLocalService getCustomerLocalService() {
		return customerLocalService;
	}

	/**
	 * Sets the customer local service.
	 *
	 * @param customerLocalService the customer local service
	 */
	public void setCustomerLocalService(
		com.liferay.docs.service.CustomerLocalService customerLocalService) {
		this.customerLocalService = customerLocalService;
	}

	/**
	 * Returns the customer remote service.
	 *
	 * @return the customer remote service
	 */
	public com.liferay.docs.service.CustomerService getCustomerService() {
		return customerService;
	}

	/**
	 * Sets the customer remote service.
	 *
	 * @param customerService the customer remote service
	 */
	public void setCustomerService(
		com.liferay.docs.service.CustomerService customerService) {
		this.customerService = customerService;
	}

	/**
	 * Returns the customer persistence.
	 *
	 * @return the customer persistence
	 */
	public CustomerPersistence getCustomerPersistence() {
		return customerPersistence;
	}

	/**
	 * Sets the customer persistence.
	 *
	 * @param customerPersistence the customer persistence
	 */
	public void setCustomerPersistence(CustomerPersistence customerPersistence) {
		this.customerPersistence = customerPersistence;
	}

	/**
	 * Returns the services local service.
	 *
	 * @return the services local service
	 */
	public com.liferay.docs.service.ServicesLocalService getServicesLocalService() {
		return servicesLocalService;
	}

	/**
	 * Sets the services local service.
	 *
	 * @param servicesLocalService the services local service
	 */
	public void setServicesLocalService(
		com.liferay.docs.service.ServicesLocalService servicesLocalService) {
		this.servicesLocalService = servicesLocalService;
	}

	/**
	 * Returns the services remote service.
	 *
	 * @return the services remote service
	 */
	public com.liferay.docs.service.ServicesService getServicesService() {
		return servicesService;
	}

	/**
	 * Sets the services remote service.
	 *
	 * @param servicesService the services remote service
	 */
	public void setServicesService(
		com.liferay.docs.service.ServicesService servicesService) {
		this.servicesService = servicesService;
	}

	/**
	 * Returns the services persistence.
	 *
	 * @return the services persistence
	 */
	public ServicesPersistence getServicesPersistence() {
		return servicesPersistence;
	}

	/**
	 * Sets the services persistence.
	 *
	 * @param servicesPersistence the services persistence
	 */
	public void setServicesPersistence(ServicesPersistence servicesPersistence) {
		this.servicesPersistence = servicesPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return Services.class;
	}

	protected String getModelClassName() {
		return Services.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = servicesPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.liferay.docs.service.CustomerLocalService.class)
	protected com.liferay.docs.service.CustomerLocalService customerLocalService;
	@BeanReference(type = com.liferay.docs.service.CustomerService.class)
	protected com.liferay.docs.service.CustomerService customerService;
	@BeanReference(type = CustomerPersistence.class)
	protected CustomerPersistence customerPersistence;
	@BeanReference(type = com.liferay.docs.service.ServicesLocalService.class)
	protected com.liferay.docs.service.ServicesLocalService servicesLocalService;
	@BeanReference(type = com.liferay.docs.service.ServicesService.class)
	protected com.liferay.docs.service.ServicesService servicesService;
	@BeanReference(type = ServicesPersistence.class)
	protected ServicesPersistence servicesPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private ServicesServiceClpInvoker _clpInvoker = new ServicesServiceClpInvoker();
}