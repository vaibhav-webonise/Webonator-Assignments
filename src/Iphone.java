import java.net.*;
import java.awt.*;
import java.util.*;

class Iphone extends Cellphone{
	Scanner scan=new Scanner(System.in);
	
	void callSiri(){
		System.out.print("\n How can I help you:");
		String inputRequest=scan.next();
		try {
			  //URI is used to request the given url
			  Desktop desktop = Desktop.getDesktop();
			  URI objectURL = new URI(inputRequest);
			  desktop.browse(objectURL);
			} catch (Exception e) {
			  System.out.print("\n Getting some problem::"+e);
	}}
}
