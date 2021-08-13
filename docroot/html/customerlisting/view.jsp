<%@page import="com.liferay.docs.service.ServicesLocalServiceUtil"%>
<%@ include file="/html/init.jsp" %>

<%
	String redirect = PortalUtil.getCurrentURL(renderRequest);
%>

<aui:button-row>
	<portlet:renderURL var="addCustomerURL">
		<portlet:param name="mvcPath" value="/html/customerlisting/edit_customer.jsp" />
		<portlet:param name="redirect" value="<%= redirect %>" />
	</portlet:renderURL>

	<aui:button onClick="<%= addCustomerURL.toString() %>" value="Add-Customer" />
</aui:button-row>

<liferay-ui:search-container emptyResultsMessage="customer-empty-results-message">
	<liferay-ui:search-container-results
		results="<%= CustomerLocalServiceUtil.getCustomersByGroupId(scopeGroupId, searchContainer.getStart(), searchContainer.getEnd()) %>"
		total="<%= CustomerLocalServiceUtil.getCustomersCountByGroupId(scopeGroupId) %>"
	/>

	<liferay-ui:search-container-row
		className="com.liferay.docs.model.Customer"
		keyProperty="customerId"
		modelVar="customer" escapedModel="<%= true %>"
	>
		<liferay-ui:search-container-column-text
			name="name"
			value="<%= customer.getName() %>"
		/>

		<liferay-ui:search-container-column-text
			name="email"
			property="email"
		/>
		
		<liferay-ui:search-container-column-text
			name="phone"
			property="phone"
		/>

		<%
			String serviceName = "";
			try {
				serviceName = ServicesLocalServiceUtil.getServices
						(customer.getServiceId()).getName();
			} catch (Exception e) {
			}
		%>

		<liferay-ui:search-container-column-text
			name="services"
			value="<%= serviceName %>"
		/>

		

		<liferay-ui:search-container-column-jsp
			align="right"
			path="/html/customerlisting/edit_actions.jsp"
		/>
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>
