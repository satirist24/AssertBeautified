package satirist24.assertbeautified;

/**
 * Created on 02.04.15.
 */
public abstract class TestCase<C extends TestCase, T> implements Testable {
    
    protected String errorMsg;
    
    public C errorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return getThis();
    }
    
    public static <T> EqualityTestCase<T> equality() {
        return getTC(EqualityTestCase.class);
    }
    
    protected static <C> C getTC(Class<C> clazz) {
        try {
            return clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        throw new IllegalStateException("Something went wrong");
    }
    
    abstract C getThis();
    
}
