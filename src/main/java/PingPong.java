
import java.util.Scanner;
import java.util.logging.Logger;
class PingPong {

    Scanner scanInputFromUser=new Scanner(System.in);

     public static void main(String[] args){
         Logger log=Logger.getLogger(PingPong.class.getName());
         Scanner scanInputFromUser = new Scanner(System.in);
         log.info(" Hey what is your name?");
        String name=scanInputFromUser.next();
        log.info(" Wow "+ name+ " is a good name...");
    }
}
