package satirist24.assertbeautified.impl.junit;

import satirist24.assertbeautified.impl.junit.testcase.JUnitEqualityTestCase;
import satirist24.assertbeautified.model.testcase.EqualityTestCase;
import satirist24.assertbeautified.model.testcase.TC;

/**
 * Created on 08.04.15.
 */
public class JUnitTC extends TC {


    @Override
    public <T> EqualityTestCase<T> equality() {
        return (EqualityTestCase<T>) getTC(JUnitEqualityTestCase.class);
    }
}
