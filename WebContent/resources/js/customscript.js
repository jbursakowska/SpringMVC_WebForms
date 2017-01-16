// validation code
// ---------------

function addSuccessClass(event){
	console.log("addSuccessClass");
	
	$(event.relatedTarget).closest("div.form-group").addClass("has-success");
	
}

function enableValidation(){
	console.log("enableValidation");
	
	$("form").validator().on("validated.bs.validator", addSuccessClass);
	
}

$(document).ready(enableValidation);

// template code
// -------------

// append checkboxes
function addCheckboxes(){
	
	 $.ajax(
			 {
				 url: "demo_test.txt",
				 success: function(result){
					 
				 }
			 }
	);
	
	var data = {
		    checkboxes: [
		                 {
		                     value: 1,
		                     label: "one"
		                 },
		                 {
		                     value: 2,
		                     label: "two"
		                 },
		                 {
		                     value: 3,
		                     label: "three"
		                 }
		             ]
		         };
	
	appendHandlebarsTemplate("#checkboxTemplate", data, "div.form-group:last");
}

$(document).ready(addCheckboxes);

function appendHandlebarsTemplate(templateId, data, target){
	console.log("appendHandlebarsTemplate");
	
	var source = $(templateId).html(); // select html template from inside script tag
	var t = Handlebars.compile(source); // magic - turn html into a method/function
	var html = t(data); // pass data to the special function that will return completed html
	$(target).after(html); // append html after target element
}

