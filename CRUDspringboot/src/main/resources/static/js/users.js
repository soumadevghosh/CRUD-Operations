$(function () {
    $("#tblUsers").on('draw.dt', function () {
        $("#divLoader").show();
        $("#divLoader").hide();
    }).DataTable({
        "columnDefs": [
            { "orderable": false, "targets": 5 }
        ],
        "order": [[0, "desc"]]

    });
});

$(document).on("click","#tbodyUsers tr td", function(){
	if ($(this).is("td:last-child")) {
        return;
    }
	$("#btnAddUser").hide();
	$("#btnUpdateUser").show();
	
	var userId = $(this).parent().find(".hdnId").text();
	$.ajax({
        type: "POST",
        url: "/user/getUserById",
        data: JSON.stringify(userId),
        contentType: "application/json",
    	dataType: "json",
        success: function (data) {
            if (data != null) {
            	$(".modal-title").html("Edit User Details");
                $('#txtName').val(data.name);
                $('#txtEmail').val(data.email);
                $('#txtPassword').val(data.password);
                $('#txtPhone').val(data.phoneno);
                $("#userModal").modal("show");
            }
            else {
                swal({
                    title: "",
                    text: "Error",
                    icon: "error"
                });
            }
        },
        error: function (xhr) {
            alert("Error Occured");
        }
    });
});

$(document).on("click","#btnAdd",function(){
	clearText();
	$(".modal-title").html("Add User");
	$("#btnAddUser").show();
	$("#btnUpdateUser").hide();
	setTimeout(function(){
		  $("#txtName").focus();
		},500);
	$("#userModal").modal("show");
});

$(document).on("click","#btnAddUser",function(){
	var userObj = createUserObj();
	$.ajax({
        type: "POST",
        url: "/user/save",
        contentType: "application/json",
        dataType:"json",
        data: JSON.stringify(userObj),
        success: function (data) {
                swal({
                    title: "Successful",
                    text: data,
                    icon: "success"
                }).then(function () {
                	location.reload(true);
                 });                       
            
            console.log(data);
        },
        error: function (xhr) {
            alert("Error Occured" + xhr);
        }
    });
});

function createUserObj(){
	var user = {};
    user.name = $("#txtName").val().trim();
    user.email = $("#txtEmail").val();
    user.password = $("#txtPassword").val();
    user.phoneno = $("#txtPhone").val();
    return user;
}

function clearText(){
	$("#txtName").val("");
    $("#txtEmail").val("");
    $("#txtPassword").val("");
    $("#txtPhone").val("");
}