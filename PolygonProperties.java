import java.util.*;

	

	interface Polygon{
		
		public int calculatePerimeter(int polygonSides);
		public int calculateSumOfAngles(int polygonSides);
		
	}


	class PolygonAngle{
		private int degreeOfAngle;
		private int sumOfDegree=0;
		protected int noOfSides;
		protected int length;
		Scanner scan=new Scanner(System.in);

		public int calculateSumOfAngles(int noOfSides){
			
			this.noOfSides=noOfSides;
			System.out.print("\n Enter the value of angles in degrees::");
			for(int i=0;i<noOfSides;i++){
			degreeOfAngle=scan.nextInt();
			sumOfDegree=sumOfDegree+degreeOfAngle;
			}
		return sumOfDegree;
		}
		
	}
	


	class RegularPolygon  extends PolygonAngle implements Polygon{
	
		public int calculatePerimeter(int noOfSides){
		this.noOfSides=noOfSides;
		System.out.print("\n Enter the length for side::");
		length=scan.nextInt();
		return this.noOfSides*length;
		}

		
		
		
	}

	class IrregularPolygon extends PolygonAngle implements Polygon {
		
		private int perimeter=0;

		public int calculatePerimeter(int noOfSides){
		
		this.noOfSides=noOfSides;
		System.out.print("\n Enter length of each sides::");
			for(int i=0;i<this.noOfSides;i++){
			length=scan.nextInt();
			perimeter=perimeter+length;		
			}
		return perimeter;
		}

	}


	class PolygonProperties{
	public static void main(String[] args){

	String continueInput="";
	Scanner scan=new Scanner(System.in);
	
	
		do{
			System.out.print("\n\n 1. Regular polygon  2.Irregular polygon  \n Choose you option::");
			int choiceInput=scan.nextInt();
			System.out.print("\n\n Enter the number of sides for polygon::");
			int noOfSides=scan.nextInt();

			if(noOfSides>2&&noOfSides<=10){
			switch(choiceInput){
			case 1:Polygon rPolygon=new RegularPolygon();
			       String choice1="";      
					 do{
						
						System.out.print("\n\n 1.Perimeter  2.Sum of degrees of angles   choose any::");
						int choiceInput1=scan.nextInt();
			
							switch(choiceInput1){
			
							case 1:System.out.print(" Perimeter of regular polygon::"+rPolygon.calculatePerimeter(noOfSides));
							break;
							case 2:System.out.print(" Sum of all angles of regular polygon::"+rPolygon.calculateSumOfAngles(noOfSides));
							break;
							}
						System.out.print("\n\n Want to try another::");
						choice1=scan.next();
					}while(choice1.equals("yes"));
			break;

			case 2:Polygon iPolygon=new IrregularPolygon();
			       String choice2="";	
					do{
						
						System.out.print("\n\n 1.Perimeter  2.Sum of degrees of angles   choose any::");
						int choiceInput2=scan.nextInt();
			
							switch(choiceInput2){
			
							case 1:System.out.print(" Perimeter of irregular polygon::"+iPolygon.calculatePerimeter(noOfSides));
							break;
							case 2:System.out.print(" Sum of all angles of irregular polygon::"+iPolygon.calculateSumOfAngles(noOfSides));
							break;
							default:System.out.print(" Invalid choice...");
							break;
							}
						System.out.print("\n\n Want to try another::");
						choice2=scan.next();
					}while(choice2.equals("yes"));
			break;
	
			default:System.out.print("\n Invalid choice...");
			break;
			}}
			else{ System.out.print("\n Polygon must have atleast 3 sides and should not be complex one...");
			}
		
		

		System.out.print("\n Want to continue::");
		continueInput=scan.next();
		}while(continueInput.equals("yes"));

	}
	}



