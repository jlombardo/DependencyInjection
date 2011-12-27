package dependencyinjection.example3;

import dependencyinjection.example2.MessageInput;
import dependencyinjection.example2.MessageOutput;

/**
 * This class is similar to the one in example2 except that it uses the 
 * ServiceLocator design pattern to retrieve and inject the dependent 
 * delegate components for input and output. The advantage of this sample 
 * over example2 is that the choice of input and output implementation is 
 * fully encapsulated by the ServiceLocator and the hard dependencies in the 
 * example2.Startup class are gone.
 * 
 * @author The ByteShop.Net
 */
public class MessageService {
    
    // Using abstractions (e.g., Interfaces) to represent dependent objects
    // makes for more flexible code
    private MessageInput input;
    private MessageOutput output;
    
    public MessageService() throws Exception {
        input = ServiceLocator.getInstance().getInputService();
        output = ServiceLocator.getInstance().getOutputService();
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
