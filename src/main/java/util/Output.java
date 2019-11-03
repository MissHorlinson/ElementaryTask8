package util;

import java.util.ArrayList;

public class Output {

    public void startInfo() {
        System.out.println("Program display Fibonacci number. You can\n 1) Enter length of the numbers\n 2) Enter diapason of the numbers\n--------------------------------------- ");
    }

    public void wrongChoice() {
        System.out.println("You select nonexistent mode. Please enter y - yes, if you want to try again ");
    }

    public void enterValue(String value) {
        System.out.println("Please enter " + value + " of the number");
    }

    public void notValid() {
        System.out.println("Not valid data");
    }

    public void fibonacciForScreen(ArrayList<Integer> fibonacci, int n) {
        for (Integer f : fibonacci) {
            System.out.println("F" + n++ + " = " + f + " ");
        }
    }
}
