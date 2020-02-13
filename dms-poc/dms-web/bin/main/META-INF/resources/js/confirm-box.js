var functionName;
jQuery(document).ready(
		function($) {
			// open popup

			
			
			// close popup
			$('.cd-popup').on(
					'click',
					function(event) {
						if ($(event.target).is('.cd-popup-close')
								|| $(event.target).is('.cd-popup')) {
							event.preventDefault();
							$(this).removeClass('is-visible');
						}
					});
			$('#noButton').on('click', function(event) {
				// alert("hello");
				event.preventDefault();
				$('.cd-popup').removeClass('is-visible');

			});
			// close popup when clicking the esc keyboard button
			$(document).keyup(function(event) {
				if (event.which == '27') {
					$('.cd-popup').removeClass('is-visible');
				}
			});
		});

function callOpenBox(textInfo,callBack) {
	// event.preventDefault();
	$('#confirmMsg').text(textInfo);
//	$('.cd-popup').addClass('is-visible');
	$('#confirmBox').addClass('is-visible');
	$('#okButton').unbind().on('click', function(event) {
		event.preventDefault();
		  if(callBack != undefined){
		callBack();
		  }
		$('.cd-popup').removeClass('is-visible');

	});
	
}
function callOpenBoxHTML(textInfo,callBack) {
	// event.preventDefault();
	$('#confirmMsg').html(textInfo);
//	$('.cd-popup').addClass('is-visible');
	$('#confirmBox').addClass('is-visible');
	$('#okButton').unbind().on('click', function(event) {
		event.preventDefault();
		console.log("ddddyhhg");
		
		  if(callBack != undefined){
		callBack();
		  }
		$('.cd-popup').removeClass('is-visible');

	});
	
}

function openOkBox(textInfo,callBack) {
	$('#okMsg').text(textInfo);
	$('#okBox').addClass('is-visible');
	
	$('#confirmButton').unbind().on('click', function(event) {
		$('#okBox').removeClass('is-visible');
		if(callBack != undefined){
			callBack();
			  }
		return true;
	});
	return true;
}