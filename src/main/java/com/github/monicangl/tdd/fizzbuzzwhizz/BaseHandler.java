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

    private BaseHandler nextHandler;
}
