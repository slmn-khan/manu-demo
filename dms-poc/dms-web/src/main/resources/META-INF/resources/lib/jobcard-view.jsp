<%@ include file="init.jsp"%>
<%@ include file="common.jspf" %>
<%@page import="com.liferay.portal.kernel.servlet.SessionErrors" %>

<link href="http://code.jquery.com/ui/1.10.2/themes/smoothness/jquery-ui.css" rel="Stylesheet"></link>


<link rel="stylesheet" href="<%=request.getContextPath()%>/css/animate.css" type="text/css" />
<link href="<%=request.getContextPath()%>/fontawesome-5.5.0-web/css/all.css" rel="stylesheet"> <!--load all styles -->
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/lib/appframework/icons.css" />
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/jquery.dataTables.min.css?t=1" /> 
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/dataTables.bootstrap.min.css" />
<link rel="stylesheet" href="https://cdn.datatables.net/responsive/2.2.3/css/responsive.bootstrap4.min.css"
	type="text/css" />
	
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/index.css?t=1500400"
	type="text/css" />
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap-datepicker.min.css?t=15000405000"
	type="text/css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/signature-pad.css" rel="stylesheet">


<script type="text/javascript" charset="utf-8"
	src="<%=request.getContextPath()%>/lib/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/js/pulltorefresh.js" type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/js/underscore-min.js" type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/js/backbone-min.js" type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/js/backbone-forms-adi.js?t=1" type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/js/handlebars-v1.3.0.js" type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/js/backbone.localStorage.js" type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/js/models.js" type="text/javascript"></script>

<!-- https://code.jquery.com/jquery-3.3.1.js -->

<script src="<%=request.getContextPath()%>/js/jquery.dataTables.min.js?t=1" type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/js/dataTables.bootstrap.min.js" type="text/javascript"></script>

<script src="https://cdn.datatables.net/responsive/2.2.3/js/dataTables.responsive.min.js" type="text/javascript"></script>
<script src="https://cdn.datatables.net/responsive/2.2.3/js/responsive.bootstrap4.min.js" type="text/javascript"></script>

<script src="<%=request.getContextPath()%>/js/bootstrap-datepicker.min.js" type="text/javascript"></script>


 <script type="text/javascript" charset="utf-8" src="<%=request.getContextPath()%>/js/moment.js"></script>
<script src="<%=request.getContextPath()%>/js/spin.min.js" type="text/javascript"></script>
<!-- Import CKEditor before controller-->
<script src="<%=request.getContextPath()%>/js/ckeditor-classic-12.0.0.js" type="text/javascript"></script>

 
<script src="<%=request.getContextPath()%>/js/controller.js?t=150120210" type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/js/renderer.js" type="text/javascript"></script>

<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/html2canvas/0.4.1/html2canvas.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jspdf/1.3.2/jspdf.min.js"></script>

<script src="https://sdk.amazonaws.com/js/aws-sdk-2.476.0.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/signature_pad@2.3.2/dist/signature_pad.min.js"></script>

<script src="http://code.jquery.com/ui/1.10.2/jquery-ui.js" ></script>


<script src="<%=request.getContextPath()%>/js/jobcard-models.js?t=15000100" type="text/javascript"></script>
<style type="text/css">
.modal .custom-width{
	position: relative;
	max-width: 650px;
	max-height: 400px;
}
.modal .inventory-custom-width{
	position: relative;
	max-width: 450px;
	max-height: 400px;
}
thead .dms-table{
	color: rgba(0, 153, 218, 1);
	background: #fff;
}
thead>tr {
    color: rgba(0, 153, 218, 1);
    font-weight: 600;
}
table.dataTable thead td{
	border-bottom: 1px solid rgba(219, 220, 225, 1)!important;
	border-top: 1px solid rgba(219, 220, 225, 1)!important;
	box-shadow: 0 4px 4px -4px rgba(0, 0, 0, 0.16);
}
table.dataTable{
	margin: 0px!important;
}
/* thead>tr>td {
    border: 1px solid rgba(219, 220, 225, 1);
    box-shadow: 0 4px 4px -4px rgba(0, 0, 0, 0.16);
    color: rgba(0, 153, 218, 1);
    font-weight: 600;
} */
.new-btn {
    font-size: 20px;
    background: linear-gradient(to right, rgba(255, 165, 87, 1), rgba(255, 135, 31, 1));
    border: 2px solid rgba(255, 135, 31, 1);
    color: #fff;
    text-transform: none;
    font-family: 'Noto Sans TC', sans-serif;
    font-weight: bold;
    border-radius: 30px;
}
.new-btn:hover, .new-btn:focus, .new-btn:active {
    color: rgba(255, 135, 31, 1);
    border: 2px solid rgba(255, 135, 31, 1);
    background-color: transparent;
    background: none;
}

@media only screen and (max-width: 600px) {
    .control-label{
		text-align : left !important; 
	}
}
@media (min-width: 600px) and (max-width: 979px) { 
	.control-label{
		text-align : left !important; 
	}
}

.panel-metric .panel-body {
    padding: 0;
}
.panel-metric .metric-content {
    position: relative;
    min-height: 135px;
}
.panel-metric .metric-content .metric-icon {
    padding-top: 40px;
}
.panel-metric .metric-content .metric-icon .value {
    line-height: 50px;
}
.panel-metric .metric-content .icon, .panel-metric .metric-content .trend, .panel-metric .metric-content .value, .panel-metric .metric-content header {
    z-index: 1;
    position: absolute;
}

.panel-metric .metric-content .value {
    top: 0;
    left: 0;
    margin: 25px 0 0 20px;
    font-weight: 700;
    font-size: 36px;
    line-height: 1em;
}
.panel-metric .metric-content .icon, .panel-metric .metric-content .trend {
    top: 0;
    right: 0;
    margin: 18px 15px 0 0;
}
.panel-metric .metric-content .icon  {
    font-size: 38px;
    line-height: 50px;
}
.panel-metric .metric-content .trend {
    text-align: center;
}
.panel-metric .metric-content .trend>p {
    font-size: 24px;
    font-weight: 700;
    line-height: 1em;
    margin: 0 0 2px;
}
.panel-metric .metric-content .trend>p .fa {
    margin-right: -3px;
    margin-top: -5px;
    font-size: .8em;
    vertical-align: middle;
}
.panel-metric .metric-content .trend strong {
    text-transform: uppercase;
    line-height: 1em;
    color: #888;
    font-weight: 600;
}
.panel-metric .metric-content .chart {
    height: 135px;
}
.panel-metric .metric-content header {
    left: 0;
    right: 0;
    bottom: 0;
    text-align: center;
}
.panel-metric .metric-content header h1, .panel-metric .metric-content header h2, .panel-metric .metric-content header h3, .panel-metric .metric-content header h4, .panel-metric .metric-content header h5, .panel-metric .metric-content header h6 {
    margin: 0;
    padding: 2px 0 12px;
}
.panel-metric-sm .metric-content {
    min-height: 110px;
}
.panel-metric-sm .metric-content .metric-icon {
    padding-top: 20px;
}
.box1 {
    color: #fff;
    background: linear-gradient(60deg,#66bb6a,#43a047);
    border-color: #ddd;
    box-shadow: 0 4px 20px 0 rgba(0,0,0,.14), 0 7px 10px -5px rgba(76,175,80,.4);
}
.box4 {
	color: #fff;
    background: linear-gradient(60deg,#ef5350,#e53935);
    border-color: #ddd;
    box-shadow: 0 4px 20px 0 rgba(0,0,0,.14), 0 7px 10px -5px rgba(244,67,54,.4);
}
.box3 {
    color: #fff;
    background: linear-gradient(60deg,#26c6da,#00acc1);
    border-color: #ddd;
    box-shadow: 0 4px 20px 0 rgba(0,0,0,.14), 0 7px 10px -5px rgba(0,188,212,.4);
}
.box2 {
    color: #fff;
    background: linear-gradient(60deg,#ffa726,#fb8c00);
    border-color: #ddd;
    box-shadow: 0 4px 20px 0 rgba(0,0,0,.14), 0 7px 10px -5px rgba(255,152,0,.4);
}
.btn.btn-danger {
    color: #fff!important;
}
/* .video-box {
	width: 500px;
	height: 375px;
	background-color: #666;
} */



.file-upload{display:block;text-align:center;font-family: Helvetica, Arial, sans-serif;font-size: 12px;}
.file-upload .file-select{display:block;border: 2px solid #ccd1d6;color: #34495e;cursor:pointer;height:40px;line-height:40px;text-align:left;background:#FFFFFF;overflow:hidden;position:relative;}
.file-upload .file-select .file-select-button{background:#dce4ec;padding:0 10px;display:inline-block;height:40px;line-height:40px;}
.file-upload .file-select .file-select-name{line-height:40px;display:inline-block;padding:0 10px;}
.file-upload .file-select:hover{border-color:#34495e;transition:all .2s ease-in-out;-moz-transition:all .2s ease-in-out;-webkit-transition:all .2s ease-in-out;-o-transition:all .2s ease-in-out;}
.file-upload .file-select:hover .file-select-button{background:#34495e;color:#FFFFFF;transition:all .2s ease-in-out;-moz-transition:all .2s ease-in-out;-webkit-transition:all .2s ease-in-out;-o-transition:all .2s ease-in-out;}
.file-upload.active .file-select{border-color:#3fa46a;transition:all .2s ease-in-out;-moz-transition:all .2s ease-in-out;-webkit-transition:all .2s ease-in-out;-o-transition:all .2s ease-in-out;}
.file-upload.active .file-select .file-select-button{background:#3fa46a;color:#FFFFFF;transition:all .2s ease-in-out;-moz-transition:all .2s ease-in-out;-webkit-transition:all .2s ease-in-out;-o-transition:all .2s ease-in-out;}
.file-upload .file-select input[type=file]{z-index:100;cursor:pointer;position:absolute;height:100%;width:100%;top:0;left:0;opacity:0;filter:alpha(opacity=0);}
.file-upload .file-select.file-select-disabled{opacity:0.65;}
.file-upload .file-select.file-select-disabled:hover{cursor:default;display:block;border: 2px solid #dce4ec;color: #34495e;cursor:pointer;height:40px;line-height:40px;margin-top:5px;text-align:left;background:#FFFFFF;overflow:hidden;position:relative;}
.file-upload .file-select.file-select-disabled:hover .file-select-button{background:#dce4ec;color:#666666;padding:0 10px;display:inline-block;height:40px;line-height:40px;}
.file-upload .file-select.file-select-disabled:hover .file-select-name{line-height:40px;display:inline-block;padding:0 10px;}
</style>
<script type="text/javascript">
Handlebars.registerHelper("inc", function(value, options)
		{
		   return parseInt(value) + 1;
		});
Handlebars.registerHelper('changeFormat', function(date, opts) {
    if(date!=undefined){ // Or === depending on your needs
         return  changeDateTimeFormat(date);
	}
});
Handlebars.registerHelper('changeDateDDMMYYYYFormat', function(date, opts) {
    if(date!=undefined){ // Or === depending on your needs
         return  changeDateDDMMYYYYFormat(date);
	}
});
Handlebars.registerHelper('changeDateHHMMFormat', function(date, opts) {
    if(date!=undefined){ // Or === depending on your needs
         return  changeDateHHMMFormat(date);
	}
});
var jobCardCollection, selectedJobCardId;
var jobCardCollectionFilter = null;
var showJobCardRow = function(jobCard){
	replaceModelView(jobCard, 'jobCard-list-row-template', 'jobCard-row-' + jobCard.get("id"));
}

var showJobCardList = function(filter){
	var viewType = 'list';
	
	Handlebars.registerPartial("jobCard-" + viewType + "-row-template", $('#jobCard-' + viewType + '-row-template').html());
	
	
	if(jobCardCollection==undefined){
		jobCardCollection = new JobCardCollection();
		//jobCardCollection.fetch();
	}
	
	if(jobCardCollection.length>0){
		var filteredList = [];
		
		if(jobCardCollectionFilter==null){
				filteredList = jobCardCollection.models;
		}else{
				filteredList = jobCardCollection.where(jobCardCollectionFilter);
		}
		
		if(filteredList.length==0){
			viewType = 'list';
		}
		renderList(filteredList, 'jobCard-' + viewType + '-template', 'jobCard-list-container');
		
	}else{
		renderList([], 'jobCard-list-template', 'jobCard-list-container');
	}
	try{
		dataTable = $('#jobCard-list-table').DataTable({
		      "bStateSave": true,
		      "fnStateSave": function (oSettings, oData) {
		            localStorage.setItem('jobCardListTable', JSON.stringify(oData));
		       },
		      "fnStateLoad": function (oSettings) {
		            return JSON.parse(localStorage.getItem('jobCardListTable'));
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
		});
			
	}catch(err){
		
	}
	$("#jobCard-list-container").show();
//	$("#jobCard-create-container").hide();
	hideProgress();
}
var downloadJobCardCollection = function(){
	//console.log("downloadJobCardCollection");
	showProgress('jobCard-list-container');
	var viewType = 'list';
	Handlebars.registerPartial("jobCard-" + viewType + "-row-template", $('#jobCard-' + viewType + '-row-template').html());
	/* if(jobCardCollection==undefined){
		jobCardCollection = new JobCardCollection();
	} */
	jobCardCollection = new JobCardCollection();
	//jobCardCollection.reset();
	if(jobCardCollection.length==0){
		showProgress('jobCard-list-container');
		showProgress('#scan-image-container');
	}
	//console.log("jobCardCollection:"+JSON.stringify(jobCardCollection));
	jobCardCollection.download().done(function(response){
		//console.log("response::"+JSON.stringify(response));
			var tempjobCardCollection = new JobCardCollection(response);
			if(response.exception!=undefined){
				toast(response.message);
				return;
			}
			//jobCardCollection.reset();
			response.forEach(function (model){
				var savedjobCardCollection = jobCardCollection.get(model.id);
				var jobCard = new JobCard(model);
				jobCardCollection.add(jobCard, {merge:true});
			});
		//	console.log("jobCardCollection::"+JSON.stringify(jobCardCollection));
			showJobCardList($("#jobCard-filter-input").val());
			
	}).fail(function(e){
			handleError(e)
	});
} 
$(document).ready(function(){
	
	downloadJobCardCollection();
});
</script>
<script id="jobCard-list-row-template" type="text/x-handlebars-template">
<tr id="jobCard-row-{{this.id}}">
<td>{{inc @index}}</td>
<td>{{this.regNo}}</td>
<td>{{this.VIN}}</td>
<td>{{this.model}}</td>
<td>{{this.repairOrderNo}}</td>
<td>{{this.status}}</td>
</tr>
</script>


<script id="jobCard-list-template" type="text/x-handlebars-template">


<table id="jobCard-list-table" style="width:100%;"  class="table dt-responsive">
<thead class="dms-table">
<tr>
<td style="width:30px">S.No.</td>
<td>Regn No</td>
<td>VIN</td>
<td>Model</td>
<td>Repair Order No</td>
<td>Status</td>
</tr>
</thead>
<tbody>
{{#each []}}
{{> jobCard-list-row-template}}
{{/each}}
</tbody>
</table>
</script>

<div class="section" >
<div id="list-container">
<div name="<portlet:namespace/>enterRegNoAndVIN" id="<portlet:namespace/>enterRegNoAndVIN">
<div class="card">
  <div class="card-body">
  	<div class="" style="text-align:right;">
 		<a href="" onclick="createJobForm();" data-target="#create-job-card-dialog" data-toggle="modal" class="btn btn-responsive new-btn"><liferay-ui:message key="create_repair_order" /></a>
	</div>
  </div>
</div>
<div class="card">
  <div class="card-body">
  	<div class="" style="text-align:right;">
 		<div class="row">

                <div class="col-sm-6 col-lg-3">
                    <div class="panel panel-metric panel-metric-sm">
                        <div class="panel-body panel-body-default box1">
                            <div class="metric-content metric-icon">
                                <div class="value">
                                    7
                                </div>
                                <div class="icon">
                                    <i class="fas fa-car"></i>
                                </div>
                                <header>
                                    <h3 class="thin">Car Received</h3>
                                </header>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="col-sm-6 col-lg-3">
                    <div class="panel panel-metric panel-metric-sm">
                        <div class="panel-body panel-body-default box2">
                            <div class="metric-content metric-icon">
                                <div class="value">
                                    3
                                </div>
                                <div class="icon">
                                    <i class="fas fa-spinner"></i>
                                </div>
                                <header>
                                    <h3 class="thin">Work In Progress</h3>
                                </header>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-sm-6 col-lg-3">
                    <div class="panel panel-metric panel-metric-sm">
                        <div class="panel-body panel-body-default box3">
                            <div class="metric-content metric-icon">
                                <div class="value">
                                    1
                                </div>
                                <div class="icon">
                                    <i class="fas fa-tasks"></i>
                                </div>
                                <header>
                                    <h3 class="thin">Quality Inspection</h3>
                                </header>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-sm-6 col-lg-3">
                    <div class="panel panel-metric panel-metric-sm">
                        <div class="panel-body panel-body-default box4">
                            <div class="metric-content metric-icon">
                                <div class="value">
                                    3
                                </div>
                                <div class="icon">
                                    <i class="fas fa-car-side"></i>
                                </div>
                                <header>
                                    <h3 class="thin">Ready for Delivery</h3>
                                </header>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
	</div>
  </div>
</div>
<div class="card">
  <div class="card-body" style="padding:0px;">
 	<div id="jobCard-list-container">
  	</div>
  </div>
</div>
</div>
</div>
<div id="create-container">
	<div name="<portlet:namespace/>enterYourJobCardDetails" id="<portlet:namespace/>enterYourJobCardDetails"></div>
</div>  
<div id="order-summary-container">
	<div name="<portlet:namespace/>yourJobCardDetails" id="<portlet:namespace/>yourJobCardDetails"></div>
</div>  

<script type="text/javascript">
var createJobForm = function (){
	var jobCard = new JobCard();	
	var createJobForm = new JobFetchForm({
				model: jobCard,
				validate: true,
				template: _.template($('#create-job-template').html())
	});
	var schema = createJobForm.schema;
	var formObj = renderForm(createJobForm, 'create-job-container',function(form){
		
		
		//showProgress('course-create-container');
		var regNo = $('input[name="regNo"]').val();
		var vin = $('input[name="vin"]').val();
		getRegNoVINRecord(regNo,vin);
		//console.log("title,siteurl::"+title +"::"+siteUrl);
		//createCloneRow(courseId,title,siteUrl);
	});
	$("#create-job-container").show();
	$("#scan-image-container").hide();
}
var scanImageForm = function (filterTypeTmp){	
	console.log("filterType:"+filterTypeTmp);
	filterType=filterTypeTmp;
	var scanImageForm = new ScanImageForm({
				validate: true,
				template: _.template($('#scan-image-template').html())
	});
	var formObj = renderForm(scanImageForm, 'scan-image-container',function(form){
		//showProgress('course-create-container');
		//var regNo = $('input[name="regNo"]').val();
		//var vin = $('input[name="vin"]').val();
		//getRegNoVINRecord(regNo,vin);
		//console.log("title,siteurl::"+title +"::"+siteUrl);
		//createCloneRow(courseId,title,siteUrl);
	});
	
	$('#chooseFile').bind('change', function () {
		  var filename = $("#chooseFile").val();
		  if (/^\s*$/.test(filename)) {
		    $(".file-upload").removeClass('active');
		    $("#noFile").text("No file chosen..."); 
		  }
		  else {
		    $(".file-upload").addClass('active');
		    $("#noFile").text(filename.replace("C:\\fakepath\\", "")); 
		  }
	});
	
	$("#scan-image").hide();
	if(navigator.mediaDevices != undefined){
		$("#scan-web").show();
		$("#scan-mobile").hide();
		startup();
	}else{
		$("#scan-mobile").show();
		$("#scan-web").hide();
	}
	$("#scan-image-container").show();
	$("#create-job-container").hide();
}
function readURL(input) {
    if (input.files && input.files[0]) {
        var reader = new FileReader();

        reader.onload = function (e) {
            $('#scannedImage').attr('src', e.target.result);
            var data = e.target.result;
            console.log("data:"+data);
            setAWSCredentials(data);
            displayImagePreview();
        };
        reader.readAsDataURL(input.files[0]);
    }
}
// The width and height of the captured photo. We will set the
// width to the value defined here, but the height will be
// calculated based on the aspect ratio of the input stream.
var width = 350;    // We will scale the photo width to this
var height = 0;     // This will be computed based on the input stream
// |streaming| indicates whether or not we're currently streaming
// video from the camera. Obviously, we start at false.
var streaming = false;
// The various HTML elements we need to configure or control. These
// will be set by the startup() function.

var video = null;
var canvas = null;
var photo = null;
var startbutton = null;
function startup() {
  video = document.getElementById('video');
  canvas = document.getElementById('canvas');
  photo = document.getElementById('photo');
  startbutton = document.getElementById('startbutton');
	if(navigator.mediaDevices != undefined){
		console.log("webcam found");
		 navigator.mediaDevices.getUserMedia({video: true, audio: false})
		  .then(function(stream) {
		    video.srcObject = stream;
		    video.play();
		  })      
		  .catch(function(err) {
		    console.log("An error occurred: " + err);
		  });
	}
  video.addEventListener('canplay', function(ev){
    if (!streaming) {
      height = video.videoHeight / (video.videoWidth/width);
    
      // Firefox currently has a bug where the height can't be read from
      // the video, so we will make assumptions if this happens.
    
      if (isNaN(height)) {
        height = width / (4/3);
      }
    
      video.setAttribute('width', width);
      video.setAttribute('height', height);
      canvas.setAttribute('width', width);
      canvas.setAttribute('height', height);
      streaming = true;
    }
  }, false);

  startbutton.addEventListener('click', function(ev){
    takepicture();
    ev.preventDefault();
  }, false);
  
}
// Fill the photo with an indication that none has been
// captured.
// Capture a photo by fetching the current contents of the video
// and drawing it into a canvas, then converting that to a PNG
// format data URL. By drawing it on an offscreen canvas and then
// drawing that to the screen, we can change its size and/or apply
// other changes before drawing it.
function takepicture() {
  var context = canvas.getContext('2d');
  if (width && height) {
    canvas.width = width;
    canvas.height = height;
    context.drawImage(video, 0, 0, width, height);
    var data = canvas.toDataURL('image/png');
	document.getElementById("scannedImage").src=data;
	var blobFile = dataURLToBlobNew(data) ;
    var fileObj = new File([blobFile], "uploaded_file.jpeg", { type: "image/jpeg", lastModified: Date.now() })
    setAWSCredentials(data);
	displayImagePreview();
  } 
}
function dataURLToBlobNew(dataURL) {
    var BASE64_MARKER = ';base64,';
    if (dataURL.indexOf(BASE64_MARKER) == -1) {
        var parts = dataURL.split(',');
        var contentType = parts[0].split(':')[1];
        var raw = decodeURIComponent(parts[1]);
        return new Blob([raw], {type: contentType});
    }
    var parts = dataURL.split(BASE64_MARKER);
    var contentType = parts[0].split(':')[1];
    var raw = window.atob(parts[1]);
    var rawLength = raw.length;
    var uInt8Array = new Uint8Array(rawLength);
    for (var i = 0; i < rawLength; ++i) {
        uInt8Array[i] = raw.charCodeAt(i);
    }
    return new Blob([uInt8Array], {type: contentType});
}

function displayImagePreview(){
	$("#scan-web").hide();
	$("#scan-mobile").hide();
	$("#scan-image").show();
}
function backToInput(){
	$("#create-job-container").show();
	$("#scan-image-container").hide();
}
</script>
<script id="scan-image-template" type="text/x-handlebars-template">
<form id="scanImageForm" class="form-horizontal" role="form" enctype="multipart/form-data">
	<fieldset>
		
		<div id="scan-image-cont">
	<div id="scan-web" class="container">
		<div class="custom-card click-web-img row">
			<div class="col-md-8 scan-web-img">
				<div class="camera" >
					<video  id="video" width="350"></video>
				</div>
				<canvas id="canvas" hidden="true" >
				</canvas>
			</div>
			<div class="col-md-2">
				<button class="btn btn-default" id="startbutton"><img src="" height="32" alt=""/>Let&#39;s Capture!</button>
			
	<div style="width:100%;text-align:center;"><span>OR</span></div>

<div class="file-upload" style="padding-bottom:15px;">
  <div class="file-select">
    <div class="file-select-button" id="fileName">Choose File</div>
    <div class="file-select-name" id="noFile">No file chosen...</div> 
    <input type="file" name="chooseFile" id="chooseFile" 
		 onchange="readURL(this);" accept="image/*;cature=camera">
  </div>
</div>
			</div>
		</div>
	</div>
	<div id="scan-mobile">
		

<div class="file-upload" style="padding-bottom:15px;">
  <div class="file-select">
    <div class="file-select-button" id="fileName">Choose File</div>
    <div class="file-select-name" id="noFile">No file chosen...</div> 
    <input type="file" name="chooseFile" id="chooseFile" 
		 onchange="readURL(this);" accept="image/*;cature=camera">
  </div>
</div>

	</div>
	<div id="scan-image" style="padding-bottom:25px;">
		<img width="320" height="240" id="scannedImage" >
	</div>
</div>

		<div class="col-sm-12 col-md-12 col-lg-12" >
			<div class="text-right col-button-colors" style="">
<a class="btn btn-danger" id="dialog-cancel" data-dismiss="modal"><liferay-ui:message key="cancel" /></a>				
<a class="btn btn-primary" onclick="backToInput();"><liferay-ui:message key="back" /></a>
				<button class="btn btn-success" onclick="" style="display:none;"><liferay-ui:message key="Next" /></button>
                
			</div>
		</div>
	<fieldset>
</form>
</script>
<script id="create-job-template" type="text/x-handlebars-template">
<form id="createJobForm" class="form-horizontal" role="form" enctype="multipart/form-data">
	<fieldset>

<div class="form-row">
   <label class="col-md-4 control-label" style="font-weight: 400" for="c12_regNo">Registration Number									      </label>										 
   <div class="col-md-7">
      <div>
         <span data-editor="" style="width:100%;display:table;">
<div class=""  style="width:90%;padding:0px;display:table-cell;">
<input id="c12_regNo" name="regNo" class="form-control input-md" style="border-radius:0.25rem 0rem 0rem 0.25rem;height:inherit;" placeholder="Registration Number" type="text">
</div>
<div class=""  style="width:10%;padding:0px;display:table-cell;">
<span onclick="filterType='regNo';scanImageForm('regNo');" class="form-control" data-toggle="tooltip" title="Capture Image" style="border-radius:0rem 0.25rem 0.25rem 0rem;border-left:none;height:inherit;">
                        <i class="fas fa-camera" style="font-size: larger;"></i>
                    </span>
</div>
</span>									        
         <div id="reg-error-msg" data-error=""></div>
      </div>
      <div class="col-md-12" style="margin-top: -10px;">
         <p class="text-muted" style="margin-top: 3px"></p>
      </div>
   </div>
</div>


		<div style="width:100%;text-align:center;"><span>OR</span></div>
		<div class="form-row">
   <label class="col-md-4 control-label" style="font-weight: 400" for="c12_vin">									        Vehicle Identification Number									      </label>										 
   <div class="col-md-7">
      <div>
         <span data-editor="" style="width:100%;display:table;">
<div class=""  style="width:90%;padding:0px;display:table-cell;">
<input id="c12_vin" name="vin" class="form-control input-md" style="border-radius:0.25rem 0rem 0rem 0.25rem;height:inherit;" placeholder="Vehicle Identification Number" type="text">
</div>
<div class=""  style="width:10%;padding:0px;display:table-cell;">
<span onclick="filterType='vin';scanImageForm('vin');" class="form-control" data-toggle="tooltip" title="Capture Image" style="border-radius:0rem 0.25rem 0.25rem 0rem;border-left:none;height:inherit;">
                        <i class="fas fa-camera" style="font-size: larger;"></i>
                    </span>
</div>
</span>									        
         <div id="vin-error-msg" data-error=""></div>
      </div>
      <div class="col-md-12" style="margin-top: -10px;">
         <p class="text-muted" style="margin-top: 3px"></p>
      </div>
   </div>
</div>



		<div class="col-sm-12 col-md-12 col-lg-12" >
			<div class="text-right col-button-colors" style="">
				<a class="btn btn-danger" id="dialog-cancel" data-dismiss="modal"><liferay-ui:message key="cancel" /></a>
				<button class="btn btn-success" onclick=""><liferay-ui:message key="Next" /></button>
                
			</div>
		</div>
	<fieldset>
</form>
</script>
<div id="create-job-card-dialog" style="display:none;"  tabindex="-1"  class="modal" role="dialog" aria-labelledby="Vehicle Details" aria-hidden="true">
  <div class="modal-dialog custom-width" style="" role="document">
  
    <div class="modal-content">
    	<div class="modal-header">
        	<h4 class="modal-title"><liferay-ui:message key="initiate_new_job" /></h4>
        	<button type="button" id="closeDialogBtn" class="close" data-dismiss="modal">&times;</button>
		</div>
      
      <div class="modal-body"  id="modal-container">
      	<div  id="create-job-container"></div>
      	<div  id="scan-image-container"></div>
	 </div><!-- /.modal-body -->
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal --> 	
<script type="text/javascript">
function setAWSCredentials(data){
	showProgress('scan-image-container');
	var base64Image = data.replace(/^data:image\/(png|jpeg|jpg);base64,/, '');
	var imageBytes = getBinary(base64Image);
	console.log("imageBytes:"+imageBytes);
	console.log("imageBytes:::"+JSON.stringify(imageBytes));
	 if(JSON.stringify(imageBytes) === JSON.stringify({})){
		console.log("imageBytes::empty:"+JSON.stringify(imageBytes));
		//imageBytes = dataURItoBlob(data) ;
		console.log("imageBytes::reset:"+JSON.stringify(imageBytes));
	} 
	var creds = new AWS.Credentials({
		  accessKeyId: 'AKIAURF4HATT24QGL47H', secretAccessKey: '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'
		});
	var myConfig = new AWS.Config({
		  credentials: creds, region: 'us-east-1'
		});
/* 	var rekognition = new AWS.Rekognition({apiVersion: '2016-06-27',region: 'us-east-1',
		 accessKeyId: 'AKIAURF4HATTRIDEOP56', secretAccessKey: '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'}); */
	
	var rekognition = new AWS.Rekognition({apiVersion: '2016-06-27',region: 'us-east-1',
		 accessKeyId: 'AKIAURF4HATT24QGL47H', secretAccessKey: '8YVHPy/BbgThTjKQwV7m0j89O/VSdofvGYJ3sJf3'});

	var params = {
			  Image: { /* required */
			    Bytes: imageBytes /* Strings will be Base-64 encoded on your behalf */,
			  }
	};
	//console.log("params:"+JSON.stringify(params));
	//debugger;
	rekognition.detectText(params, function(err, data) {
		console.log("detectText");
			  if (err) {
				  console.log(err, err.stack); // an error occurred
			//	  alert( err, err.stack);
			  }
			  else{
				  console.log(data);           // successful response
				  if(data.TextDetections != undefined){
					  $.each(data.TextDetections, function( index, value ) {
				//		  alert( index + ": " + value +":"+value.Type);
						 var detectedText = value.DetectedText;
						 console.log("detectedText:"+detectedText);
						 console.log("detectedText.length:"+detectedText.length);
						 console.log("filterType:"+filterType);
						 if(detectedText.length > 6){
							 console.log("filterType:::"+filterType);
							 if(filterType == "regNo"){
								 if(validateRegistrationNumber(detectedText)){
									 getRegNoVINRecord(detectedText,"");
									  return false;
								 }
									  
							  }else{
								  getRegNoVINRecord("",detectedText);
								  return false; 
							  }
							 
						 }
					});
					  
				  }else{
					  hideProgress();
				  }
			  }
	});
}

function getBinary(base64Image) {
	  var binaryImg = atob(base64Image);
	  var length = binaryImg.length;
	  var ab = new ArrayBuffer(length);
	  var ua = new Uint8Array(ab);
	  for (var i = 0; i < length; i++) {
	    ua[i] = binaryImg.charCodeAt(i);
	  }
	  return ab;
}
function dataURItoBlob(dataURI) {
    var binary = atob(dataURI.split(',')[1]);
    var array = [];
    for(var i = 0; i < binary.length; i++) {
        array.push(binary.charCodeAt(i));
    }
    return new Blob([new Uint8Array(array)], {type: 'image/jpeg'});
}

function isValidNumber(value){
	if(value.length==10){
        return true;
   }else{
	   return false;
   } 
	//var car_plate_number = /^[A-Z]{2}[0-9]{2}[A-Z]{2}[0-9]{4}$/;
	//return car_plate_number.test(value);
}
function validateRegistrationNumber(registrationNumber){
	  var res = registrationNumber.replace(/-/g, ' ').replace(/\s/g, "");
	  var patt = new RegExp("^[A-Z]{2}[0-9]{1,2}(?:[A-Z])?(?:[A-Z]*)?[0-9]{4}$");
	  var result = patt.test(res);
	  return result;
}
</script>

<%@ include file="bottom.jsp"%>

