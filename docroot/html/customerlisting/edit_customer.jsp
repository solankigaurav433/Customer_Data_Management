<%@page import="com.liferay.docs.service.ServicesLocalServiceUtil"%>
<%@page import="java.util.List"%>
<%@ include file="/html/init.jsp" %>

<%
	Customer customer = null;
	long customerId = ParamUtil.getLong(request, "customerId");
	if (customerId > 0) {
		customer = CustomerLocalServiceUtil.getCustomer(customerId);
	}
	List<Services> servicess = ServicesLocalServiceUtil.getServicessByGroupId(scopeGroupId);
	String redirect = ParamUtil.getString(request, "redirect");
%>

<aui:model-context bean="<%= customer %>" model="<%= Customer.class %>" />
<portlet:renderURL var="viewCustomerURL" />
<portlet:actionURL name='<%= customer == null ? "addCustomer" : "updateCustomer" %>' var="editCustomerURL" windowState="normal" />

<liferay-ui:header
	backURL="<%= viewCustomerURL %>"
	title='<%= (customer != null) ? customer.getName() : "new-customer" %>'
/>

<aui:form action="<%= editCustomerURL %>" method="POST" name="fm">
	<aui:fieldset>
		<aui:input name="redirect" type="hidden" value="<%= redirect %>" />

		<aui:input name="customerId" type="hidden" value='<%= customer == null ? "" : customer.getCustomerId() %>'/>

		<aui:input name="name" />

		<aui:input name="email" />
		
		<aui:input name="address" />
		
		<aui:input name="phone" />
		
		<aui:input name="passportNo" />

		<aui:select label="Services" name="serviceId" showEmptyOption="<%= true %>">

	 		<%
				for (Services services : servicess) {
			%>

			<aui:option selected="<%= customer != null && services.getServiceId() == customer.getServiceId() %>" value="<%= services.getServiceId() %>"><%=services.getName() %></aui:option>

			<%
				}
			%>

		</aui:select>		

	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit" />

		<aui:button onClick="<%= viewCustomerURL %>"  type="cancel" />
	</aui:button-row>
</aui:form>