import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
        public static void main(String[] args){

            ApplicationContext applicationContext= new ClassPathXmlApplicationContext("classpath:my-beans.xml");
            HelloWorld helloWorld=(HelloWorld)applicationContext.getBean("objectHello");
            String str=helloWorld.getMessage();
            System.out.println(str);

        }

    }
