package vehicle;

import javax.swing.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDateTime;
import javax.swing.ImageIcon;

public class Maker {
	
	ImageIcon imgmack = new ImageIcon("Mack-logo.png");
	 ClassLoader ldr= this.getClass().getClassLoader();
		 String company;
		 String location;
		 Date mintdate;
		 ImageIcon logo;
		 int phone;
		 String webSite;
		 
		
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
	

  class MakeDisplay extends JFrame {

	JPanel pnl = new JPanel();
	 ImageIcon mack = logo;
	 JLabel lbl1 = new JLabel(mack);
	 
	 MakeDisplay() {
		 super("Mack-logo");
		 setSize(600,600);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 add(pnl);
		 pnl.add(lbl1);
		 setVisible(true);
	 }
  }
}


