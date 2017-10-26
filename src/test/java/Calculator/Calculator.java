package Calculator;

import java.util.LinkedHashSet;
import java.util.Scanner;

import static java.lang.System.out;

/**
 * Created by pavlo.balyuk on 9/4/2017.
 */
public class Calculator {
    public static void main(String[] args) throws Exception {
        //Class saves all calculator inputs except 'do {} while()' loop breaker
        CalcInput input = new CalcInput();
        //Class saves all calculator methods
        CalcMethods c = new CalcMethods();
        String action;
        String result = "\nResult: ";
        do {
            action = new CalcInput().inputOperation();

            try {
                if ("q".equalsIgnoreCase(action)) {
                    break;
                }
                double v1 = input.inputValue1();
                double v2 = input.inputValue2();
                switch (action) {
                    case ("+"):
                        out.println(result + c.add(v1, v2));
                        break;

                    case ("-"):
                        out.println(result + c.subtract(v1, v2));
                        break;

                    case ("*"):
                        out.println(result + c.multiply(v1, v2));
                        break;

                    case ("/"):
                        try {
                            out.println(result + c.divide(v1, v2));
                        } catch (ArithmeticException e) {
                            out.println("Zero division is not allowed");
                        }
                        break;
                }
            } catch (NumberFormatException e) {
                out.println("Entered value is not a number!");
            } catch (IllegalArgumentException e) {
                out.println(e + "Attempts to enter valid operations failed");
            }
        } while (true);
    }
    public static class CalcInput {
        private LinkedHashSet actions () {
            LinkedHashSet actions = new LinkedHashSet();
            actions.add("+");
            actions.add("-");
            actions.add("*");
            actions.add("/");
            //added to quit program before entering values
            actions.add("q");
            return actions;
        }

        private Scanner scanner () {
            Scanner inputs = new Scanner(System.in);
            return inputs;
        }

        protected String inputOperation() throws IllegalArgumentException {
            int attempts = 3;
            while (attempts-- >= 0) {

                System.out.println("Enter required operation name: add (+), subtract (-), multiply (*), divide (/), 'q' to exit");

                String action = scanner().next();
                if ( actions().contains(action) ) {
                    return action;
                }
                System.out.println("Illegal input!");
            }
            throw new IllegalArgumentException("Attempts to enter valid operations failed");
        }

        protected double inputValue1 () throws NumberFormatException {
            int attempts = 3;
            while (attempts-- >= 0) {

                System.out.println("\n" + "Enter 1st element");

                Double a = Double.parseDouble(scanner().next());
                if ( !(a.isNaN()) ) {
                    return a;
                }
                System.out.println("Illegal input!");
            }
            throw new NumberFormatException("Attempts to enter valid element ends ");
        }

        protected double inputValue2 () throws NumberFormatException {
            int attempts = 3;
            while (attempts-- >= 0) {

                System.out.println("\n" + "Enter 2nd element");

                Double b = Double.parseDouble(scanner().next());
                if ( !(b.isNaN()) ) {
                    return b;
                }
                System.out.println("Illegal input!");
            }
            throw new NumberFormatException("Attempts to enter valid element ends ");
        }

    }
    public static class CalcMethods {

        public double add (double a, double b) {
            return a + b;
        }

        public double subtract (double a, double b) {
            return a - b;
        }

        public double multiply (double a, double b) {
            return a * b;
        }

        public double divide (double a, double b) throws ArithmeticException {
            if ( b == 0.0 ) {
                throw new ArithmeticException();
            }
            return a / b;
        }
    }
}

