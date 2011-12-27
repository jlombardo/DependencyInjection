package dependencyinjection.example1;

// A service that displays messages
public class MessageService {
    
    // Code in this class controls instantiation of dependencies (delegates)
    // Such strong dependencies make for very rigid, inflexible programs
    private GuiMessageInput input = new GuiMessageInput();
    private ConsoleMessageOutput output = new ConsoleMessageOutput();
    
//    public MessageService() {
//        input = new GuiMessageInput();
//        output = new ConsoleMessageOutput();
//    }
    
    
    // This behavior encapsulates the work of the delegate components
    public void displayMessage() {
        String message = input.getMessage();
        output.outputMessage(message);
    }
       
}
