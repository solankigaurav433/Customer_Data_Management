<%@ include file="/html/init.jsp" %>

<%
	ResultRow row = (ResultRow) request
			.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	Customer customer = (Customer) row.getObject();
	long groupId = customer.getGroupId();
	String name = Customer.class.getName();
	long customerId = customer.getCustomerId();
	String redirect = PortalUtil.getCurrentURL(renderRequest);
%>

<liferay-ui:icon-menu>
	<portlet:renderURL var="editURL">
		<portlet:param name="mvcPath" value="/html/customerlisting/edit_customer.jsp" />
		<portlet:param name="customerId" value="<%= String.valueOf(customerId) %>" />
		<portlet:param name="redirect" value="<%= redirect %>" />
	</portlet:renderURL>

	<liferay-ui:icon image="edit" url="<%= editURL.toString() %>" />

	<portlet:actionURL name="deleteCustomer" var="deleteURL">
		<portlet:param name="customerId" value="<%= String.valueOf(customerId) %>" />
		<portlet:param name="redirect" value="<%= redirect %>" />
	</portlet:actionURL>

	<liferay-ui:icon-delete url="<%= deleteURL.toString() %>" />
</liferay-ui:icon-menu>