package vehicle;

import java.awt.Image;
import java.util.Date;

public class Maker {
		 String company;
		 String location;
		 Date mintdate;
		 Image logo;
		 long phone;
		 String webSite;
		
		Maker() {
			company = "Mack";
			location = "Greensboro, NC";
			mintdate =  new Date();
			phone = 501555368;
			webSite = "http://www.google.com";
		//	log
		}
		
	     Maker( String c, String l, Date md, Image lg, long pn, String ws) {
			company = c;
			location = l;
			mintdate = md;
			logo = lg;
			phone = pn;
			webSite = ws;
		}
	    
	     
	     Image getLogo() {
	    	 return logo;
	     }
	     void getMake() {
	    	 
	     }
		
		
		

	}


