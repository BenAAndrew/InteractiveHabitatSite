package views;

import java.util.ArrayList;

import model.AnimalArchiveData;
import storage.DatabaseInterface;
import storage.FileStoreInterface;
import web.WebRequest;
import web.WebResponse;

public class AnimalArchive extends DynamicWebPage
{

	public AnimalArchive(DatabaseInterface db,FileStoreInterface fs)
	{
		super(db,fs);
	}

	public boolean process(WebRequest toProcess)
	{
		AnimalArchiveData data = new AnimalArchiveData();
		data.animalName = "Bear";
		data.animalKingdom = "Animalia";
		data.animalDescription = "Bears are carnivoran mammals of the family Ursidae. They are classified as caniforms, or doglike carnivorans.";
		data.image = "bear.jpg";
		ArrayList <AnimalArchiveData> animals = new ArrayList<AnimalArchiveData>();
		animals.add(data);
		animals.add(data);
		animals.add(data);
		animals.add(data);
			
		
		
		if(toProcess.path.equalsIgnoreCase("AnimalArchive.html"))
		{
			String stringToSendToWebBrowser = "";
			stringToSendToWebBrowser += "<!DOCTYPE HTML>\n";
			stringToSendToWebBrowser += "<html>\n";
			stringToSendToWebBrowser += "\t<head>\n";
			stringToSendToWebBrowser += "\t\t<title>WikiEcosystem</title>\n";
			stringToSendToWebBrowser += "\t\t<meta charset=\"utf-8\" />\t\n";
			stringToSendToWebBrowser += "\t\t<link rel=\"stylesheet\" href=\"main.css\" />\n";
			stringToSendToWebBrowser += "\t\t<link rel=\"stylesheet\" href=\"Treant.css\">\n";
			stringToSendToWebBrowser += "\t\t<link rel=\"stylesheet\" href=\"collapsable.css\">\n";
			stringToSendToWebBrowser += "\t\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n";
			stringToSendToWebBrowser += "\t\t<script>\n";
			stringToSendToWebBrowser += "\t\t$(document).ready(function(){\n";
			stringToSendToWebBrowser += "\t\t  // Add smooth scrolling to all links\n";
			stringToSendToWebBrowser += "\t\t  $(\"a\").on('click', function(event) {\n";
			stringToSendToWebBrowser += "\t\t\tif (this.hash !== \"\") {\n";
			stringToSendToWebBrowser += "\t\t\t  event.preventDefault();\n";
			stringToSendToWebBrowser += "\t\t\t  var hash = this.hash;\n";
			stringToSendToWebBrowser += "\t\t\t  $('html, body').animate({\n";
			stringToSendToWebBrowser += "\t\t\t\tscrollTop: $(hash).offset().top\n";
			stringToSendToWebBrowser += "\t\t\t  }, 800, function(){\n";
			stringToSendToWebBrowser += "\t\t\t\twindow.location.hash = hash;\n";
			stringToSendToWebBrowser += "\t\t\t  });\n";
			stringToSendToWebBrowser += "\t\t\t}\n";
			stringToSendToWebBrowser += "\t\t  });\n";
			stringToSendToWebBrowser += "\t\t});\n";
			stringToSendToWebBrowser += "\t\t</script>\n";
			stringToSendToWebBrowser += "\t</head>\n";
			stringToSendToWebBrowser += "\t<body>\n";
			stringToSendToWebBrowser += "\t<div id=\"wrapper\">\n";
			stringToSendToWebBrowser += "\t\t<div id=\"main\">\n";
			stringToSendToWebBrowser += "\t\t\t<div class=\"inner\">\t\n";
			stringToSendToWebBrowser += "\t\t\t<br><br>\t\t\t\n";
			stringToSendToWebBrowser += "\t\t\t<div class = \"content\">\t\n";
			stringToSendToWebBrowser += "              <header class = \"major align-center\"> \n";
			stringToSendToWebBrowser += "                <h1>Animal Archives</h1>\n";
			stringToSendToWebBrowser += "\t\t\t\t</header>\n";
			stringToSendToWebBrowser += "\t\t\t\t<p class = \"align-center\"><b>These are all of the existing Animals on the website in Alphabetical Order</p>\n";
			
			for ( AnimalArchiveData A: animals)
			{
						stringToSendToWebBrowser += "\t\t\t\t<div class = \"row\" style= \"display:inline-block; margin-right:4%;\">\n";
						stringToSendToWebBrowser += "\t\t\t\t<div class = \"box\">\n";
						stringToSendToWebBrowser += "\t\t\t\t<div class=\"img__wrap\">\n";
						stringToSendToWebBrowser += "                   <img class=\"img__img\" src=" +A.image+ "style=\"width:257px;height:200px;\" />\n";
						stringToSendToWebBrowser += "                   <p class=\"img__description\">"+ A.animalName +"\n";
						stringToSendToWebBrowser += "\t\t\t\t   <br>\n";
						stringToSendToWebBrowser += "\t\t\t\t" + A.animalDescription+ "\n";
						stringToSendToWebBrowser += "\t\t\t\t   </p>\n";
						stringToSendToWebBrowser += "                </div>\n";
						stringToSendToWebBrowser += "\t\t\t\t</div>\n";
						stringToSendToWebBrowser += "\t\t\t  </div> \n";
			}
			
			stringToSendToWebBrowser += "\t\t\t\t \n";
			stringToSendToWebBrowser += "\t\t\t\t \n";
			stringToSendToWebBrowser += "\t\t \n";
			stringToSendToWebBrowser += "\t\t\t\t \n";
			stringToSendToWebBrowser += "\t\t\t\t \n";
			stringToSendToWebBrowser += "\t\t\t</div>\n";
			stringToSendToWebBrowser += "\t\t\t</div>\n";
			stringToSendToWebBrowser += "       \n";
			stringToSendToWebBrowser += "\t\t</div>\n";
			stringToSendToWebBrowser += "\n";
			stringToSendToWebBrowser += "<!-- Sidebar -->\n";
			stringToSendToWebBrowser += "\t\t<div id=\"sidebar\">\n";
			stringToSendToWebBrowser += "\t\t\t<div class=\"inner\">\n";
			stringToSendToWebBrowser += "\t\t\t\t<!-- Search -->\n";
			stringToSendToWebBrowser += "\t\t\t\t<section id=\"search\" class=\"alt\">\n";
			stringToSendToWebBrowser += "\t\t\t\t\t<form name=\"searchForm\" onsubmit=\"return search()\" >\n";
			stringToSendToWebBrowser += "\t\t\t\t\t\t<input type=\"text\" name=\"query\" id=\"query\" placeholder=\"Search\" />\n";
			stringToSendToWebBrowser += "\t\t\t\t\t</form>\n";
			stringToSendToWebBrowser += "\t\t\t\t</section>\n";
			stringToSendToWebBrowser += "\n";
			stringToSendToWebBrowser += "\t\t\t\t<!-- Menu -->\n";
			stringToSendToWebBrowser += "\t\t\t\t<nav id=\"menu\">\n";
			stringToSendToWebBrowser += "\t\t\t\t\t<header class=\"major\">\n";
			stringToSendToWebBrowser += "\t\t\t\t\t\t<h2>Menu</h2>\n";
			stringToSendToWebBrowser += "\t\t\t\t\t</header>\n";
			stringToSendToWebBrowser += "\t\t\t\t\t<ul>\n";
			stringToSendToWebBrowser += "\t\t\t\t\t\t<li><a href=\"index.html\">Home</a></li>\n";
			stringToSendToWebBrowser += "\t\t\t\t\t\t<li><a href=\"AnimalArchive.html\">Animals</a></li>\n";
			stringToSendToWebBrowser += "\t\t\t\t\t\t<li><a href=\"interactive.html\">Interactive</a></li>\n";
			stringToSendToWebBrowser += "\t\t\t\t\t\t<li><a href=\"login.html\">Login</a></li>\n";
			stringToSendToWebBrowser += "\t\t\t\t\t\t<li><a href=\"signup.html\">Sign Up</a></li>\n";
			stringToSendToWebBrowser += "\t\t\t\t\t\t<li><a href=\"ContactUs.html\">Contact</a></li>\n";
			stringToSendToWebBrowser += "\t\t\t\t\t</ul>\n";
			stringToSendToWebBrowser += "\t\t\t\t</nav>\t\t\t\n";
			stringToSendToWebBrowser += "\n";
			stringToSendToWebBrowser += "\t\t\t\t<!-- Contact -->\n";
			stringToSendToWebBrowser += "\t\t\t\t<section>\n";
			stringToSendToWebBrowser += "\t\t\t\t\t<header class=\"major\">\n";
			stringToSendToWebBrowser += "\t\t\t\t\t\t<h2>Login</h2>\n";
			stringToSendToWebBrowser += "\t\t\t\t\t</header>\n";
			stringToSendToWebBrowser += "\t\t\t\t\t<p>Login to the system to contribute and amend animals</p>\n";
			stringToSendToWebBrowser += "\t\t\t\t\t<ul class=\"contact\">\n";
			stringToSendToWebBrowser += "\t\t\t\t\t\t<form>\n";
			stringToSendToWebBrowser += "\t\t\t\t\t\t<li class=\"fa-user\"><input type=\"text\" placeholder=\"Username\"></li>\n";
			stringToSendToWebBrowser += "\t\t\t\t\t\t<li class=\"fa-lock\"><input type=\"password\" placeholder=\"Password\"></li>\n";
			stringToSendToWebBrowser += "\t\t\t\t\t\t<li><input type=\"submit\"></li>\n";
			stringToSendToWebBrowser += "\t\t\t\t\t\t</form>\n";
			stringToSendToWebBrowser += "\t\t\t\t\t</ul>\n";
			stringToSendToWebBrowser += "\t\t\t\t</section>\n";
			stringToSendToWebBrowser += "\t\t\t\t<!-- Footer -->\n";
			stringToSendToWebBrowser += "\t\t\t\t<footer id=\"footer\">\n";
			stringToSendToWebBrowser += "\t\t\t\t\t<p class=\"copyright\"> Design: Team 10</p>\n";
			stringToSendToWebBrowser += "\t\t\t\t</footer>\n";
			stringToSendToWebBrowser += "\t\t\t</div>\n";
			stringToSendToWebBrowser += "\t\t</div>\n";
			stringToSendToWebBrowser += "\n";
			stringToSendToWebBrowser += "\t<!-- Scripts -->\n";
			stringToSendToWebBrowser += "\t<script src=\"assets/js/jquery.min.js\"></script>\n";
			stringToSendToWebBrowser += "\t<script src=\"assets/js/skel.min.js\"></script>\n";
			stringToSendToWebBrowser += "\t<script src=\"assets/js/util.js\"></script>\n";
			stringToSendToWebBrowser += "\t<script src=\"assets/js/main.js\"></script>\n";
			stringToSendToWebBrowser += "\t</body>\n";
			stringToSendToWebBrowser += "</html>\n";
			toProcess.r = new WebResponse( WebResponse.HTTP_OK, WebResponse.MIME_HTML, stringToSendToWebBrowser );
			return true;
		}
		return false;
	}

}