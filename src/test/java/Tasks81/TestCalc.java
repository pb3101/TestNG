package Tasks81;

import Calculator.Calculator;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;




/**
 * Created by pavlo.balyuk on 10/24/2017.
 */
public class TestCalc {
    double a = 5;
    double b = 2;
    Calculator.CalcMethods calc = new Calculator.CalcMethods();
    @Test(groups = "unit")
    public void testCalcAdd() throws Exception {
        Reporter.log("asserting add method: ", true);
        Assert.assertEquals(calc.add(a,b),7.0);
    }
    @Test(groups = "unit")
    public void testCalcSubtract() throws Exception {
        Reporter.log("asserting subtract method: ", true);
        Assert.assertEquals( calc.subtract(a,b),3.0);
    }
    @Test(groups = "unit")
    public void testCalcMultiply() throws Exception {
        Reporter.log("asserting multiply method: ", true);
        Assert.assertEquals(calc.multiply(a,b),10.0);
    }
    @Test(groups = "unit")
    public void testCalcDivide() throws Exception {
        Reporter.log("asserting divide method: ", true);
        Assert.assertEquals(calc.divide(a,b),2.5);
    }
}
