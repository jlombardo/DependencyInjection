package dependencyinjection.example3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


// A Singleton that locates a service and returns it
public class ServiceLocator {
    private static ServiceLocator instance;
    private Properties props;
    
    private ServiceLocator() throws IOException {
        props = getProps();
    }
    
    public static ServiceLocator getInstance() throws IOException {
        if(instance == null) {
            instance = new ServiceLocator();
        }
        
        return instance;
    }
    
    public MessageInput getInputService() throws Exception {
        MessageInput input = null;
        
        String className = props.getProperty("input.class");
        Class theClass = Class.forName(className);
        input = (MessageInput)theClass.newInstance();
        
        return input;
    }
    
    public MessageOutput getOutputService() throws Exception {
        MessageOutput output = null;
        
        String className = props.getProperty("output.class");
        Class theClass = Class.forName(className);
        output = (MessageOutput)theClass.newInstance();
                
        return output;
    }
    
    private Properties getProps() throws IOException {
        Properties props = new Properties();
 
        //load and return properties from file
        props.load(new FileInputStream("src/config.properties"));
        
        return props;
    }

}
