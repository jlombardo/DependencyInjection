package dependencyinjection.example1;

/**
 * This class serves as a service facade. It encapsulates the functionality 
 * of two components -- one for input, one for output. Although this is a 
 * nice, modular design, it is far too rigid to be generally useful. It 
 * suffers from hard dependencies on the specific instances of the delegate
 * components (the input and output classes). And variation will require
 * changes to the source code.
 * 
 * @author The ByteShop.Net
 */
public class MessageService {
    
    // Code in this class controls instantiation of dependencies (delegates)
    // Such strong dependencies make for very rigid, inflexible programs
    private GuiMessageInput input = new GuiMessageInput();
    private ConsoleMessageOutput output = new ConsoleMessageOutput();
    
    // Alternatively ... use the constructor or a setter method.
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
