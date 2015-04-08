package satirist24.assertbeautified.impl;

import satirist24.assertbeautified.impl.junit.JUnitTC;
import satirist24.assertbeautified.impl.testng.TestNGTC;
import satirist24.assertbeautified.model.testcase.TC;

/**
 * Created on 08.04.15.
 */
public enum Implementation {
    
    JUNIT("junit", new JUnitTC()),
    TESTNG("testng", new TestNGTC());
    
    private String name;
    
    private TC tc;
    
    private Implementation(String name, TC tc) {
        this.name = name;
        this.tc = tc;
    }
    
//    protected abstract void resolveTC();
    
    public TC getTC() {
        return tc;
        
    }
    
    public TC newTC() {
        return tc.clone();
        
    }
    
}
