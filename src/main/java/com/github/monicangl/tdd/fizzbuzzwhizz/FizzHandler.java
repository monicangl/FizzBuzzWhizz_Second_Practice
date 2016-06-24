package com.github.monicangl.tdd.fizzbuzzwhizz;

public class FizzHandler extends IHandler{
    public FizzHandler(IHandler nextHandler) {
        super(nextHandler);
    }

    public FizzHandler() {
    }

    @Override
    public String handleNumber(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }

        IHandler nextHandler = super.getNextHandler();
        if (null != nextHandler) {
            return nextHandler.handleNumber(number);
        }

        return String.valueOf(number);
    }
}
