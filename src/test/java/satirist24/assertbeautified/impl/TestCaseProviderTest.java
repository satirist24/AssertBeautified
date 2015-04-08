package satirist24.assertbeautified.impl;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import satirist24.assertbeautified.impl.junit.JUnitTC;
import satirist24.assertbeautified.model.testcase.TC;
import satirist24.assertbeautified.provider.TestCaseProvider;
import satirist24.assertbeautified.provider.TestCaseProviderImpl;

/**
 * Created on 08.04.15.
 */
public class TestCaseProviderTest {
    
    private static TestCaseProvider provider;
    
    @BeforeClass
    public static void setUp() {
        provider = new TestCaseProviderImpl();
        
    }
    
    @Test
    public void testJUnitImpl() {
        TC tc = provider.provide(Implementation.JUNIT);
        Assert.assertEquals(tc.getClass(), JUnitTC.class);
    }
    
    @Test
    public void testJUnitImplGetTC() {
        testImplGetTC(Implementation.JUNIT);
    }
    
    @Test
    public void testJUnitImplNewTC() {
        testImplNewTC(Implementation.JUNIT);
    }
    
    @Test
    public void testTestNGImplGetTC() {
        testImplGetTC(Implementation.TESTNG);
    }

    @Test
    public void testTestNGImplNewTC() {
        testImplNewTC(Implementation.TESTNG);
    }
    
    private void testImplGetTC(Implementation implementation) {
        Assert.assertNotNull(implementation.getTC());
        Assert.assertEquals(implementation.getTC(), implementation.getTC());
    }
    
    private void testImplNewTC(Implementation implementation) {
        Assert.assertNotNull(implementation.newTC());
        Assert.assertNotEquals(implementation.newTC(), implementation.newTC());
        Assert.assertNotEquals(implementation.getTC(), implementation.newTC());
    }
    
    
}
