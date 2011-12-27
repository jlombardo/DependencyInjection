package dependencyinjection.example2;


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
