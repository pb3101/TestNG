package Tasks8Bonus;

import Calculator.Calculator;
import org.testng.annotations.*;

/**
 * Created by pavlo.balyuk on 10/26/2017.
 */
@Listeners({MethodListener.class})
public class Setup {

    private static Calculator.CalcMethods calculator = new Calculator.CalcMethods();

    public Setup() {

    }

    public static Calculator.CalcMethods setup() {
        return calculator;
    }

}