import java.net.URI;
import java.awt.Desktop;
import java.util.Scanner;

class Iphone extends Cellphone {
    Scanner scan = new Scanner(System.in);

    void callSiri() {
        System.out.print("\n How can I help you:");

        String inputRequest = scan.next();
        try {
            //URI is used to request the given url
            Desktop desktop = Desktop.getDesktop();
            URI objectURL = new URI("https://www."+inputRequest+".com");
            desktop.browse(objectURL);
        } catch (Exception e) {
            System.out.print("\n Getting some problem::" + e);
        }
    }
}
