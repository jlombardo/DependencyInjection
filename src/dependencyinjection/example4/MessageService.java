package dependencyinjection.example4;

// A service that displays messages

import dependencyinjection.example2.MessageInput;
import dependencyinjection.example2.MessageOutput;

/**
 * This class is similar to the one in examples 2 and 3 except that it 
 * eliminates the ServiceLocator and, instead uses Spring to retrieve and 
 * inject the dependent delegate components for input and output. The advantage 
 * of this sample over example3 (using Spring vs ServiceLocator) is the 
 * reduction in code required. Just a little Spring XML, no properties file 
 * and no ServiceLocator dependency. Yes, this program has a new dependency -- 
 * the Spring Framework -- but this service class doesn't know that. It's
 * totally portable and could be used in systems that rely on other 
 * dependency injection techniques. And don't forget, Spring is doing more than
 * just DI -- it's also managing the lifecycle of the objects in question.
 * 
 * @author The ByteShop.Net
 */
public class MessageService {
    
    // Using abstractions (e.g., Interfaces) to represent dependent objects
    // makes for more flexible code
    private MessageInput input;
    private MessageOutput output;
    
    public MessageService() {
        
    }
    
    
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
