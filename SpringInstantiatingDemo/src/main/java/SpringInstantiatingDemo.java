import net.codeJava.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * https://www.codejava.net/frameworks/spring/spring-dependency-injection-example-with-xml-configuration
 * Spring Dependency Injection with XML Configuration
 */


public class SpringInstantiatingDemo {
    public static void main(String[] args) {

        ApplicationContext appContext =
                new ClassPathXmlApplicationContext("services.xml");

        Client client = (Client) appContext.getBean("client2");  //switch injection to client2 from XML
        client.doSomething();
    }

}
