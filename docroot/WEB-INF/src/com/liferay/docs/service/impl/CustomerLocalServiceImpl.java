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

package com.liferay.docs.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.liferay.docs.model.Customer;
import com.liferay.docs.service.CustomerLocalServiceUtil;
import com.liferay.docs.service.base.CustomerLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.CalendarFactoryUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the customer local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.docs.service.CustomerLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author ADMIN
 * @see com.liferay.docs.service.base.CustomerLocalServiceBaseImpl
 * @see com.liferay.docs.service.CustomerLocalServiceUtil
 */
public class CustomerLocalServiceImpl extends CustomerLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.liferay.docs.service.CustomerLocalServiceUtil} to access the customer local service.
	 */
	
	public Customer addCustomer(long userId, long groupId, String name, String email, String address, String phone, String passportNo, long serviceId, ServiceContext serviceContext) throws PortalException, SystemException {
		
		System.out.println("Add customer Impl");
		
		 User user = userPersistence.findByPrimaryKey(userId);
		 Date now = new Date();
		 long customerId = counterLocalService.increment(Customer.class.getName());
		 Customer customer = customerPersistence.create(customerId);
		 customer.setName(name);
		 customer.setEmail(email);
		 customer.setAddress(address);
		 customer.setPhone(phone);
		 customer.setPassportNo(passportNo);
		 
		/* Calendar dateCal = CalendarFactoryUtil.getCalendar(user.getTimeZone());
		 dateCal.set(year, month,day,hour, minute);*/
		 
		 customer.setServiceId(serviceId);

		 customer.setGroupId(groupId);
		 customer.setCompanyId(user.getCompanyId());
		 customer.setUserId(user.getUserId());
		 customer.setCreateDate(serviceContext.getCreateDate(now));
		 customer.setModifiedDate(serviceContext.getModifiedDate(now));
		 
		 super.addCustomer(customer);
		 
		 System.out.println("End add customer impl");
		 
		return customer;
		
	}
	
	public Customer deleteCustomer(Customer customer) throws SystemException {
		
		return customerPersistence.remove(customer);
		
	}
	
	public Customer deleteCustomer(long customerId)
		    throws PortalException, SystemException {

		Customer customer = customerPersistence.findByPrimaryKey(customerId);

		    return deleteCustomer(customer);
		}
	
	public Customer getCustomer(long customerId)
		    throws SystemException, PortalException {

		    return customerPersistence.findByPrimaryKey(customerId);
		}
	
	public List<Customer> getCustomersByGroupId(long groupId) throws SystemException {

	    return customerPersistence.findByGroupId(groupId);
	}
	
	public List<Customer> getCustomersByGroupId(long groupId, int start, int end)
		    throws SystemException {

		    return customerPersistence.findByGroupId(groupId, start, end);
		}
	
	public int getCustomersCountByGroupId(long groupId) throws SystemException {

	    return customerPersistence.countByGroupId(groupId);
	}
	
	public Customer updateCustomer(long userId, long customerId, String name, String email, String address, String phone, String passportNo, long serviceId, ServiceContext serviceContext) throws PortalException, SystemException {
		
		User user = userPersistence.findByPrimaryKey(userId);
		Date now = new Date();

		Customer customer = CustomerLocalServiceUtil.fetchCustomer(customerId);
		
		customer.setModifiedDate(serviceContext.getModifiedDate(now));
		 customer.setName(name);
		 customer.setEmail(email);
		 customer.setAddress(address);
		 customer.setPhone(phone);
		 customer.setPassportNo(passportNo);
		 
		 /*Calendar dateCal = CalendarFactoryUtil.getCalendar(
			        user.getTimeZone());
			    dateCal.set(year, month, day, hour, minute);
			    Date date = dateCal.getTime();*/
		
		customer.setServiceId(serviceId);
		
		super.updateCustomer(customer);
		
		return customer;
		
		
	}
}