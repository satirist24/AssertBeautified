package satirist24.assertbeautified.provider;

import satirist24.assertbeautified.impl.Implementation;
import satirist24.assertbeautified.model.testcase.TC;

/**
 * Created on 08.04.15.
 */
public interface TestCaseProvider {
    
    public TC provide(Implementation implementation);
    
}
