
<%@ include file="../init.jsp"%>
<%@ include file="../common.jspf" %>
<style type="text/css">
 #elementInOneLine {
    display:inline-block;

} 
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}
</style>
<%
	DmsPoc dmsPoc = (DmsPoc)resourceRequest.getAttribute("dmsPoc");
   
%>
<div name="jobCardDetails" id="jobCardDetails">
 <div>
 	<div><img src="/documents/106732/0/volkswagen.jpg/1462a7a8-19c1-bbc2-37f3-b3c1d5281dc4?t=1559718051738" /></div>
 	<div>
 		<h2>company name</h2>
 		<p>Narsingh Pur Industrial Area</p>
 		<p>6km Mile Stone, NH8, Gurgaon, 122002 Haryana</p>
 		<p> Tel : 01234567890</p>
 		<p> Fax : 01234567890</p>
 		<p> infoaftersales@audigurgaon.in</p>
 	</div>
 	<div><img src="/documents/106732/0/volkswagen.jpg/1462a7a8-19c1-bbc2-37f3-b3c1d5281dc4?t=1559718051738" /></div>
 
 </div>
  
 <div>
 	<h2>Repair Order</h2>System.out.println();

	<table border=1px; style="width:90%; margin-left:50px; margin-top:50px;">
	  <tr>
	    <td align="lift">Repair Order No: <%=dmsPoc.getRepairOrderNo() %> </td>
	    <td align="right">Regn. No: <%=dmsPoc.getRegNo() %> </td>
	    <td align="lift">Date in: <%= (new java.util.Date()).toLocaleString() %> </td>
	  </tr>
	  <tr>
	    <td>Customer Name: <%=dmsPoc.getCustomerName() %> </td>
	    <td>VIN: <%=dmsPoc.getVIN() %> </td>
	    <td>Time in: <%= (new java.util.Date()).toLocaleString() %> </td>
	  </tr>
	  <tr>
	    <td>Address: <%=dmsPoc.getCustomerAddress() %> </td>
	    <td>Date of Delivery:  <%=dmsPoc.getDateOfDelivery() %></td>
	    <td>Service Advisor: <%=dmsPoc.getServiceAdvisor() %> </td>
	  </tr>
	  <tr>
	    <td>Mobile Number: <%=dmsPoc.getCustomerMobileNo() %> </td>
	    <td>KMs in: <%=dmsPoc.getKmsIn() %> </td>
	    <td>SA Mobile Number: <%=dmsPoc.getServiceAdvisorMobileNo() %> </td>
	  </tr>
	  <tr>
	    <td>Email Address: <%=dmsPoc.getCustomerEmailAddress() %> </td>
	    <td>Colour Code:  </td>
	    <td>Sold By Dealer: <%=dmsPoc.getSoldByDealer() %> </td>
	  </tr>
	  <tr>
	    <td>Alternate Contact Person: <%=dmsPoc.getContactPerson() %> </td>
	    <td>Model: <%=dmsPoc.getModel() %> </td>
	    <td>Mobility Service: <%=dmsPoc.getCustomerMobilityType() %> </td>
	  </tr>
	</table>
 </div>
 
 <div> Customer Order Description : <%=dmsPoc.getCustomerOrderDescription() %></div>
 
<div>
	<% int count = 0; 
		int loopCount = 4;
		
	%>	
	<table border=1px; style="width:90%; margin-left:50px; margin-top:50px;" id="customerVoice">
		<tr>
			<th>Demanded Repair(Customer Voice)</th>			
			<th>Work to be done(Based on Customer Voice)</th>	
			<th></th>		
		</tr>
		<% for(int i =1 ; i<loopCount; i++){ %>
		<tr border=0px;>
			<td border=0px;>
				<%=dmsPoc.getInstruction()%>
			</td>
			<td>
				<%=dmsPoc.getWorkToBeDone() %>
			</td>
			<td><input type="button" value="Add" onclick='getCustomerVoice(<%=i %>)'/></td>
		</tr>
		<%} %>		
	</table>	
</div>

<div id="elementInOneLine" style="width:90%; margin-left:50px; margin-top:20px; margin-bottom:30px; border:1px;" >
	<h2>Inventory </h2> <br />
	
	<div><img src="/documents/106732/0/volkswagen.jpg/1462a7a8-19c1-bbc2-37f3-b3c1d5281dc4?t=1559718051738" /></div>
	
	<div>
		<table>
			<tr>
				<td style="width:50%;">xDent : <%=dmsPoc.getXDent()%> </td>
				<td style="width:50%;"></td>
			</tr>
			<tr>
				<td style="width:50%;">Scratch : <%=dmsPoc.getScratch()%> </td>
				<td style="width:50%;"></td>
			</tr>
			<tr>
				<td style="width:50%;">Body Damage : <%=dmsPoc.getBodyDamage() %> </td>
				<td style="width:50%;">F/R: <%=dmsPoc.getFrontRight() %></td>
			</tr>
			<tr>
				<td style="width:50%;"></td>
				<td style="width:50%;">F/L:<%=dmsPoc.getFrontLeft() %> </td>
			</tr>
			<tr>
				<td style="width:50%;"></td>
				<td style="width:50%;">R/R:<%=dmsPoc.getRearRight() %> </td>
			</tr>
			<tr>
				<td style="width:50%;"></td>
				<td style="width:50%;">R/L:<%=dmsPoc.getRearLeft() %></td>
			</tr>
			<tr><td><h3>Direct Reception</h3></td><td></td></tr>
			<tr>
				<td>Windows Glazing : <input type="radio" name="windowsGlazing" value="ok"> Ok <input type="radio" name="windowsGlazing" value="notOk"> Not Ok </td>
				<td>Oil Level : <input type="radio" name="oilLevel" value="ok"> Ok <input type="radio" name="oilLevel" value="notOk"> Not Ok </td>
			</tr>
			<tr>
				<td>Wiper blades : <input type="radio" name="wiperBlades" value="ok"> Ok <input type="radio" name="wiperBlades" value="notOk"> Not Ok</td>
				<td>Coolant : <input type="radio" name="coolant" value="ok"> Ok <input type="radio" name="coolant" value="notOk"> Not Ok </td>
			</tr>
			<tr>
				<td>Lights : <input type="radio" name="lights" value="ok"> Ok <input type="radio" name="lights" value="notOk"> Not Ok </td>
				<td>Windshild Washer : <input type="radio" name="windshildWasher" value="ok"> Ok <input type="radio" name="windowsGlazing" value="notOk"> Not Ok</td>
			</tr>			
			<tr>
				<td>Exhoust System : <input type="radio" name="exhoustSystem" value="ok"> Ok <input type="radio" name="exhoustSystem" value="notOk"> Not Ok</td>
				<td>Breks : <input type="radio" name="breks" value="ok"> Ok <input type="radio" name="breks" value="notOk"> Not Ok</td>
			</tr>
			<tr>
				<td>Underbody : <input type="radio" name="underbody" value="ok"> Ok <input type="radio" name="underbody" value="notOk"> Not Ok</td>
				<td>Axle : <input type="radio" name="axle" value="ok"> Ok <input type="radio" name="axle" value="notOk"> Not Ok</td>
			</tr>
			<tr>
				<td>Engin Compartment : <input type="radio" name="enginCompartment" value="ok"> Ok <input type="radio" name="enginCompartment" value="notOk"> Not Ok</td>
				<td>Monograms : <input type="radio" name="monograms" value="ok"> Ok <input type="radio" name="monograms" value="notOk"> Not Ok</td>
			</tr>
			<tr>
				<td>Washing : <input type="radio" name="washing" value="ok"> Yes <input type="radio" name="washing" value="notOk"> No</td>
				<td>Polishing : <input type="radio" name="polishing" value="ok"> Yes <input type="radio" name="polishing" value="notOk"> No</td>
			</tr>
			
		</table>
	</div>
	
	<div>
		<table>
			<tr><td>Fule : <input type="radio" name="fule" value="ok"> Yes <input type="radio" name="fule" value="notOk"> No</td></tr>
			<tr><td>Owner Manual : <input type="checkbox" name="ownerManual" /></td></tr>
			<tr><td>Maintenance Manuals : <input type="checkbox" name="maintenanceManuals" /></td></tr>
			<tr><td>Infotainment MMI : <input type="checkbox" name="infotainmentMMI" /></td></tr>
			<tr><td>Ext. Warranty Book : <input type="checkbox" name="extWarrantyBook" /></td></tr>
			<tr><td>Quick Reference Guide : <input type="checkbox" name="quickReferenceGuide" /></td></tr>
			<tr><td>Tool Kit : <input type="checkbox" name="toolKit" /></td></tr>
			<tr><td>Floor Mats : <input type="checkbox" name="floorMats" /></td></tr>
			<tr><td>Mud Flaps : <input type="checkbox" name="mudFlaps" /></td></tr>
			<tr><td>Warning Triangle : <input type="checkbox" name="warningTriangle" /></td></tr>
			<tr><td>First Aid Kit : <input type="checkbox" name="firstAidKit" /></td></tr>
			<tr><td>CDs : <input type="checkbox" name="cd" /></td></tr>
			<tr><td>No Of Keys : <input type="checkbox" name="noOfKeys" /></td></tr>
			<tr><td>Other LooseI tems : <input type="checkbox" name="otherLooseItems" /></td></tr>
			
		</table>
	</div>
	
</div> 

<div id="partSection">	
	<!-- <input type="button" value="Add Row" onclick="addRow('parts')" />

	<input type="button" value="Delete Row" onclick="deleteRow('dataTable')" /> -->
	
	<table id="parts"  style="width:90%; margin-left:50px; margin-top:50px; border:1px;" >
		<tr>			
			<td>part Number</td>
			<td>description</td>
			<td>category</td>
			<td>internalPartsOrder</td>
			<td>quantity</td>
			<td>rate</td>
			<td>cost</td>			
		</tr>
		<tr border=0px;>
					
			<td border=0px;>
				<input style="width:100%" type="text" name="<portlet:namespace/>partNumber" id="<portlet:namespace/>partNumber" />
			</td>
			<td>
				<input style="width:100%" type="text" name="<portlet:namespace/>description" id="<portlet:namespace/>description" />
			</td>
			<td>
				<input style="width:100%" type="text" name="<portlet:namespace/>category" id="<portlet:namespace/>category" />
			</td>
			<td>
				<input style="width:100%" type="text" name="<portlet:namespace/>internalPartsOrder" id="<portlet:namespace/>internalPartsOrder" />
			</td>
			<td>
				<input style="width:100%" type="text" name="<portlet:namespace/>quantity" id="<portlet:namespace/>quantity" />
			</td>
			<td>
				<input style="width:100%" type="text" name="<portlet:namespace/>rate" id="<portlet:namespace/>rate" />
			</td>
			<td>
				<input style="width:100%" type="text" name="<portlet:namespace/>cost" id="<portlet:namespace/>cost" />
			</td>
			
		</tr>
			
	</table>	
</div>

</div><!-- <td><input type="button" value="getParts" onclick='getParts()'/></td> -->

<div name="<portlet:namespace/>viewJobCard" id="<portlet:namespace/>viewJobCard"></div>

<div style="width:90%; margin-left:700px; margin-top:20px; margin-bottom:30px;" name="<portlet:namespace/>print" id="<portlet:namespace/>print">  >
	<input type="submit" value="Submit" onclick='submitData()'/>
</div>

