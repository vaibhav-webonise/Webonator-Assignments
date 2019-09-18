
	class RegularPolygon  extends PolygonAngle implements Polygon{
	
		public int calculatePerimeter(int noOfSides){
		this.noOfSides=noOfSides;
		System.out.print("\n Enter the length for side::");
		length=scan.nextInt();
		return this.noOfSides*length;
		}

		
		
		
	}
