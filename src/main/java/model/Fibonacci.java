package model;

public class Fibonacci {
    private int length;
    private int diapasonFirst;
    private int diapasonLast;

    public Fibonacci() { }

    public Fibonacci(int length) {
        this.length = length;
    }

    public Fibonacci(int diapasonFirst, int diapasonLast) {
        this.diapasonFirst = diapasonFirst;
        this.diapasonLast = diapasonLast;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getDiapasonFirst() {
        return diapasonFirst;
    }

    public void setDiapasonFirst(int diapasonFirst) {
        this.diapasonFirst = diapasonFirst;
    }

    public int getDiapasonLast() {
        return diapasonLast;
    }

    public void setDiapasonLast(int diapasonLast) {
        this.diapasonLast = diapasonLast;
    }
}
