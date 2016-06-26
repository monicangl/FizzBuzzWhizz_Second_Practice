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

    protected int fizzNumber = 3;
    protected int buzzNumber = 5;
    protected int whizzNumber = 7;
    private BaseHandler nextHandler;

}
