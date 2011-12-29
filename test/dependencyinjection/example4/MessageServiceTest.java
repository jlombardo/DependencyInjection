package dependencyinjection.example4;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * This is a simple JUnit 4 unit test example with the Spring Framework
 * providing test support. Note that the value of the @ContextConfiguration 
 * is the relative to the classpath.
 * 
 * @author The ByteShop.Net
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( { "/applicationContext.xml" })
public class MessageServiceTest {
    
    // Spring creates before testa are run
    @Autowired
    private MessageService msgService;
    
    public MessageServiceTest() {
    }

    /**
     * Test of getInput method, of class MessageService.
     */
    @Test
    public void testGetInput() {
        assertNotNull(msgService.getInput());
    }


    /**
     * Test of getOutput method, of class MessageService.
     */
    @Test
    public void testGetOutput() {
        assertNotNull(msgService.getOutput());
    }

}
