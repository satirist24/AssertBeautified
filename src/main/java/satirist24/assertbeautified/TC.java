package satirist24.assertbeautified;

/**
 * Created on 03.04.15.
 */
public class TC {
    
    public static <T> EqualityTestCase<T> equality() {
        return TestCase.getTC(EqualityTestCase.class);
        
    }
    
}
