package dependencyinjection.example4;

// Produces output to the console
public class ConsoleMessageOutput implements MessageOutput {
    
    @Override
    public void outputMessage(String message) {
        System.out.println(message);
    }
    
}
