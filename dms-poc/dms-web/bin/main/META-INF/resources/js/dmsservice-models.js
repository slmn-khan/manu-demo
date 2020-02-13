var dmsServiceBaseUrl = "/api/jsonws/dms.dms";
var DMSService = Backbone.Model.extend({
	label : 'DMSService',
	icon : '$ModelIconUrl$',
	visible : {
		"title" : {
			"title" : "Service Title",
			"type" : "Text",
			"validators" : [ "required" ]
		},
		"description" : {
			"title" : "Service Description",
			"type" : "TextArea",
			"validators" : [ "required" ]
		},
		"serviceType" : {
			"title" : "Service Type",
			"type" : "Text",
			"validators" : [ "required" ]
		},
		"cost" : {
			"title" : "Cost",
			"type" : "Text",
			"validates" : [ "required" ]
		},
		"time" : {
			"title" : "Time(In hours)",
			"type" : "Text",
			"validates" : [ "number", "required" ]
		},
		"active" : {
			"title" : "Active",
			"type" : "Select",
			"options" : [ "Yes", "No" ]
		},
		"kms" : {
			"title" : "Select Service Kilometre",
			"type" : "Select",
			"options" : [ "40000 Km", "60000 Km" ]
		}
	},
	localStorage : new Backbone.LocalStorage('tbl-dmsService'),
	url : dmsServiceBaseUrl + "/find",
	create : function() {
		this.url = dmsServiceBaseUrl + "/create";
		return Backbone.ajaxSync('create', this);
	},
	update : function() {
		this.url = dmsServiceBaseUrl + "/update";
		return Backbone.ajaxSync('create', this);
	},
	remove : function() {
		this.url = dmsServiceBaseUrl + "/delete";
		return Backbone.ajaxSync('create', this);
	},
	find : function(selectedDMSServiceId) {
		this.url = dmsServiceBaseUrl + "/find?id="+selectedDMSServiceId;
		return Backbone.ajaxSync('read', this);
	},
	toString : function() {
		return this.get('title');
	}
});

var DMSServiceCollection = Backbone.Collection.extend({
	model : DMSService,
	url : dmsServiceBaseUrl + "/find-all",
	localStorage : new Backbone.LocalStorage('tbl-dmsService'),
	download : function() {
		this.url = dmsServiceBaseUrl + "/find-all";
		return Backbone.ajaxSync('read', this);
	},
	allActiveDMSService : function() {
		this.url = dmsServiceBaseUrl + "/find-all-active";
		return Backbone.ajaxSync('read', this);
	},
	findAllByLoginMember : function() {
		this.url = dmsServiceBaseUrl + "/find-all-by-l-member" ;
		return Backbone.ajaxSync('read', this);
	}
});

var DMSServiceCreateForm = Backbone.Form.extend({
	schema : {
		"title" : {
			"title" : "Service Title",
			"type" : "Text",
			"validators" : [ "required" ],
			"editorClass" : "form-control input-md",
			editorAttrs : {
				placeholder : 'Service Title'
			}
		},
		"description" : {
			"title" : "Service Description",
			"type" : "TextArea",
			"editorClass" : "form-control",
			"validators" : [ "required", "description" ],
			editorAttrs : {
				placeholder : 'Service Description'
			}
		},
		"serviceType" : {
			"title" : "Service Type",
			"type" : "Text",
			"editorClass" : "form-control input-md",
			"validators" : [ "required" ]
		},
		"cost" : {
			"title" : "Cost",
			"type" : "Text",
			"editorClass" : "form-control input-md",
			"validates" : [ "required" ]
		},
		"time" : {
			"title" : "Time (In hours)",
			"type" : "Text",
			editorAttrs : {
				placeholder : '2'
			},
			"editorClass" : "form-control input-md",
			"validates" : [ "number", "required" ]
		},
		"active" : {
			"title" : "Status",
			"type" : "Radio",
			"options" : [ {
				"val" : "Yes",
				"label" : "Yes"
			}, {
				"val" : "No",
				"label" : "No"
			} ],
			fieldAttrs : {
				"data-bind" : "radio",
				"data-condition" : "yes"
			},
			"validators" : [ "required" ]
		},
		"kms" : {
			"title" : "Select Service Kilometre",
			"type" : "Select",
			"editorClass" : "form-control",
			"options" : [ {
				"val" : "40000",
				"label" : "40000 Km"
			}, {
				"val" : "60000",
				"label" : "60000 Km"
			} ]
		}
	}
});

var DMSServiceEditForm = Backbone.Form.extend({
	schema : {
		"id" : {
			"id" : "ID",
			"type" : "Hidden"
		},
		"title" : {
			"title" : "Service Title",
			"type" : "Text",
			"validators" : [ "required" ],
			"editorClass" : "form-control input-md",
			editorAttrs : {
				placeholder : 'Service Title'
			}
		},
		"description" : {
			"title" : "Service Description",
			"type" : "TextArea",
			"editorClass" : "form-control",
			"validators" : [ "required", "description" ],
			editorAttrs : {
				placeholder : 'Service Description'
			}
		},
		"serviceType" : {
			"title" : "Service Type",
			"type" : "Text",
			"editorClass" : "form-control input-md",
			"validators" : [ "required" ]
		},
		"cost" : {
			"title" : "Cost",
			"type" : "Text",
			"editorClass" : "form-control input-md",
			"validates" : [ "required" ]
		},
		"time" : {
			"title" : "Time (In hours)",
			"type" : "Text",
			editorAttrs : {
				placeholder : '2'
			},
			"editorClass" : "form-control input-md",
			"validates" : [ "number", "required" ]
		},
		"active" : {
			"title" : "Status",
			"type" : "Radio",
			"options" : [ {
				"val" : "Yes",
				"label" : "Enabled"
			}, {
				"val" : "No",
				"label" : "Disabled"
			} ],
			fieldAttrs : {
				"data-bind" : "radio",
				"data-condition" : "yes"
			},
			"validators" : [ "required" ]
		},
		"kms" : {
			"title" : "Select Service Kilometre",
			"type" : "Select",
			"editorClass" : "form-control",
			"options" : [ {
				"val" : "40000",
				"label" : "40000 Km"
			}, {
				"val" : "60000",
				"label" : "60000 Km"
			} ]
		}
	}
});
