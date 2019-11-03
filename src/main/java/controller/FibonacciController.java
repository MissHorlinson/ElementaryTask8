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

    public void run() {
        while (true) {
            output.startInfo();
            String mode = input.getString();
            if(mode.equals("1")) {
                runLength();
                break;
            }
            if (mode.equals("2")) {
                runDiapason();
                break;
            }
            output.wrongChoice();
            if (!shouldContinue())
                break;
        }
    }

    public void runLength() {
        model = new Fibonacci(getValue("length"));
        output.fibonacciForScreen(service.length(model), 0);
    }

    public void runDiapason(){
        model = new Fibonacci(getValue("first index"), getValue("last index"));
        output.fibonacciForScreen(service.diapason(model), model.getDiapasonFirst());
    }

    public int getValue(String str) {
        output.enterValue(str);
        String value = input.getString();
        while (!validator.isValid(value)) {
            output.notValid();
            value = input.getString();
        }
        return validator.getInt(value);
    }

    public boolean shouldContinue() {
        return validator.continueRequest(input.getString());
    }
}
