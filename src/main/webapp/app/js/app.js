function ajax(url, params, successCallback) {
	$.ajax({
		"url" : url,
		"type" : "POST",
		"dataType" : "json",
		"data" : params,
		"success" : successCallback
	});
}