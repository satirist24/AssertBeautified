package satirist24.assertbeautified;

import org.junit.Test;
import satirist24.assertbeautified.impl.junit.JUnitTC;
import satirist24.assertbeautified.model.testcase.TC;

/**
 * Created on 02.04.15.
 */
public class TestEqualityTC {
    
    
    @Test
    public void testEqualityCreate() {
        new JUnitTC().<String>equality().errorMsg("Objects are not equals").expected("1").actual(1).test();
        
    }
    
}
