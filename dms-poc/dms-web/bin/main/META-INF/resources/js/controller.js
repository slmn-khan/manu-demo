//Backbone.emulateJSON = true;
//Backbone.emulateHTTP = true;

var user, activePage;
var loading = true;
var notificationListScroll;
var moduleDefinitionCollection;

/*$.ajaxSetup({
	timeout : 900000//15 Mins
});*/

function customFileOnClick(ele) {
	var fileElementName = $(ele).parent().closest('div').siblings('input')
			.attr('name');
	$("input[name = '" + fileElementName + "']").unbind('click');
	$("input[name = '" + fileElementName + "']").click();
	$("input[name = '" + fileElementName + "']").unbind('change');
	$("input[name = '" + fileElementName + "']").change(function() {
		var fileName = $(this).val().replace(/C:\\fakepath\\/i, '');
		var inputElement = $(ele).siblings('span');
		var tmpFileName = "";
		if (fileName.length > 15) {
			tmpFileName = fileName.substring(0, 15) + '...';
		} else {
			tmpFileName = fileName;
		}

		$(inputElement).text(tmpFileName);
	});
}
function customMultipleFileOnClick(ele) {
	console.log(ele);
	var fileElementName = $(ele).parent().closest('div').siblings('input')
			.attr('name');
	console.log("file element name:"+fileElementName);
	$("input[name = '" + fileElementName + "']").unbind('click');
	$("input[name = '" + fileElementName + "']").click();
	$("input[name = '" + fileElementName + "']").unbind('change');
	$("input[name = '" + fileElementName + "']").change(function() {
		var names = [];
	    for (var i = 0; i < $(this).get(0).files.length; ++i) {
	        names.push($(this).get(0).files[i].name);
	        console.log(names[i]);
	    }
		
		var fileName = $(this).val().replace(/C:\\fakepath\\/i, '');
		var inputElement = $(ele).siblings('span');
		var tmpFileName = "";
		if (fileName.length > 15) {
			tmpFileName = fileName.substring(0, 15) + '...';
		} else {
			tmpFileName = fileName;
		}

		$(inputElement).text(tmpFileName);
	});
}



/*$(document).ajaxSend(
		function(e, xhr, options) {
			try {
				xhr.setRequestHeader('Content-Type',
						'application/x-www-form-urlencoded');
				xhr.setRequestHeader('Accept', 'application/json');
				xhr.setRequestHeader('Authorization', 'Basic dGVzdEBsaWZlcmF5LmNvbTp0ZXN0');
				var pAuth = Liferay.authToken;
				console.log("pauth:"+pAuth);
				xhr.setRequestHeader('p_auth',''+ pAuth);
				if(options.data != undefined){
					console.log("options.data:"+options.data);
					//options.data = $.param(JSON.parse(options.data));
				}
				console.log("added pauth auth");
			} catch (e) {
				console.log("ajaxsend error"+e);
			}
		});
*/
//function setAjaxSendJson(){
	$(document).ajaxSend(
			function(e, xhr, options) {
				try {
					//console.log("options::"+JSON.stringify(options));
					
					xhr.setRequestHeader('Accept', 'application/json');
					var host = window.location.hostname;
					//console.log("host:"+host);
					if(host.includes("liferay.teamcomputers.com")){
						xhr.setRequestHeader('Authorization', 'Basic cG9ydGFsYWRtaW5AdGVhbWNvbXB1dGVycy5jb206TGlmZXJheUBAMjAxOQ==');
					}else {
						xhr.setRequestHeader('Authorization', 'Basic dGVzdEBsaWZlcmF5LmNvbTp0ZXN0');
					}
					//xhr.setRequestHeader('Authorization', 'Basic dGVzdEBsaWZlcmF5LmNvbTp0ZXN0');
					var pAuth = Liferay.authToken;
					//console.log("pauth:"+pAuth);
					xhr.setRequestHeader('p_auth',''+ pAuth);
					if(options.data != undefined && options.dataType != "text"){
						console.log("options.data:"+options.data);
						options.data = $.param(JSON.parse(options.data));
						xhr.setRequestHeader('Content-Type',
						'application/x-www-form-urlencoded');
					}
					//console.log("added pauth auth");
				} catch (e) {
					console.log("ajaxsend error"+e);
				}
			});	
//}

$(document)
		.on(
				"deviceready",
				function() {
					window.requestFileSystem(LocalFileSystem.PERSISTENT, 0,
							ImageIO.gotFS, ImageIO.errorHandler);

					document.addEventListener("backbutton", onBackKeyDown,
							false);
					deviceType = (navigator.userAgent.match(/iPad/i)) == "iPad" ? "iPad"
							: (navigator.userAgent.match(/iPhone/i)) == "iPhone" ? "iPhone"
									: (navigator.userAgent.match(/Android/i)) == "Android" ? "Android"
											: (navigator.userAgent
													.match(/BlackBerry/i)) == "BlackBerry" ? "BlackBerry"
													: "null";
					deviceId = device.uuid;
					ImgCache.options.debug = true;
					ImgCache.options.chromeQuota = 50 * 1024 * 1024;
					ImgCache.init();
				});
/*
window.onerror = function(e) {
	alert(e);
};*/
window.onerror = function (errorMsg, url, lineNumber, column, errorObj) {
	console.log("window.onerror:"+errorObj);
	console.log("window.errorMsg:"+errorMsg);
    if (errorMsg.indexOf('Unexpected end of JSON input') > -1) {
        return;
    }else if (errorMsg.indexOf('JSON.parse: unexpected end of data') > -1) {
        return;
    }else if (errorMsg.indexOf("Uncaught TypeError: Cannot read property 'all' of null") > -1) {
        return;
    }else{
    	alert(errorMsg);
    }
};


function changeDateTimeFormat(dateToChange) {
	return moment(new Date(dateToChange)).format('YYYY-MM-DD');
}

function changeDateDDMMYYYYFormat(dateToChange) {
	return moment(new Date(dateToChange)).format('DD-MM-YYYY');
}
function changeDateHHMMFormat(dateToChange) {
	return moment(new Date(dateToChange)).format('HH:mm');
}

function changeDateTimeFormatLastActivity(dateToChange, localeCode) {
	return moment(new Date(dateToChange)).lang(localeCode).format(
			'D MMM YYYY ,HH:mm A');
}

function changeDateTimeFormatBootStrap(dateToChange) {
	return moment(new Date(dateToChange)).format('YYYY-MM-DD HH:mm');
}

$.fn.serializeObject = function() {
	var o = {};

	var a = this.serializeArray();
	$.each(a, function() {
		if (o[this.name] !== undefined) {
			if (!o[this.name].push) {
				o[this.name] = [ o[this.name] ];
			}
			o[this.name].push(this.value || '');
		} else {
			o[this.name] = this.value || '';
		}
	});
	return o;
};

function submitLogin() {
	var uName = $("#usernameText").val();
	var uPassword = $("#passwordText").val();

	if (uName == null || uName == "") {
		toast('Enter a valid username');
	} else if (uPassword == null || uPassword == "") {
		toast('Enter a valid password');
	} else {
		showProgress("Please wait");
		user = new User();
		user.set("id", "0");
		user.set("uName", uName);
		user.set("uPassword", uPassword);

		user.login().done(
						function(userModel) {
							hideProgress();

							var userDetail = new User(userModel);
							if (userDetail.get('userId') != undefined) {
								userDetail.set('id', '0');
								userDetail.set("uName", uName);
								userDetail.set("uPassword", uPassword);
								userDetail.save();
								user = userDetail;
								$("#usernameText").val('')
								$("#passwordText").val('')
								onLoginSuccess();

							} else {
								$("#passwordText").val('');
								toast("You have entered invalid credentials. Please enter valid details to Login");
							}
						}).error(function(e) {
					handleError(e);
				});
	}
}

var loadActionItems = function() {

	alert('Success');

}

var checkLogin = function() {
	var userCollection = new UserCollection();
	userCollection.fetch().done(function(savedUsers) {
		if (savedUsers.length > 0) {
			var savedUser = new User(savedUsers[0]);
			user = savedUser;
			if (user.has('userId')) {
				onLoginSuccess();
			} else {
				$.afui.loadContent("#login-page", false, false, "up-reveal");
			}
		} else {
			$.afui.loadContent("#login-page", false, false, "up-reveal");
		}
	})
}

var loadRelatedObjects = function(form) {
	var object = form.model;

	for ( var property in presentableFields) {
		var presentableProperty = presentableFields[property];

		try {
			presentableProperty.data = object.get(property);
			if (presentableProperty['type'] == 'Select'
					|| presentableProperty['type'] == 'Radio') {
				var options = form.schema[property].options;
				if (options instanceof Backbone.Collection) {
					$(collectionField).append(
							"<option value=''>Please Select</option>");
					options.download().done(
							function(response) {
								response.forEach(function(collectionObject) {
									var collectionField = form.elements
											.namedItem(property);
									$(collectionField).append(
											"<option value='"
													+ collectionObject.id
													+ "'>" + collectionObject
													+ "</option>");
								})
							});
				}
			}

		} catch (e) {
		}
	}

}

var getPresentableProperties = function(form) {
	var object = form.model;
	var presentableProperties = [];
	var presentableFields = object.visible;
	for ( var property in presentableFields) {
		var presentableProperty = presentableFields[property];

		try {
			presentableProperty.data = object.get(property);
			if (presentableProperty.data == ''
					|| presentableProperty.data == null) {
				presentableProperty.data = "Not found";
			} else {
				if (presentableProperty['type'] == 'Date'
						|| presentableProperty['type'] == 'DatePicker') {
					presentableProperty.data = changeDateTimeFormat(presentableProperty.data);
				} else if (presentableProperty['type'] == 'Select'
						|| presentableProperty['type'] == 'Radio') {
					var options = form.schema[property].options;
					if (options instanceof Backbone.Collection) {
						options.fetch();
						presentableProperty.data = options.get(
								object.get(property)).toString();
					} else if (options[0].label != undefined) {
						options.forEach(function(o) {
							if (o.val == object.get(property)) {
								presentableProperty.data = o.label;
							}

						});

					}
				}
			}

			presentableProperties.push(presentableProperty);

		} catch (e) {
		}
	}
	return presentableProperties;
}
var getPresentableProperties1 = function(form) {
	var object = form.model;
	console.log("presentableProperty.object" + JSON.stringify(object));
	var presentableProperties = [];
	var presentableFields = object.visible;
	var questionType,contentType;
	for ( var property in presentableFields) {
		var presentableProperty = presentableFields[property];

		try {
			console.log("presentableProperty.data" + object.get(property));

			presentableProperty.data = object.get(property).toString();
			console.log("presentableProperty.data" + presentableProperty.data);
			if (presentableProperty.data == ''
					|| presentableProperty.data == null) {
				presentableProperty.data = liferayMessagesAsPerLocale["not_found"];
			} else {
				if (presentableProperty['type'] == 'Date'
						|| presentableProperty['type'] == 'DatePicker') {
					presentableProperty.data = changeDateTimeFormat(presentableProperty.data);
				} else if (presentableProperty['type'] == 'Select'
						|| presentableProperty['type'] == 'Radio') {
					var options = form.schema[property].options;
					console.log("property" + property);
					if (property == "questionType") {
						questionType = object.get(property);
						console.log("presentableProperty.questionType"
								+ questionType);
					}
					if (property == "contentType") {
						contentType = object.get(property);
						console.log("presentableProperty.contentType"
								+ contentType);
					}
					if (property == "courseId") {
						presentableProperty.data = object.get("courseTitle")
								.toString();

						console.log("property::::" + presentableProperty.data
								+ "::" + property);
						console.log("property::"
								+ object.get("courseTitle").toString());
					} else if (property == "lessonId") {
						presentableProperty.data = object.get("lessonTitle")
								.toString();
					} else if (property == "difficultyLevelId") {
						presentableProperty.data = object.get(
								"difficultyLevelTitle").toString();
					} else if (property == "labId") {
						presentableProperty.data = object.get("labTitle")
								.toString();
					} else if (property == "instructionText") {
						presentableProperty.data = object.get("instructionText")
								.toString();
					} else if (property == "assessmentCategoryTitle") {
						presentableProperty.data = object.get(
						"assessmentCategoryTitle").toString();
					} else {
						if (options instanceof Backbone.Collection) {
							options.fetch();
							presentableProperty.data = options.get(
									object.get(property)).toString();
							console.log("property33::::"
									+ presentableProperty.data + "::"
									+ property);

						} else if (options[0].label != undefined) {
							options.forEach(function(o) {
								if (o.val == object.get(property)) {
									presentableProperty.data = o.label;
								}

							});
							console.log("property44::::"
									+ presentableProperty.data + "::"
									+ property);

						}
					}
				}
			}
			if (!(questionType == "Topic" && property == "labId")) {
				presentableProperties.push(presentableProperty);
			}

		} catch (e) {
		}
	}
	console
			.log("presentableProperties"
					+ JSON.stringify(presentableProperties));
	return presentableProperties;
}
var getPresentablePropertiesLabQuestion = function(form,selectedModel) {
	
	var object = form.model;
	console.log("presentableProperty.object" + JSON.stringify(object));
	var presentableProperties = [];
	var presentableFields = object.visible;
	var questionType,contentType;
	for ( var property in presentableFields) {
		var presentableProperty = presentableFields[property];

		try {
			console.log("presentableProperty.data" + object.get(property));

			presentableProperty.data = object.get(property).toString();
			console.log("presentableProperty.data" + presentableProperty.data);
			if (presentableProperty.data == ''
					|| presentableProperty.data == null) {
				//presentableProperty.data = liferayMessagesAsPerLocale["not_found"];
				
			} else {
				if (presentableProperty['type'] == 'Date'
						|| presentableProperty['type'] == 'DatePicker') {
					presentableProperty.data = changeDateTimeFormat(presentableProperty.data);
				} else if (presentableProperty['type'] == 'Select'
						|| presentableProperty['type'] == 'Radio') {
					var options = form.schema[property].options;
					console.log("property" + property);
					if (property == "questionType") {
						questionType = object.get(property);
						console.log("presentableProperty.questionType"
								+ questionType);
					}
					if (property == "contentType") {
						contentType = object.get(property);
						console.log("presentableProperty.contentType"
								+ contentType);
					}
					if (property == "courseId") {
						presentableProperty.data = object.get("courseTitle")
								.toString();

						console.log("property::::" + presentableProperty.data
								+ "::" + property);
						console.log("property::"
								+ object.get("courseTitle").toString());
					} else if (property == "lessonId") {
						presentableProperty.data = object.get("lessonTitle")
								.toString();
					} else if (property == "difficultyLevelId") {
						presentableProperty.data = object.get(
								"difficultyLevelTitle").toString();
					} else if (property == "labId") {
						presentableProperty.data = object.get("labTitle")
								.toString();
					} else if (property == "instructionText") {
						presentableProperty.data = object.get("instructionText")
								.toString();
					} else if (property == "assessmentCategoryTitle") {
						presentableProperty.data = object.get(
						"assessmentCategoryTitle").toString();
					} else {
						if (options instanceof Backbone.Collection) {
							options.fetch();
							presentableProperty.data = options.get(
									object.get(property)).toString();
							console.log("property33::::"
									+ presentableProperty.data + "::"
									+ property);

						} else if (options[0].label != undefined) {
							options.forEach(function(o) {
								if (o.val == object.get(property)) {
									presentableProperty.data = o.label;
								}

							});
							console.log("property44::::"
									+ presentableProperty.data + "::"
									+ property);

						}
					}
				}
			}
			presentableProperty.propertyName = property;
			if (!(questionType == "Topic" && property == "labId")) {
				presentableProperties.push(presentableProperty);
			}

		} catch (e) {
		}
	}
	console
			.log("presentableProperties"
					+ JSON.stringify(presentableProperties));
	return presentableProperties;
}
var onLoginSuccess = function() {

	if (moduleDefinitionCollection == undefined) {
		moduleDefinitionCollection = new ModuleDefinitionCollection();
		moduleDefinitionCollection.fetch();
	}

	moduleDefinitionCollection.download().done(function(response) {
		if (response != undefined && response.exception == null) {
			response.forEach(function(model) {
				var moduleDefinition = new ModuleDefinition(model);
				moduleDefinition.save();
				moduleDefinitionCollection.add(moduleDefinition);
			});
		}
	});

	$.afui.loadContent("#home-page", false, false, "slide");
	setTimeout("syncOfflineUpdates()", 0);
	// setInterval("syncOfflineUpdates()", 60000);
	// setTimeout("pushRegistration()", 400);
	// $.mobile.changePage('#flightlist', { transition: "pop", changeHash:
	// false}); //{changeHash: false} for not
}

var syncOfflineUpdates = function() {
	//
}

/*
 * var toast = function(message){ navigator.notification.alert( message, //
 * message function(){}, // callback "App Message", // title 'Ok' // buttonName ); }
 */

/*var handleError = function(e) {
	hideProgress();
	if (e.readyState == 0 && e.statusText == 'timeout') {
		toast(liferayMessagesAsPerLocale["connection_timeout"]);
	} else if (e.readyState == 0 && e.statusText == 'error') {
		toast(liferayMessagesAsPerLocale["no_internet_connection"]);
	} else if (e.readyState == 4 && e.statusText == 'Internal Server Error') {
		toast(liferayMessagesAsPerLocale["server_is_not_responding_well_please_try_after_sometime"]);
	}
}*/
var handleError = function(e) {
	hideProgress();
	if (e.readyState == 0 && e.statusText == 'timeout') {
		toast(liferayMessagesAsPerLocale["connection_timeout"]);
	} else if (e.readyState == 0 && e.statusText == 'error') {
		toast(liferayMessagesAsPerLocale["no_internet_connection"]);
	} else if (e.readyState == 4 && e.statusText == 'Internal Server Error') {
		toast(liferayMessagesAsPerLocale["server_is_not_responding_well_please_try_after_sometime"]);
	} else if(e.responseJSON != undefined){
		alert(e.responseJSON.exception);
	}else if(e.status == 403){
		alert("You are not allowed to access the resource.");
	}else{
		alert(e.statusText);
	}
}
var handleErrorLab = function(e) {
	hideProgress();
	console.log(JSON.stringify(e));
	console.log("handleErrorLab e.statusText" + e.statusText);
	if (e.readyState == 0 && e.statusText == 'timeout') {
		toast(liferayMessagesAsPerLocale["please_try_again"]);
	} else if (e.readyState == 0 && e.statusText == 'error') {
		toast(liferayMessagesAsPerLocale["no_internet_connection"]);
	} else if (e.readyState == 4 && e.statusText == 'Internal Server Error') {
		toast(liferayMessagesAsPerLocale["server_is_not_responding_well_please_try_after_sometime"]);
	}
}
function toast(message) {
	openOkBox(message);
}

var showProgress = function(targetContainer) {
	spinner.spin(document.getElementById(targetContainer));
}

var spinner;
function initProgressBar() {
	if (spinner == null) {
		var opts = {
			lines : 13 // The number of lines to draw
			,
			length : 3 // The length of each line
			,
			width : 5 // The line thickness
			,
			radius : 10 // The radius of the inner circle
			,
			scale : 1 // Scales overall size of the spinner
			,
			corners : 1 // Corner roundness (0..1)
			,
			color : '#000' // #rgb or #rrggbb or array of colors
			,
			opacity : 0.25 // Opacity of the lines
			,
			rotate : 0 // The rotation offset
			,
			direction : 1 // 1: clockwise, -1: counterclockwise
			,
			speed : 3 // Rounds per second
			,
			trail : 60 // Afterglow percentage
			,
			fps : 20 // Frames per second when using setTimeout() as a
			// fallback for CSS
			,
			zIndex : 2e9 // The z-index (defaults to 2000000000)
			,
			className : 'spinner' // The CSS class to assign to the spinner
			,
			top : '50%' // Top position relative to parent
			,
			left : '50%' // Left position relative to parent
			,
			shadow : false // Whether to render a shadow
			,
			hwaccel : false // Whether to use hardware acceleration
			,
			position : 'absolute' // Element positioning
		}
		spinner = new Spinner(opts);
	}
}

initProgressBar();

var hideProgress = function() {
	spinner.stop();
}

var logout = function() {
	localStorage.clear();
	document.location.href = "./index.html";
}

$(document).on('panelload', function() {
	setTimeout(function() {
		activePage = $('div .panel.active').attr("id");
		loading = false;
	}, 20);

});

$(document).on('panelbeforeunload', '#home-page', function() {
	$("#left-menu-button").hide();
});

$(document).on('panelload', '#home-page', function() {
	$("#left-menu-button").show();
});

var onBackKeyDown = function(e) {

	if (loading) {
		e.preventDefault();
		return;
	} else {
		loading = true;
	}
	if (activePage == 'login-page' || activePage == 'home-page') {
		e.preventDefault();
		// navigator.app.exitApp();
	} else {
		$.afui.goBack();
	}
}

Handlebars.registerHelper('if_eq', function(a, b, opts) {
	if (a == b) // Or === depending on your needs
		return opts.fn(this);
	else
		return opts.inverse(this);
});

var onBackKeyDown = function(e) {

	if (loading) {
		e.preventDefault();
		return;
	} else {
		loading = true;
	}

	if (activePage == 'login-page' || activePage == 'home-page') {
		e.preventDefault();
		// navigator.app.exitApp();
	} else {
		$.afui.goBack();
	}
}

Handlebars.registerHelper('icon', function(a) {
	if (a == 'Open') {
		return 'fa-square-o';
	} else if (a == 'In Progress') {
		return 'fa-cog';
	} else if (a == 'Resolved') {
		return 'fa-thumbs-up';
	} else if (a == 'Closed') {
		return 'fa-check-square';
	}
});

Handlebars.registerHelper('lowercase', function(a) {
	return a.toLowerCase();
});

Backbone.Form.editors.DateTimePicker = Backbone.Form.editors.Text
		.extend({
			tagName : "div",
			events : {
				'change .picker__input' : 'setDateTime',
				'change .hourInput' : 'setDateTime',
				'change .minuteInput' : 'setDateTime',
				'click .remove' : 'removeFile'
			},
			setDateTime : function() {
				this.$input
						.val(this.$dateInput.val() + " "
								+ this.$hourInput.val() + ":"
								+ this.$minuteInput.val());
			},
			initialize : function(options) {
				Backbone.Form.editors.Hidden.prototype.initialize.call(this,
						options);
				this.$input = $('<input style="display:none;float:left" type="hidden" name="'
						+ this.key + '"/>');
				this.$dateInput = $('<input type="text" style="width:56%;float:left;padding-left: 0px;padding-right: 0px;" name="'
						+ this.key + '-date-input" />');
				var hourOptions;
				for (var i = 0; i < 24; i++) {
					var hh = (i < 10) ? "0" + i : i;
					hourOptions = hourOptions + '<option value="' + hh + '">'
							+ hh + '</option>';
				}
				this.$hourInput = $('<select pattern="[0-9]*" style="width:10%;background:none;padding:0;"  class="hourInput" name="'
						+ this.key
						+ '-hour-input">'
						+ hourOptions
						+ '</select>');
				var minuteOptions;

				for (var i = 0; i < 60; i++) {
					var mm = (i < 10) ? "0" + i : i;
					minuteOptions = minuteOptions + '<option value="' + mm
							+ '">' + mm + '</option>';
				}
				this.$minuteInput = $('<select pattern="[0-9]*" style="width:34%;background:none;padding:0;padding-left: 3px;" class="minuteInput hasDateTimePicker" name="'
						+ this.key
						+ '-minute-input">'
						+ minuteOptions
						+ '</select>');
				this.$error = $('<div class="error">Error</div>');
			},
			render : function() {
				// Call the parent's render method
				Backbone.Form.editors.Hidden.prototype.render.apply(this,
						arguments);
				this.$el.append(this.$dateInput);
				this.$el.append(this.$hourInput);
				this.$el.append(this.$minuteInput);
				this.$el.append(this.$input);
				this.$el.attr("style", "float:left;width:50%");

				this.$dateInput.pickadate({
					formatSubmit : 'yyyy-mm-dd',
					format : 'yyyy-mm-dd',
					container : '#container',
					// editable: true,
					min : moment(this.$input.val()).add(
							this.$el.attr("mindatevalue"), "days").format(
							"YYYY-MM-DD"),
					max : moment(this.$input.val()).add(
							this.$el.attr("maxdatevalue"), "days").format(
							"YYYY-MM-DD"),
					closeOnSelect : true,
					closeOnClear : false,
					showMonthsShort : true
				});

				// this.$el.addClass('hasDateTimePicker');
				// this.$el.append(this.$list);
				return this;
			},
			getValue : function() {
				var val = this.$input.val();
				return val;
			},
			// The set value must correctl
			setValue : function(value) {
				if (value == "") {
					value = new Date();
				}

				this.$dateInput.val(moment(value).format('YYYY-MM-DD'));
				this.$hourInput.val(moment(value).format('HH'));
				this.$minuteInput.val(moment(value).format('mm'));
				this.$input.val(moment(value).format('YYYY-MM-DD HH:mm'));
			}
		});

var logoutPrompt = function() {
	navigator.notification.confirm('Are you sure you want to sign off?', // message
	function(buttonIndex) {
		if (buttonIndex == 1) {
			showProgress("Please Wait...");
			localStorage.clear();
			$.afui.clearHistory();
			document.location.href = "./index.html";
		}
	}, 'Please confirm', [ 'Yes', 'No' ]);
}

Backbone.Form.editors.DatePicker = Backbone.Form.editors.Text.extend({
	render : function() {
		// Call the parent's render method
		Backbone.Form.editors.Text.prototype.render.call(this);
		// Then make the editor's element a datepicker.
		this.$el.addClass('hasDatePicker');
		this.$el.datepicker();
		// var picker = $input.pickadate('picker');
		// this.$el.pickadate({min:moment(new Date()).subtract("30",
		// "days").format("YYYY-MM-DD")});

		return this;
	},

	// The set value must correct
	setValue : function(value) {
		if (value == "") {
			value = new Date();
		}
		console.log("date:" + moment(value).format('YYYY-MM-DD'));
		this.$el.val(moment(value).format('YYYY-MM-DD'));
		// /this.$el.trigger('blur');
	}
});

Backbone.Form.editors.DatePickerBootstrap = Backbone.Form.editors.Text.extend({
	render : function() {
		// debugger;
		// Call the parent's render method
		Backbone.Form.editors.Text.prototype.render.call(this);
		// Then make the editor's element a datepicker.
		this.$el.addClass('hasDatePicker');
		this.$el.datepicker({
			format : 'yyyy-mm-dd',
			endDate : '-1d'
		});
		// var picker = $input.pickadate('picker');
		// this.$el.pickadate({min:moment(new Date()).subtract("30",
		// "days").format("YYYY-MM-DD")});

		return this;
	},

	// The set value must correct
	setValue : function(value) {
		if (value == "") {
			value = new Date();
		}
		console.log("date:" + moment(value).format('YYYY-MM-DD'));
		this.$el.val(moment(value).format('YYYY-MM-DD'));
		// /this.$el.trigger('blur');
	}
});

Backbone.Form.editors.LastDateDisableDatePickerBootstrap = Backbone.Form.editors.Text
		.extend({
			render : function() {
				// debugger;
				// Call the parent's render method
				Backbone.Form.editors.Text.prototype.render.call(this);
				// Then make the editor's element a datepicker.
				this.$el.addClass('hasDatePicker');
				this.$el.datepicker({
					format : 'yyyy-mm-dd',
					startDate : new Date()
				});
				// var picker = $input.pickadate('picker');
				// this.$el.pickadate({min:moment(new Date()).subtract("30",
				// "days").format("YYYY-MM-DD")});

				return this;
			},

			// The set value must correct
			setValue : function(value) {
				if (value == "") {
					value = new Date();
				}
				console.log("date:" + moment(value).format('YYYY-MM-DD'));
				this.$el.val(moment(value).format('YYYY-MM-DD'));
				// /this.$el.trigger('blur');
			}
		});

Backbone.Form.editors.DateTimePickerCurrentDateBootstrap = Backbone.Form.editors.Text
		.extend({
			render : function() {
				// Call the parent's render method
				Backbone.Form.editors.Text.prototype.render.call(this);
				// Then make the editor's element a datepicker.
				// this.$el.addClass('hasDatePicker');
				this.$el.datetimepicker({
					format : 'YYYY-MM-DD HH:mm',
					collapse : true,
					minDate : new Date()
				// showMeridian : false
				});

				return this;
			},

			// The set value must correct
			setValue : function(value) {
				if (value == "") {
					value = new Date();
				}
				console.log("date:" + moment(value).format('YYYY-MM-DD HH:mm'));
				this.$el.val(moment(value).format('YYYY-MM-DD HH:mm'));
				// /this.$el.trigger('blur');
			}
		});

Backbone.Form.editors.DateTimePickerBootstrap = Backbone.Form.editors.Text
		.extend({
			render : function() {
				// Call the parent's render method
				Backbone.Form.editors.Text.prototype.render.call(this);
				// Then make the editor's element a datepicker.
				// this.$el.addClass('hasDatePicker');
				this.$el.datetimepicker({
					format : 'YYYY-MM-DD HH:mm',
					collapse : true,
					minDate : new Date()
				// showMeridian : false
				});

				return this;
			},

			// The set value must correct
			setValue : function(value) {
				if (value == "") {
					value = new Date();
				}
				console.log("date:" + moment(value).format('YYYY-MM-DD HH:mm'));
				this.$el.val(moment(value).format('YYYY-MM-DD HH:mm'));
				// /this.$el.trigger('blur');
			}
		});

Backbone.Form.editors.FieldSeparator = Backbone.Form.editors.Text.extend({
	render : function() {
		// Call the parent's render method
		Backbone.Form.editors.Text.prototype.render.call(this);
	},

	// The set value must correct
	setValue : function(value) {
		this.$el.val("");
		// /this.$el.trigger('blur');
	}
});

Backbone.Form.editors.ImagePicker = Backbone.Form.editors.Base
		.extend({

			template : _
					.template('<input type="file" accept=".jpg,.jpeg,.png,.svg,.gif">'),

			initialize : function(options) {
				Backbone.Form.editors.Base.prototype.initialize.call(this,
						options);
				this.$el.attr('type', 'file');
			},
			render : function() {
				var $el = $(this.template());
				$el.attr('name', this.key);
				$el.attr('style', 'display:none');
				var tmpDiv = $('<div></div>');
				var customFileButton = $('<div class="inputBtnSection" style="width:100%"><span class="form-control input-md input-responsive" style="width: 70%;display: inline-block;" >'
						+ 'Choose file...'
						+ '</span><button type="button" onclick="customFileOnClick(this);" class="btn btn-primary btn-responsive"style="width:28%;margin-left: 2%;margin-bottom: 10px;">'
						+'Upload'
						+ '</button></div>');

				tmpDiv.append(customFileButton);
				tmpDiv.append($el);
				this.$el.append(tmpDiv);

				return this;
			},
			getValue : function() {
				return this.$el.val();
			},

		});
Backbone.Form.editors.VideoPicker = Backbone.Form.editors.Base
		.extend({

			template : _.template('<input type="file" accept=".mp4">'),

			initialize : function(options) {
				Backbone.Form.editors.Base.prototype.initialize.call(this,
						options);
				this.$el.attr('type', 'file');
			},
			render : function() {
				var $el = $(this.template());
				$el.attr('name', this.key);
				$el.attr('style', 'display:none');
				var tmpDiv = $('<div></div>');
				var customFileButton = $('<div class="inputBtnSection" style="width:100%"><span class="form-control input-md" style="width: 70%;display: inline-block;" >'
						+ liferayMessagesAsPerLocale['choose_file...']
						+ '</span><button type="button" onclick="customFileOnClick(this);" class="btn btn-primary"style="width:28%;margin-left: 2%;margin-bottom: 10px;">'
						+ liferayMessagesAsPerLocale['upload']
						+ '</button></div>');

				tmpDiv.append(customFileButton);
				tmpDiv.append($el);
				this.$el.append(tmpDiv);

				return this;
			},
			getValue : function() {
				return this.$el.val();
			},

		});
Backbone.Form.editors.FilePicker = Backbone.Form.editors.Base
		.extend({

			template : _.template('<input type="file" accept=".pdf,.ppt">'),

			initialize : function(options) {
				Backbone.Form.editors.Base.prototype.initialize.call(this,
						options);
				this.$el.attr('type', 'file');
			},
			render : function() {
				var $el = $(this.template());
				$el.attr('name', this.key);
				$el.attr('style', 'display:none');
				var tmpDiv = $('<div></div>');
				var customFileButton = $('<div class="inputBtnSection" style="width:100%"><span class="form-control input-md" style="width: 70%;display: inline-block;" >'
						+ liferayMessagesAsPerLocale['choose_file...']
						+ '</span><button type="button" onclick="customFileOnClick(this);" class="btn btn-primary"style="width:28%;margin-left: 2%;margin-bottom: 10px;">'
						+ liferayMessagesAsPerLocale['upload']
						+ '</button></div>');

				tmpDiv.append(customFileButton);
				tmpDiv.append($el);
				this.$el.append(tmpDiv);

				return this;
			},
			getValue : function() {
				return this.$el.val();
			},

		});
Backbone.Form.editors.MultipleFilePicker = Backbone.Form.editors.Base.extend({

	template : _.template('<input type="file" multiple="multiple">'),

	initialize : function(options) {
		Backbone.Form.editors.Base.prototype.initialize.call(this,
				options);
		this.$el.attr('type', 'file');
	},
	render : function() {
		var $el = $(this.template());
		$el.attr('name', this.key);
		$el.attr('style', 'display:none');
		var tmpDiv = $('<div></div>');
		var filesInforDiv = '<div id="uploadedFilesInfo"><div class="row">'
			+ '<div class="col-md-10" id="fileName">file name</div><div class="col-md-1"><i class="fa fa-times"></i></div>'
			+'</div>';
		var customFileButton = $('<div class="inputBtnSection" style="width:100%"><span class="form-control input-md" style="width: 70%;display: inline-block;" >'
				+ liferayMessagesAsPerLocale['choose_file...']
				+ '</span><button type="button" onclick="customMultipleFileOnClick(this);" class="btn btn-primary"style="width:28%;margin-left: 2%;margin-bottom: 10px;">'
				+ liferayMessagesAsPerLocale['upload']
				+ '</button></div>'
				);

		tmpDiv.append(customFileButton);
		tmpDiv.append($el);
		this.$el.append(tmpDiv);

		return this;
	},
	getValue : function() {
		return this.$el.val();
	},

});

Backbone.Form.editors.ZipFilePicker = Backbone.Form.editors.Base
		.extend({

			template : _.template('<input type="file" accept=".zip">'),

			initialize : function(options) {
				Backbone.Form.editors.Base.prototype.initialize.call(this,
						options);
				this.$el.attr('type', 'file');
			},
			render : function() {
				var $el = $(this.template());
				$el.attr('name', this.key);
				$el.attr('style', 'display:none');
				var tmpDiv = $('<div></div>');
				var customFileButton = $('<div class="inputBtnSection" style="width:100%"><span class="form-control input-md" style="width: 70%;display: inline-block;" >'
						+ liferayMessagesAsPerLocale['choose_file...']
						+ '</span><button type="button" onclick="customFileOnClick(this);" class="btn btn-primary"style="width:28%;margin-left: 2%;margin-bottom: 10px;">'
						+ liferayMessagesAsPerLocale['upload']
						+ '</button></div>');

				tmpDiv.append(customFileButton);
				tmpDiv.append($el);
				this.$el.append(tmpDiv);

				return this;
			},
			getValue : function() {
				return this.$el.val();
			},

		});
Backbone.Form.editors.UploadZipFilePicker = Backbone.Form.editors.Base
.extend({

	template : _.template('<input type="file" accept=".zip">'),

	initialize : function(options) {
		Backbone.Form.editors.Base.prototype.initialize.call(this,
				options);
		this.$el.attr('type', 'file');
	},
	render : function() {
		var $el = $(this.template());
		$el.attr('name', this.key);
		$el.attr('style', 'display:none');
		var tmpDiv = $('<div></div>');
		var customFileButton = $('<div class="inputBtnSection" style="width:100%;display: grid;grid-template-columns: 75% 23%;grid-gap: 1%;" ><span class="form-control input-md" >'
				+ '</span><button type="button" onclick="customFileOnClick(this);" class="btn btn-primary">'
				+ liferayMessagesAsPerLocale['choose_file']
				+ '</button></div>');

		tmpDiv.append(customFileButton);
		tmpDiv.append($el);
		this.$el.append(tmpDiv);

		return this;
	},
	getValue : function() {
		return this.$el.val();
	},

});
Backbone.Form.editors.UploadExcelFilePicker = Backbone.Form.editors.Base
.extend({

	template : _.template('<input type="file" accept="application/vnd.ms-excel">'),

	initialize : function(options) {
		Backbone.Form.editors.Base.prototype.initialize.call(this,
				options);
		this.$el.attr('type', 'file');
	},
	render : function() {
		var $el = $(this.template());
		$el.attr('name', this.key);
		$el.attr('style', 'display:none');
		var tmpDiv = $('<div></div>');
		var customFileButton = $('<div class="inputBtnSection" style="width:100%;display: grid;grid-template-columns: 75% 23%;grid-gap: 1%;" ><span class="form-control input-md" >'
				+ '</span><button type="button" onclick="customFileOnClick(this);" class="btn btn-primary">'
				+ liferayMessagesAsPerLocale['choose_file']
				+ '</button></div>');

		tmpDiv.append(customFileButton);
		tmpDiv.append($el);
		this.$el.append(tmpDiv);

		return this;
	},
	getValue : function() {
		return this.$el.val();
	},

});
/*
 * Backbone.Form.editors.excelFilePicker = Backbone.Form.editors.Base.extend({
 * template : _.template('<input class="col-sm-10" type="file"
 * accept="application/vnd.ms-excel"/>'),
 * 
 * initialize: function(options) {
 * Backbone.Form.editors.Base.prototype.initialize.call(this, options);
 * this.$el.attr('type', 'file'); }, render: function() { var $el =
 * $(this.template()); $el.attr('name', this.key); this.$el.append($el);
 * 
 * return this; }, getValue: function() { return this.$el.val(); }, });
 * 
 */
Backbone.Form.editors.excelFilePicker = Backbone.Form.editors.Base
		.extend({

			template : _
					.template('<input type="file" accept="application/vnd.ms-excel">'),

			initialize : function(options) {
				Backbone.Form.editors.Base.prototype.initialize.call(this,
						options);
				this.$el.attr('type', 'file');
			},
			render : function() {
				var $el = $(this.template());
				$el.attr('name', this.key);
				$el.attr('style', 'display:none');
				var tmpDiv = $('<div></div>');
				var customFileButton = $('<div class="inputBtnSection" style="width:100%"><span class="form-control input-md" style="width: 70%;display: inline-block;" >'
						+ 'Choose file...'
						+ '</span><button type="button" onclick="customFileOnClick(this);" class="btn btn-primary"style="width:28%;margin-left: 2%;margin-bottom: 10px;">'
						+ 'Upload'
						+ '</button></div>');

				tmpDiv.append(customFileButton);
				tmpDiv.append($el);
				this.$el.append(tmpDiv);

				return this;
			},
			getValue : function() {
				return this.$el.val();
			},

		});
/*
 * Backbone.Form.editors.ImagePicker = Backbone.Form.editors.Base.extend({
 * template : _ .template('<input class="col-sm-10" type="file"
 * accept=".jpg,.jpeg,.png,.svg,.gif"/>'),
 * 
 * initialize : function(options) {
 * Backbone.Form.editors.Base.prototype.initialize.call(this, options);
 * this.$el.attr('type', 'file'); }, render : function() { var $el =
 * $(this.template()); $el.attr('name', this.key); this.$el.append($el);
 * 
 * return this; }, getValue : function() { return this.$el.val(); }, });
 * Backbone.Form.editors.VideoPicker = Backbone.Form.editors.Base.extend({
 * template : _ .template('<input class="col-sm-10" type="file"
 * accept=".mp4"/>'),
 * 
 * initialize : function(options) {
 * Backbone.Form.editors.Base.prototype.initialize.call(this, options);
 * this.$el.attr('type', 'file'); }, render : function() { var $el =
 * $(this.template()); $el.attr('name', this.key); this.$el.append($el);
 * 
 * return this; }, getValue : function() { return this.$el.val(); }, });
 * 
 * Backbone.Form.editors.FilePicker = Backbone.Form.editors.Base .extend({
 * template : _ .template('<input class="col-sm-10" type="file"
 * accept=".pdf,.ppt"/>'),
 * 
 * initialize : function(options) {
 * Backbone.Form.editors.Base.prototype.initialize.call(this, options);
 * this.$el.attr('type', 'file'); }, render : function() { var $el =
 * $(this.template()); $el.attr('name', this.key); this.$el.append($el);
 * 
 * return this; }, getValue : function() { return this.$el.val(); }, });
 * Backbone.Form.editors.ZipFilePicker = Backbone.Form.editors.Base.extend({
 * template : _ .template('<input class="col-sm-10" type="file"
 * accept=".zip"/>'),
 * 
 * initialize : function(options) {
 * Backbone.Form.editors.Base.prototype.initialize.call(this, options);
 * this.$el.attr('type', 'file'); }, render : function() { var $el =
 * $(this.template()); $el.attr('name', this.key); this.$el.append($el);
 * 
 * return this; }, getValue : function() { return this.$el.val(); }, });
 */
var imageInputField, imagePreviewContainer;

var imageBase64;

var ImageIO = {

	// sets the filesystem to the global var gFileSystem
	gotFS : function(fileSystem) {
		gFileSystem = fileSystem;
	},

	// pickup the URI from the Camera edit and assign it to the global var
	// gImageURI
	// create a filesystem object called a 'file entry' based on the image URI
	// pass that file entry over to gotImageURI()
	updateCameraImages : function(imageURI, inputField, previewContainer) {
		gImageURI = imageURI;
		imageInputField = inputField;
		imagePreviewContainer = previewContainer;
		window.resolveLocalFileSystemURI(imageURI, ImageIO.gotImageURI,
				ImageIO.errorHandler);
	},

	// pickup the file entry, rename it, and move the file to the app's root
	// directory.
	// on success run the movedImageSuccess() method
	gotImageURI : function(fileEntry) {
		var newName = "attachment-" + (new Date()).getTime() + ".png";
		fileEntry.moveTo(gFileSystem.root, newName, ImageIO.movedImageSuccess,
				ImageIO.errorHandler);
	},

	// send the full URI of the moved image to the updateImageSrc() method which
	// does some DOM manipulation
	movedImageSuccess : function(fileEntry) {
		fileEntry
				.file(function(file) {
					var reader = new FileReader();
					reader.onloadend = function(e) {
						imageBase64 = this.result.replace(
								'data:image/png;base64,', '');
						// /$("textarea[name='EmployeeComments']").val(imageBase64);
					};
					// The most important point, use the readAsDatURL Method
					// from the file plugin
					reader.readAsDataURL(file);
				});

		updateImageSrc(fileEntry.nativeURL);
	},

	// get a new file entry for the moved image when the user hits the delete
	// button
	// pass the file entry to removeFile()
	removeDeletedImage : function(imageURI) {
		window.resolveLocalFileSystemURI(imageURI, ImageIO.removeFile,
				ImageIO.errorHandler);
	},

	// delete the file
	removeFile : function(fileEntry) {
		fileEntry.remove();
	},

	// simple error handler
	errorHandler : function(e) {
		var msg = '';
		switch (e.code) {
		case FileError.QUOTA_EXCEEDED_ERR:
			msg = 'QUOTA_EXCEEDED_ERR';
			break;
		case FileError.NOT_FOUND_ERR:
			msg = 'NOT_FOUND_ERR';
			break;
		case FileError.SECURITY_ERR:
			msg = 'SECURITY_ERR';
			break;
		case FileError.INVALID_MODIFICATION_ERR:
			msg = 'INVALID_MODIFICATION_ERR';
			break;
		case FileError.INVALID_STATE_ERR:
			msg = 'INVALID_STATE_ERR';
			break;
		default:
			msg = e.code;
			break;
		}
		;
		console.log('Error: ' + msg);
	}
}

function updateImageSrc(nativeUrl) {
	imageInputField.val(nativeUrl);
	imagePreviewContainer.css("width", "100%");
	imagePreviewContainer.css("height", "500px");
	imagePreviewContainer.css("background", "url(" + nativeUrl
			+ ") no-repeat center center #fff");
	imagePreviewContainer.css("background-size", "cover");
}

function fileUploadUsingAjax(form, action_url, action, success, fail) {
	var data = new FormData(form);
	var fileInput = document.getElementsByName('profileImage');
	var file = fileInput.files[0];
	formData.append('profileImage', file);
	 $.ajax({
         type: "POST",
         enctype: 'multipart/form-data',
         url: action_url,
         data: data,
         processData: false,
         cache: false,
         timeout: 600000,
         dataType: 'json',
         headers:{
        	 "p_auth":Liferay.pAuth
         },
         success: function (data) {

             console.log("SUCCESS : ", data);
             success(data);
         },
         error: function (e) {

             console.log("ERROR : ", e);
             fail(e);
         }
     });
}

function fileUpload(form, action_url, action, success, fail) {
	// Create the iframe...
	var iframe = document.createElement("iframe");
	iframe.setAttribute("id", "upload_iframe");
	iframe.setAttribute("name", "upload_iframe");
	iframe.setAttribute("width", "0");
	iframe.setAttribute("height", "0");
	iframe.setAttribute("border", "0");
	iframe.setAttribute("style", "width: 0; height: 0; border: none;");
	console.log("File Upload 1- "+iframe);
	// Add to document...

	form.parentNode.appendChild(iframe);
	console.log("File Upload 2- "+iframe);
	
	window.frames['upload_iframe'].name = "upload_iframe";

	iframeId = document.getElementById("upload_iframe");
	console.log("File Upload 3- "+iframe);
	
	// Add event...
	var eventHandler = function() {
		if (iframeId.detachEvent)
			iframeId.detachEvent("onload", eventHandler);
		else
			iframeId.removeEventListener("load", eventHandler, false);
		var response = "";
		console.log("File Upload 4- "+iframe);
		
		// Message from server...
		if (iframeId.contentDocument) {
			response = $(iframeId.contentDocument.body.innerHTML).text();
			console.log("File Upload 5- "+iframe);
			
		} else if (iframeId.contentWindow) {
			response = $(iframeId.contentWindow.document.body.innerHTML).text();
			console.log("File Upload 6- "+iframe);
			
		} else if (iframeId.document) {
			response = $(iframeId.document.body.innerHTML).text();
			console.log("File Upload 7- "+iframe);
			
			// content = iframeId.document.body.innerHTML;
		}
		console.log("File Upload 8- "+response);
		
		response = JSON.parse(response);
		if (response.id) {
			console.log("File Upload 9- "+iframe);
			
			success(response);
		} else {
			console.log("File Upload 10- "+response);
			
			fail(response);
		}

		// setTimeout('iframeId.parentNode.removeChild(iframeId)', 1000);

	}
	/*
	 * $.each(document.getElementById($(form).attr('id')).elements,
	 * function(index, elem){ alert("Name:"+elem.name) //Do something here. });
	 */

	if (iframeId.addEventListener)
		iframeId.addEventListener("load", eventHandler, true);
	if (iframeId.attachEvent)
		iframeId.attachEvent("onload", eventHandler);

	// Set properties of form...
	form.setAttribute("target", "upload_iframe");
	form.setAttribute("action", action_url);
	form.setAttribute("method", "post");
	form.setAttribute("enctype", "multipart/form-data");
	form.setAttribute("encoding", "multipart/form-data");
	//Auth
	var pAuth = Liferay.authToken;
	console.log("pAuth"+pAuth);
	form.setAttribute("p_auth", pAuth);
	//form.setAttribute("Authorization", "Basic dGVzdEBsaWZlcmF5LmNvbTp0ZXN0");
	console.log("File Upload 11- "+iframe);
	
	// Submit the form...
	form.submit();

	// return content;

}

function wrapText(context, text, x, y, maxWidth, lineHeight) {
	var words = text.split(' ');
	var line = '';

	for (var n = 0; n < words.length; n++) {
		var testLine = line + words[n] + ' ';
		var metrics = context.measureText(testLine);
		var testWidth = metrics.width;
		if (testWidth > maxWidth && n > 0) {
			context.fillText(line, x, y);
			line = words[n] + ' ';
			y += lineHeight;
		} else {
			line = testLine;
		}
	}
	context.fillText(line, x, y);
}
var canvas = null;
var ctx = null;

function generateCertificate(orgLogoImageTmp, bgImageTmp, orgName, courseName,
		awardedStr, studentName, completionStr, certDate, instructorName,
		instructorRole) {
	var root = location.protocol + '//' + location.host;
	console.log("root::" + root);
	var orgLogoImage = root + orgLogoImageTmp;
	console.log("orgLogoImage::" + orgLogoImage);
	var bgImage = root + bgImageTmp;
	console.log("bgImage::" + bgImage);
	canvas = document.createElement('canvas');
	ctx = canvas.getContext('2d');
	var width = 752;
	var height = 572;
	canvas.width = width;
	canvas.height = height;
	var bgImgObj = new Image();
	bgImgObj.onload = function() {
		ctx.drawImage(this, 0, 0, width, height);
		var xcenter = width / 2;
		ctx.font = "24px Arial";
		ctx.textAlign = 'center';
		ctx.fillStyle = "black";
		ctx.fillText(orgName, xcenter, 119);
		// ctx.font="24px Arial";
		//ctx.fillText(courseName, xcenter, 168);
		wrapText(ctx, courseName, xcenter, 168, 400, 20)
		ctx.font = "12px Arial";
		ctx.fillStyle = "#5EAFFF";
		ctx.fillText(awardedStr, xcenter, 216);
		ctx.font = "24px Arial";
		ctx.fillStyle = "black";
		ctx.fillText(studentName, xcenter, 256);
		ctx.font = "12px Arial";
		ctx.fillStyle = "#5EAFFF";
		wrapText(ctx, completionStr, xcenter, 306, 400, 20)
		ctx.font = "12px Arial";
		ctx.fillStyle = "black";
		ctx.fillText(certDate, xcenter, 360);
		ctx.font = "12px Arial";
		ctx.fillText(instructorName, xcenter + 145, 452);
		ctx.fillStyle = "#5EAFFF";
		ctx.fillText(instructorRole, xcenter + 145, 465);
		ctx.restore();
		ctx.save();
		var orgLogoImgObj = new Image();
		orgLogoImgObj.onload = function() {
			var jsonObj = getNewImageWidthHeight(this.width, this.height);
			console.log(jsonObj.originalImageWidth);
			console.log(jsonObj.originalImageHeight);
			ctx.drawImage(this, 113, 390 + jsonObj.y,
					jsonObj.originalImageWidth, jsonObj.originalImageHeight);

			ctx.restore();
			ctx.save();
			downloadCertificate();
		};
		orgLogoImgObj.src = orgLogoImage + "&d=" + Date.now();

	};
	bgImgObj.src = bgImage;
	bgImgObj = null;
}
function getNewImageWidthHeight(originalImageWidth, originalImageHeight) {
	var ratio = 0;
	var maxWidth = 100;
	var maxHeight = 90;
	var y = 0;
	if (originalImageWidth > originalImageHeight) {
		ratio = originalImageHeight / originalImageWidth;
		originalImageWidth = maxWidth;
		originalImageHeight = maxWidth * ratio;

	} else if (originalImageHeight > originalImageWidth
			|| originalImageWidth == originalImageHeight) {
		ratio = originalImageWidth / originalImageHeight;
		originalImageHeight = maxHeight;
		originalImageWidth = maxHeight * ratio;
	}
	console.log("originalImageWidth:" + originalImageWidth);
	console.log("originalImageHeight:" + originalImageHeight);
	if (originalImageHeight < maxHeight) {
		y = (maxHeight - originalImageHeight) / 2;
	}
	return {
		"originalImageWidth" : originalImageWidth,
		"originalImageHeight" : originalImageHeight,
		"y" : y
	};
}

function downloadCertificate() {
	var imgData = canvas.toDataURL('image/jpg');
	var doc = new jsPDF('l', 'mm', [ 198.966667, 151.341667 ]);
	doc.addImage(canvas, 'JPEG', 0, 0);
	doc.save('certificate.pdf');
	canvas = null;
	ctx = null;

}

var ScrollPagination = {
	flag : false,
	size : 5,
	onScrollPagination : function(v1, len) {
		var tmp = $(window).scrollTop() + $(window).height() + 1;
		// console.log("$(window).scrollTop() "+$(window).scrollTop() );
		// console.log("$(window).height() "+$(window).height() );
		console.log("$(document).height()   " + $(document).height());
		console.log("tmp   " + tmp);
		// alert($(window).scrollTop() + $(window).height() ==
		// $(document).height());
		if (tmp >= $(document).height()) {
			console.log("hello if");
			position = len;
			if (this.flag)
				v1(position, size);
			else
				console.log("List empty");
		} else {
			console.log("hello else");
		}
	}
};
//When the user clicks on the button, scroll to the top of the document
function scrollToTopFunction() {
    document.body.scrollTop = 0; // For Safari
    document.documentElement.scrollTop = 0; // For Chrome, Firefox, IE and Opera
}

var validation = {
	    isNumber:function(str) {
	        var pattern = /^[0-9]+$/;
	        return pattern.test(str);  // returns a boolean
	    }
}; 
Handlebars.registerHelper({
    eq: function (v1, v2) {
        return v1 === v2;
    },
    ne: function (v1, v2) {
        return v1 !== v2;
    },
    lt: function (v1, v2) {
        return v1 < v2;
    },
    gt: function (v1, v2) {
        return v1 > v2;
    },
    lte: function (v1, v2) {
        return v1 <= v2;
    },
    gte: function (v1, v2) {
        return v1 >= v2;
    },
    and: function () {
        return Array.prototype.slice.call(arguments).every(Boolean);
    },
    or: function () {
        return Array.prototype.slice.call(arguments, 0, -1).some(Boolean);
    }
});
function labTimeout(){
    $('*').bind('mousemove click mouseup mousedown keydown keypress keyup submit change mouseenter scroll dblclick', function (event) {
   	labTimeoutCalculations();
    //console.log("outer element:" +JSON.stringify(event.target));
   	 var iFrameList = document.getElementsByTagName("iframe");
   	 for (iframe of iFrameList) {
   	  //console.log("outer bind:"+rgb2hex($(iframe).css("border-color")) );
   		$(iframe).css({"border-color": "#ccc", 
            "border-width":"1px", 
            "border-style":"solid"});
   		 
   	 }
    });
    bindIFrameEvents();
}
function bindIFrameEvents() {
    var iFrameList = document.getElementsByTagName("iframe");
    var i = 0;
    for (iframe of iFrameList) {
        i++;
        var y = (iframe.contentWindow || iframe.contentDocument);
        //resize 
        $(y).on('mousemove click mouseup mousedown keydown keypress keyup submit change mouseenter scroll dblclick', function(e) {
            console.log("i:" + i);
            console.log("inner gg :" );
            labTimeoutCalculations();
            
           if (rgb2hex($(iframe).css("border-color")) == "#cccccc" ) 
            {
        	   $(iframe).css({"border-color": "#34a8db", 
                     "border-width":"3px", 
                     "border-style":"solid"});
            	// console.log("inner highlightVMff:" );
            }
           
        });
    }
}
function rgb2hex(rgb) {
    if (  rgb.search("rgb") == -1 ) {
         return rgb;
    } else {
         rgb = rgb.match(/^rgba?\((\d+),\s*(\d+),\s*(\d+)(?:,\s*(\d+))?\)$/);
         function hex(x) {
              return ("0" + parseInt(x).toString(16)).slice(-2);
         }
         return "#" + hex(rgb[1]) + hex(rgb[2]) + hex(rgb[3]); 
    }
}
var waitTimeInMillis = 2000;
var lastMillis = 0;
var myVar;
function labTimeoutCalculations() {
    if (lastMillis > (Date.now() - waitTimeInMillis)) {
        if (myVar != undefined) {
            clearTimeout(myVar);
            //console.log("clear time out");
        }
    }
    lastMillis = Date.now();
    myVar = setTimeout(function() {
       // console.log("setTimeout");
        refreshPage();
    }, waitTimeInMillis);
}
function refreshPage() {
    Liferay.Session.extend();
    console.log("labRefreshURL:");
}