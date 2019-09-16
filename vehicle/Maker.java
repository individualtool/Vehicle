package vehicle;

import javax.swing.*;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;

public class Maker {
	ImageIcon imgmack = new ImageIcon("macklogo.jpg");
		 String company;
		 String location;
		 Date mintdate;
		 ImageIcon logo;
		 int phone;
		 String webSite;
		 
		
		@Override
		public String toString() {
			return "Maker [imgmack=" + imgmack + ", company=" + company + ", location=" + location + ", mintdate="
					+ mintdate + ", logo=" + logo + ", phone=" + phone + ", webSite=" + webSite + "]";
		}

		Maker() {
			company = "Mack";
			location = "Greensboro, NC";
			try { mintdate=new SimpleDateFormat("yyyy-MM-dd").parse("2020-12-32"); }
			catch (Exception e) {;}
			phone = 501555368;
			webSite = "http://www.google.com";
			logo = imgmack;
		}
		
	     Maker( String c, String l, Date md, ImageIcon lg, int pn, String ws) {
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
	     
	     String getMake() {
	    	 return company;
	    	 
	     }
	


}
