import java.util.*;
public class Cellphone{
	protected int display;
	protected String operatingSystem;
	protected String batteryCapacity;
	protected int internalStorage;
	protected String connectivity;
	protected int RAM;
	protected String modelName;
	protected String phoneType;
	protected int simSlot;
	protected String batteryType;
	
	Scanner scan=new Scanner(System.in);
	
	void doMessage(){
		if(simSlot==2){
		System.out.print("\n 1.Sim1  2.sim2  Choose sim:" );
		int simChoice=scan.nextInt();}
		System.out.print("\n Enter number:");
		long mobileNumber=scan.nextLong();		
		System.out.print("\n Enter message here->");
		String message=scan.next();
		System.out.println("\n Sending message...");
		System.out.println(" Message sent!");
		
	}
	
	void doCall(){
		if(simSlot==2){
		System.out.print("\n 1.Sim1  2.sim2  choose sim:");
		int simChoice=scan.nextInt();
		}
		System.out.print("\n Dial number:");
		long mobileNumber=scan.nextLong();
		System.out.println(" Dialing...");
		System.out.println(" Connected!");
	}

	void doCalculate(){
		String choiceContinue="";
		do{
		System.out.print("\n 1.Addition  2.Substraction  3.multiplication  4.Division  ::");
		int choiceInput=scan.nextInt();
		System.out.print("\n Enter numbers:");
		int numberOne=scan.nextInt();
		int numberTwo=scan.nextInt();
		switch(choiceInput){
			case 1:System.out.print(" Addition result: "+(numberOne+numberTwo));
			break;
			case 2:System.out.print(" Substraction result: "+(numberOne-numberTwo));
			break;
			case 3:System.out.print(" Multiplication result: "+(numberOne*numberTwo));
			break;
			case 4:System.out.print(" Division result: "+(numberOne/numberTwo));
			break;
			default:System.out.print(" Invalid option!");
			break;
		}System.out.print("\n\n continue with calculator?");
	         choiceContinue=scan.next();
		 
		}while(choiceContinue.equals("yes"));
	}
	
	void showFeatures(int display,String operatingSystem, String batteryCapacity,int internalStorage,String connectivity,int RAM,
					String modelName,String phoneType,int simSlot,String batteryType){
						this.simSlot=simSlot;
						this.connectivity=connectivity;
						this.batteryCapacity=batteryCapacity;
						this.batteryType=batteryType;
						this.display=display;
						this.phoneType=phoneType;
						this.RAM=RAM;
						this.modelName=modelName;
						this.internalStorage=internalStorage;
						this.operatingSystem=operatingSystem;
						
	System.out.print("\n 1.display::"+display+"inch  \n 2.operatingSystem::"+operatingSystem+"  \n 3.batteryCapacity:: "+batteryCapacity);
	System.out.print("\n 4.internalStorage::"+internalStorage+"GB  \n 5.connectivity::"+connectivity+"  \n 6.RAM::"+RAM+"GB \n 7.modelName:: "+modelName);
	System.out.print("\n 8.phoneType::"+phoneType+"  \n 9.simSlot::"+simSlot+"  \n 10.batteryType::"+batteryType);

	
}}
