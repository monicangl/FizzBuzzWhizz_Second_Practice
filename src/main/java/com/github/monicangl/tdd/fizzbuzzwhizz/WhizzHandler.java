package com.github.monicangl.tdd.fizzbuzzwhizz;

public class WhizzHandler extends IHandler {
    public WhizzHandler(IHandler nextHandler) {
        super(nextHandler);
    }

    public WhizzHandler() {
    }

    @Override
    public String handleNumber(int number) {
        if (number % 7 == 0) {
            return "Whizz";
        }

        IHandler nextHandler = super.getNextHandler();
        if (null != nextHandler) {
            return nextHandler.handleNumber(number);
        }

        return String.valueOf(number);
    }
}
