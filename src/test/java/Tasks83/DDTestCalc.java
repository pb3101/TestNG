package Tasks83;

import Tasks8Bonus.Setup;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by pavlo.balyuk on 10/24/2017.
 */

public class DDTestCalc {

    @DataProvider(name = "test")
    public static Object[][] createData() {
        return new Object[][]{
                {-1.0, 2.0, 1.0},
                {5.5, 1.0, 6.5},
                {7.0, 3.0, 10.0},
        };
    }

    static Object[][] ar2 = {{3.14, 2.71, 5.85},{3.14, 2.71, 5.85},{3.14, 2.71, 5.85}};

    @DataProvider(name = "array")
    public static Object[][] createArray() {
        return ar2;
    }

    @Test(dataProvider = "array")
    public void testCalcAddDataProvider(double a, double b, double exp) throws Exception {
        Setup suite = new Setup();
        //Reporter.log("asserting add method", true);
        Assert.assertEquals(suite.setup().add(a, b), exp);
    }
}
