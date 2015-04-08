package satirist24.assertbeautified.model.testcase;

import org.junit.Assert;

/**
 * Created on 02.04.15.
 */
public abstract class EqualityTestCase<T> extends TestCase<EqualityTestCase, T> {
    
    protected T expected;
    
    protected T actual;
    
    EqualityTestCase<T> getThis() {
        return this;
    }
    
    public EqualityTestCase<T> expected(T expected) {
        this.expected = expected;
        return this;
        
    }
    
    public EqualityTestCase<T> actual(T actual) {
        this.actual = actual;
        return this;
        
    }

}
