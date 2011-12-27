package dependencyinjection.example1;

/**
 * This demo shows a poorly designed application for simple messaging. 
 * Although it's a modular design, with separate components for input and
 * output, plus a service facade, it suffers from strong dependencies that
 * make it rigid and inflexible.
 * 
 * @author The ByteShop.Net
 */
public class Startup {

    public static void main(String[] args) {
        // Create the service object
        MessageService service = new MessageService();
        
        // Now ask it to display the message. Note that the displayMessage
        // method nicely encapsulates the behavior. However, when you 
        // examine the MessageService class you will see it is too rigid.
        service.displayMessage();
        
    }
    
}
