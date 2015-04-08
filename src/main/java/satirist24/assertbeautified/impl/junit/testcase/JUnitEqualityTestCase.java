package satirist24.assertbeautified.impl.junit.testcase;

import org.junit.Assert;
import satirist24.assertbeautified.model.testcase.EqualityTestCase;

/**
 * Created on 08.04.15.
 */
public class JUnitEqualityTestCase<T> extends EqualityTestCase<T> {
    
    @Override
    public void test() {
        Assert.assertEquals(errorMsg, expected, actual);
    }
    
}
