/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dependencyinjection.example4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author jlombardo
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({dependencyinjection.example4.MessageServiceTest.class})
public class Example4Suite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
