<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>

<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.model.PortletPreferences"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>

<%@page import="com.tc.poc.dms.model.DmsPoc"%>
<%@page import="com.tc.poc.dms.service.DmsPocLocalServiceUtil" %>

<%@page import="com.liferay.portal.kernel.servlet.SessionErrors" %>

 <%@page import="java.text.DateFormat"%>
<%@page import ="java.text.SimpleDateFormat"%>
<%@page import=" java.util.Date;"%>

<liferay-theme:defineObjects />

<portlet:defineObjects />

<portlet:resourceURL var="resourceUrl"></portlet:resourceURL>