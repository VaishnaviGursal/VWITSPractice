$(".info-item .btn").click(function(){
  $(".container").toggleClass("log-in");
});
$(".container-form .btn").click(function(){
  $(".container").addClass("active");
});



$(".container.log-in .container-form .form-item.log-in").click(function(){
	  $(".container").toggleClass("log-in");
	});
	$(".container-form .btn").click(function(){
	  $(".container").addClass("active");
	});

