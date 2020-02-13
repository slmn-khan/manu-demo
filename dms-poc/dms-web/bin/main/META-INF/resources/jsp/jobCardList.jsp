
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="../init.jsp"%>

<%
	PortletURL portletURL = renderResponse.createRenderURL();
%>
<liferay-ui:search-container delta="<%=5%>"
	headerNames="Reg No, Dealer Code, VIN, Repair Order No, Vihicle Model"
	iteratorURL="<%=portletURL%>">

	<liferay-ui:search-container-results>
		<%
			results = DmsVwPocLocalServiceUtil.getDmsVwPocs(-1, -1);
					total = DmsVwPocLocalServiceUtil.getDmsVwPocsCount();
					pageContext.setAttribute("results", results);
					pageContext.setAttribute("total", total);
		%>
	</liferay-ui:search-container-results>

	<liferay-ui:search-container-row className="DmsVwPoc"
		escapedModel="<%=true%>" keyProperty="id" modelVar="curUser"
		indexVar="indexNumber">
		<liferay-ui:search-container-column-text name="Reg No"
			property="regNo" />
		<liferay-ui:search-container-column-text name="Dealer Code"
			property="dealerCode" />
		<liferay-ui:search-container-column-text name="VIN" property="VIN" />
		<liferay-ui:search-container-column-text name="Repair Order No"
			property="repairOrderNo" />
		<liferay-ui:search-container-column-text name="Vihicle Model"
			property="model" />
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />

</liferay-ui:search-container>