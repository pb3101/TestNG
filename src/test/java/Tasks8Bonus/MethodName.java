package Tasks8Bonus;

import org.testng.annotations.*;
import java.lang.reflect.*;

/**
 * Created by pavlo.balyuk on 10/26/2017.
 */
@Listeners({MethodListener.class})
public class MethodName {

    @BeforeMethod
    public void beforeTestMethod(Method testMethod){
        System.out.println("Before Testmethod: " + testMethod.getName());
    }

    @Test
    public void methodNameTest(){
        System.out.println("true");
    }
}
