$(document).ready(function(){
  // Add smooth scrolling to all links
  $("a").on('click', function(event) {
	if (this.hash !== "") {
	  event.preventDefault();
	  var hash = this.hash;
	  $('html, body').animate({
		scrollTop: $(hash).offset().top
	  }, 800, function(){
		window.location.hash = hash;
	  });
	}
  });
});

function search() {
	//var searchItem = document.forms["searchForm"]["query"].value.substring(0,1);
	var directory = document.location.href.split("/");
	var currentPage = directory[directory.length-1].length;
	//var url = document.location.href.substring(0, document.location.href.length-currentPage)+"archive.html#"+searchItem;
	var url = document.location.href.substring(0, document.location.href.length-currentPage)+"animal.html";
	window.location.assign(url);
	return false;
}

function changeStatus(id){
	var option = document.getElementById("li"+id);
	if(option.className == "checked"){
		option.className ="";
		ignore.pop(ignore.indexOf(id));
	} else {
		option.className="checked";
		ignore.push(id);
	}
	destroy(createGlobe());
	createGlobe();
	alert(ignore);
}