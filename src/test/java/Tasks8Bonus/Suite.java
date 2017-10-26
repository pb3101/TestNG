package Tasks8Bonus;

import org.testng.annotations.*;

/**
 * Created by pavlo.balyuk on 10/26/2017.
 */
public class Suite {
    @BeforeSuite
    public void beforeSuite() {

        System.out.println("Before Suite - " + getMethodName());

    }

    @AfterSuite
    public void AfterSuite() {

        System.out.println("After Suite - " + getMethodName());

    }

    public String getMethodName() {

        final StackTraceElement[] ste = Thread.currentThread().getStackTrace();

        return ste[2].toString().substring(0, ste[2].toString().indexOf("."));

    }

}