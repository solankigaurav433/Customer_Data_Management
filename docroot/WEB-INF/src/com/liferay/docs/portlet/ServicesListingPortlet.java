package com.liferay.docs.portlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.docs.model.Services;
import com.liferay.docs.service.ServicesLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class ServicesListingPortlet
 */
public class ServicesListingPortlet extends MVCPortlet {
	
	public void addServices(ActionRequest request, ActionResponse response)
            throws Exception {

        _updateServices(request);

        sendRedirect(request, response);
    }
	
	 public void deleteServices(ActionRequest request, ActionResponse response)throws Exception {

		 long serviceId = ParamUtil.getLong(request, "serviceId");

	     ServicesLocalServiceUtil.deleteServices(serviceId);

	     sendRedirect(request, response);
	}

	public void updateServices(ActionRequest request, ActionResponse response) throws Exception {

		 _updateServices(request);
      
		 sendRedirect(request, response);
    }
	
	private Services _updateServices(ActionRequest request) throws PortalException, SystemException {
		
		long serviceId = (ParamUtil.getLong(request, "serviceId"));
		 String name = (ParamUtil.getString(request, "name"));
	     String description = (ParamUtil.getString(request, "description"));
	     String price = (ParamUtil.getString(request, "price"));
	     
	     ServiceContext serviceContext = ServiceContextFactory.getInstance(
	                Services.class.getName(), request);

	     Services services = null;

	        if (serviceId <= 0) {

	        	services = ServicesLocalServiceUtil.addServices(
	                serviceContext.getUserId(), serviceContext.getScopeGroupId(), name, description,
	                price, serviceContext);
	        }
	        else {
	        	services = ServicesLocalServiceUtil.getServices(serviceId);

	        	services = ServicesLocalServiceUtil.updateServices(
	                    serviceContext.getUserId(), serviceId, name,
	                    description, price,
	                    serviceContext);
	        }
	        return services;
		
	}
	private static Log _log = LogFactoryUtil.getLog(ServicesListingPortlet.class);

}
