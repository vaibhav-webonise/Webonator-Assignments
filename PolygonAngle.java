import java.util.Scanner;
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
	
