$(document).ready(function(){
	
});

$(document).on("click",".editButton",function(e){
	e.preventDefault();
	var url= $(this).attr('href');

	$.get(url,function(nationality, status){
		$("#txtIdEdit").val(nationality.id);
		$("#txtnameEdit").val(nationality.name);
		$("#txtcountryEdit").val(nationality.country);
		$("#txtcapitalEdit").val(nationality.capital);
		$("#txtupdatedByEdit").val(nationality.updatedBy);
		$("#txtupdatedOnEdit").val(nationality.updatedOn);
	});
	$("#nationalityEditModal").modal("show");
});

$(document).on("click","#addNew",function(event){
	$("#nationalityModal").modal("show");
});

$(document).on("click",".deleteButton",function(e){
	  var r = confirm("Are you sure?");
	  if (r == false) {
		  e.preventDefault();
	  }
});