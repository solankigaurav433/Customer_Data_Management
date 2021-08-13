<%@page import="com.liferay.docs.service.ServicesLocalServiceUtil"%>
<%@ include file="/html/init.jsp" %>

<%
	String redirect = PortalUtil.getCurrentURL(renderRequest);
%>

<aui:button-row>
	<portlet:renderURL var="addServicesURL">
		<portlet:param name="mvcPath" value="/html/serviceslisting/edit_services.jsp" />
		<portlet:param name="redirect" value="<%= redirect %>" />
	</portlet:renderURL>

	<aui:button onClick="<%= addServicesURL.toString() %>" value="Add-Services" />
</aui:button-row>

<%
String displayStyle = GetterUtil.getString(portletPreferences.getValue("displayStyle", StringPool.BLANK));
long displayStyleGroupId = GetterUtil.getLong(portletPreferences.getValue("displayStyleGroupId", null), scopeGroupId);

%>


		<liferay-ui:search-container>
			<liferay-ui:search-container-results
				results="<%= ServicesLocalServiceUtil.getServicessByGroupId(scopeGroupId, searchContainer.getStart(), searchContainer.getEnd()) %>"
				total="<%= ServicesLocalServiceUtil.getServicessCountByGroupId(scopeGroupId) %>"
			/>

			<liferay-ui:search-container-row
				className="com.liferay.docs.model.Services"
				keyProperty="serviceId"
				modelVar="services" escapedModel="<%= true %>"
			>
				<liferay-ui:search-container-column-text
					name="name"
					value="<%= services.getName() %>"
				/>

				<liferay-ui:search-container-column-text
					name="description"
					property="description"
				/>
				
				<liferay-ui:search-container-column-text
					name="price"
					property="price"
				/>

				
				<liferay-ui:search-container-column-jsp
					align="right"
					path="/html/serviceslisting/services_actions.jsp"
				/>
			</liferay-ui:search-container-row>

			<liferay-ui:search-iterator />

		</liferay-ui:search-container>
