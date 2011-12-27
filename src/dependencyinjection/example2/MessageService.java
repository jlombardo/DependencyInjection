package dependencyinjection.example2;

/**
 * This class serves as a service facade. It encapsulates the functionality 
 * of two delegate components -- one for input, one for output. But in this 
 * version we've improved it to base those delegate components on abstractions,
 * making it possible to inject the specific implementations at runtime 
 * without requiring any source code changes to this class. Much more flexible 
 * and portable! This class could be used anywhere, along with the interface
 * classes. Provide the implementations you need and the class just works.
 * 
 * @author The ByteShop.Net
 */
public class MessageService {
    
    // Using abstractions (e.g., Interfaces) to represent dependent objects
    // makes for more flexible code
    private MessageInput input;
    private MessageOutput output;
    
    public MessageService(MessageInput input, MessageOutput output) {
        this.input = input;
        this.output = output;
    }
    
    public MessageService() {}
    
    
    // This behavior encapsulates the work of the delegate components
    public void displayMessage() {
        String message = input.getMessage();
        output.outputMessage(message);
    }
    
    // JavaBeans-style getter and setter methods

    public MessageInput getInput() {
        return input;
    }

    public void setInput(MessageInput input) {
        this.input = input;
    }

    public MessageOutput getOutput() {
        return output;
    }

    public void setOutput(MessageOutput output) {
        this.output = output;
    }
       
}
