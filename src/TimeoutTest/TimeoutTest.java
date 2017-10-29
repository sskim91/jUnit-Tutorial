package TimeoutTest;

import org.junit.Test;

public class TimeoutTest {

    @Test(timeout = 1000)
    public void infinity() {
        while (true) ;
    }

    @Test(timeout = 5000)
    public void testSlowMethod() {
        //..
    }
}
