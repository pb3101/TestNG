package Tasks84;

import Tasks8Bonus.Setup;
import org.testng.*;
import org.testng.annotations.*;

/**
 * Created by pavlo.balyuk on 10/25/2017.
 */

public class DDTestXML {
    @Parameters({"a", "b", "exp"})
    @Test(testName = "XML")
    public void testCalcAddParametersXML(double a, double b, double exp) throws Exception {
        Setup setEnv = new Setup();
     // Reporter.log("asserting add method from XML", true);
        Assert.assertEquals(setEnv.setup().add(a, b), exp);
    }
}
