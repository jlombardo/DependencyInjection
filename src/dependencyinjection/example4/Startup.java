package dependencyinjection.example4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * This demo improves on example3 by removing the need for a Service Locator 
 * class. Instead we use the Spring Framework and its factory classes to
 * automatically build and inject the dependencies. Now Spring is doing all 
 * the work behind the scenes. Spring completely manages the lifecycle of 
 * the objects in question and performs dependency injection. This type of 
 * automatic, managed system is referred to as Inversion of Control, or IoC 
 * for short. 
 * 
 * @author The ByteShop.Net
 */
public class Startup {

    public static void main(String[] args) {
        /*
         * Spring manages the lifecylce of configured objects. It is Spring
         * that instantiates and injects them and marks them. Access to these 
         * objects is via one of Spring's many context classes. Notice that 
         * ApplicationContext is a generic representation of these classes.
         * Here, for simplicity, we'll use a ClassPathXmlApplicatonContext 
         * which means the Spring configuration information is in an xml
         * file embedded in the application on the classpath. Alternatively
         * we could use a FileSystemXmlApplicationContext (see below) to
         * locate the spring config file external to the application.
         */
        ApplicationContext ctx = 
             new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // To store your config file external to the app use something like 
        // this, where /conf/applicationContext.xml is relative to the root
        // of the startup drive.
//        ApplicationContext ctx =
//             new FileSystemXmlApplicationContext("/conf/applicationContext.xml");
        
        /*
         * Once you have a Sring context you can use it to retrieve any 
         * managed object by its id name. Here we ask for an instance of 
         * the MessageService class. Spring has already created it and injected
         * the delegate input and output components. Cool!
         */
        MessageService service = (MessageService) ctx.getBean("messageService");
        service.displayMessage();  
        
    }
    
}
