package dependencyinjection.example2;

import javax.swing.JOptionPane;

// Retrieves input from a GUI
public class GuiMessageInput implements MessageInput {
    
    @Override
    public String getMessage() {
        return JOptionPane.showInputDialog("Enter a message:");
    }
    
}
