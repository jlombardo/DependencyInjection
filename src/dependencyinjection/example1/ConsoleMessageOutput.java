package dependencyinjection.example1;

/**
 * This class serves as a delegate component that will perform console output.
 * 
 * @author The ByteShop.Net
 */
public class ConsoleMessageOutput {
    
    public void outputMessage(String message) {
        System.out.println(message);
    }
    
}
