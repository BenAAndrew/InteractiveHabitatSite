package views;
import java.util.List;

import org.h2.mvstore.MVMap;

import model.ContactUsData;

import storage.DatabaseInterface;
import storage.FileStoreInterface;
import web.WebRequest;
import web.WebResponse;

public class ContactUs extends DynamicWebPage
{

	public ContactUs(DatabaseInterface db,FileStoreInterface fs)
	{
		super(db,fs);
	}

	public boolean process(WebRequest toProcess)
	{
		if(toProcess.path.equalsIgnoreCase("ContactUs.html"))
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
			stringToSendToWebBrowser += "\t\t\t<div class=\"inner\">\t\t\n";
			stringToSendToWebBrowser += "\t\t\t\t<!--Info grid-->\n";
			stringToSendToWebBrowser += "\t\t\t\t<section id=\"1\">\n";
			stringToSendToWebBrowser += "\t\t\t\t<header class=\"major\">\n";
			stringToSendToWebBrowser += "\t\t\t\t\t<h2>Contact Us</h2>\n";
			stringToSendToWebBrowser += "\t\t\t\t</header>\n";
			stringToSendToWebBrowser += "\t\t\t\t<form id=\"contactUs\" action=\"/ContactUs.html/submit/contact\" method=\"GET\">\n";
			stringToSendToWebBrowser += "\t\t\t\t<input type=\"text\" name=\"name\" placeholder=\"Name\" /> <br>\n";
			stringToSendToWebBrowser += "\t\t\t\t<textarea name=\"contactReason\" placeholder=\"What are you getting in contact for?\" required></textarea><br>\n";
			stringToSendToWebBrowser += "\t\t\t\t<input type=\"email\" name=\"email\" placeholder=\"Email\" /> <br>\n";
			stringToSendToWebBrowser += "\t\t\t\t<input type=\"submit\" value=\"Send\" />\n";
			stringToSendToWebBrowser += "\t\t\t\t</form>\n";
			stringToSendToWebBrowser += "\t\t\t\t<center><a id=\"link\" href=\"#2\"><span class = \"mini-icon fa-arrow-down\"></span></a></center>\n";
			stringToSendToWebBrowser += "\t\t\t\t</section>\n";
			stringToSendToWebBrowser += "\t\t\t\t\t\n";
			stringToSendToWebBrowser += "\t\t\t\t<!--Section One-->\n";
			stringToSendToWebBrowser += "\t\t\t\t<section id=\"2\">\n";
			stringToSendToWebBrowser += "\t\t\t\t<center><a id=\"link\" href=\"#1\"><span class = \"mini-icon fa-arrow-up\"></span></a></center>\n";
			stringToSendToWebBrowser += "\t\t\t\t<div class=\"content\">\n";
			stringToSendToWebBrowser += "\t\t\t\t\t<h2>Alternative Contact Methods</h2>\n";
			stringToSendToWebBrowser += "\t\t\t\t\t<p>---This will have things like and email address, an address, contact number---</p>\n";
			stringToSendToWebBrowser += "\t\t\t\t</div>\n";
			stringToSendToWebBrowser += "\t\t\t\t</section>\n";
			stringToSendToWebBrowser += "\t\t\t\t<section id=\"3\">\n";
			stringToSendToWebBrowser += "\t\t\t</div>\n";
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
			stringToSendToWebBrowser += "\t\t\t\t\t\t<li><a href=\"LogIn.html\">Login</a></li>\n";
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
			stringToSendToWebBrowser += "\n";
			stringToSendToWebBrowser += "\t\t\t\t<!-- Footer -->\n";
			stringToSendToWebBrowser += "\t\t\t\t<footer id=\"footer\">\n";
			stringToSendToWebBrowser += "\t\t\t\t\t<p class=\"copyright\"> Design: Team 10</p>\n";
			stringToSendToWebBrowser += "\t\t\t\t</footer>\n";
			stringToSendToWebBrowser += "\t\t\t</div>\n";
			stringToSendToWebBrowser += "\t\t</div>\n";
			stringToSendToWebBrowser += "\t</div>\n";
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
		else if(toProcess.path.equalsIgnoreCase("ContactUs.html/submit/contact"))
		{
			MVMap<String, ContactUsData> contactDetails = db.s.openMap("ContactUsData");
			
			ContactUsData data = new ContactUsData();
			data.setUniqueId("contact_" + System.currentTimeMillis());
			data.setName(toProcess.params.get("name"));
			data.setContactReason(toProcess.params.get("contactReason"));
			data.setEmail(toProcess.params.get("email"));
			
			contactDetails.put(data.getUniqueId(), data);
			db.commit();
			String url="/ContactUs.html";
			toProcess.r = new WebResponse(WebResponse.HTTP_REDIRECT, WebResponse.MIME_HTML,"<html><body>Redirected: <a href=\""+url+"\">"+url+"</a></body></html>");
			toProcess.r.addHeader("Location", url);
			return true;
		}
		return false;
	}

}