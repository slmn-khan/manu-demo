
<%@ include file="../init.jsp"%>
<%@ include file="../common.jspf" %>

<link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css" type="text/css" />


<script src="<%=request.getContextPath()%>/js/jquery-ui.js" type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/js/jquery.nicescroll.min.js" type="text/javascript"></script>


<style>

.di-re p {
	display: inline-block;
	margin-right: 50px;
	min-width: 300px;
}
.di-re p > span:last-child {
	color: #077CAE;
	margin-left: 10px;
}

.dr-top .col-md-12 > p, .dr-top .col-md-12 > div {
	display: inline-block;
}
.dr-top .col-md-12 > div {
	min-width: 120px;
}
.dr-top .progress {
	margin-bottom: 0;
	margin-left: 10px;
	height: 2px;
}

.in-li p {
	display: inline-block;
	color: #0099DA;
	min-width: 170px;
}
.in-li p .container1 {
	font-size: 14px;
	font-weight: 400;
	padding-left: 21px;
	padding-bottom: 0;
}
.in-li p .container1 .checkmark {
	top: 3px;
	left: 0;
	border-color: #0099DA;
}
.in-li p .container1:hover input ~ .checkmark, .in-li p .container1 input:checked ~ .checkmark {
	background-color: #0099DA;
}
.in-li .form-control {
	color: rgba(0, 153, 218, 1);
	font-size: 14px;
}
.kbw-signature { width: 400px; height: 200px; }
</style>
<style type="text/css">
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
 #elementInOneLine {
    display:inline-block;

} 
.control-label-custom {
    text-align: left !important; 
    padding-right: 16px !important;
    padding-top: 10px !important;
    color: #0099DA;
    font-weight: 300;
}
.panel-group.pmd-accordion .panel > .panel-heading a {
    font-weight: bold;
}

.pmd-textfield .form-control {
    border: none!important;
    border-bottom: 1px solid rgba(0, 153, 218, .5)!important;
}
.padding-top-default{
padding-top: 12px;
}


.inventory-car-image{
	max-width: 70%; 
	display: block; 
	margin: 0 auto
}
@media(min-width:576px) and (max-width:767px) {
	.inventory-car-image{
		max-width: 100%; 
		display: block; 
		margin: 0 auto
	}
}
@media(max-width:575px) {
	.inventory-car-image{
		max-width: 100%; 
		display: block; 
		margin: 0 auto
	}
}

@media(max-width:480px) {
	.inventory-car-image{
		max-width: 100%; 
		display: block; 
		margin: 0 auto
	}
}
.containerFuel {
	display: block;
	position: relative;
	padding-left: 27px;
	margin-bottom: 0;
	cursor: pointer;
	font-size: 14px;
	-webkit-user-select: none;
	-moz-user-select: none;
	-ms-user-select: none;
	user-select: none;
	font-weight: 400;
}

/* Hide the browser's default radio button */
.containerFuel input {
	position: absolute;
	opacity: 0;
	cursor: pointer;
}

/* Create a custom radio button */
.containerFuel .checkmark {
	position: absolute;
	top: 1px;
	left: 0;
	height: 17px;
	width: 17px;
	background-color: transparent;
	border-radius: 50%;
	border: 2px solid #2196F3;
}

/* On mouse-over, add a grey background color */
.containerFuel:hover input ~ .checkmark {
	background-color: #fafafa;
}

/* When the radio button is checked, add a blue background */
.containerFuel input:checked ~ .checkmark {
	background-color: transparent;
}

/* Create the indicator (the dot/circle - hidden when not checked) */
.containerFuel .checkmark:after {
	content: "";
	position: absolute;
	display: none;
}

/* Show the indicator (dot/circle) when checked */
.containerFuel input:checked ~ .checkmark:after {
	display: block;
}

/* Style the indicator (dot/circle) */
.containerFuel .checkmark:after, .container3:hover .checkmark:after {
	top: 3px;
	left: 3px;
	width: 7px;
	height: 7px;
	border-radius: 50%;
	background: #2196F3;
}
.txt-sty .inline-textbox{
	display: inline-block !important;
}

/* .job-ini .panel-body .txt-sty > span:first-child {
	width : 50%;
}
 */
 .job-ini .panel-body .txt-sty  {
	height: 30px;
}
.job-ini .panel-body .txt-sty .row > span:first-child {
	color: #0099DA;
	font-weight: 300;
	min-width: 80px;
	display: inline-block;
	vertical-align: top;
	margin-right: 10px;
}
.job-ini .panel-body .txt-sty .row > span:last-child {
	color: #077CAE;
	font-weight: 400;
	display: inline-block;
}




</style>
<%
	DmsPoc dmsPoc = (DmsPoc)resourceRequest.getAttribute("dmsPoc");
%>


<div class="" style="">
 		<a href="" onclick="backToListContainer();" class="btn "><i class="fas fa-arrow-left" style="padding-right:8px;"></i>Back</a>
</div>
<input type="hidden" value="<%=dmsPoc.getId() %>" id="dmsPocId" />
<section class="res-box inp padding-top-default" >
<div class="container-fluid">
	<div class="row">
		<div class="col-md-12 job-ini">
			<!-- Propeller Accordion example -->
			<!-- Customer & Vehicle Information -->
			<div class="panel-group pmd-accordion" id="accordion7" role="tablist" aria-multiselectable="true" > 
						<div class="panel panel-default"> 
							<div class="panel-heading" role="tab" id="headingOne">
								<h4 class="panel-title"> 
									<a data-toggle="collapse" data-parent="#accordion7" href="#collapseOne7" aria-expanded="true" aria-controls="collapseOne7" data-expandable="false">Customer & Vehicle Information <i class="material-icons md-dark pmd-sm pmd-accordion-arrow"><i class="fas fa-angle-down"></i></i></a>
								</h4>
							</div>
							<div id="collapseOne7" class="panel-collapse" role="tabpanel" aria-labelledby="headingOne">
								<div class="panel-body">
									<div class="row">
										<div class="col-md-4 txt-sty">
											<div class="row">
											<span class="col"> Repair Order Number :</span><span  class="col" id="repairOrderNo"><%=dmsPoc.getRepairOrderNo() %></span>
											</div>
										</div>
										<div class="col-md-4 txt-sty">
											<div class="row">
											<span  class="col">Customer Name:</span>
											<span class="col form-group pmd-textfield inline-textbox"><input id="customerName" value="<%=dmsPoc.getCustomerName() %>" type="text" class="form-control" placeholder=""></span>
										</div>
										</div>
										
										<div class="col-md-4 txt-sty">
											<div class="row">
											<span class="col">Registration Number:</span><span class="col" id="regNo"><%=dmsPoc.getRegNo() %> </span>
										</div>
										</div>
									</div>
									<div class="row">
										<div class="col-md-4 txt-sty">
										<div class="row">
											<span class="col">VIN :</span><span class="col" id="vin"><%=dmsPoc.getVIN() %></span>
										</div>
										</div>
										<div class="col-md-4 txt-sty">
										<div class="row">
											<span class="col">Contact person phone :</span>
											<span class="col form-group pmd-textfield inline-textbox"><input id="contactPerson" type="text" value="<%=dmsPoc.getContactPersonPhone() %>" class="form-control" placeholder=""></span>
										</div>
										</div>
										<div class="col-md-4 txt-sty">
										<div class="row">
											<span class="col">SA Mobile No:</span><span class="col form-group pmd-textfield inline-textbox"><input type="text" id="saPhone" value="<%=dmsPoc.getServiceAdvisorMobileNo() %>" class="form-control" placeholder=""></span>
</div>
										</div>
									</div>
									<div class="row">
										<div class="col-md-4 txt-sty">
										<div class="row">
												<%           
												DateFormat formatDate = SimpleDateFormat.getDateInstance();
												String deliveryDate = formatDate.format(dmsPoc.getDateOfDelivery()); // formats to: 4:53:03 AM
												%>
										<span class="col" >Delivery Date :</span><span class="col form-group pmd-textfield inline-textbox"><input type="text" id="dateOfDel" value="<%=deliveryDate %>" class="form-control" placeholder=""></span>
										</div>
										</div>
										
										<div class="col-md-4 txt-sty">
										<div class="row">
										<span class="col">Kms (in) :</span>		
										<span class="col form-group pmd-textfield inline-textbox"><input  id="kms" type="text" value="<%=dmsPoc.getKmsIn() %>" class="form-control" placeholder=""></span>
										</div>
										</div>
																														
										<div class="col-md-4 txt-sty m-bt0">
										<div class="row">
										<span class="col">Service Advisor :</span><span class="col form-group pmd-textfield inline-textbox"><input id="sa" type="text" value="<%=dmsPoc.getServiceAdvisor() %>" class="form-control" placeholder=""></span>
										</div>
										</div>
											
										</div>
										
										<div class="row">
										
										<div class="col-md-4 txt-sty">
										<div class="row">
											<span class="col">Address :</span><span class="col form-group pmd-textfield inline-textbox">
											<input id="address" type="text" value="<%=dmsPoc.getCustomerAddress() %>"  class="form-control" placeholder=""></span>
										</div>
										</div>
										<div class="col-md-4 txt-sty">
										<div class="row">
											<span class="col">Dealer Code :</span><span class="col" id="dealerCode"><%=dmsPoc.getDealerCode() %></span>
										</div>
										</div>
										<div class="col-md-4 txt-sty">
										<div class="row">
										<span class="col">Sold by Dealer:</span><span class="col" id="soldByDealer"><%=dmsPoc.getSoldByDealer() %></span>
										</div>
										</div>
										<%-- <div class="col-md-4 txt-sty">											
										<span>Model :</span><span><%=dmsPoc.getModel() %></span>
										</div> --%>
									</div>
									<div class="row">
										<div class="col-md-4 txt-sty">
										<div class="row">
											<span class="col">Mobile No :</span><span class="col" id="mobileNumber"><%=dmsPoc.getCustomerMobileNo() %></span>
										</div>
										</div>
										<div class="col-md-4 txt-sty">
										<div class="row">
											<span class="col">Service Plan :</span>
											<span class="col form-group pmd-textfield inline-textbox"><input id="servicePlan" type="text" value="<%=dmsPoc.getServicePlan() %>" class="form-control" placeholder=""></span>
										</div>
										</div>
										<div class="col-md-4 txt-sty">
										<div class="row">
											<span class="col">Engine No. :</span><span class="col" id="engineNo" ><%=dmsPoc.getEngineNo() %></span>
										</div>
										</div>
									</div>
									<div class="row">
										<div class="col-md-4 txt-sty">
										<div class="row">
											<span class="col">Appointment Type:</span><span class="col form-group pmd-textfield inline-textbox"><input id="appointmentType" type="text" value="<%=dmsPoc.getAppointmentType() %>" class="form-control" placeholder=""></span>
										</div>
										</div>
										<div class="col-md-4 txt-sty">	
										<div class="row">									          							 
          							 <span class="col">Contact Person :</span>					
									<span class="col form-group pmd-textfield inline-textbox"><input id="contactPerson" type="text"  value="<%=dmsPoc.getContactPerson() %>"  class="form-control" placeholder=""></span>
</div>
										</div>
										<div class="col-md-4 txt-sty">
										<div class="row">
											<span class="col">Insurance Policy No :</span><span class="col" id="insurancePolicyNo"><%=dmsPoc.getInsurancePolicyNo() %></span>
										</div>
										</div>
									</div>
									
									
								<div class="row">
										<div class="col-md-4 txt-sty">
										<div class="row">
										   <%           
    										DateFormat Dformat = SimpleDateFormat.getDateInstance();
    										String inSuranceDate= Dformat.format(dmsPoc.getOrderDateIn()); // formats to: 4:53:03 AM
         								   %>
											<span class="col">I.P. expiry date :</span><span class="col" id="insuranceExpiryDate"><%=inSuranceDate %></span>
										</div>
										</div>
										<div class="col-md-4 txt-sty">
										<div class="row">
											<span class="col">E-mail:</span>
											<span class="col form-group pmd-textfield inline-textbox"><input  id="emailaddress" type="text" value="<%=dmsPoc.getCustomerEmailAddress() %>" class="form-control" placeholder=""></span>
										</div>
										</div>
										<div class="col-md-4 txt-sty">
										<div class="row">
											<span class="col">RSA Required :</span>	
											 <%
 String rsa =(dmsPoc.getRsaRequired())==true?"YES":"NO";
 
 %>					
											<span class="col form-group pmd-textfield inline-textbox"><input id="rsaRequired" type="text" value="<%=rsa %>" class="form-control" placeholder=""></span>
</div>
										</div>
									</div>
									<div class="row">
										<div class="col-md-4 txt-sty">
										<div class="row">
										 
         							   <%
                        				DateFormat timeFormat = SimpleDateFormat.getTimeInstance();
    									DateFormat dateFormat = SimpleDateFormat.getDateInstance();
    									String orderDate=	dateFormat.format(dmsPoc.getOrderDateIn()); // formats to: 4:53:03 AM
    									String orderTime = timeFormat.format(dmsPoc.getOrderDateIn());
          							  %>
          							 <span class="col">Order Date :</span>					
									<span class="col form-group pmd-textfield inline-textbox"><span id="dateIn" ><%=orderDate%></span></span>
</div>
										</div>
										<div class="col-md-4 txt-sty">
										<div class="row">
										  <%           
    										DateFormat dateFormatrsa = SimpleDateFormat.getDateInstance();
    										String rsaExpiryDate=	dateFormatrsa.format(dmsPoc.getOrderDateIn());
     								       %>
											<span class="col">ASA Expiry Date :</span>
											<span class="col form-group pmd-textfield inline-textbox"><span id="asaExpiryDate" ><%=rsaExpiryDate%></span></span>
										</div>
										</div>
										<div class="col-md-4 txt-sty">
										<div class="row">
											<span class="col">Order Time:</span>									
											<span class="col form-group pmd-textfield inline-textbox"><span id="timeIn" ><%=orderTime%></span></span>
</div>
										</div>
									</div>
									<div class="row">
										<div class="col-md-4 txt-sty">
										        <div class="row"> 							 
          							 <span class="col">Model :</span>					
									<span class="col form-group pmd-textfield inline-textbox"><span id="model" ><%=dmsPoc.getModel() %></span></span>
</div>
										</div>
										
										<div class="col-md-4 txt-sty">
										<div class="row">
											<span class="col">RSA Expiry Date:</span>									
											<span class="col form-group pmd-textfield inline-textbox"><span id="rsaExpiryDate" ><%=rsaExpiryDate %></span></span>
</div>
										</div>
									</div>
									
									 
								</div>
							</div>
						</div>
						
						<!-- Inventory Panel -->
												<div class="panel panel-default"> 
							<div class="panel-heading" role="tab" id="headingThree">
								<h4 class="panel-title"> 
									<a class="collapsed" data-toggle="collapse" data-parent="#accordion7" href="#collapseThree7" aria-expanded="false" aria-controls="collapseThree7"  data-expandable="false"> Inventory <i class="material-icons md-dark pmd-sm pmd-accordion-arrow"><i class="fas fa-angle-down"></i></i></a>
								</h4>
							</div>
							<div id="collapseThree7" class="panel-collapse " role="tabpanel" aria-labelledby="headingThree">
								<div class="panel-body">
								<div class="panel-body invent">
									<div class="row" style="">
										<div class="col-md-12 ls cm" style="">
											<p>Damage Report (Pick-up)</p>
											<img class="inventory-car-image" src='<%=request.getContextPath()+"/images/car-damage-image.png" %>' alt="car damage pic" usemap="#planetmap" style="">
											<map name="planetmap" >	
<!-- Front side coordinates -->
<area  data-toggle="modal" data-target="#myModal" shape="rect" coords="96,230,157,172" alt="1F"  value="1F" onclick="setDamageParts('1F')">
<area  data-toggle="modal" data-target="#myModal" shape="rect" coords="94,245,120,401" alt="2F"  value="2F" onclick="setDamageParts('2F')">
<area  data-toggle="modal" data-target="#myModal" shape="rect" coords="95,419,159,476" alt="3F"  value="3F" onclick="setDamageParts('3F')">

<!-- Front side coordinates -->
<area  data-toggle="modal" data-target="#myModal" shape="rect" coords="1032,153,1096,211" alt="1B"  value="1B" onclick="setDamageParts('1B')">
<area  data-toggle="modal" data-target="#myModal" shape="rect" coords="1057,228,1093,376" alt="2B"  value="2B" onclick="setDamageParts('2B')">
<area  data-toggle="modal" data-target="#myModal" shape="rect" coords="1092,394,1033,450" alt="3B"  value="3B" onclick="setDamageParts('3B')">

<!-- Right side coordinates -->
<area  data-toggle="modal" data-target="#myModal" shape="rect" coords="200,123,389,228" alt="1R"  value="1R" onclick="setDamageParts('1R')">
<area  data-toggle="modal" data-target="#myModal" shape="rect" coords="421,122,581,221" alt="2R"  value="2R" onclick="setDamageParts('2R')">
<area  data-toggle="modal" data-target="#myModal" shape="rect" coords="456,107,747,89" alt="3R"  value="3R" onclick="setDamageParts('3R')">
<area  data-toggle="modal" data-target="#myModal" shape="rect" coords="447,251,734,236" alt="4R"  value="4R" onclick="setDamageParts('4R')">
<area  data-toggle="modal" data-target="#myModal" shape="rect" coords="628,116,787,224" alt="5R"  value="5R" onclick="setDamageParts('5R')">
<area  data-toggle="modal" data-target="#myModal" shape="rect" coords="852,146,995,223" alt="6R"  value="6R" onclick="setDamageParts('6R')">	

<!-- Left side coordinates -->
<area  data-toggle="modal" data-target="#myModal" shape="rect" coords="200,541,389,429" alt="1L"  value="1L" onclick="setDamageParts('1L')">
<area  data-toggle="modal" data-target="#myModal" shape="rect" coords="421,439,578,539" alt="2L"  value="2L" onclick="setDamageParts('2L')">
<area  data-toggle="modal" data-target="#myModal" shape="rect" coords="457,550,748,570" alt="3L"  value="3L" onclick="setDamageParts('3L')">
<area  data-toggle="modal" data-target="#myModal" shape="rect" coords="449,404,733,420" alt="4L"  value="4L" onclick="setDamageParts('4L')">
<area  data-toggle="modal" data-target="#myModal" shape="rect" coords="632,434,789,541" alt="5L"  value="5L" onclick="setDamageParts('5L')">
<area  data-toggle="modal" data-target="#myModal" shape="rect" coords="855,435,994,517" alt="6L"  value="6L" onclick="setDamageParts('6L')">

<!-- center coordinates -->
<area  data-toggle="modal" data-target="#myModal" shape="rect" coords="209,263,338,393" alt="1C"  value="1C" onclick="setDamageParts('1C')">
<area  data-toggle="modal" data-target="#myModal" shape="rect" coords="375,267,438,396" alt="2C"  value="2C" onclick="setDamageParts('2C')">
<area  data-toggle="modal" data-target="#myModal" shape="rect" coords="479,261,701,392" alt="3C"  value="3C" onclick="setDamageParts('3C')">
<area  data-toggle="modal" data-target="#myModal" shape="rect" coords="735,265,792,395" alt="4C"  value="4C" onclick="setDamageParts('4C')">
<area  data-toggle="modal" data-target="#myModal" shape="rect" coords="843,263,1005,392" alt="5C"  value="5C" onclick="setDamageParts('5C')">

</map>
													<div id="myModal" style="display:none;" class="modal" aria-hidden="true" role="dialog">
													  <div class="modal-dialog inventory-custom-width" >													  
													    <div class="modal-content" style="">
													    	<div class="modal-header">
													        	<button type="button" class="close" data-dismiss="modal">&times;</button>
          														<h4 class="modal-title">Report damage to part - <span id="spanId"></span> </h4>
															</div>													      
													      <div class="modal-body"  id="modal-container">
													    	
													      	<div class="col-md-7 cm" style="display: inline-block;">
																<p><span>C - Crack</span> <span>D - Dent</span> <span>S - Scratch</span> <span>N - None</span></p>
																<div class="row">
																	<div class="col-md-12">
																		<p>
																			
																			<span><label class="container3">C
																			  <input type="radio" name="damageParts" id="damageParts" value="C">
																			  <span class="checkmark"></span>
																			</label></span>
																			<span><label class="container3">D
																			  <input type="radio" name="damageParts" id="damageParts" value="D">
																			  <span class="checkmark"></span>
																			</label></span>
																			<span><label class="container3">S
																			  <input type="radio" name="damageParts" id="damageParts" value="S">
																			  <span class="checkmark"></span>
																			</label></span>
																			<span><label class="container3">N
																			  <input type="radio"  checked="checked" name="damageParts" id="damageParts" value="N">
																			  <span class="checkmark"></span>
																			</label></span>
																		</p>
																		<p>Specify the type of damage part - <span id="spanId1"></span></p>
																		<textarea rows="4" cols="50" id="damageDescription" placeholder="Enter description of damage..."></textarea>
																	</div>
																</div>
															</div><span id="demoDamageData" ></span> 
														 </div><!-- /.modal-body -->
														 <div class="modal-footer">	
														 	<button type="submit" onclick='addDamageParts()' class="btn def-btn blue-btn">Submit</button>
															<button type="button" class="btn def-btn orange-btn" id="closeInventoryDialogBtn" data-dismiss="modal">Cancel</button>		
												          <!-- <button type="button" class="btn btn-default" data-dismiss="modal">Close</button> -->
												        </div>
													    </div><!-- /.modal-content -->
													  </div><!-- /.modal-dialog -->
												</div><!-- /.modal --> 
										</div>
										
									</div>
									<div class="row">
										<p class="col-md-12">Inventory List</p>
									</div>
									<div class="row in-li">
										<div class="col-md-8">
											<div class="row">
												<div class="col-md-12">
													<p><label class="container1">Owner Handbook
													  <input type="checkbox" name="inventoryList" value="Owner Handbook">
													  <span class="checkmark"></span>
													</label></p>
														<p><label class="container1">Spare Wheel
													  <input type="checkbox" name="inventoryList" value="Spare Wheel">
													  <span class="checkmark"></span>
													</label></p>
														<p><label class="container1">Jack & Handle
													  <input type="checkbox" name="inventoryList" value="Jack & Handle">
													  <span class="checkmark"></span>
													</label></p>
														<p><label class="container1">Seat Covers
													  <input type="checkbox" name="inventoryList" value="Seat Covers">
													  <span class="checkmark"></span>
													</label></p>
												</div>
											</div>
											<div class="row">
												<div class="col-md-12">
													<p><label class="container1">Mud Flaps
													  <input type="checkbox" name="inventoryList" value="Mud Flaps">
													  <span class="checkmark"></span>
													</label></p>
														<p><label class="container1">CD Changer
													  <input type="checkbox" name="inventoryList" value="CD Changer">
													  <span class="checkmark"></span>
													</label></p>
													<p><label class="container1">CD/DVDs
													  <input type="checkbox" name="inventoryList" value="CD/DVDs">
													  <span class="checkmark"></span>
													</label></p>
														<p><label class="container1">Side Mirror
													  <input type="checkbox" name="inventoryList" value="Side Mirror">
													  <span class="checkmark"></span>
													</label></p>
												</div>
											</div>

											<div class="row">
												<div class="col-md-12">
													<p><label class="container1">Divinity
													  <input type="checkbox" name="inventoryList" value="Divinity">
													  <span class="checkmark"></span>
													</label></p>
													<p><label class="container1">Air Freshener
													  <input type="checkbox" name="inventoryList" value="Air Freshener">
													  <span class="checkmark"></span>
													</label></p>
														<p><label class="container1">Antenna
													  <input type="checkbox" name="inventoryList" value="Antenna">
													  <span class="checkmark"></span>
													</label></p>														
														<p><label class="container1">Floor Mats
													  <input type="checkbox" name="inventoryList" value="Floor Mats">
													  <span class="checkmark"></span>
													</label></p>
												</div>
											</div>
											<div class="row">
												<div class="col-md-12">
													<p><label class="container1">Boot Mats
													  <input type="checkbox" name="inventoryList" value="Boot Mats">
													  <span class="checkmark"></span>
													</label></p>
													<p><label class="container1">Plastic Mats
													  <input type="checkbox" name="inventoryList" value="Plastic Mats">
													  <span class="checkmark"></span>
													</label></p>
														<p><label class="container1">First-aid Kit
													  <input type="checkbox" name="inventoryList" value="First-aid Kit">
													  <span class="checkmark"></span>
													</label></p>
														<p><label class="container1">Key Chains
													  <input type="checkbox" name="inventoryList" value="Key Chains">
													  <span class="checkmark"></span>
													</label></p>														
												</div>
											</div>
											<div class="row">
												<div class="col-md-12">
													<p><label class="container1">Tool Kit
													  <input type="checkbox" name="inventoryList" value="Tool Kit">
													  <span class="checkmark"></span>
													</label></p>
												</div>
											</div>
</div>
										<div class="col-md-4">
											<div class="row">
												<div class="col-md-12">
													<p><label class="container1">Other Loose Items
													  <input type="checkbox" name="inventoryList" value="Other Loose Items">
													  <span class="checkmark"></span>
													</label></p>
												</div>
											</div>
											<div class="row">
												<div class="col-md-12">
													
														<div class="form-group pmd-textfield add-task" style="width: 90%"><input type="text" id="specifyLooseItemDesc" class="form-control" placeholder="Specify loose items (if any)"></div>
													
												</div>
											</div>
										</div>
									</div>
									<div class="row dr-top">
										<div class="col-md-12"><p>Fuel Level</p>
										<p style="font-weight:600;font-size:22px;display:inline-flex;">
<span><label class="containerFuel" style="margin-right:8px;">E
 <input type="radio" checked="checked" name="fuelLevel" value="E">
 <span class="checkmark"></span>
</label></span>
<span><label class="containerFuel" style="margin-right:8px;">&frac14;
 <input type="radio" name="fuelLevel" value="1/4">
 <span class="checkmark"></span>
</label></span>
<span><label class="containerFuel" style="margin-right:8px;">&frac12;
 <input type="radio" name="fuelLevel" value="1/2">
 <span class="checkmark"></span>
</label></span>
<span><label class="containerFuel" style="margin-right:8px;">&frac34;
 <input type="radio" name="fuelLevel" value="3/4">
 <span class="checkmark"></span>
</label></span>
<span><label class="containerFuel" style="margin-right:8px;">F
 <input type="radio" name="fuelLevel" value="F">
 <span class="checkmark"></span>
</label></span>
</p>

											<div class="progress" style="display:none;">
											  <div class="progress-bar" role="progressbar" aria-valuenow="70"
											  aria-valuemin="0" aria-valuemax="100" style="width:70%">
												<span class="sr-only">16</span>
												  <i class="fas fa-map-marker"><b>70</b></i>
											  </div>
											</div>
										</div>
									</div>
									<div class="row di-re">
										<div class="col-md-12">
											<p>
												<span><label class="container3">OK
												  <input type="radio" checked="checked" name="dr1" value="ok">
												  <span class="checkmark"></span>
												</label></span>
												<span><label class="container3">Not OK
												  <input type="radio" name="dr1" value="notok">
												  <span class="checkmark"></span>
												</label></span>
												<span>Oil Level</span>
											</p>
											<p>
												<span><label class="container3">OK
												  <input type="radio" checked="checked" name="dr11" value="ok">
												  <span class="checkmark"></span>
												</label></span>
												<span><label class="container3">Not OK
												  <input type="radio" name="dr11" value="notok">
												  <span class="checkmark"></span>
												</label></span>
												<span>Windows glazing</span>
											</p>
											<p>
												<span><label class="container3">OK
												  <input type="radio" checked="checked" name="dr111" value="ok">
												  <span class="checkmark"></span>
												</label></span>
												<span><label class="container3">Not OK
												  <input type="radio" name="dr111" value="notok">
												  <span class="checkmark"></span>
												</label></span>
												<span>Engine Compartment</span>
											</p>
										</div>
										<div class="col-md-12">
											<p>
												<span><label class="container3">OK
												  <input type="radio" checked="checked" name="dr2" value="ok">
												  <span class="checkmark"></span>
												</label></span>
												<span><label class="container3">Not OK
												  <input type="radio" name="dr2" value="notok">
												  <span class="checkmark"></span>
												</label></span>
												<span>Coolant</span>
											</p>
											<p>
												<span><label class="container3">OK
												  <input type="radio" checked="checked" name="dr22" value="ok">
												  <span class="checkmark"></span>
												</label></span>
												<span><label class="container3">Not OK
												  <input type="radio" name="dr22" value="notok">
												  <span class="checkmark"></span>
												</label></span>
												<span>Wiper Blades</span>
											</p>
											<p>
												<span><label class="container3">OK
												  <input type="radio" checked="checked" name="dr222" value="ok">
												  <span class="checkmark"></span>
												</label></span>
												<span><label class="container3">Not OK
												  <input type="radio" name="dr222" value="notok">
												  <span class="checkmark"></span>
												</label></span>
												<span>Monograms</span>
											</p>
										</div>
										<div class="col-md-12">
											<p>
												<span><label class="container3">OK
												  <input type="radio" checked="checked" name="dr3" value="ok">
												  <span class="checkmark"></span>
												</label></span>
												<span><label class="container3">Not OK
												  <input type="radio" name="dr3" value="notok">
												  <span class="checkmark"></span>
												</label></span>
												<span>Windshield washer</span>
											</p>
											<p>
												<span><label class="container3">OK
												  <input type="radio" checked="checked" name="dr33" value="ok">
												  <span class="checkmark"></span>
												</label></span>
												<span><label class="container3">Not OK
												  <input type="radio" name="dr33" value="notok">
												  <span class="checkmark"></span>
												</label></span>
												<span>Lights</span>
											</p>
										</div>
										<div class="col-md-12">
											<p>
												<span><label class="container3">OK
												  <input type="radio" checked="checked" name="dr4" value="ok">
												  <span class="checkmark"></span>
												</label></span>
												<span><label class="container3">Not OK
												  <input type="radio" name="dr4" value="notok">
												  <span class="checkmark"></span>
												</label></span>
												<span>Brakes</span>
											</p>
											<p>
												<span><label class="container3">OK
												  <input type="radio" checked="checked" name="dr44" value="ok">
												  <span class="checkmark"></span>
												</label></span>
												<span><label class="container3">Not OK
												  <input type="radio" name="dr44" value="notok">
												  <span class="checkmark"></span>
												</label></span>
												<span>Exhaust system</span>
											</p>
										</div>
										<div class="col-md-12">
											<p>
												<span><label class="container3">OK
												  <input type="radio" checked="checked" name="dr5" value="ok">
												  <span class="checkmark"></span>
												</label></span>
												<span><label class="container3">Not OK
												  <input type="radio" name="dr5" value="notok">
												  <span class="checkmark"></span>
												</label></span>
												<span>Axle</span>
											</p>
											<p>
												<span><label class="container3">OK
												  <input type="radio" checked="checked" name="dr55" value="ok">
												  <span class="checkmark"></span>
												</label></span>
												<span><label class="container3">Not OK
												  <input type="radio" name="dr55" value="notok">
												  <span class="checkmark"></span>
												</label></span>
												<span>Underbody</span>
											</p>
										</div>
									</div>
								</div>
							</div>
							</div>
						</div>
						
						
						
						<!-- Customer Voice -->
						
						<div class="panel panel-default"> 
							<div class="panel-heading" role="tab" id="headingTwo">
								<h4 class="panel-title"> 
									<a data-toggle="collapse" data-parent="#accordion7" href="#collapseTwo7" aria-expanded="false" aria-controls="collapseTwo7"  data-expandable="false"> Customer Order Description <i class="material-icons md-dark pmd-sm pmd-accordion-arrow"><i class="fas fa-angle-down"></i></i></a>
								</h4>
							</div>
							<div id="collapseTwo7" class="panel-collapse " role="tabpanel" aria-labelledby="headingTwo">
								<div class="panel-body">
									<table class="table add-task">
										<thead>
											<tr>
												<th style="width: 3%;">S.No.</th>
												<th style="width:49%">Demanded Repair (Customer Voice)</th>
												<th>Instruction</th>
											</tr>
										</thead>
										<tbody class="field_wrapper">
											
										</tbody>
										<tfoot>
										<tr>
<td align="center" style="text-align:left;" colspan="6">
   <a href="javascript:void(0);" id="target" onclick="addCustOrderRow();" class="add_button "><strong><i class="fas fa-plus-circle"></i> Add Task</strong></a>   
 </td>
 </tr>
 <tr>
										
										</tfoot>
									</table>
								</div>
							</div>
						</div>
						
						<!-- Parts -->
						<div class="panel panel-default"> 
							<div class="panel-heading" role="tab" id="headingFour">
								<h4 class="panel-title"> 
									<a class="collapsed" data-toggle="collapse" data-parent="#accordion7" href="#collapseFour7" aria-expanded="false" aria-controls="collapseFour7"  data-expandable="false"> Parts<i class="material-icons md-dark pmd-sm pmd-accordion-arrow"><i class="fas fa-angle-down"></i></i></a>
								</h4>
							</div>
							<div id="collapseFour7" class="panel-collapse " role="tabpanel" aria-labelledby="headingFour">
								<div class="panel-body table-responsive">
									
<table id="PartsTable" class="table add-task">
<thead>
<tr>
<th style="width: 5%;">S.No.</th>
<th style="width: 20%;">Part Number</th>
<th style="width:20%">Part Description</th>
<th style="width:10%" >Price/Unit</th>
<th style="width:15%" >Quantity</th>
<th style="width:15%">Amount</th>
</tr>
</thead>
<tbody id="partsTableBody" class="field_wrapper1">

<tfoot>
<tr>
<td align="center" style="text-align:left;" colspan="6">
   <a href="javascript:void(0);" id="target1" onclick="addPartsRow()" class="add_button "><strong><i class="fas fa-plus-circle"></i> Add Task</strong></a>   
 </td>
 </tr>
 <tr>
         <td></td>
         <td></td>
          <td></td>
         <td></td>
              <td></td>
     
     <td> <strong>Sum Total: <span class="total_amount" id="partTotalAmount" ></span> </strong></td>
   </tr>
    <tr>
         <td></td>
         <td></td>
          <td></td>
         <td></td>
              <td></td>
     
     <td> <strong>GST(18%): <span id="partGst" ></span> </strong></td>
   </tr>
    <tr>
         <td></td>
         <td></td>
          <td></td>
         <td></td>
              <td></td>
     
     <td> <strong>Grand Total: <span id="partGrandTotal" ></span> </strong></td>
   </tr>
 </tfoot>
</tbody>
</table>	



							</div>
							</div>
						</div>
					
					<!-- Labour -->
					<div class="panel panel-default"> 
							<div class="panel-heading" role="tab" id="headingSix">
								<h4 class="panel-title"> 
									<a data-toggle="collapse" data-parent="#accordion7" href="#collapseSix7" aria-expanded="false" aria-controls="collapseTwo7"  data-expandable="false"> Labour Description <i class="material-icons md-dark pmd-sm pmd-accordion-arrow"><i class="fas fa-angle-down"></i></i></a>
								</h4>
							</div>
							<div id="collapseSix7" class="panel-collapse " role="tabpanel" aria-labelledby="headingTwo">
								<div class="panel-body table-responsive">
								<table id="LabourTable" class="table add-task  dt-responsive">
										<thead>
											<tr>
												<th style="width: 5%">S.No.</th>
												<th style="width:10%">Labour Code</th>
												<th style="width:20%" >Labour Description</th>
												<th style="width:20%" >Hourly Rate(In &#8377;)</th>
												<th style="width:20%">Time Required (In hours)</th>												
												<th style="width:20%">Amount</th>
											</tr>
										</thead>
										<tbody id="LabourTableBody" class="field_wrapper2">
										
										<tfoot>
<tr>
<td align="center" style="text-align:left;" colspan="6">
   <a href="javascript:void(0);" id="target2" onclick="addLabourRow()" class="add_button "><strong><i class="fas fa-plus-circle"></i> Add Task</strong></a>   
 </td>
 </tr>
 <tr>
         <td></td>
         <td></td>
          <td></td>
         <td></td>
              <td></td>
     
     <td> <strong>Sum Total: <span class="total_amount" id="labourTotalAmount" ></span> </strong></td>
   </tr>
    <tr>
         <td></td>
         <td></td>
          <td></td>
         <td></td>
              <td></td>
     
     <td> <strong>GST(5%): <span id="labourGst" ></span> </strong></td>
   </tr>
    <tr>
         <td></td>
         <td></td>
          <td></td>
         <td></td>
              <td></td>
     
     <td> <strong>Grand Total: <span id="labourGrandTotal" ></span> </strong></td>
   </tr>
 </tfoot>
										</tbody>
									</table>
		
		
		
		
									</div>
							</div>
						</div>
					
				<!-- 	Mode of Payment -->
						<div class="panel panel-default"> 
							<div class="panel-heading" role="tab" id="headingFive">
								<h4 class="panel-title"> 
									<a class="collapsed" data-toggle="collapse" data-parent="#accordion7" href="#collapseFive7" aria-expanded="false" aria-controls="collapseFive7"  data-expandable="false"> Financial Information <i class="material-icons md-dark pmd-sm pmd-accordion-arrow"><i class="fas fa-angle-down"></i></i></a>
								</h4>
							</div>
							<div id="collapseFive7" class="panel-collapse " role="tabpanel" aria-labelledby="headingFive">
								<div class="panel-body fin-info">
									<div class="row">
										<div class="col-md-12">
											<span>Mode of payment :</span>
											<span><label class="container3">UPI
											  <input type="radio" checked="checked" name="modeOfPayment">
											  <span class="checkmark"></span>
											</label></span>
											<span><label class="container3">Payment Gateway
											  <input type="radio" name="modeOfPayment">
											  <span class="checkmark"></span>
											</label></span>
											<span><label class="container3">Cash
											  <input type="radio" name="modeOfPayment">
											  <span class="checkmark"></span>
											</label></span>
											<span><label class="container3">Card
											  <input type="radio" name="modeOfPayment">
											  <span class="checkmark"></span>
											</label></span>
										</div>
									</div>
									<div class="row">
										<div class="col-md-12" style="display:none;">
											<span><span>Est. Delivery Date :</span><span id="estimatedDateOfDelivery"><%=dmsPoc.getEstimatedDateOfDelivery() %></span></span>
											<span><span>Est. Delivery Time :</span><span id="estimatedTimeOfDelivery"><%=dmsPoc.getEstimatedDeliveryTime() %></span></span>
										</div>
									</div>
									<div class="row">
										<div class="col-md-12">
											<span><span>Labour Cost(Rs.) :</span><span id="labourCost"></span></span>
											<span><span>Parts Costs(Rs.) :</span><span id="partCost"></span></span>
											<span><span>Estimated Cost(Rs.) :</span><span style="margin-right: 5px" id="estimatedCost"></span><span>(Taxes as applicable)</span></span>
											
										</div>
									</div>
									<div class="row">
										<div class="col-md-12">
										<span>Customer Signature :</span><br><br>
										<div id="signature-pad" class="signature-pad">
    <div class="signature-pad--body">
      <canvas></canvas>
    </div>
    <div class="signature-pad--footer">
      <div class="description">Sign above</div>

      <div class="signature-pad--actions">
        <div>
          <button type="button" class="button clear" data-action="clear">Clear</button>
          <button type="button" class="button" data-action="change-color">Change color</button>
          <button type="button" class="button" data-action="undo">Undo</button>

        </div>
      </div>
    </div>
  </div>
  
									</div>
									</div>
									<div class="row">
										<div class="col-md-12">
											<div class="btn-box">
												<button type="submit" onclick='submitData()' class="btn def-btn blue-btn">Submit</button>
												<button type="button" onclick="backToListContainer();" class="btn def-btn orange-btn">Cancel</button>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					
					
						
					</div> 
					
					
					
					<!-- Propeller Accordion example end-->
				</div>
			</div>
	  	</div>
	</section>

<script>
		var defaultPartRows = true;
		var defaultLabourRows = true;
		$(document).ready(function() {
			$(".do-nicescroll3").niceScroll();
			var tmpName = '<%=dmsPoc.getDealerCode() %>';
			var lastChar = tmpName[tmpName.length -1];
			var brandName = "";
			if(lastChar == "A" || lastChar == "R"){
				brandName = "audi";
			}
			else if(lastChar == "S"){
				brandName = "skoda";
			}
			else if(lastChar == "V"){
				brandName = "audi";
			}
			changeLogoAsPerBrand(brandName);
				setDefaultTableData();
				if(sig == undefined){
					var canvas = document.querySelector("canvas");
					//sig = $('#sig').signature();	
					sig = new SignaturePad(canvas);
				}
				
				var wrapper = document.getElementById("signature-pad");
				var clearButton = wrapper.querySelector("[data-action=clear]");
				var changeColorButton = wrapper.querySelector("[data-action=change-color]");
				var undoButton = wrapper.querySelector("[data-action=undo]");
				clearButton.addEventListener("click", function (event) {
					sig.clear();
					});

					undoButton.addEventListener("click", function (event) {
					  var data = sig.toData();

					  if (data) {
					    data.pop(); // remove the last dot or line
					    sig.fromData(data);
					  }
					});

					changeColorButton.addEventListener("click", function (event) {
					  var r = Math.round(Math.random() * 255);
					  var g = Math.round(Math.random() * 255);
					  var b = Math.round(Math.random() * 255);
					  var color = "rgb(" + r + "," + g + "," + b +")";

					  sig.penColor = color;
					});
				
				/* dataTable = $('#PartsTable').DataTable({
				      "bStateSave": true,
				      "fnStateSave": function (oSettings, oData) {
				            localStorage.setItem('PartsTable', JSON.stringify(oData));
				       },
				      "fnStateLoad": function (oSettings) {
				            return JSON.parse(localStorage.getItem('PartsTable'));
				       },
					   "language": {
					            "paginate": {
					                "previous"	:	'<i class="prev-next-table-icons" data-toggle="tooltip" title="Previous">&#8592;</i>',
					                "next"		:	'<i class="prev-next-table-icons" data-toggle="tooltip" title="Next">&#8594;</i>'
					            }
					   },
				       "bFilter": false,
				       "bInfo": false,
				       "paging": false
				}); */
		});
		var sig;
		function calculatePartAmountByQuantity(){
			$(".part-quantity").change(function(){
				  var totalAmount = 0;
				  $('.part-quantity').each(function(){
					  var tmpStr = $(this).attr('id');
						var array = tmpStr.split("-");
						var uniqueId = array[2];
					  console.log("id"+uniqueId);
					  var quantityVal = $(this).val();
					  var priceVal = $('#part-per-unit-price-'+uniqueId).val();
					  
					  if(quantityVal && priceVal){
						  var amount = quantityVal * priceVal;
						  $('#part-amount-'+uniqueId).val(amount);
						  totalAmount = totalAmount + amount;
					  }
					    //alert("value is "+$(this).val());
				});
				  $("#partTotalAmount").text(totalAmount);
				  if(totalAmount){
					  var gst = (totalAmount*0.18);
					  var totalAmountGst = totalAmount+gst;
					  $("#partGst").text(gst);
					  $("#partGrandTotal").text(totalAmountGst);
					  $("#partCost").text(totalAmountGst);
					  var labourTotalCost = $("#labourCost").text();
					  estimatedCost = parseInt(labourTotalCost) + totalAmountGst;
					  $("#estimatedCost").text(estimatedCost);
				  } 
				 console.log("totalAmount"+totalAmount);
			});
		}
		
		function setDefaultTableData(){
			var defaultNoOfRows = 2;
			for( var i=1;i<= defaultNoOfRows;i++){
				addPartsRow();
				addCustOrderRow();
				addLabourRow();
			}
			/* addPartsRow();
			addPartsRow();
			addCustOrderRow();
			addCustOrderRow();
			addLabourRow();
			addLabourRow(); */
			setTimeout(function(){
	   			imageObj = $('img[usemap]');
		   		//console.log("imageObj:"+imageObj);
		   		if( imageObj != undefined){
		   			imageObj.imageMap();
		   		}
	   		}, 5000);
			calculatePartAmountByQuantity();
			calculateLabourAmountByHour();
		}
		
		function myFunction() {
  			document.getElementById("myDropdown").classList.toggle("show");
		};
		
		function addRowCount(tableAttr) {
		  $(tableAttr).each(function(){
			$('th:first-child, thead td:first-child', this).each(function(){
			  var tag = $(this).prop('tagName');
			  $(this).before('<'+tag+'>#</'+tag+'>');
			});
			$('td:first-child', this).each(function(i){
			  $(this).before('<td>'+(i+1)+'</td>');
			});
		  });
		}
		
	</script> 
	<script type="text/javascript">
		 function myFunction () {
			var maxField = 10; //Input fields increment limitation
			var inc = 1;
			var wrapper = $( '.field_wrapper' ); //Input field wrapper
			var x = 0; //Initial field counter is 1
			//$( addButton ).click( function () { //Once add button is clicked

				if ( x < maxField ) { //Check maximum number of input fields
					x++; //Increment field counter

					//$(wrapper).append(fieldHTML); // Add field html
					$( wrapper ).append( '<tr><td></td><td><div class="form-group pmd-textfield"><input type="text"  class="form-control" placeholder="Demanded Repair"></div></td><td><div class="form-group pmd-textfield "><input type="text"  class="form-control" placeholder="Work to be done"></div></td></tr>'); // Add field html


				}

				$(".select-with-search").select2({
				theme: "bootstrap"
				});

				$(".select-tags.custom-select-2").select2({
				tags: true,
				theme: "bootstrap",
				});

			//} );
			$( wrapper ).on( 'click', '.remove_button', function ( e ) { //Once remove button is clicked
				e.preventDefault();
				//$(this).parent('.col-md-1').parent('.col-md-1').remove(); //Remove field html
				$( this ).closest( ".removeDiv" ).remove();
				x--; //Decrement field counter
			} );
		};
	</script>
	
	<script type="text/javascript">
	
		function SetParts(sel) {
			var  tr= $('#dummy tbody  ').html()			 
			 $("#PartsTable tbody ").replaceWith(tr);
			var labourtr = $('#templateLabour tbody').html();
			$("#LabourTable tbody").replaceWith(labourtr);
		}
		function addPartsLabourData(obj){
			addPartsData(obj);
			addLabourData(obj);
		}
		function addPartsData(obj){
			var custOrderRowId = $(obj).attr('id');
			var value = $("#"+custOrderRowId+" option:selected").val();
			if(defaultPartRows){
				partsRowCounter = 1;
				$("#PartsTable tbody ").empty();
				 $("#partTotalAmount").text("");
				  $("#partGst").text("");
				  $("#partGrandTotal").text("");
				  defaultPartRows = false;
			}
			
			var jsonArray = [];
			
			if(value == 15){
				jsonArray = [{
					"id":"1",
					"partNumber":"77593",
					"partDesc":"Air Filter",
					"pricePerUnit":"500"
					},{
						"id":"2",
						"partNumber":"53594",
						"partDesc":"Fuel Filter",
						"pricePerUnit":"300"
						}
					,{
						"id":"3",
						"partNumber":"63594",
						"partDesc":"Oil Pan Plug",
						"pricePerUnit":"120"
						}];
			}else if(value == 30){
				jsonArray = [{
					"id":"1",
					"partNumber":"77593",
					"partDesc":"Air Filter",
					"pricePerUnit":"120"
					},{
					"id":"2",
					"partNumber":"73594",
					"partDesc":"Fuel Filter",
					"pricePerUnit":"110"
					},{
					"id":"3",
					"partNumber":"56594",
					"partDesc":"Oil Pan Plug",
					"pricePerUnit":"150"
					},{
					"id":"4",
					"partNumber":"78554",
					"partDesc":"Brake Pad Set Change",
					"pricePerUnit":"400"
					}];
			}
			$.each(jsonArray, function(key,value) {
				var wrapper = $( '.field_wrapper1' ); 
				  var tableRow='<tr id="part-row-'+partsRowCounter+'">'+
					'<td>'+partsRowCounter+'.</td>' +
					'<td>' +
					'<div class="form-group pmd-textfield"><input type="text"  class="form-control part-number" id="part-no-'+partsRowCounter+'" placeholder="Part Number" value="'+value.partNumber+'"></div>' +
					'</td>' +
					'<td>' +
					'<div class="form-group pmd-textfield "><input type="text"  class="form-control part-desc" id="part-desc-'+partsRowCounter+'" placeholder="Part Description"  value="'+value.partDesc+'"></div>' +
					'</td>' +
					'<td>' +
					'<div class="form-group pmd-textfield"><input type="text"  class="form-control part-price" id="part-per-unit-price-'+partsRowCounter+'" placeholder="50"  value="'+value.pricePerUnit+'"></div>' +
					'</td>' +
					'<td>' +
					'<div class="form-group pmd-textfield"><input type="text"  class="form-control part-quantity" id="part-quantity-'+partsRowCounter+'" placeholder="Quantity"></div>' +
					'</td>' +
					'<td>' +
					'<div class="form-group pmd-textfield"><input type="text"  class="form-control part-amount" id="part-amount-'+partsRowCounter+'" placeholder="Amount"></div>' +
					'</td>' ;
					$( wrapper ).append(tableRow);
				  partsRowCounter++;
			});
			calculatePartAmountByQuantity();
			setAutoCompleteInput();
		}
		function addLabourData(obj){
			var custOrderRowId = $(obj).attr('id');
			var value = $("#"+custOrderRowId+" option:selected").val();
			if(defaultLabourRows){
				labourRowCounter = 1;
				$("#LabourTable tbody ").empty();
				 $("#labourTotalAmount").text("");
				  $("#labourGst").text("");
				  $("#labourGrandTotal").text("");
				  defaultLabourRows = false;
			}
			
			var jsonArray = [];
			if(value == 15){
				jsonArray = [{
					"id":"1",
					"labourCode":"L1477593",
					"labourDesc":"Floor Mechanic",
					"labourHourlyRate":"100"
					},{
						"id":"2",
						"labourCode":"L5277593",
						"labourDesc":"Denter/Painter",
						"labourHourlyRate":"80"
						}
					,{
						"id":"3",
						"labourCode":"L677593",
						"labourDesc":"Electrician",
						"labourHourlyRate":"150"						
					}];
			}else if(value == 30){
				jsonArray = [{
					"id":"1",
					"labourCode":"L177593",
					"labourDesc":"Floor Mechanic",
					"labourHourlyRate":"100"
					},{
						"id":"2",
						"labourCode":"L277593",
						"labourDesc":"Denter/Painter",
						"labourHourlyRate":"80"
						}
					,{
						"id":"3",
						"labourCode":"L377593",
						"labourDesc":"Electrician",
						"labourHourlyRate":"150"						
					}];
			}
			$.each(jsonArray, function(key,value) {
				var wrapper = $( '.field_wrapper2' ); 
				var tableRow='<tr id="labour-row-'+labourRowCounter+'">'+
				'<td>'+labourRowCounter+'.</td>' +
				'<td>' +
				'<div class="form-group pmd-textfield"><input type="text"  class="form-control labour-code" id="labour-code-'+labourRowCounter+'" placeholder="Labour Code"  value="'+value.labourCode+'"></div>' +
				'</td>' +
				'<td>' +
				'<div class="form-group pmd-textfield "><input type="text"  class="form-control labour-desc" id="labour-desc-'+labourRowCounter+'" placeholder="Labour Description"  value="'+value.labourDesc+'"></div>' +
				'</td>' +
				'<td>' +
				'<div class="form-group pmd-textfield"><input type="text"  class="form-control labour-hourly-rate" id="labour-hourly-rate-'+labourRowCounter+'" placeholder="Hourly Rate( In &#8377; ) "  value="'+value.labourHourlyRate+'"></div>' +
				'</td>' +
				'<td>' +
				'<div class="form-group pmd-textfield"><input type="text"  class="form-control labour-expected-time" id="labour-expected-time-'+labourRowCounter+'" placeholder="Time Required (In hours)"></div>' +
				'</td>' +
				'<td>' +
				'<div class="form-group pmd-textfield"><input type="text"  class="form-control" id="labour-amount-'+labourRowCounter+'" placeholder="Amount"></div>' +
				'</td>' ;
				$( wrapper ).append(tableRow);
				labourRowCounter++;
			});
			calculateLabourAmountByHour();
			setAutoCompleteInput();
		}
		function calculateLabourAmountByHour(){
			$(".labour-expected-time").change(function(){
				  var totalAmount = 0;
				  
				  $('.labour-expected-time').each(function(){
					  
					  
					  var tmpStr = $(this).attr('id');
						var array = tmpStr.split("-");
						var uniqueId = array[3];
					  console.log("id"+uniqueId);
					  var expectedTime = $(this).val();
					  var hourlyRate = $('#labour-hourly-rate-'+uniqueId).val();
					  item = {}
					  if(expectedTime && hourlyRate){
						  var amount = expectedTime * hourlyRate;
						  $('#labour-amount-'+uniqueId).val(amount);
						  totalAmount = totalAmount + amount;
						  
					  }
					 
					    //alert("value is "+$(this).val());
				});
				  $("#labourTotalAmount").text(totalAmount);
				  if(totalAmount){
					  var gst = (totalAmount*0.05);
					  var totalAmountGst = totalAmount+gst;
					  $("#labourGst").text(gst);
					  $("#labourGrandTotal").text(totalAmountGst);
					  $("#labourCost").text(totalAmountGst);
					  var partTotalCost =$("#partCost").text();
					  estimatedCost = parseInt(partTotalCost) + totalAmountGst;
					  $("#estimatedCost").text(estimatedCost);
				  } 
				 console.log("totalAmount"+totalAmount);
			});
		}

		var partsRowCounter = 1;
		 function addPartsRow () {
			var maxField = 10; //Input fields increment limitation
			var inc = 1;
			var wrapper = $( '.field_wrapper1' ); //Input field wrapper
			var x = 0; //Initial field counter is 1
			//$( addButton ).click( function () { //Once add button is clicked

				if ( x < maxField ) { //Check maximum number of input fields
					x++; //Increment field counter

					//$(wrapper).append(fieldHTML); // Add field html
					var tableRow='<tr id="part-row-'+partsRowCounter+'">'+
					'<td>'+partsRowCounter+'.</td>' +
					'<td>' +
					'<div class="form-group pmd-textfield"><input type="text"  class="form-control part-number" id="part-no-'+partsRowCounter+'" placeholder="Part Number"></div>' +
					'</td>' +
					'<td>' +
					'<div class="form-group pmd-textfield "><input type="text"  class="form-control part-desc" id="part-desc-'+partsRowCounter+'"  placeholder="Part Description"></div>' +
					'</td>' +
					'<td>' +
					'<div class="form-group pmd-textfield"><input type="text"  class="form-control part-price" id="part-per-unit-price-'+partsRowCounter+'"  placeholder="50"></div>' +
					'</td>' +
					'<td>' +
					'<div class="form-group pmd-textfield"><input type="text"  class="form-control part-quantity" id="part-quantity-'+partsRowCounter+'" placeholder="Quantity"></div>' +
					'</td>' +
					'<td>' +
					'<div class="form-group pmd-textfield"><input type="text"  class="form-control" id="part-amount-'+partsRowCounter+'" placeholder="Amount"></div>' +
					'</td>' ;
					$( wrapper ).append(tableRow);
					//$( wrapper ).append( '<tr><td>1.</td><td><div class="form-group pmd-textfield"><input type="text"  class="form-control" placeholder="Technician Name/Part Name"></div></td><td><div class="form-group pmd-textfield "><input type="text"  class="form-control" placeholder="Enter time/qty."></div></td><td><div class="form-group pmd-textfield "><input type="text"  class="form-control" placeholder="INR 00"></div></td></tr>'); // Add field html

					partsRowCounter++;
				}
				calculatePartAmountByQuantity();
				setAutoCompleteInput();
				callPartAmount();
		};
		
		
		var custOrderRowCounter = 1;
		 function addCustOrderRow () {
			 
			var maxField = 10; //Input fields increment limitation
			var inc = 1;
			var wrapper = $( '.field_wrapper' ); //Input field wrapper
			var x = 0; //Initial field counter is 1
			//$( addButton ).click( function () { //Once add button is clicked

				if ( x < maxField ) { //Check maximum number of input fields
					x++; //Increment field counter

					//$(wrapper).append(fieldHTML); // Add field html
					var tableRow='<tr id="cust-order-row-'+custOrderRowCounter+'">'+
					'<td>'+custOrderRowCounter+'.</td>' +
					'<td>' +
					'<div class="form-group pmd-textfield"><input type="text"  class="form-control customer-voice" id="cust-order-customer-voice-'+custOrderRowCounter+'" placeholder="Demanded Repair"></div>' +
					'</td>' +
					'<td><div class="form-group pmd-textfield "><select class="form-control work-to-be-done" id="cust-order-ins-'+custOrderRowCounter+'" onchange="addPartsLabourData(this)">' +
				    '<option selected>Select</option>'+
				    '<option value="15">15 Service</option>' +
				    '<option value="30">30 Service</option>'+
				    '<option value="45">45 Service</option>'+
					'<option value="60">60 Service</option>'+
					'<option value="75">75 Service</option>'+
					'<option value="90">90 Service</option>'+
					'</select></div>'
					'</td>';

					$( wrapper ).append(tableRow);
					//$( wrapper ).append( '<tr><td>1.</td><td><div class="form-group pmd-textfield"><input type="text"  class="form-control" placeholder="Technician Name/Part Name"></div></td><td><div class="form-group pmd-textfield "><input type="text"  class="form-control" placeholder="Enter time/qty."></div></td><td><div class="form-group pmd-textfield "><input type="text"  class="form-control" placeholder="INR 00"></div></td></tr>'); // Add field html

					custOrderRowCounter++;
				}

		}

		
		var labourRowCounter = 1;
		 function addLabourRow () {
			 
			var maxField = 10; //Input fields increment limitation
			var inc = 1;
			var wrapper = $( '.field_wrapper2' ); //Input field wrapper
			var x = 0; //Initial field counter is 1
			//$( addButton ).click( function () { //Once add button is clicked

				if ( x < maxField ) { //Check maximum number of input fields
					x++; //Increment field counter

					//$(wrapper).append(fieldHTML); // Add field html
					var tableRow='<tr id="labour-row-'+labourRowCounter+'">'+
					'<td>'+labourRowCounter+'.</td>' +
					'<td>' +
					'<div class="form-group pmd-textfield"><input type="text"  class="form-control labour-code" id="labour-code-'+labourRowCounter+'"  placeholder="Labour Code"></div>' +
					'</td>' +
					'<td>' +
					'<div class="form-group pmd-textfield "><input type="text"  class="form-control labour-desc" id="labour-desc-'+labourRowCounter+'"  placeholder="Labour Description"></div>' +
					'</td>' +
					'<td>' +
					'<div class="form-group pmd-textfield"><input type="text"  class="form-control labour-hourly-rate" id="labour-hourly-rate-'+labourRowCounter+'"  placeholder="Hourly Rate(In &#8377;)"></div>' +
					'</td>' +
					'<td>' +
					'<div class="form-group pmd-textfield"><input type="text"  class="form-control labour-expected-time" id="labour-expected-time-'+labourRowCounter+'" placeholder="Time Required (In hours)"></div>' +
					'</td>' +
					'<td>' +
					'<div class="form-group pmd-textfield"><input type="text"  class="form-control" id="labour-amount-'+labourRowCounter+'" placeholder="Amount"></div>' +
					'</td>' ;

					$( wrapper ).append(tableRow);
					//$( wrapper ).append( '<tr><td>1.</td><td><div class="form-group pmd-textfield"><input type="text"  class="form-control" placeholder="Technician Name/Part Name"></div></td><td><div class="form-group pmd-textfield "><input type="text"  class="form-control" placeholder="Enter time/qty."></div></td><td><div class="form-group pmd-textfield "><input type="text"  class="form-control" placeholder="INR 00"></div></td></tr>'); // Add field html

					labourRowCounter++;
				}
				setAutoCompleteInput();

		}
		var estimatedCost = 0;
		function backToListContainer(){
			$("#<portlet:namespace/>enterRegNoAndVIN").show();
	   		$("#<portlet:namespace/>enterYourJobCardDetails").hide();
		}
		var partNumberAutoFillArray = ["min93015","speed93025","speed77822","speed55859"];
		var partDescAutoFillArray = ["ABS Sensor","Wheel","Brake","Gear box"];
		//var partDescAutoFillArray = {"speed93015":"ABS Sensor","speed93025":"Wheel","speed77822":"Brake","speed55859":"Gear box"};
		var partPriceAutoFillArray = ["50","10","15","20"];
		var labourCodeAutoFillArray = ["L1977593","L1078244","L3378255","L9012323"];
		var labourDescAutoFillArray = ["Denter/Painter","Floor Mechanic","Heavy Vehicle Mechanic"
			,"Small Engine Mechanic","Diesel Mechanic"];
		var labourHourlyRateAutoFillArray = ["100","500","1000","1500"];
		
		function setAutoCompleteInput(){
			$(".part-number").autocomplete({
				source: partNumberAutoFillArray
			});
			$(".part-desc").autocomplete({
				source: partDescAutoFillArray
			});
			$(".part-price").autocomplete({
				source: partPriceAutoFillArray
			});
			$(".labour-code").autocomplete({
				source: labourCodeAutoFillArray
			});
			$(".labour-desc").autocomplete({
				source: labourDescAutoFillArray
			});
			$(".labour-hourly-rate").autocomplete({
				source: labourHourlyRateAutoFillArray
			});
		}
		
		function callPartAmount(){
		$(".part-number").change(function() {
			
			  var str = this.id;
			  var res = str.charAt(8);
			  var partUnitPrice = "part-per-unit-price-"+res;
			  var price = 50;
			  console.log(partUnitPrice);
			  $('#'+partUnitPrice).val(price);
			  //$('#'+inputId).val("50");
			});
		}
	</script>
	
	<script src="<%=request.getContextPath()%>/js/image-map.js?t=15000100" type="text/javascript"></script>
	<script src="<%=request.getContextPath()%>/js/jspdf.min.js?t=15000100" type="text/javascript"></script>
	<script>
	
	generate = function()
{
	var doc = new jsPDF()
	doc.text('Hello world!', 10, 10)
	doc.save('a4.pdf')
};
 </script>