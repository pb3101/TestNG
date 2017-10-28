package Tasks81;

import Tasks8Bonus.Setup;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

/**
 * Created by pavlo.balyuk on 10/24/2017.
 */

public class TestCalc {
    double a = 5;
    double b = 2;
    Setup setEnv = new Setup();

    @Test(testName = "TEST")
    public void testCalcAdd() throws Exception {
        //  Reporter.log("asserting add method: ", true);
        Assert.assertEquals(setEnv.setup().add(a, b), 7.0);
    }

    @Test(testName = "TEST")
    public void testCalcSubtract() throws Exception {
        //  Reporter.log("asserting subtract method: ", true);
        Assert.assertEquals(setEnv.setup().subtract(a, b), 3.0);
    }

    @Test(testName = "TEST")
    public void testCalcMultiply() throws Exception {
        //  Reporter.log("asserting multiply method: ", true);
        Assert.assertEquals(setEnv.setup().multiply(a, b), 10.0);
    }

    @Test(testName = "TEST")
    public void testCalcDivide() throws Exception {
        //  Reporter.log("asserting divide method: ", true);
        Assert.assertEquals(setEnv.setup().divide(a, b), 2.5);
    }
}
