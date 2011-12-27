package dependencyinjection.example3;

// Produces output to the console

import javax.swing.JOptionPane;

public class GuiMessageOutput implements MessageOutput {
    
    @Override
    public void outputMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    
}
