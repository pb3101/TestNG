package Tasks8Bonus;

import org.testng.annotations.BeforeTest;

/**
 * Created by pavlo.balyuk on 11/14/2017.
 */
public class MethodName {
    @BeforeTest
    public void beforeTest(){
        System.out.println("BeforeTest: " + MethodName.class.getName());
    }
}
