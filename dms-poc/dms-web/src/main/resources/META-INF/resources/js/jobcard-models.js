var jobCardBaseUrl = "/api/jsonws/dmspoc.dmspoc";
var JobCard = Backbone.Model.extend({
	label : 'JobCard',
	icon : '$ModelIconUrl$',
	idAttribute : 'dmsPocId',
	visible : {
		"id" : {
			"title" : "Id",
			"type" : "Text"
		},
		"regNo" : {
			"title" : "Vehicle Registration Number",
			"type" : "Text",
			"validators" : [ "required" ]
		},
		"model" : {
			"title" : "Model",
			"type" : "Text",
			"validators" : [ "required" ]
		},
		"VIN" : {
			"title" : "Vehicle Identification Number",
			"type" : "Text",
			"validators" : [ "required" ]
		},
		"repairOrderNo" : {
			"title" : "Repair Order Number",
			"type" : "Text",
			"validates" : [ "required" ]
		},
		"status" : {
			"title" : "Status",
			"type" : "Text",
			"validates" : [ "number", "required" ]
		}
	},
	localStorage : new Backbone.LocalStorage('tbl-jobCard'),
	url : jobCardBaseUrl + "/find",
	create : function() {
		this.url = jobCardBaseUrl + "/create";
		return Backbone.ajaxSync('create', this);
	},
	update : function() {
		this.url = jobCardBaseUrl + "/update";
		return Backbone.ajaxSync('create', this);
	},
	remove : function() {
		this.url = jobCardBaseUrl + "/delete";
		return Backbone.ajaxSync('create', this);
	},
	find : function(selectedJobCardId) {
		this.url = jobCardBaseUrl + "/find?id="+selectedJobCardId;
		return Backbone.ajaxSync('read', this);
	},
	toString : function() {
		return this.get('vin');
	}
});

var JobCardCollection = Backbone.Collection.extend({
	model : JobCard,
	url : jobCardBaseUrl + "/find-all",
	localStorage : new Backbone.LocalStorage('tbl-jobCard'),
	download : function() {
		this.url = jobCardBaseUrl + "/find-all-to-show";
		return Backbone.ajaxSync('read', this);
	}
});

var JobFetchForm = Backbone.Form.extend({
	schema : {
		"vin" : {
			"title": "Vehicle Identification Number",
			"type" : "Text",
			"editorClass" : "form-control input-md",
			editorAttrs: {placeholder: 'Vehicle Identification Number'}
		},
		"regNo" : {
			"title" : "Registration Number",
			"type" : "Text",
			"editorClass" : "form-control input-md",
			editorAttrs: {placeholder: 'Registration Number'}
		}
		
		
	}
});
var ScanImageForm = Backbone.Form.extend({
	schema : {
		"image" : {
			"title": "Scan Image",
			"type" : "ImagePicker",
			"editorClass" : "form-control input-md",
			editorAttrs: {placeholder: 'Scan Image'}
		}
	}
});

