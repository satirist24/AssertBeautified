package satirist24.assertbeautified.model.testcase;

import satirist24.assertbeautified.model.testcase.EqualityTestCase;
import satirist24.assertbeautified.model.testcase.TestCase;

/**
 * Created on 03.04.15.
 */
public abstract class TC implements Cloneable {
    
    public abstract <T> EqualityTestCase<T> equality();

    protected <C extends TestCase> C getTC(Class<C> clazz) {
        try {
            return clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        throw new IllegalStateException("Something went wrong");
    }
    
    public TC clone() {
        try {
            return (TC) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        
    }
    
}
