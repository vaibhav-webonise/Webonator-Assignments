import java.util.Scanner;

public class RegularPolygon extends PolygonAngle implements Polygon{
    Scanner scan=new Scanner(System.in);
    public int calculatePerimeter(int noOfSides){
        this.noOfSides=noOfSides;
        System.out.print("\n Enter the length for side::");
        length=scan.nextInt();
        return this.noOfSides*length;
    }
}
