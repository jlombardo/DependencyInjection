package dependencyinjection.example2;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 * This class serves as a delegate component that will perform input by
 * randomly selecting a message from a collection of messages. HIit has been 
 * improved by basing its behavior on an abstraction -- 
 * the MessageInput interface. This means that any class that implements the 
 * same interface will be interchangeable with this one. Better flexibility!
 * 
 * @author The ByteShop.Net
 */
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
