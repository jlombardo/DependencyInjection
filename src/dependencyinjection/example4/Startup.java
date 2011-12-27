package dependencyinjection.example4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Startup {

    public static void main(String[] args) {
        // Spring creates the object and it's dependencies
        // ... now ask for it
        ApplicationContext ctx = 
             new ClassPathXmlApplicationContext("applicationContext.xml");
        
        MessageService service = (MessageService) ctx.getBean("messageService");
        service.displayMessage();  
        
    }
    
}
