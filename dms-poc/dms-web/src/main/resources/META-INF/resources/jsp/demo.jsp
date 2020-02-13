<%@ include file="../init.jsp"%>
<%@ include file="../common.jspf" %>

<div name="<portlet:namespace/>enterRegNoAndVIN" id="<portlet:namespace/>enterRegNoAndVIN">
	Reg no : <input type="text" name="regNo" id="regNo" />
	
	VIN : <input type="text" name="vin" id="vin" />
	
	<input type="submit" value="Submit" onclick='getRegNoVINRecord()' />
</div>

<div name="<portlet:namespace/>enterYourJobCardDetails" id="<portlet:namespace/>enterYourJobCardDetails"></div>