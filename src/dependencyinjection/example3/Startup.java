package dependencyinjection.example3;


/**
 * This demo improves on example2 by removing the hard dependencies on 
 * specific implementations of the input and output classes. The 
 * dependencies are manually injected into the MessageService class by 
 * a ServiceLocator component (see Service Locator design pattern). Not only 
 * does this reduce coupling in this Startup class but it also encapsulates 
 * (hides) the underlying mechanism by which dependency injection is done, 
 * simplifying the code in this class. It should be notes, however, that
 * this is still a manual form of DI. In example4 we will use Spring to 
 * automatically perform DI.
 * 
 * @author The ByteShop.Net
 */
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
