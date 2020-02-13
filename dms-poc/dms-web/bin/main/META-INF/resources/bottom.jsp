<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.kernel.util.LocaleThreadLocal"%>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/ConfirmBoxStyle.css?t=13579147" type="text/css" />
<script src='<%=request.getContextPath()%>/js/confirm-box.js?t=150248'></script>
<div class="cd-popup" id="confirmBox" role="alert" style="display:none;">
	<div class="cd-popup-container">
		<p id="confirmMsg"></p>
		<ul class="cd-buttons" style="padding-left: 0px;">
			<li><a href="#" id="okButton"><liferay-ui:message key="yes" /></a></li>
			<li><a href="#" id="noButton"><liferay-ui:message key="no" /></a></li>
		</ul>
		<a href="#0" class="cd-popup-close img-replace">Close</a>
	</div> <!-- cd-popup-container -->
</div> <!-- cd-popup -->
					
					
<!-- for ok box						 -->
 <div class="cd-popup" id="okBox" role="alert" style="display:none;">
	<div class="cd-popup-container">
		<p id="okMsg"></p>
		<ul class="cd-buttons" style="padding-left: 0px;">
			<li style="width:100%"><a href="#0" style="background-color: #337ab7;" id="confirmButton"><%= LanguageUtil.get(LocaleThreadLocal.getThemeDisplayLocale(), "ok", "Ok") %></a></li>
		</ul>
	</div> <!-- cd-popup-container -->
</div> <!-- cd-popup -->

