package vehicle;

import java.awt.Image;
import java.util.Date;

public class Maker {
		 String company;
		 String location;
		 Date mintdate;
		 Image logo;
		
		Maker() {
			company = "Mack";
			location = "Greensboro, NC";
			mintdate =  new Date();
		//	log
		}
		
	     Maker( String c, String l, Date md, Image lg) {
			company = c;
			location = l;
			mintdate = md;
			logo = lg;
		}
	     
	     String getcompany() {return company;}
	     String getlocation() {return location;}
	     void setcompany(String c) {company = c;}
	     void setlocation(String l) {location = l;}
	     
	     void showDim() {
	    	 System.out.println("The company and location are: " + company + " and " + location);
	     }
	     
	     
	     Image getLogo() {
	    	 return logo;
	     }
	     void getMake() {
	    	 
	     }
		
		
		

	}


