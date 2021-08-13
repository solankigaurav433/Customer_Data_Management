package com.liferay.docs.portlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.docs.model.Customer;
import com.liferay.docs.service.CustomerLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class CustomerListingPortlet
 */
public class CustomerListingPortlet extends MVCPortlet {
 
	public void addCustomer(ActionRequest request, ActionResponse response) throws Exception {
		
		_updateCustomer(request);
		
		sendRedirect(request, response);
		
	}
	
	public void deleteCustomer(ActionRequest request, ActionResponse response)
	        throws Exception {

	        long customerId = ParamUtil.getLong(request, "customerId");

	        CustomerLocalServiceUtil.deleteCustomer(customerId);

	        sendRedirect(request, response);
   }
	
	public void updateCustomer(ActionRequest request, ActionResponse response)
	        throws Exception {

	        _updateCustomer(request);

	        sendRedirect(request, response);	
	}
	
	private Customer _updateCustomer(ActionRequest request) throws PortalException, SystemException {
		
		long customerId = ParamUtil.getLong(request, "customerId");
		String name = ParamUtil.getString(request, "name");
		String email = ParamUtil.getString(request, "email");
		String address = ParamUtil.getString(request, "address");
		String phone = ParamUtil.getString(request, "phone");
		String passportNo = ParamUtil.getString(request, "passportNo");
		long serviceId = ParamUtil.getLong(request, "serviceId");
		
		ServiceContext serviceContext = ServiceContextFactory.getInstance(Customer.class.getName(), request);
		
		Customer customer = null;
		
		if (customerId <= 0) {
			System.out.println("Add Customer");
			customer = CustomerLocalServiceUtil.addCustomer(serviceContext.getUserId(), serviceContext.getScopeGroupId(),name, email, address, phone, passportNo, serviceId, serviceContext);
			
		}
		else {
			System.out.println("Update Customer");
			customer = CustomerLocalServiceUtil.getCustomer(customerId);
			
			customer = CustomerLocalServiceUtil.updateCustomer(serviceContext.getUserId(), customerId, name, email, address, phone, passportNo, serviceId, serviceContext);
		}
		
		return customer;
		
	}
	 private static Log _log = LogFactoryUtil.getLog(CustomerListingPortlet.class);

}
