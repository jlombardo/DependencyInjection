package dependencyinjection.example3;

import dependencyinjection.example2.MessageInput;
import dependencyinjection.example2.MessageOutput;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


/**
 * This class is an implementation of the ServiceLocator design pattern 
 * which specifies a way to retrieve and inject the dependent 
 * delegate components (for input and output in this case). The advantage of 
 * this is the explicit hiding (encapsulation) of the details of how objects 
 * are configured, realized and injected. Although the configuration info 
 * can be stored anywhere, we chose a properties file on the classpath for 
 * this example. Note that this class also follows the Singleton design 
 * pattern, meaning that there will only be one instance of this class.
 * 
 * @author The ByteShop.Net
 */
public class ServiceLocator {
    private static ServiceLocator instance;
    private Properties props;
    
    // Singleton implementation...
    private ServiceLocator() throws IOException {
        props = getProps();
    }
    
    // Singleton implementation...
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
