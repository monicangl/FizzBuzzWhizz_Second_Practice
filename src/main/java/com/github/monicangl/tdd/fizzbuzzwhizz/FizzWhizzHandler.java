package com.github.monicangl.tdd.fizzbuzzwhizz;

public class FizzWhizzHandler extends BaseHandler {
    protected FizzWhizzHandler(BaseHandler nextHandler) {
        super(nextHandler);
    }

    public String handleNumber(int number) {
        if (number % 3 == 0 && number % 7 == 0) {
            return "FizzWhizz";
        }

        return super.handleNumber(number);
    }
}
