package service;

import model.Fibonacci;

import java.util.ArrayList;

public class FibonacciService {

    private  ArrayList<Integer> fibonacci = new ArrayList<Integer>();

    public ArrayList length(Fibonacci model) {
        int f0 = 0;
        fibonacci.add(f0);
        int f1 = 1;
        fibonacci.add(f1);
        int fn;
        for (int i = 2; i <= model.getLength(); i++) {
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;
            fibonacci.add(fn);
        }
        return fibonacci;
    }

    public ArrayList diapason(Fibonacci model) {
        int f0 = (int) fibonacciN(model.getDiapasonFirst());
        fibonacci.add(f0);
        int f1 = (int) fibonacciN(model.getDiapasonFirst() + 1);
        fibonacci.add(f1);
        int fn;
        for (int i = model.getDiapasonFirst() + 2; i <= model.getDiapasonLast(); i++) {
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;
            fibonacci.add(fn);
        }
        return fibonacci;
    }

    public double fibonacciN(int num) {
        double fn = (Math.pow(((1 + Math.sqrt(5)) / 2), num) - Math.pow(((1 - Math.sqrt(5)) / 2), num)) / Math.sqrt(5);
        return fn;
    }
}
