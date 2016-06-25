package com.github.monicangl.tdd.fizzbuzzwhizz;

public class FizzHandler extends BaseHandler {
    public FizzHandler(BaseHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public String handleNumber(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }

        return super.handleNumber(number);
    }
}
