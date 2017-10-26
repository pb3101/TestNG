package Tasks84;

import Calculator.Calculator;
import org.testng.*;
import org.testng.annotations.*;

/**
 * Created by pavlo.balyuk on 10/25/2017.
 */
public class DDTestXML {
    @Parameters({ "a","b" })
    @Test(testName = "DDTTestXML")
    public void testCalcAdd(double a, double b) throws Exception {
            Calculator.CalcMethods calc = new Calculator.CalcMethods();
            Reporter.log("asserting add method from XML", true);
            Assert.assertEquals(calc.add(a, b), 4.0);
    }
}
