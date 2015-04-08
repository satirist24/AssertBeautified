package satirist24.assertbeautified.model.testcase;

import satirist24.assertbeautified.model.Testable;

/**
 * Created on 02.04.15.
 */
public abstract class TestCase<C extends TestCase, T> implements Testable<T> {
    
    protected String errorMsg;
    
    public C errorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return getThis();
    }
    
    abstract C getThis();
    
}
