package dependencyinjection.example2;

import java.util.Random;
import javax.swing.JOptionPane;

// Retrieves input from a GUI
public class RandomMessageProvider implements MessageInput {
    private String[] messages = {
        "Hello Java Student",
        "Welcome to The Byteshop.Net E-School",
        "Java Programming Rocks"
    };
    
    @Override
    public String getMessage() {
        
        Random r = new Random(System.nanoTime());
        
        return messages[r.nextInt(messages.length)];
    }
    
}
