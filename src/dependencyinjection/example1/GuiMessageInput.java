package dependencyinjection.example1;

import javax.swing.JOptionPane;

/**
 * This class serves as a delegate component that will perform input using a 
 * stock GUI component from the javax.swing library.
 * 
 * @author The ByteShop.Net
 */
public class GuiMessageInput {
    
    public String getMessage() {
        return JOptionPane.showInputDialog("Enter a message:");
    }
    
}
