package views;

import java.util.List;

import org.h2.mvstore.MVMap;

import model.AnimalData;
import storage.DatabaseInterface;
import storage.FileStoreInterface;
import web.WebRequest;
import web.WebResponse;

public class NewAnimal extends DynamicWebPage
{
AnimalData animalx = new AnimalData();
public NewAnimal(DatabaseInterface db,FileStoreInterface fs)
{
super(db,fs);
}

public boolean process(WebRequest toProcess)
{
	AnimalData animaldetails = new AnimalData();
	animaldetails.setAnimal_name("Test");
	if(toProcess.path.equalsIgnoreCase("NewAnimal.html"))
	{
String stringToSendToWebBrowser = "";
stringToSendToWebBrowser += "<!DOCTYPE HTML>\n";
stringToSendToWebBrowser += "<html>\n";
stringToSendToWebBrowser += "\t<head>\n";
stringToSendToWebBrowser += "\t\t<title>WikiEcosystem</title>\n";
stringToSendToWebBrowser += "\t\t<meta charset=\"utf-8\" />\t\n";
stringToSendToWebBrowser += "\t\t<link rel=\"stylesheet\" href=\"assets/css/main.css\" />\n";
stringToSendToWebBrowser += "\t\t<link rel=\"stylesheet\" href=\"treant/Treant.css\">\n";
stringToSendToWebBrowser += "\t\t<link rel=\"stylesheet\" href=\"treant/collapsable.css\">\n";
stringToSendToWebBrowser += "\t\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n";
stringToSendToWebBrowser += "\n";
stringToSendToWebBrowser += "\t</head>\n";
stringToSendToWebBrowser += "\t<body>\n";
stringToSendToWebBrowser += "\t<div id=\"wrapper\">\n";
stringToSendToWebBrowser += "\t\t<div id=\"main\">\n";
stringToSendToWebBrowser += "\t\t\t<div class=\"inner\">\t\t\n";
stringToSendToWebBrowser += "\t\t\t\n";
stringToSendToWebBrowser += "\t\t\t\t\n";
stringToSendToWebBrowser += "\t\t\t\t\t\n";
stringToSendToWebBrowser += "\t\t\t\t<!--Section One-->\n";
stringToSendToWebBrowser += "\t\t\t\t<section id=\"2\">\n";
stringToSendToWebBrowser += "\t\t\t\t<center><a id=\"link\" href=\"#1\"><span class = \"mini-icon fa-arrow-up\"></span></a></center>\n";
stringToSendToWebBrowser += "\t\t\t\t<div class=\"content\">\n";
stringToSendToWebBrowser += "\t\t\t\t\n";
stringToSendToWebBrowser += "\t\t\t\t\n";
stringToSendToWebBrowser += "\t\t\t\t\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t<header class=\"major align-center\">\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t<h1>Form for adding new animal</h1> \n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t</header>\t\t\t\t\t\t\t\t\t\t\t\t\t\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t<p>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t<b>This part of the website allows you to add a new animal species to our database, \n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\trequiring details regarding its scientific classification and more general facts \n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\tabout the animal being added. There is also space below to include a general description \n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\tof the animal, and also additional notes which can be used to add any other details not included in the form.</b>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t</p>\t\t\t\t\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t<br>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- Form -->\n";
stringToSendToWebBrowser += "\t\t\t\t<form id=\"NewAnimal\" action=\"/NewAnimal.html/submit/animal\" method=\"GET\">\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"12u 12u$(xsmall)\">\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t<input class=align-center type=\"text\" name=\"Animal_Name\" id=\"Animal_Name\" value=\"\" placeholder=\"Animal Name\"/> <br>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\t\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t<b>Upload Animal Image  </b> <input type=\"file\" name=\"pic\" accept=\"image/*\"> \n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<br><br>\t\t\t\t\t\t\t\t\t\t\t\t\t\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<header class=\"major\">\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t<h3>Scientific Classification</h3>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t</header>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"row uniform\">\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"6u 12u$(xsmall)\">\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"Animal_Kingdom\" id=\"Animal_Kingdom\" value=\"\" placeholder=\"Kingdom\"/>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"6u$ 12u$(xsmall)\">\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"Animal_Phylum\" id=\"Animal_Phylum\" value=\"\" placeholder=\"Phylum\"/>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"6u 12u$(xsmall)\">\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"Animal_Class\" id=\"Animal_Class\" value=\"\" placeholder=\"Class\"/>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"6u$ 12u$(xsmall)\">\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"Animal_Order\" id=\"Animal_Order\" value=\"\" placeholder=\"Order\"/>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"6u 12u$(xsmall)\">\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"Animal_Suborder\" id=\"Animal_Suborder\" value=\"\" placeholder=\"Suborder\"/>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"6u$ 12u$(xsmall)\">\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"Animal_Family\" id=\"Animal_Family\" value=\"\" placeholder=\"Family\"/>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"6u 12u$(xsmall)\">\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"Animal_Genus\" id=\"Animal_Genus\" value=\"\" placeholder=\"Genus\"/>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"6u$ 12u$(xsmall)\">\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"Animal_Species\" id=\"Animal_Species\" value=\"\" placeholder=\"Species\"/>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<br>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<header class=\"major\">\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t<h3>General Facts</h3>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t</header>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"row uniform\">\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"6u 12u$(xsmall)\">\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"Animal_Location\" id=\"Animal_Location\" value=\"\" placeholder=\"Location Primarily Found\"/>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"6u$ 12u$(xsmall)\">\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"Animal_Habitat\" id=\"Animal_Habitat\" value=\"\" placeholder=\"Habitat\"/>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"6u 12u$(xsmall)\">\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"Animal_Name_Of_Young\" id=\"Animal_Name_Of_Young\" value=\"\" placeholder=\"Name of Young\"/>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"6u$ 12u$(xsmall)\">\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"Animal_Population\" id=\"Animal_Population\" value=\"\" placeholder=\"Estimated Population\"/>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"6u 12u$(xsmall)\">\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"Amimal_Prey\" id=\"Animal_Prey\" value=\"\" placeholder=\"Prey\"/>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"6u$ 12u$(xsmall)\">\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"Animal_Predator\" id=\"Animal_Predator\" value=\"\" placeholder=\"Predators\"/>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"6u 12u$(xsmall)\">\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"Animal_Lifespan\" id=\"Animal_Lifespan\" value=\"\" placeholder=\"Average Lifespan\"/>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"6u$ 12u$(xsmall)\">\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"Animal_Weight\" id=\"Animal_Weight\" value=\"\" placeholder=\"Average Weight\"/>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"6u 12u$(xsmall)\">\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"Animal_Diet\" id=\"Animal_Diet\" value=\"\" placeholder=\"Diet e.g. Herbivore/Carnivore etc\"/>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"6u$ 12u$(xsmall)\">\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"Animal_Endangered\" id=\"Animal_Endangered\" value=\"\" placeholder=\"IUCN Endangered Scale\"/>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"6u$ 12u$(xsmall)\">\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t<header class=\"major\">\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t<h3>General Description</h3>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t</header> \n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"12u$\">\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<textarea name=\"Animal_Description\" id=\"nimal_Description\" placeholder=\"Enter your description\" rows=\"6\"></textarea>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<br>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t<header class=\"major\">\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t<h3>Additional Notes</h3>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t</header>\t\t\t\t\t\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"12u$\">\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t<textarea name=\"Animal_Additional_Notes\" id=\"Animal_Additional_Notes\" placeholder=\"Enter your additional notes\" rows=\"6\"></textarea>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\t\t\t\t\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"12u$\">\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<ul class=\"actions\">\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><input type=\"submit\" value=\"Submit Information\" class=\"special\" /></li>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><input type=\"reset\" value=\"Reset Fields\" /></li>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</ul>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</form>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t\t\t\t\t\t\t\t\n";
stringToSendToWebBrowser += "\t\t\t\t\t\n";
stringToSendToWebBrowser += "\t\t\t\t<center><a id=\"link\" href=\"#3\"><span class = \"mini-icon fa-arrow-down\"></span></a></center>\n";
stringToSendToWebBrowser += "\t\t\t\t</section>\n";
stringToSendToWebBrowser += "\t\t\t\t\n";
stringToSendToWebBrowser += "\n";
stringToSendToWebBrowser += "\t\t\t\n";
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
stringToSendToWebBrowser += "\t\t\t\t\t\t<li><a href=\"archive.html\">Animals</a></li>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t<li><a href=\"interactive.html\">Interactive</a></li>\n";
stringToSendToWebBrowser += "\t\t\t\t\t\t<li><a href=\"login.html\">Login</a></li>\n";
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

//submitted animal data

MVMap<String, AnimalData> animalDetails = db.s.openMap("AnimalData");
List<String> animalKeys = animalDetails.keyList();

if(animalKeys.size()!= 0)
{
	for(int count = 0; count<animalKeys.size();count++)
	{
		String id = animalKeys.get(count);
		AnimalData data=animalDetails.get(id);
		
		stringToSendToWebBrowser += "\t\t\t\t<section id=\"3\">\n";
		stringToSendToWebBrowser += "\t\t\t\t<center><a id=\"link\" href=\"#2\"><span class = \"mini-icon fa-arrow-up\"></span></a></center>\n";
		stringToSendToWebBrowser += "\t\t\t\t<div class=\"content\">\n";
		stringToSendToWebBrowser += "\t\t\t\t\t<h2>Animal Submitted Data</h2>\n";
		stringToSendToWebBrowser += "\t\t\t\t\t<p>"+animalDetails.get(id).getAnimal_name()+"</p>\n";
		stringToSendToWebBrowser += "\t\t\t\t\t<p>"+animalDetails.get(id).getAnimal_description()+"</p>\n";
		stringToSendToWebBrowser += "\t\t\t\t\t<p>"+animalDetails.get(id).getAnimal_kingdom()+"</p>\n";
		stringToSendToWebBrowser += "\t\t\t\t\t<p>"+animalDetails.get(id).getAnimal_phylum()+"</p>\n";
		stringToSendToWebBrowser += "\t\t\t\t\t<p>"+animalDetails.get(id).getAnimal_class()+"</p>\n";
		stringToSendToWebBrowser += "\t\t\t\t\t<p>"+animalDetails.get(id).getAnimal_order()+"</p>\n";
		stringToSendToWebBrowser += "\t\t\t\t\t<p>"+animalDetails.get(id).getAnimal_suborder()+"</p>\n";
		stringToSendToWebBrowser += "\t\t\t\t\t<p>"+animalDetails.get(id).getAnimal_family()+"</p>\n";
		stringToSendToWebBrowser += "\t\t\t\t\t<p>"+animalDetails.get(id).getAnimal_genus()+"</p>\n";
		stringToSendToWebBrowser += "\t\t\t\t\t<p>"+animalDetails.get(id).getAnimal_species()+"</p>\n";
		
		stringToSendToWebBrowser += "\t\t\t\t\t<p>"+animalDetails.get(id).getAnimal_location()+"</p>\n";
		stringToSendToWebBrowser += "\t\t\t\t\t<p>"+animalDetails.get(id).getAnimal_habitat()+"</p>\n";
		stringToSendToWebBrowser += "\t\t\t\t\t<p>"+animalDetails.get(id).getAnimal_name_of_young()+"</p>\n";
		stringToSendToWebBrowser += "\t\t\t\t\t<p>"+animalDetails.get(id).getAnimal_prey()+"</p>\n";
		stringToSendToWebBrowser += "\t\t\t\t\t<p>"+animalDetails.get(id).getAnimal_predators()+"</p>\n";
		stringToSendToWebBrowser += "\t\t\t\t\t<p>"+animalDetails.get(id).getAnimal_average_lifespan()+"</p>\n";
		stringToSendToWebBrowser += "\t\t\t\t\t<p>"+animalDetails.get(id).getAnimal_weight()+"</p>\n";
		stringToSendToWebBrowser += "\t\t\t\t\t<p>"+animalDetails.get(id).getAnimal_diet()+"</p>\n";
		stringToSendToWebBrowser += "\t\t\t\t\t<p>"+animalDetails.get(id).getAnimal_endangered_scale()+"</p>\n";
		stringToSendToWebBrowser += "\t\t\t\t\t<p>"+animalDetails.get(id).getAnimal_additional_notes()+"</p>\n";
		stringToSendToWebBrowser += "\t\t\t\t\t<p>"+animalDetails.get(id).getAnimal_population()+"</p>\n";
		stringToSendToWebBrowser += "\t\t\t\t</div>\n";
		stringToSendToWebBrowser += "\t\t\t\t</section>\n";
	}
}

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
else if(toProcess.path.equalsIgnoreCase("NewAnimal.html/submit/animal"))
{
	
	MVMap<String, AnimalData> animalDetails = db.s.openMap("AnimalData");
	AnimalData animalx = new AnimalData();
	
	animalx.setUniqueid("animal_" + System.currentTimeMillis());
	animalx.setAnimal_name(toProcess.params.get("Animal_Name"));
	animalx.setAnimal_description(toProcess.params.get("Animal_Description"));
	animalx.setAnimal_kingdom(toProcess.params.get("Animal_Kingdom"));
	animalx.setAnimal_phylum(toProcess.params.get("Animal_Phylum"));
	animalx.setAnimal_class(toProcess.params.get("Animal_Class"));
	animalx.setAnimal_order(toProcess.params.get("Animal_Order"));
	animalx.setAnimal_suborder(toProcess.params.get("Animal_Suborder"));
	animalx.setAnimal_family(toProcess.params.get("Animal_Family"));
	animalx.setAnimal_genus(toProcess.params.get("Animal_Genus"));
	animalx.setAnimal_species(toProcess.params.get("Animal_Species"));
	
	animalx.setAnimal_location(toProcess.params.get("Animal_Location"));
	animalx.setAnimal_habitat(toProcess.params.get("Animal_Habitat"));
	animalx.setAnimal_name_of_young(toProcess.params.get("Animal_Name_Of_Young"));
	animalx.setAnimal_prey(toProcess.params.get("Animal_Prey"));
	animalx.setAnimal_predators(toProcess.params.get("Animal_Predator"));
	animalx.setAnimal_average_lifespan(toProcess.params.get("Animal_Lifespan"));
	animalx.setAnimal_weight(toProcess.params.get("Animal_Weight"));
	animalx.setAnimal_diet(toProcess.params.get("Animal_Diet"));
	animalx.setAnimal_endangered_scale(toProcess.params.get("Animal_Endangered"));
	animalx.setAnimal_additional_notes(toProcess.params.get("Animal_Additional_Notes"));
	animalx.setAnimal_population(toProcess.params.get("Animal_Population"));
	
	animalDetails.put(animalx.getUniqueid(), animalx);
	db.commit();
	
			String url="/NewAnimal.html";
			
				toProcess.r = new WebResponse(WebResponse.HTTP_REDIRECT, WebResponse.MIME_HTML,"<html><body>Redirected: <a href=\""+url+"\">"+url+"</a></body></html>");
					toProcess.r.addHeader("Location", url);
return true;

}
return false;
}

}