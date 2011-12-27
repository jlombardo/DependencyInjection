package dependencyinjection.example2;


/**
 * This demo improves on example 1 by using abstractions (Interfaces) to
 * represent the input and output components. Because the MessageService
 * class relies only on those abstractions it is vastly more flexible and 
 * portable. However, this startup class still has some hard dependencies 
 * that will be removed in example 3.
 * 
 * @author The ByteShop.Net
 */
public class Startup {

    public static void main(String[] args) {
        // Create the service object
        MessageService service = new MessageService();
        
        // Now can can inject a dependency at runtime, and change it
        // later to something else -- much more flexible
        service.setInput(new GuiMessageInput());
        service.setOutput(new ConsoleMessageOutput());
        
        // Now ask it to display the message
        service.displayMessage();
        
    }
        
        
        
        
        
        
        

    
}
