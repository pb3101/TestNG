package Calculator;

/**
 * Created by pavlo.balyuk on 8/29/2017.
 */
class CalcMethods {

    protected static double add (double a, double b) {
        return a + b;
    }

    protected static double subtract (double a, double b) {
        return a - b;
    }

    protected static double multiply (double a, double b) {
        return a * b;
    }

    protected static double divide (double a, double b) throws ArithmeticException {
        if ( b == 0.0 ) {
            throw new ArithmeticException();
        }
        return a / b;
    }
}
