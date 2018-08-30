package views;

import java.util.ArrayList;

import storage.DatabaseInterface;
import storage.FileStoreInterface;
import web.WebRequest;
import web.WebResponse;

public class Archive extends DynamicWebPage
{

	public Archive(DatabaseInterface db,FileStoreInterface fs)
	{
		super(db,fs);
	}

	public boolean process(WebRequest toProcess)
	{
		if(toProcess.path.equalsIgnoreCase("Archive.html"))
		{
			ArrayList<String> animals=null;
			ArrayList<String> imgUrl=null;
			String stringToSendToWebBrowser = "";
			stringToSendToWebBrowser += "<!DOCTYPE html>\n";
			stringToSendToWebBrowser += "<html>\n";
			stringToSendToWebBrowser += "  <head>\n";
			stringToSendToWebBrowser += "    <title>Archive</title>\n";
			stringToSendToWebBrowser += "    <meta charset=\"utf-8\">\n";
			stringToSendToWebBrowser += "    <meta  name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n";
			stringToSendToWebBrowser += "    <link href=\"/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n";
			stringToSendToWebBrowser += "    <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,400,300,600,700\" rel=\"stylesheet\">\n";
			stringToSendToWebBrowser += "    <link href=\"https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic\" rel=\"stylesheet\">\n";
			stringToSendToWebBrowser += "    <link href=\"/css/blocks.css\" rel=\"stylesheet\">\n";
			stringToSendToWebBrowser += "    <script type=\"text/javascript\" src=\"/js/jquery-1.11.1.min.js\"></script>\n";
			stringToSendToWebBrowser += "    <script type=\"text/javascript\" src=\"/js/bootstrap.min.js\"></script>\n";
			stringToSendToWebBrowser += "\t<link href=\"https://use.fontawesome.com/releases/v5.0.6/css/all.css\" rel=\"stylesheet\">\n";
			stringToSendToWebBrowser += "\t<style>\n";
			stringToSendToWebBrowser += "\t.grid-container {\n";
			stringToSendToWebBrowser += "\t  margin-top: 40px;\n";
			stringToSendToWebBrowser += "\t  display: grid;\n";
			stringToSendToWebBrowser += "\t  grid-template-columns: auto auto auto;\n";
			stringToSendToWebBrowser += "\t}\n";
			stringToSendToWebBrowser += "\t.grid-item {\n";
			stringToSendToWebBrowser += "\t  background-color: rgba(255, 255, 255, 0.8);\n";
			stringToSendToWebBrowser += "\t  border: 1px solid rgba(0, 0, 0, 0.8);\n";
			stringToSendToWebBrowser += "\t  padding: 20px;\n";
			stringToSendToWebBrowser += "\t  text-align: center;\n";
			stringToSendToWebBrowser += "\t}\n";
			stringToSendToWebBrowser += "\t.grid-item img{\n";
			stringToSendToWebBrowser += "\t  height:150px;\n";
			stringToSendToWebBrowser += "\t  width:250px;\n";
			stringToSendToWebBrowser += "\t  display:block;\n";
			stringToSendToWebBrowser += "\t  text-align:center;\n";
			stringToSendToWebBrowser += "\t  margin:auto;\n";
			stringToSendToWebBrowser += "\t  margin-bottom:10px;\n";
			stringToSendToWebBrowser += "\t}\n";
			stringToSendToWebBrowser += "\t.grid-item button{\n";
			stringToSendToWebBrowser += "\t\tfont-size: 20px;\n";
			stringToSendToWebBrowser += "\t}\n";
			stringToSendToWebBrowser += "\t</style>\n";
			stringToSendToWebBrowser += "  </head>\n";
			stringToSendToWebBrowser += "  <body>\n";
			stringToSendToWebBrowser += "    <body style=\"font-family:Lato;background-color:#aaffd7;\">\n";
			stringToSendToWebBrowser += "\t\t<div style=\"display:inline-block;width:20%;height:100%;background-color:white;position:fixed;top:0;left:0;\">\n";
			stringToSendToWebBrowser += "\t\t<nav>\n";
			stringToSendToWebBrowser += "\t\t<h2>Menu</h2>\n";
			stringToSendToWebBrowser += "\t\t<input type=\"text\" name=\"query\" id=\"query\" placeholder=\"Search\" style=\"margin-left:40px;\"/>\n";
			stringToSendToWebBrowser += "\t\t<ul style=\"list-style-type: none;font-size:18px;\">\n";
			stringToSendToWebBrowser += "\t\t\t<li><a href=\"index.html\">Home</a></li>\n";
			stringToSendToWebBrowser += "\t\t\t<li><a href=\"#\">other</a></li>\n";
			stringToSendToWebBrowser += "\t\t\t<li><a href=\"#\">other2</a></li>\n";
			stringToSendToWebBrowser += "\t\t</ul>\n";
			stringToSendToWebBrowser += "\t\t</nav>\t\t\t\n";
			stringToSendToWebBrowser += "\t\t</div>\n";
			stringToSendToWebBrowser += "\t\n";
			stringToSendToWebBrowser += "\t\t<div style=\"display:inline-block;width:60%;padding-left:25%;\">\n";
			stringToSendToWebBrowser += "\t\t\t<div class=\"grid-container\">\n";
			for(String i : animals) {
				stringToSendToWebBrowser += "\t\t\t  <div class=\"grid-item\"><img src=\""+imgUrl+"\"><button onclick=\"animal.html#"+i.toLowerCase()+"\">"+i+"</button></div>  \n";
			}
			stringToSendToWebBrowser += "\t\t\t</div>\n";
			stringToSendToWebBrowser += "\t\t</div>\n";
			stringToSendToWebBrowser += "</body>\n";
			stringToSendToWebBrowser += "</html>\n";
			toProcess.r = new WebResponse( WebResponse.HTTP_OK, WebResponse.MIME_HTML, stringToSendToWebBrowser );
			return true;
		}
		return false;
	}

}