$( document ).ready(function() {

	// GET REQUEST
	$("#submit").click(function(event){
		event.preventDefault();
		ajaxGet();
	});

	// DO GET
	function ajaxGet(){
	alert("in it");
		$.ajax({
			type : "POST",
			url : window.location + "/getsingledata",

			success: function(result){
			alert(result);
			$("#div1").html(result);


			},
			error : function(e){
			   alert(e);
				$("#nalayak").html("<strong>FUCK YOU</strong>");
				console.log("ERROR: ", e);
			}
		});
	}
})