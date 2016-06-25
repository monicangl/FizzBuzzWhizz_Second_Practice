package com.github.monicangl.tdd.fizzbuzzwhizz;

public class BuzzHandler extends BaseHandler {
    public BuzzHandler(BaseHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public String handleNumber(int number) {
        if (number % 5 == 0) {
            return "Buzz";
        }

        return super.handleNumber(number);
    }
}
