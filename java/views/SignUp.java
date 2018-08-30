package views;


import java.util.List;

import model.SignUpData;

import org.h2.mvstore.MVMap;

import storage.DatabaseInterface;
import storage.FileStoreInterface;
import web.WebRequest;
import web.WebResponse;

public class SignUp extends DynamicWebPage
{

	public SignUp(DatabaseInterface db, FileStoreInterface fs) {
		super(db, fs);
		// TODO Auto-generated constructor stub
	}
	
	

	public boolean process(WebRequest toProcess)
	{
		if(toProcess.path.equalsIgnoreCase("SignUpForlab4.html"))
		{
			MVMap<String, SignUpData> signUpData = db.s.openMap("SignUpData");
			List<String> signUpDataKeys = signUpData.keyList();

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
			stringToSendToWebBrowser += "\t</head>\n";
			stringToSendToWebBrowser += "\t<body>\n";
			stringToSendToWebBrowser += "\t<div id=\"wrapper\">\n";
			stringToSendToWebBrowser += "\t\t<div id=\"main\">\n";
			stringToSendToWebBrowser += "\t\t\t<div class=\"inner align-center\">\t\t\n";
			stringToSendToWebBrowser += "\t\t\t\t<header class = \"major align-center\">\n";
			stringToSendToWebBrowser += "\t\t\t\t<h1 >Sign up</h1>\n";
			stringToSendToWebBrowser += "\t\t\t\t</header>\n";
			stringToSendToWebBrowser += "\t\t\t\t<p><b>To sign up and become a contributing member to the wonderful community simply enter your details below!</b></p>\n";
			stringToSendToWebBrowser += "\t\t\t\t<div>\n";
			stringToSendToWebBrowser += "\t\t\t\t<form class = \"box\" action = \"SignUp.html/submit\" method =\"post\">\n";
			stringToSendToWebBrowser += "                <input style=\"width: 30%;margin:auto;margin-bottom:1%;\" type=\"text\" name=\"first-name\" id=\"first-name\" value=\"\" placeholder=\"First Name\"> \n";
			stringToSendToWebBrowser += "\t\t\t\t<input style=\"width: 30%;margin:auto;margin-bottom:1%;\" type= \"text\" name=\"last-name\" id=\"last-name\" value=\"\" placeholder= \"Last Name\" >\n";
			stringToSendToWebBrowser += "\t\t\t\t<input style=\"width: 30%;margin:auto;margin-bottom:1%;\" type =\"text\" name=\"Email\" id=\"email\" value=\"\" placeholder = \"Email\">\n";
			stringToSendToWebBrowser += "\t\t\t\t<input style = \"width: 30%;margin:auto;margin-bottom:1%;\" type = \"Password\" name = \"password\" id=\"password\" value = \"\" placeholder= \"Password\">\n";
			stringToSendToWebBrowser += "\t\t\t\t<input style = \"width: 30%;margin:auto;margin-bottom:1%;\" type = \"Password\" name = \"password2\" id=\"password2\" value = \"\" placeholder= \"Re-Type Password\">\n";
			stringToSendToWebBrowser += "\t\t\t\t<input style = \"width: 30%;margin:auto;\" type=\"submit\" value=\"Submit\" class=\"special\">\n";
			stringToSendToWebBrowser += "\t\t\t\t</form>\n";
			stringToSendToWebBrowser += "\n";
			stringToSendToWebBrowser += "                 </div>\n";
for (int signUpDataKeyIndex = 0; signUpDataKeyIndex < signUpDataKeys.size(); signUpDataKeyIndex++ )			{
	
	String signUpDataUniqueID = signUpDataKeys.get(signUpDataKeyIndex);
	SignUpData data = signUpData.get(signUpDataUniqueID);
	
			stringToSendToWebBrowser += "\t\t\t</div>\n";
			stringToSendToWebBrowser += "\t\t\t<div>\n";
			stringToSendToWebBrowser += "\t\t\t<Header class = \"align-center\">\n";
			stringToSendToWebBrowser += "\t\t\t<h3>Submitted data</h1>\n";
			stringToSendToWebBrowser += "\t\t\t<p> First name:"+ data.firstname+"</p>\n";
			stringToSendToWebBrowser += "\t\t\t<p> Last name:"+ data.lastname+"</p>\n";
			stringToSendToWebBrowser += "\t\t\t<p> Email:"+ data.email+" </p>\n";
			stringToSendToWebBrowser += "\t\t\t<p> Password:"+ data.password+" </p/\n";
			stringToSendToWebBrowser += "\t\t\t</div>\n";
			
}
			stringToSendToWebBrowser += "\t\t\t</div>\n";
			stringToSendToWebBrowser += "\t\t</div>\n";
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
		
		else if(toProcess.path.equalsIgnoreCase("SignUp.html/submit"))
		{
			SignUpData data = new SignUpData();
			data.uniqueid = "story_" +System.currentTimeMillis();
			data.firstname = toProcess.params.get("first-name");
			data.lastname = toProcess.params.get("last-name");
			data.email = toProcess.params.get("Email");
			data.password = toProcess.params.get("password");
			MVMap<String,SignUpData> signUpData = db.s.openMap("SignUpData");
			signUpData.put(data.uniqueid, data);
			db.commit();
			
			
		}
		return false;
	}

}