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

import java.util.Date;
import java.util.List;

import com.liferay.docs.model.Services;
import com.liferay.docs.service.base.ServicesLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the services local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.docs.service.ServicesLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author ADMIN
 * @see com.liferay.docs.service.base.ServicesLocalServiceBaseImpl
 * @see com.liferay.docs.service.ServicesLocalServiceUtil
 */
public class ServicesLocalServiceImpl extends ServicesLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.liferay.docs.service.ServicesLocalServiceUtil} to access the services local service.
	 */
	
	public Services addServices(long userId, long groupId, String name, String description, String price, ServiceContext serviceContext) throws PortalException, SystemException {
		
		 User user = userPersistence.findByPrimaryKey(userId);

		    Date now = new Date();

		    long serviceId =
		        counterLocalService.increment(Services.class.getName());

		    Services services = servicesPersistence.create(serviceId);
		    
		    services.setName(name);
		    services.setDescription(description);
		    services.setPrice(price);
		    
		    services.setGroupId(groupId);
		    services.setCompanyId(user.getCompanyId());
		    services.setUserId(user.getUserId());
		    services.setCreateDate(serviceContext.getCreateDate(now));
		    services.setModifiedDate(serviceContext.getModifiedDate(now));

		    super.addServices(services);
		    return services;	
	}
	
	public Services deleteServices(Services services) throws SystemException {
		
		return servicesPersistence.remove(services);
		
	}
	
	public Services deleteServices(long serviceId)
		    throws PortalException, SystemException {

		Services services = servicesPersistence.fetchByPrimaryKey(serviceId);

		    return deleteServices(services);
	}
	
	public List<Services> getServicessByGroupId(long groupId)
		    throws SystemException {

		    return servicesPersistence.findByGroupId(groupId);
	}
	
	public List<Services> getServicessByGroupId(long groupId, int start, int end) throws SystemException {

	    return servicesPersistence.findByGroupId(groupId, start, end);
	}
	
	public int getServicessCountByGroupId(long groupId) throws SystemException {

	    return servicesPersistence.countByGroupId(groupId);
	}
	
	public Services updateServices(long userId, long serviceId, String name, String description, String price, ServiceContext serviceContext) throws PortalException, SystemException {
		User user = userPersistence.findByPrimaryKey(userId);

	    Date now = new Date();

	    Services services = servicesPersistence.findByPrimaryKey(serviceId);
	    
	    services.setName(name);
	    services.setDescription(description);
	    services.setPrice(price);
	    
	    services.setModifiedDate(serviceContext.getModifiedDate(now));
	    
	    super.updateServices(services);
	    
		return services;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}