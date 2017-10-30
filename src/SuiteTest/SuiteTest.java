package SuiteTest;

import ExceptExceptionTest.Exception1Test;
import TimeoutTest.TimeoutTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

public class SuiteTest {
    @RunWith(Suite.class)
    @Suite.SuiteClasses({
            Exception1Test.class, //test case 1
            TimeoutTest.class     //test case 2
    })
    public class SuiteAbcTest {
        //normally, this is an empty class
    }
}
