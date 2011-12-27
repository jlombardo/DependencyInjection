package dependencyinjection.example2;

import javax.swing.JOptionPane;

/**
 * This class serves as a delegate component that will perform GUI input.
 * However it has been improved by basing its behavior on an abstraction -- 
 * the MessageInput interface. This means that any class that implements the 
 * same interface will be interchangeable with this one. Better flexibility!
 * 
 * @author The ByteShop.Net
 */
public class GuiMessageInput implements MessageInput {
    
    @Override
    public String getMessage() {
        return JOptionPane.showInputDialog("Enter a message:");
    }
    
}
