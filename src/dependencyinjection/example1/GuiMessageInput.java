package dependencyinjection.example1;

import javax.swing.JOptionPane;

// Retrieves input from a GUI
public class GuiMessageInput {
    
    public String getMessage() {
        return JOptionPane.showInputDialog("Enter a message:");
    }
    
}
