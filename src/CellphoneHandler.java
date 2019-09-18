import java.util.*;



//main class		
	
public class CellphoneHandler{
public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	
	
	String inputChoiceFeatures="";
	
	do{
	System.out.print("\n Available brands: 1.Samsung  2.Iphone");
	System.out.print("\n your choice of brand:");
	int brandChoice=scan.nextInt();
	switch(brandChoice){
		case 1: Samsung samsungObject=new Samsung();
				System.out.println("\n Samsung features...");
				samsungObject.showFeatures(5,"Android","3000MaH",32,"3G",4,"Samsung note 4","smartphone",2,"Non removable");
				System.out.println("\n\n Samsung functions...");
				System.out.print("\n 1.Samsung pay  2.Call  3.Message  4.Calculator  Try any::");
				int samsungChoice=scan.nextInt();
				
				switch(samsungChoice){
					case 1:samsungObject.samsungPay();
					break;
					case 2:samsungObject.doCall();
					break;
					case 3:samsungObject.doMessage();
					break;
					case 4:samsungObject.doCalculate();
					break;


				}break;



				
		case 2: Iphone iphoneObject=new Iphone();
				System.out.print("\n Iphone features...");
				iphoneObject.showFeatures(5,"IOS","5000MaH",64,"4G",4,"Iphone 6S","smartphone",1,"Non removable");
				System.out.print("\n\n  Iphone functions...");
				System.out.print("\n  1.Siri intelligent assistant  2.Call  3.Message  4.Calculator  Try any::");
				int iphoneChoice=scan.nextInt();
				
				switch(iphoneChoice){
					case 1:iphoneObject.callSiri();
					break;
					case 2:iphoneObject.doCall();
					break;
					case 3:iphoneObject.doMessage();
					break;
					case 4:iphoneObject.doCalculate();
					break;
				}break;
				
		default:System.out.print("Invalid option");
		break;
		}
		System.out.print("\n Want to see another brand::");
		inputChoiceFeatures=scan.next();
	}while(inputChoiceFeatures.equals("yes"));	
}}		

	
	
	
	
	
	
	
	
	
	
