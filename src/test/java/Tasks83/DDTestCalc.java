package Tasks83;

import Calculator.Calculator;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

import java.lang.reflect.Array;

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

    static Object[] ar2 = {3.14, 2.71, 5.85};
    @DataProvider(name = "array")
    public static Object[][] createArray(){
        return new Object[][]{ ar2
            };
        }



    @BeforeTest
    public Calculator.CalcMethods setup() {
        Calculator.CalcMethods calc = new Calculator.CalcMethods();
        return calc;
    }

    @Test(dataProvider = "array")
    public void testCalcAdd(double a, double b, double exp) throws Exception {

        Reporter.log("asserting add method", true);
        Assert.assertEquals(setup().add(a, b), exp);
    }
}
