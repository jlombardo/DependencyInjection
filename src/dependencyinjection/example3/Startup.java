package dependencyinjection.example3;


public class Startup {

    public static void main(String[] args) {
        // Create the service object
        MessageService service = null;
        
        try {
            service = new MessageService();
            service.displayMessage();
            
        } catch(Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
