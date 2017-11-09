package Calculator;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * Created by pavlo.balyuk on 9/4/2017.
 */
class CalcInput {
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