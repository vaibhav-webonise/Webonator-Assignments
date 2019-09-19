
import java.util.Scanner;

public class IrregularPolygon extends PolygonAngle implements Polygon {
    private int perimeter=0;
    Scanner scan=new Scanner(System.in);
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
