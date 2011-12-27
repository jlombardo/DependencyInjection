package dependencyinjection.example2;

import javax.swing.JOptionPane;

/**
 * This class serves as a delegate component that will perform GUI output.
 * However it has been improved by basing its behavior on an abstraction -- 
 * the MessageOutput interface. This means that any class that implements the 
 * same interface will be interchangeable with this one. Better flexibility!
 * 
 * @author The ByteShop.Net
 */
public class GuiMessageOutput implements MessageOutput {
    
    @Override
    public void outputMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    
}
