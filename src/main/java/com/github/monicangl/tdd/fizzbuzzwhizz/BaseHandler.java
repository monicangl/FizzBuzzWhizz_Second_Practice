package com.github.monicangl.tdd.fizzbuzzwhizz;

public abstract class BaseHandler {
    protected BaseHandler(BaseHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public  String handleNumber(int number) {
        if (null != nextHandler) {
            return nextHandler.handleNumber(number);
        }
        return String.valueOf(number);
    }

    public static void setFizzNumber(int number) {fizzNumber = number;}
    public static void setBuzzNumber(int number) {buzzNumber = number;}
    public static void setWhizzNumber(int number) {whizzNumber = number;}

    protected static int fizzNumber;
    protected static int buzzNumber;
    protected static int whizzNumber;
    private BaseHandler nextHandler;

}
