package vehicle;

import javax.swing.*;
import java.util.Date;

import javax.swing.ImageIcon;

public class Maker {
	
	ImageIcon imgmack = new ImageIcon("Mack-logo.png");
	
		 String company;
		 String location;
		 Date mintdate;
		 ImageIcon logo;
		 long phone;
		 String webSite;
		
		Maker() {
			company = "Mack";
			location = "Greensboro, NC";
			mintdate =  new Date();
			phone = 501555368;
			webSite = "http://www.google.com";
			logo = imgmack;
		}
		
	     Maker( String c, String l, Date md, ImageIcon lg, long pn, String ws) {
			company = c;
			location = l;
			mintdate = md;
			logo = lg;
			phone = pn;
			webSite = ws;
		}
	    
	     
	     ImageIcon getLogo() {
	    	 return logo;
	     }
	     void getMake() {
	    	 
	     }
		
		
		

	}


