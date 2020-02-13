<%@ include file="../init.jsp"%>
<%@ include file="../common.jspf" %>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jspdf/1.4.1/jspdf.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/html2canvas/0.4.1/html2canvas.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jspdf/1.0.272/jspdf.debug.js"></script>
<style type="text/css">
@media print {
        body * {
            visibility: hidden; // part to hide at the time of print
            -webkit-print-color-adjust: exact !important; // not necessary use         
               if colors not visible
        }

        #printBtn {
           display:none !important; 
        }
        #printBtn1 {
            display:none !important; 
        }
        #footer{
         	display:none !important; 
        }
        #banner{
        	display:none !important; 
        }
        #createOrder{
         	display:none !important; 
        }
        #saveBtn{
         	display:none !important; 
        }
        #saveBtn1{
         display:none !important; 
        }
        #backBtn{
         display:none !important; 
        }

        #temp-pdf * {
            visibility: visible; 
            text-align: left;
            -webkit-print-color-adjust: exact !important;
        }
    }



.pmd-navbar a.navbar-brand-custome {
	padding: 0;
	padding-top: 5px;
}

.navbar-brand-custome > img {
	display: inline-block;
	vertical-align: text-bottom;
	margin-right: 10px;
}
.navbar-header {
	min-width: 300px;
}

.navbar-brand svg {
    width: 70px;
    vertical-align: middle;
}

.logo-txt {
    position: relative;
    color: #0099DA;
    font-size: 27px;
    font-weight: 500;
    display: inline-block;
}

.wel-txt {
    padding: 15px 0;
	color: #0099DA;
	font-size: 16px;
	font-weight: 500;
}

.navbar .media-right.media-middle {
    padding-left: 0;
}

.navbar .media-left {
    padding-right: 0;
}

.navbar i.material-icons.md-dark.pmd-sm {
    padding-top: 5px;
}

.top-m {
    padding-top: 80px;
}

.pf-menu {
	color: #231F20;
}

.pf-menu span {
	display: inline-block;
	min-width: 50px;
	text-align: center;
}

.home-bg {
	background: url(../images/home-bg.png) repeat-y;
    height: 100%;
    background-position: top center;
    background-size: cover;
	background-color: rgba(245, 247, 253, .16)
}

.inp h2 {
	font-size: 20px;
	color: rgba(29, 31, 32, 1);
	font-weight: 400;
}

.inp h2 .del-sel {
	font-size: 14px;
	color: rgba(0, 153, 218, 1);
	font-weight: 400;
	float: right;
	line-height: 3;
	cursor: pointer;
}

.inp h2 .del-sel i {
	margin-left: 15px;
}

.new-job-main-cvr {
	border-bottom: 1px solid rgba(219, 220, 225, 1);
    box-shadow: 0 4px 4px -4px rgba(0, 0, 0, 0.16);
	margin-bottom: 20px;
}

.res-box h2 {
    color: rgba(29, 31, 32, 1);
    font-size: 20px;
    font-weight: 400;
    margin-bottom: 10px;
	margin-top: 0;
}

.res-box h2 img {
    vertical-align: bottom;
    margin-right: 3px;
}


.res-box .form-group label {
	color: rgba(0, 153, 218, 1);
	font-size: 14px;
}

.res-box .form-group img {
    vertical-align: sub;
    margin-right: 5px;
}

.top-m20 {
	margin-top: 20px;
}


.res-box .pmd-card {
	background-color: transparent;
	box-shadow: none;
	margin-bottom: 10px;
}

.res-box table.table thead th {
    color: #533B71;
}

.res-box table.table tbody tr {
    color: #231F20;
}

.res-box table.table tbody tr td:first-child {
    padding: 5px 0 5px 5px;
}

.res-box table.table tbody tr td:nth-child(2) {
    padding: 5px;
}

.res-box table.table tbody tr td:last-child {
    width: 20px;
}

.res-box .table>tbody>tr>td {
	border: none;
	padding: 2px;
}

.res-box .table>thead>tr>th {
	border: none;
	padding: 2px;
	padding-bottom: 10px;
	padding-left: 20px;
}

.res-box .form-control {
	height: unset;
}


.btn-box {
	text-align: center;
	margin-bottom: 0px;
	border-top: 2px solid #E7E7E7;
	padding-top: 15px;
}

.btn-box .btn {
	padding: 10px 30px;
	min-width: 150px;
	text-transform: capitalize;
	font-size: 14px;
	border-radius: 5px;
	box-shadow: 3px 0 6px rgba(0, 0, 0, 0.24);
}


.btn-box .btn.btn-success {
	background-color: rgba(39, 157, 130, 1);
}


.inp .table-normal {
	background: linear-gradient(to right, rgba(250, 251, 254, .87), rgba(245, 247, 253, .87));
	padding: 10px 10px 10px 0;
	box-shadow: 0 3px 12px rgba(0, 0, 0, 0.16);
}


.inp .table>thead>tr {
	border-bottom: 1px solid rgba(219, 220, 225, 1);
	box-shadow: 0 4px 4px -4px rgba(0, 0, 0, 0.16);
}

.inp .table>thead>tr>th {
	padding-left: 5px;
	color: rgba(0, 153, 218, 1);
	font-size: 14px;
}

.inp .table>tbody>tr>td {
	padding-left: 5px;
	color: rgba(7, 124, 174, 1);
	font-size: 14px;
	padding-top: 12px;
	padding-bottom: 12px;
}

.res-box.inp .table>tbody>tr:first-child td {
	padding-top: 24px;
}

.inp .table>tbody>tr>td .green-btn, .green-btn {
	color: rgba(39, 157, 130, 1);
	border: 1px solid rgba(39, 157, 130, 1);
	padding: 3px 10px;
	border-radius: 20px;
	display: block;
	text-align: center;
}

.inp .table>tbody>tr>td .red-btn, .red-btn {
	color: rgba(221, 81, 73, 1);
	border: 1px solid rgba(221, 81, 73, 1);
	padding: 3px 20px;
	border-radius: 20px;
	display: block;
	text-align: center;
	transition: all .5s ease-in-out;
}


.res-box .cd-left-cvr table.table tbody tr td {
	padding: 10px 20px;
	font-size: 16px;
	color: rgba(106, 10, 212, 1);
}

.res-box .cd-left-cvr table.table tbody tr td img {
	vertical-align: text-top;
	margin-right: 5px;
}

.res-box .cd-left-cvr table {
	margin-bottom: 0;
}

.res-box .cd-left-cvr table.table tbody tr td:last-child {
	font-weight: 500;
	color: rgba(42, 0, 111, 1);
}

.job-ini .panel-body .txt-sty > span:first-child {
	color: #0099DA;
	font-weight: 300;
	min-width: 80px;
	display: inline-block;
	vertical-align: top;
	margin-right: 10px;
}

.job-ini .panel-body .txt-sty > span:last-child {
	color: #077CAE;
	font-weight: 400;
	display: inline-block;
}

.job-ini .panel-body .txt-sty {
	margin-bottom: 10px;
}

.inp table.add-task thead tr th, .res-box.inp .table.add-task >tbody>tr td {
	padding: 5px 10px;

}

.inp table.add-task tbody tr td .form-control {
	color: rgba(0, 153, 218, 1);
	font-size: 14px;
}

.res-box.inp .table.add-task >tbody>tr:first-child td {
	padding: 5px 10px;
	padding-top: 15px;
}

.fin-info .row {
	margin-bottom: 7px;
}

.def-btn {
	border-radius: 30px !important;
	padding: 5px 20px;
	color: #fff;
	margin-top: 5px;
}

.blue-btn {
	background: linear-gradient(to right, rgba(0, 153, 218, 1), rgba(7, 124, 174, 1));
	border: 1px solid rgba(0, 153, 218, 1);
}

.fin-info .btn-box {
	border: none;
}

/* radio button */
.container3 {
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

.txt-sty .form-group {
	margin: 0;
}

.txt-sty .form-control {
	padding: 0;
	color: #077CAE;
	font-size: 14px;
}

.modal-footer .btn-box {
	padding-top: 0;
}

.invent .row > p {
	margin-top: 25px;
}

.pmd-navbar .navbar-toggle .icon-bar {
	background: #0099DA;
}

/* order summary */

.arrow-cvr .row div:last-child {
	text-align: right;
}

.arrow-cvr .row div:last-child i {
	margin-left: 1px;
}

.arrow-cvr .row div:first-child i {
	margin-right: 1px;
}

.arrow-cvr a {
	font-size: 20px;
	color: #0099DA;
}

.arrow-cvr i {
	font-size: 16px;
}

.arrow-cvr {
	border: none;
	box-shadow: none;
}

.arrow-cvr .ord-summ {
	color: #1D1F20;
}

.arrow-cvr .row div:first-child .ord-summ i {
	margin-right: 5px;
	font-size: 20px;
}

.arrow-cvr img {
	margin-right: 4px;
}

.sav {
	margin-right: 20px;
}

.ord-cvr {
	margin-top: 10px;
}

.ord-sum-det {
	background: linear-gradient(to right, rgba(250, 251, 254, .87), rgba(245, 247, 253, .87));
}

.ord-head h4, .ord-head h5 {
	font-size: 16px;
	color: rgba(29, 31, 32, 1);
}

.ord-head h5 {
	color: rgba(0, 153, 218, 1);
}

.ord-body span {
	/*  display: block; */ /* Commented by Shashi Bhushan Singh */
	color: rgba(0, 153, 218, 1);
}

.ord-body .txt-sty {
	margin-bottom: 10px;
}

.ord-body .txt-sty span:last-child {
	color: rgba(7, 124, 174, 1);
}

.cmn-sec {
	border-bottom: 2px solid rgba(245, 247, 253, 1);
	box-shadow: 0 4px 4px -4px rgba(0, 0, 0, 0.16);
	padding-bottom: 10px;
	margin-bottom: 10px;
}

.ord-bx table.table {
	max-width: 600px;
}

.ord-bx table th {
	width: 33%;
	border: 0;
}

.ord-bx .table thead tr {
	border: none;
	box-shadow: none;
}

.ord-bx table.table tbody td {
	padding: 5px;
}

.ord-bx table.table thead th:first-child {
	padding-left: 0;
}

.ord-bx.inp .table>tbody>tr:first-child td {
	padding-top: 5px;
}

.ord-bx.inp .table>tbody>tr td:first-child {
	padding-left: 0;
}

.inv {
	border-bottom: 1px solid rgba(0, 153, 218, .28);
}

.ord-bx table.parts {
	max-width: 1100px;
}

table.parts th {
	width: 10%;
}

.ord-body p {
	margin-bottom: 5px;
}

.ord-body p span {
	display: inline-block;
}

.ord-body p span:last-child {
	margin-left: 10px;
}

.btn-box img {
	width: 20px;
	height: 20px;
	margin-right: 5px;
}

.ord-btn .btn {
	font-size: 20px;
}


 
</style>
<%
	DmsPoc dmsPoc = (DmsPoc)resourceRequest.getAttribute("dmsPoc"); 
%>
	<section class="res-box inp ord-bx" id="temp-pdf">
		<div class="container-fluid new-job-main-cvr arrow-cvr">
			<div class="row">
				<div class="col-xs-4">
					<a href="#" id="backBtn"><i class="fas fa-arrow-left"></i> Back</a>
				</div>
				<div class="col-xs-8">
					<!-- <a href="#" id="createOrder">Create new order <i class="fas fa-arrow-right"></i></a> --> <!-- Commented by Shashi Bhushan Singh -->
				</div>
			</div>
			<div class="row ord-cvr">
				<div class="col-xs-6">
					<a href="javascript:void;" class="ord-summ"><i class="fas fa-list-ul"></i> Order Summary</a>
				</div>
				<div class="col-xs-6">
				<button onclick="javascript:demoFromHTML()" style="display:none;" class="button">Run Code</button></p>
	
					<a href="#" onclick="return false" style="" id="savePdf"><img src='<%=request.getContextPath()+"/images/save-icon.svg"%>' alt="save icon"> <span>Save</span> </a>
					<a href="#" id="printBtn" onclick="window.print();" ><img src='<%=request.getContextPath()+"/images/print-icon.svg"%>' alt="save icon"> <span>Print</span> </a>
				</div>
			</div>
		</div>
		<div class="canvas_div_pdf">
		<div class="container-fluid ord-sum-det-cvr" id="fromHTMLtestdiv">
			<div class="col-md-12 ord-sum-det" >
				<div class="row cmn-sec">
					<div class="col-md-12">
						<div class="ord-head">
							<h4>Customer & Vehicle Information</h4>
						</div>
						<div class="row ord-body" >
							<div class="col-md-4 col-xs-6 txt-sty">
								<span id="orderNo">Repair Order Number :  </span><span><%=dmsPoc.getRepairOrderNo() %></span>
							</div>
							<div class="col-md-4 col-xs-6 txt-sty">
								<span id="regno">Registration Number :  </span><span><%=dmsPoc.getRegNo() %></span>
							</div>
							<div class="col-md-4 col-xs-6 txt-sty">
								<span id="customerName">Customer Name :  </span><span><%=dmsPoc.getCustomerName() %></span>
							</div>
							<div class="col-md-4 col-xs-6 txt-sty">
								<span id="vin">VIN :  </span><span><%=dmsPoc.getVIN() %></span>
							</div>
							<div class="col-md-4 col-xs-6 txt-sty">
								<span id="address" >Address :  </span><span><%=dmsPoc.getCustomerAddress() %></span>
							</div>
							<div class="col-md-4 col-xs-6 txt-sty">
								<%           
												DateFormat formatDate = SimpleDateFormat.getDateInstance();
												String deliveryDate = formatDate.format(dmsPoc.getDateOfDelivery()); // formats to: 4:53:03 AM
												%>
							
								<span id="deliveryDate" >Delivery Date :  </span><span><%=deliveryDate %></span>
							</div>
							<div class="col-md-4 col-xs-6 txt-sty">
								<span id="kmsIn" >Kms (in) :  </span><span><%=dmsPoc.getKmsIn() %></span>
							</div>
							<div class="col-md-4 col-xs-6 txt-sty">
								<span id="phoneNumber" >Mobile No :  </span><span><%=dmsPoc.getCustomerMobileNo() %></span>
							</div>
							<div class="col-md-4 col-xs-6 txt-sty">
								<span id="engineNumber" >Engine Number :  </span><span><%=dmsPoc.getEngineNo() %></span>
							</div>
							<div class="col-md-4 col-xs-6 txt-sty" >
								<span id="email" >Email :  </span><span><%=dmsPoc.getCustomerEmailAddress() %></span>
							</div>
							<div class="col-md-4 col-xs-6 txt-sty">
							
								<span id="insurancePolicy" >Insurance Policy No :  </span> <span><%=dmsPoc.getInsurancePolicyNo() %></span>
							</div>
							<div class="col-md-4 col-xs-6 txt-sty">
							<%           
    										DateFormat Dformat = SimpleDateFormat.getDateInstance();
    										String inSuranceDate= Dformat.format(dmsPoc.getOrderDateIn()); // formats to: 4:53:03 AM
         								   %>
								<span id="ipExpiryDate" >I.P. Expiry Date :  </span><span><%=inSuranceDate %></span>
							</div>
							<div class="col-md-4 col-xs-6 txt-sty">
								<span id="contactPerson" >Contact Person :  </span><span><%=dmsPoc.getContactPerson() %></span>
							</div>
							<div class="col-md-4 col-xs-6 txt-sty">
								<span id="contactPersonPhone" >Contact Person Phone :  </span><span><%=dmsPoc.getContactPersonPhone()%></span>
							</div>
							<div class="col-md-4 col-xs-6 txt-sty">
																		 <%
 String rsa =(dmsPoc.getRsaRequired())==true?"YES":"NO";
 
 %>		
								<span id="rsaRequired" >RSA Required :  </span><span><%=rsa %></span>
							</div>
							<div class="col-md-4 col-xs-6 txt-sty">
								<span id="serviceAdvisor" >Service Advisor :  </span><span><%=dmsPoc.getServiceAdvisor() %></span>
							</div>
							<div class="col-md-4 col-xs-6 txt-sty">
								<span id="serviceAdvisorPhone" >SA Mobile No :  </span><span><%=dmsPoc.getServiceAdvisorMobileNo() %></span>
							</div>
							<div class="col-md-4 col-xs-6 txt-sty">
								<span id="model" >Model :  </span><span><%=dmsPoc.getModel() %></span>
							</div>
							 <%
                        				DateFormat timeFormat = SimpleDateFormat.getTimeInstance();
    									DateFormat dateFormat = SimpleDateFormat.getDateInstance();
    									String orderDate=	dateFormat.format(dmsPoc.getOrderDateIn()); // formats to: 4:53:03 AM
    									String orderTime = timeFormat.format(dmsPoc.getOrderDateIn());
          							  %>
							<div class="col-md-4 col-xs-6 txt-sty">
								<span id="orderDate" >Order Date :  </span><span><%=orderDate%></span>
							</div>
							<div class="col-md-4 col-xs-6 txt-sty">
								<span id="orderTime" >Order Time :  </span><span><%=orderTime%></span>
							</div>
							<div class="col-md-4 col-xs-6 txt-sty">
								<span id="dealerCode" >Dealer Code :  </span><span><%=dmsPoc.getDealerCode() %></span>
							</div>
							<div class="col-md-4 col-xs-6 txt-sty">
								<span id="soldByDealer" >Sold By Dealer :  </span><span><%=dmsPoc.getSoldByDealer() %></span>
							</div>
							<div class="col-md-4 col-xs-6 txt-sty">
								<span id="appointmentType" >Appointment Type :  </span><span><%=dmsPoc.getAppointmentType() %></span>
							</div>
							<div class="col-md-4 col-xs-6 txt-sty">
								<span id="servicePlan" >Service Plan :  </span><span><%=dmsPoc.getServicePlan() %></span>
							</div>			
						</div>
					</div>
				</div>
				<div class="row cmn-sec">
					<div class="col-md-12">
						<div class="ord-head">
							<h4>Customer Order Description</h4>
						</div>
						<div class="ord-body table-responsive">
							<table class="table" id="customerOrderDescTable">
								<thead>
									<tr>
										<th>S. No.</th>
										<th>Demanded Repair</th>
										<th>Work to be done</th>
									</tr>
								</thead>
								<tbody class=".cust_wrapper">
								
									
								</tbody>
							</table>		
						</div>
					</div>
				</div>
				<div class="row cmn-sec">
					<div class="col-md-12">
						<div class="ord-head">
							<h4>Inventory</h4>
							<h5>Damage Records</h5>
						</div>
						<div class="ord-body table-responsive inv">
							<table class="table" id="inventoryPartListTable">
								<thead>
									<tr>
										<th>S. No.</th>
										<th>Part</th>
										<th>Damage Type</th>
										<th>Description</th>
									</tr>
								</thead>
								<tbody>									
								</tbody>
							</table>		
						</div>
					</div>
					<div class="col-md-12">
						<div class="ord-head">
							<h5>Inventory List</h5>
						</div>
						<div class="ord-body inv clearfix">
							<div class="row">
							<!-- Col 1 -->
								<div class="col-md-3">
									<table class="table" id="inventoryListTable1">
										<thead>
											<tr>
												<th>S. No.</th>
												<th>Item Present</th>
											</tr>
										</thead>
										<tbody>								
										</tbody>
									</table>
								</div>
								<!-- Col 2 -->
								<div class="col-md-3">
									<table class="table " id="inventoryListTable2" style="display:none;">
										<thead>
											<tr>
												<th>S. No.</th>
												<th>Item Present</th>
											</tr>
										</thead>
										<tbody>								
										</tbody>
									</table>
								</div>
								<!-- Col 3 -->
								<div class="col-md-3">
									<table class="table " id="inventoryListTable3" style="display:none;">
										<thead>
											<tr>
												<th>S. No.</th>
												<th>Item Present</th>
											</tr>
										</thead>
										<tbody>								
										</tbody>
									</table>
								</div>
								<!-- Col 4 -->
								<div class="col-md-3">
									<table class="table " id="inventoryListTable4" style="display:none;">
										<thead>
											<tr>
												<th>S. No.</th>
												<th>Item Present</th>
											</tr>
										</thead>
										<tbody>								
										</tbody>
									</table>
								</div>
							</div>
							
						</div>
					</div>
					<div class="col-md-12">
						<div class="ord-body table-responsive inv">
							<table class="table" id="fuelTable" style="margin-top: 15px;">
								<thead>
									<tr>
										<th style="padding-bottom: 0">Fuel Level</th>
									</tr>
								</thead>
								<tbody>
									<tr>
									<% String fuel = dmsPoc.getFuel();
									String fuelLevel = "empty.";
									if(!fuel.isEmpty() && fuel.contains("E")){
										fuelLevel = "empty.";
									}else if(!fuel.isEmpty() && fuel.contains("1/4")){
										fuelLevel = fuel + "th  of the tank capacity." ;
									}else if(!fuel.isEmpty() && fuel.contains("1/2")){
										fuelLevel  = "half  of the tank capacity." ;
									}else if(!fuel.isEmpty() && fuel.contains("3/4")){
										fuelLevel  = fuel + "th  of the tank capacity." ;
									}%>
										<td id="fuelLevel">Fuel Quantity at the time of entry was <%=fuelLevel %></td>
									</tr>
								</tbody>
							</table>		
						</div>
					</div>
					
					<div class="col-md-12">
						<div class="ord-head">
							<h5>Items and services marked OK</h5>
						</div>
						<div class="ord-body inv clearfix">
							<div class="row">
								<div class="col-md-3">
									<table class="table" id="itemOkTable1">
										<thead>
											<tr>
												<th>S. No.</th>
												<th>Item Present</th>
											</tr>
										</thead>
										<tbody>
																						
										</tbody>
									</table>
								</div>
							<div class="col-md-3">
									<table class="table " id="itemOkTable2" style="display:none;">
										<thead>
											<tr>
												<th>S. No.</th>
												<th>Item Present</th>
											</tr>
										</thead>
										<tbody>
																						
										</tbody>
									</table>
								</div>
								
							</div>
							
						</div>
					</div>
					
					<div class="col-md-12"><br>
						<div class="ord-head">
							<h5>Items and services marked NOT OK</h5>
						</div>
						<div class="ord-body inv clearfix" > <!-- style="border:none;" -->
							<div class="row">
								<div class="col-md-3">
									<table class="table" id="itemNotOkTable1">
										<thead>
											<tr>
												<th>S. No.</th>
												<th>Item Present</th>
											</tr>
										</thead>
										<tbody>
											
										</tbody>
									</table>
								</div>
								<div class="col-md-3">
									<table class="table " id="itemNotOkTable2" style="display:none;">
										<thead>
											<tr>
												<th>S. No.</th>
												<th>Item Present</th>
											</tr>
										</thead>
										<tbody>
											
										</tbody>
									</table>
								</div>
							
							</div>
							
						</div>
					</div>
				</div>
				<div class="row cmn-sec">
					<div class="col-md-12">
						<div class="ord-head">
							<h4>Parts and Labour</h4>
							<h5>Parts</h5>
						</div>
						<div class="ord-body table-responsive inv" style="border: none">
							<table class="table parts" id="partsTable">
								<thead>
									<tr>
										<th>S. No.</th>
										<th>Part Number</th>
										<th>Part Description</th>
										<th>Price/Unit</th>
										<th>Quantity</th>
										<th>Amount</th>
									</tr>
								</thead>
								<tbody>
									
								</tbody>
							</table>	
							<p><span>Total amount :</span><span id="part_TotalCostOfParts">INR 21,000.00</span></p>
						</div>
					</div>
					<div class="col-md-12">
						<div class="ord-head">
							<h5>Labour</h5>
						</div>
						<div class="ord-body table-responsive inv" style="border: none">
							<table class="table parts" id="labourTable">
								<thead>
									<tr>
										<th>S. No.</th>
										<th>Labour Code</th>
										<th>Labour Description</th>
										<th>Hourly Rate(In &#8377;)</th>
										<th>Time Required (In hours)</th>
										<th>Amount</th>
									</tr>
								</thead>
								<tbody>
									
								</tbody>
							</table>	
							<p><span>Total amount :</span><span id="labour_TotalCostOfParts">INR 21,000.00</span></p>
						</div>
					</div>
				</div>
				<div class="row cmn-sec" style="border: none; box-shadow: none">
					<div class="col-md-12">
						<div class="ord-head">
							<h4>Financial Information</h4>
						</div>
						<div class="ord-body table-responsive inv" style="border: none">	
							<p><span>Mode of payment :  </span><span id="modeOfPayment">Cash</span></p>
							<p><span>Est. Delivery Date :  </span><span id="estDeliveryDate">04/06/2019</span></p>
							<p><span>Est. Delivery Time :  </span><span id="estDeliveryTime">6:00 P.M.</span></p>
							<p><span>Labour Cost(Rs.) :  </span><span id="labourCost"></span></p>
							<p><span>Parts Costs(Rs.) :  </span><span id="partCost"></span></p>
							<p><span>Estimated Total Cost(Rs.) :  </span><span id="estTotalCost"></span></p>
						</div>
					</div>
				</div>
					<div class="row cmn-sec" style="border: none; box-shadow: none">
					<div class="col-md-12">
						<div class="ord-head">
							<h4>Customer Signature</h4>
						</div>
						<div class="ord-body table-responsive inv" style="border: none">	
							<img src="<%=dmsPoc.getCustomerSignature() %>" alt="Customer Signature" width=400 height=200>
						</div>
					</div>
				</div>
			</div>
	  	</div>
		</div>
	</section>
	
	<!--start code for dlfileentry file  -->
	
	
	<div class="btn-box ord-btn" style="border:none; margin-bottom: 20px;">
	 	<button onclick="generate()"  style="display:none;">Generate PDF</button>
			 
		<button type="submit" style="display:none;" id="saveBtn1"  onclick="downloadPdf();" class="btn def-btn blue-btn"><img src='<%=request.getContextPath()+"/images/save-icon-white.svg"%>' alt="save white icon"> Save</button>
		<button type="button" id="printBtn1" class="btn def-btn blue-btn" onclick="shareOnWhatsApp()" style="display:none;" ><i class="fas fa-share-alt"></i> Share on WhatsApp</button>
		<button type="button" id="printBtn1" class="btn def-btn blue-btn" onclick="window.print();" data-dismiss="modal"><img src='<%=request.getContextPath()+"/images/print-icon-white.svg"%>' alt="save white icon"> Print</button>
	</div>  
<script type="text/javascript">
		$(document).ready(function() {
			$(window).scrollTop( $("#temp-pdf").offset().top );
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
			$("#temp-pdf").scrollTop();
			preLoadData();
			
			$("#savePdf").click(function(){
				
/* 		        html2canvas(document.getElementById("dashb"), {
		            onrendered: function(canvas) {

		                var imgData = canvas.toDataURL('image/png');
		                console.log('Report Image URL: '+imgData);
		                var doc = new jsPDF('p', 'mm', [297, 210]); //210mm wide and 297mm high
		                
		                doc.addImage(imgData, 'PNG', 10, 10);
		                doc.save('sample.pdf');
		            }
		        });
		         */
		        
		        var HTML_Width = $(".canvas_div_pdf").width();
				var HTML_Height = $(".canvas_div_pdf").height();
				var top_left_margin = 1;
				var PDF_Width = HTML_Width+(top_left_margin*2);
				var PDF_Height = (PDF_Width*1.5)+(top_left_margin*2);
				var canvas_image_width = HTML_Width;
				var canvas_image_height = HTML_Height;
				
				var totalPDFPages = Math.ceil(HTML_Height/PDF_Height)-1;
				

				html2canvas($(".canvas_div_pdf")[0],{allowTaint:true}).then(function(canvas) {
					canvas.getContext('2d');
					
					console.log(canvas.height+"  "+canvas.width);
					
					
					var imgData = canvas.toDataURL("image/jpeg", 1.0);
					var pdf = new jsPDF('p', 'pt',  [PDF_Width, PDF_Height]);
				    pdf.addImage(imgData, 'JPG', top_left_margin, top_left_margin,canvas_image_width,canvas_image_height);
					
					
					for (var i = 1; i <= totalPDFPages; i++) { 
						pdf.addPage(PDF_Width, PDF_Height);
						pdf.addImage(imgData, 'JPG', top_left_margin, -(PDF_Height*i)+(top_left_margin*4),canvas_image_width,canvas_image_height);
					}
					
					
				    pdf.save("HTML-Document.pdf");
				   });

			});
		});
		function preLoadData(){
			setCustomerOrderDescriptionData();
			setInventoryPartsData();
			setInventoryList();
			setOkNotOkList();
			setPartsTableData();
			setLabourTableData();
		}
		function setCustomerOrderDescriptionData(){
			var complaintData = JSON.parse('<%=dmsPoc.getComplaint() %>');
			var workToBeDoneData = JSON.parse('<%=dmsPoc.getWorkToBeDone() %>');
			$.each(complaintData, function(index,item) {
				var wrapper = $('#customerOrderDescTable');
				var valueTmp = workToBeDoneData[index].value ;
				if(valueTmp != "Select"){
					var tableRow='<tr id="cust-order-row-'+item.key+'">'+
					'<td id="sNo">'+item.key+'</td>' +
					'<td id="cust-order-demanded-repair-'+item.key+'">' + item.value+'</td>'+
					'<td id="cust-order-work-to-be-done-'+item.key+'">' +workToBeDoneData[index].value +'</td>'+
					'</tr>';
					$( wrapper ).append(tableRow);
				}
			});
		}
		function setInventoryPartsData(){
			var data = JSON.parse('<%=dmsPoc.getInventoryPartsJSONStr() %>');
			$.each(data, function(index,item) {
				var wrapper = $('#inventoryPartListTable');
				var tableRow='<tr id="inventory-part-row-'+item.id+'">'+
					'<td id="inventory-part-s-no">'+(index+1)+'</td>' +
					'<td id="inventory-part-'+item.id+'">' + item.id+'</td>'+
					'<td id="inventory-part-damage-type-'+item.id+'">' +item.damageParts +'</td>'+
					'<td id="inventory-part-desc-'+item.id+'">' + item.damageDescription+'</td>'+
					'</tr>';
				$( wrapper ).append(tableRow);
			});
		}
		function setInventoryList(){
			var data = JSON.parse('<%=dmsPoc.getOwnersManual() %>');
			$.each(data, function(index,item) {
				if(index < 5){
					var wrapper = $('#inventoryListTable1');
				}else if(index >= 5 && index < 10 ){
					var wrapper = $('#inventoryListTable2');
					$( wrapper ).show();
				}else if(index >= 10 && index < 15 ){
					var wrapper = $('#inventoryListTable3');
					$( wrapper ).show();
				}else{
					var wrapper = $('#inventoryListTable4');
					$( wrapper ).show();
				}
				var tableRow='<tr id="inventory-list-row-'+item.id+'">'+
					'<td id="inventory-list-s-no">'+(index+1)+'</td>' +
					'<td id="inventory-list-value-'+item.id+'">' + item.value+'</td>'+
					'</tr>';
				$( wrapper ).append(tableRow);
			});
		}
		function setOkNotOkList(){
			
			var oilLevel = '<%=dmsPoc.getOilLevel() %>';
			if(oilLevel == "ok"){
				addOkTableRow("Oil Level");
			}else{
				addNotOkTableRow("Oil Level");
			}
			var coolant = '<%=dmsPoc.getCoolant() %>';
			if(coolant == "ok"){
				addOkTableRow("Coolant");
			}else{
				addNotOkTableRow("Coolant");
			}
			var windshildWasher = '<%=dmsPoc.getWindshieldWasher() %>';
			if(windshildWasher == "ok"){
				addOkTableRow("Windshield washer");
			}else{
				addNotOkTableRow("Windshield washer");
			}			
			var brakes = '<%=dmsPoc.getBrakes() %>';
			if(brakes == "ok"){
				addOkTableRow("Brakes");
			}else{
				addNotOkTableRow("Brakes");
			}			
			var axle = '<%=dmsPoc.getAxle() %>';
			if(axle == "ok"){
				addOkTableRow("Axle");
			}else{
				addNotOkTableRow("Axle");
			}			
			var windowsGlazing = '<%=dmsPoc.getWindowsGlazzing() %>';
			if(windowsGlazing == "ok"){
				addOkTableRow("Windows glazing");
			}else{
				addNotOkTableRow("Windows glazing");
			}			
			var wiperBlades = '<%=dmsPoc.getWiperBlades() %>';
			if(wiperBlades == "ok"){
				addOkTableRow("Wiper Blades");
			}else{
				addNotOkTableRow("Wiper Blades");
			}			
			var lights = '<%=dmsPoc.getLights() %>';
			if(lights == "ok"){
				addOkTableRow("Lights");
			}else{
				addNotOkTableRow("Lights");
			}			
			var exhoustSystem = '<%=dmsPoc.getExhaustSystem() %>';
			if(exhoustSystem == "ok"){
				addOkTableRow("Exhaust system");
			}else{
				addNotOkTableRow("Exhaust system");
			}			
			var underbody = '<%=dmsPoc.getUnderbody() %>';
			if(underbody == "ok"){
				addOkTableRow("Underbody");
			}else{
				addNotOkTableRow("Underbody");
			}			
			var enginCompartment = '<%=dmsPoc.getEngineCompartment() %>';
			if(enginCompartment == "ok"){
				addOkTableRow("Engine Compartment");
			}else{
				addNotOkTableRow("Engine Compartment");
			}			
			var monograms = '<%=dmsPoc.getMonograms() %>';
			if(monograms == "ok"){
				addOkTableRow("Monograms");
			}else{
				addNotOkTableRow("Monograms");
			}	
		}
		var okTableCounter = 1;
		function addOkTableRow(value){
			if(okTableCounter <= 6){
				var wrapper = $('#itemOkTable1');
			}else{
				var wrapper = $('#itemOkTable2');
				$( wrapper ).show();
			}
			var tableRow='<tr id="inventory-ok-row-'+okTableCounter+'">'+
			'<td id="inventory-ok-s-no">'+okTableCounter+'</td>' +
			'<td id="inventory-ok-value-'+okTableCounter+'">' + value+'</td>'+
			'</tr>';
			$( wrapper ).append(tableRow);
			okTableCounter++;
		}
		var notOkTableCounter = 1;
		function addNotOkTableRow(value){
			if(notOkTableCounter < 6){
				var wrapper = $('#itemNotOkTable1');
			}else{
				var wrapper = $('#itemNotOkTable2');
				$( wrapper ).show();
			}
			var tableRow='<tr id="inventory-notok-row-'+notOkTableCounter+'">'+
			'<td id="inventory-notok-s-no">'+notOkTableCounter+'</td>' +
			'<td id="inventory-notok-value-'+notOkTableCounter+'">' + value+'</td>'+
			'</tr>';
			$( wrapper ).append(tableRow);
			notOkTableCounter++;
		}
		function setPartsTableData(){
			var data = JSON.parse('<%=dmsPoc.getPartsJSONStr() %>');
			var totalAmount = 0;
			$.each(data, function(index,item) {
				var wrapper = $('#partsTable');
				if(item.partNumber){
					var tableRow='<tr id="part-row-'+item.id+'">'+
					'<td id="part-s-no">'+(index+1)+'</td>' +
					'<td id="part-no-'+item.id+'">' + item.partNumber+'</td>'+
					'<td id="part-desc-'+item.id+'">' +item.partDesc +'</td>'+
					'<td id="part-price-'+item.id+'">' + item.pricePerUnit+'</td>'+
					'<td id="part-quantity-'+item.id+'">' + item.partQuantity+'</td>'+
					'<td id="part-amount-'+item.id+'">' + item.partAmount+'</td>'+
					'</tr>';
					var amount = item.partQuantity * item.pricePerUnit;
					totalAmount = totalAmount + amount;
				$( wrapper ).append(tableRow);
				}
			});
			var gst = (totalAmount*0.18);
			var totalAmountGst = totalAmount+gst;
			$("#part_TotalCostOfParts").text(totalAmountGst);
			$("#partCost").text(totalAmountGst);
			estTotalCost = estTotalCost +totalAmountGst;
		}
		var estTotalCost = 0 ;
		function setLabourTableData(){
			var data = JSON.parse('<%=dmsPoc.getLabourJSONStr() %>');
			var totalAmount = 0;
			$.each(data, function(index,item) {
				var wrapper = $('#labourTable');
				if(item.labourCode){
					var tableRow='<tr id="labour-row-'+item.id+'">'+
					'<td id="labour-s-no">'+(index+1)+'</td>' +
					'<td id="labour-code-'+item.id+'">' + item.labourCode+'</td>'+
					'<td id="labour-desc-'+item.id+'">' +item.labourDesc +'</td>'+
					'<td id="labour-hourly-'+item.id+'">' + item.labourHourlyRate+'</td>'+
					'<td id="labour-time-'+item.id+'">' + item.labourExpectedTime+'</td>'+
					'<td id="labour-amount-'+item.id+'">' + item.labourAmount+'</td>'+
					'</tr>';
				$( wrapper ).append(tableRow);
				var amount = item.labourExpectedTime * item.labourHourlyRate;
				totalAmount = totalAmount + amount;
				}
			});
			var gst = (totalAmount*0.05);
			var totalAmountGst = totalAmount+gst;
			$("#labour_TotalCostOfParts").text(totalAmountGst);
			$("#labourCost").text("------");
			console.log("totalAmountGst"+totalAmountGst);
			var partTotalCost =$("#partCost").text();
			estTotalCost = parseInt(partTotalCost) + totalAmountGst;
			$("#estTotalCost").text(estTotalCost);
		}
		function downloadPdf(){
			 var pdf = new jsPDF('p', 'pt', 'letter');
			  pdf.canvas.height = 72 * 11;
			  pdf.canvas.width = 72 * 8.5;
			  pdf.fromHTML($('#temp-pdf').get(0), 15, 15, {
			      'width': 600
			    }, function (dispose) {
			    doc.save('thisMotion11.pdf');
			  });
			 
			  
			  var doc = new jsPDF('p', 'pt', 'a4', true);
			    doc.fromHTML($('#temp-pdf').get(0), 15, 15, {
			      'width': 500
			    }, function (dispose) {
			    doc.save('thisMotion.pdf');
			    });
		}
		

		function demoFromHTML() {
			var htmlStr = $('#fromHTMLtestdiv');
			var pdf = new jsPDF('p', 'pt', 'a3')

				// source can be HTML-formatted string, or a reference
				// to an actual DOM element from which the text will be scraped.
				, source = document.getElementById('fromHTMLtestdiv')

				// we support special element handlers. Register them with jQuery-style 
				// ID selector for either ID or node name. ("#iAmID", "div", "span" etc.)
				// There is no support for any other type of selectors 
				// (class, of compound) at this time.
				, specialElementHandlers = {
					// element with id of "bypass" - jQuery style selector
					'#bypassme': function (element, renderer) {
						// true = "handled elsewhere, bypass text extraction"
						
						return true;
					},
					'#inventoryListTable2': function (element, renderer) {
						// true = "handled elsewhere, bypass text extraction"
						
						return true;
					},
					'.hide': function (element, renderer) {
						// true = "handled elsewhere, bypass text extraction"
						return true
					}
				}

			var margins = {
				top: 40,
				bottom: 40,
				left: 40,
				width: 750
			};
			// all coords and widths are in jsPDF instance's declared units
			// 'inches' in this case
			pdf.fromHTML(
				source // HTML string or DOM elem ref.
				, margins.left // x coord
				, margins.top // y coord
				, {
					'width': margins.width // max width of content on PDF
					, 'elementHandlers': specialElementHandlers
				},
				function (dispose) {
					// dispose: object with X, Y of the last line add to the PDF 
					//          this allow the insertion of new lines after html
					pdf.save('Test.pdf');
				},
				margins
			)
		
			 
		}
		var pdfURL= "http://www.pdf995.com/samples/pdf.pdf";
		function shareOnWhatsApp(){
			location.href = "https://api.whatsapp.com/send?phone=whatsappphonenumber&text="+pdfURL;
		}
		
		
</script>
<script>

margins = {
  top: 70,
  bottom: 40,
  left: 30,
  width: 550
};

generate = function()
{
	console.log("sss");
	var pdf = new jsPDF('p', 'pt', 'a4');
	pdf.setFontSize(12);
	pdf.fromHTML(document.getElementById('fromHTMLtestdiv'), 
		margins.left, // x coord
		margins.top,
		{
			// y coord
			width: margins.width// max width of content on PDF
		},function(dispose) {
			headerFooterFormatting(pdf, pdf.internal.getNumberOfPages());
		}, 
		margins);
		
	var iframe = document.createElement('iframe');
	iframe.setAttribute('style','position:absolute;right:0; top:0; bottom:0; height:100%; width:650px; padding:20px;');
	document.body.appendChild(iframe);
	
	iframe.src = pdf.output('datauristring');
	pdf.save('Testing.pdf');
};
function headerFooterFormatting(doc, totalPages)
{
    for(var i = totalPages; i >= 1; i--)
    {
        doc.setPage(i);                            
        //header
        header(doc);
        
        footer(doc, i, totalPages);
        doc.page++;
    }
};

function header(doc)
{
    doc.setFontSize(20);
    doc.setTextColor(30);
    doc.setFontStyle('normal');
	 
    doc.text("Report Header Template", margins.left + 50, 40 );
	doc.setLineCap(2);
	doc.line(3, 70, margins.width + 43,70); // horizontal line
};

// You could either use a function similar to this or pre convert an image with for example http://dopiaza.org/tools/datauri
// http://stackoverflow.com/questions/6150289/how-to-convert-image-into-base64-string-using-javascript

function footer(doc, pageNumber, totalPages){

    var str = "Page " + pageNumber + " of " + totalPages
   
    doc.setFontSize(10);
    doc.text(str, margins.left, doc.internal.pageSize.height - 20);
    
};

 </script>