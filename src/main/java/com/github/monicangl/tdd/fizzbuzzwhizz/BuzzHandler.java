package com.github.monicangl.tdd.fizzbuzzwhizz;

public class BuzzHandler extends IHandler {
    public BuzzHandler(IHandler nextHandler) {
        super(nextHandler);
    }

    public BuzzHandler() {
        super();
    }

    @Override
    public String handleNumber(int number) {
        if (number % 5 == 0)
        {
            return "Buzz";
        }

        IHandler nextHandler = super.getNextHandler();
        if (null != nextHandler) {
            return nextHandler.handleNumber(number);
        }

        return String.valueOf(number);
    }
}
