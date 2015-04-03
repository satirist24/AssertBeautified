package satirist24.assertbeautified;

import org.junit.Test;

/**
 * Created on 02.04.15.
 */
public class TestEqualityTC {
    
    
    @Test
    public void testEqualityCreate() {
        TC.<String>equality().errorMsg("Objects are not equals").expected(1).actual(1).test();
        
    }
    
}
