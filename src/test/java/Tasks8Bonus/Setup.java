package Tasks8Bonus;

import Calculator.Calculator;
import org.testng.annotations.*;

/**
 * Created by pavlo.balyuk on 10/26/2017.
 */
@Listeners({MethodListener.class})
public class Setup {
    @BeforeSuite
    public Calculator.CalcMethods setup() {
        final Calculator.CalcMethods calc = new Calculator.CalcMethods();
        return calc;
    }
}