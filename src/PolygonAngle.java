import java.util.Scanner;

public class PolygonAngle {
    private int defaultAngle=180;
    private int noOfTriangle;
    private int sumOfInteriorAngles;
    protected int noOfSides;
    protected int length;
    Scanner scan=new Scanner(System.in);

    public int calculateSumOfAngles(int noOfSides){
        this.noOfSides=noOfSides;
        noOfTriangle=noOfSides-2;
        sumOfInteriorAngles=noOfTriangle*defaultAngle;
        return sumOfInteriorAngles;
    }
}
