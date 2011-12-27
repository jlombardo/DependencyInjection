package dependencyinjection.example1;


public class Startup {

    public static void main(String[] args) {
        // Create the service object
        MessageService service = new MessageService();
        
        // Now ask it to display the message
        service.displayMessage();
        
    }
    
}
