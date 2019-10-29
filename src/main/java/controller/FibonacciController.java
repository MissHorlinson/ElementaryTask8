package controller;

import model.Fibonacci;
import service.FibonacciService;
import util.*;

public class FibonacciController {
    private Input            input = new Input();
    private Output           output = new Output();
    private Validator        validator = new Validator();
    private FibonacciService service = new FibonacciService();
    private Fibonacci        model;

    public  void run() {
        output.startInfo();
        while (true) {
        String mode = input.getString();
        if(mode.equals("1")) {
            runLength();
            break;
        }
        if(mode.equals("2")) {
            runDiapason();
            break;
        }
            output.wrongChoice();
            if(!shouldContinue())
                break;
        }
    }

    public void runLength() {
        model = new Fibonacci(getValue("length"));
        output.fibonacciForScreen(service.length(model));
    }

    public void runDiapason(){
        model = new Fibonacci(getValue("first index"), getValue("last index"));
        output.fibonacciForScreen(service.diapason(model));
    }

    public int getValue(String str) {
        output.enterValue(str);
        int value = 0;
        while (value <=0) {
            output.negativeNumber();
            value = Integer.parseInt(input.getString());
        }
        return value;
    }

    public boolean shouldContinue() {
        return validator.continueRequest(input.getString());
    }
}
