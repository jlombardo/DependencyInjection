package dependencyinjection.example3;

// A service that displays messages
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
