package com.github.monicangl.tdd.fizzbuzzwhizz;

public abstract class BaseHandler {
    protected BaseHandler(BaseHandler successor) {
        this.successor = successor;
    }
    public abstract String handleNumber(int number);

    protected String passRequest(int number) {
        if (null != successor) {
            return successor.handleNumber(number);
        }
        return String.valueOf(number);
    }

    public static void setFizzNumber(int number) {fizzNumber = number;}
    public static void setBuzzNumber(int number) {buzzNumber = number;}
    public static void setWhizzNumber(int number) {whizzNumber = number;}

    static int fizzNumber;
    static int buzzNumber;
    static int whizzNumber;
    private BaseHandler successor;
}
