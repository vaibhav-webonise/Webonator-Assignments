import java.util.Scanner;

public class PolygonProperties {
    public static void main(String[] args) {
        String continueInput="";
        Scanner scan=new Scanner(System.in);
        do{
            System.out.print("\n\n 1. Regular polygon  2.Irregular polygon  \n Choose you option::");
            int choiceInput=scan.nextInt();
            System.out.print("\n\n Enter the number of sides for polygon::");
            int noOfSides=scan.nextInt();

            if(noOfSides>2&&noOfSides<=10){
                switch(choiceInput){
                    case 1:Polygon regularPolygon=new RegularPolygon();
                        String choice1="";
                        do{

                            System.out.print("\n\n 1.Perimeter  2.Sum of interior angles   choose any::");
                            int choiceInput1=scan.nextInt();

                            switch(choiceInput1){

                                case 1:System.out.print(" Perimeter of regular polygon::"+regularPolygon.calculatePerimeter(noOfSides));
                                    break;
                                case 2:System.out.print(" Sum of interior angles of regular polygon::"+regularPolygon.calculateSumOfAngles(noOfSides));
                                    break;
                            }
                            System.out.print("\n\n Want to continue with selected option::");
                            choice1=scan.next();
                        }while(choice1.equals("yes"));
                        break;

                    case 2:Polygon irregularPolygon=new IrregularPolygon();
                        String choice2="";
                        do{

                            System.out.print("\n\n 1.Perimeter  2.Sum of interior angles   choose any::");
                            int choiceInput2=scan.nextInt();

                            switch(choiceInput2){

                                case 1:System.out.print(" Perimeter of irregular polygon::"+irregularPolygon.calculatePerimeter(noOfSides));
                                    break;
                                case 2:System.out.print(" Sum of interior angles of irregular polygon::"+irregularPolygon.calculateSumOfAngles(noOfSides));
                                    break;
                                default:System.out.print(" Invalid choice...");
                                    break;
                            }
                            System.out.print("\n\n Want to continue with selected option::");
                            choice2=scan.next();
                        }while(choice2.equals("yes"));
                        break;

                    default:System.out.print("\n Invalid choice...");
                        break;
                }
            }
            else{ System.out.print("\n Polygon must have atleast 3 sides and should not be complex one...");
            }
            System.out.print("\n Want to continue with the application::");
            continueInput=scan.next();
        }while(continueInput.equals("yes"));
    }
}

