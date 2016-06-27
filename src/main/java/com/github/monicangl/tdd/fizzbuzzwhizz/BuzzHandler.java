package com.github.monicangl.tdd.fizzbuzzwhizz;

public class BuzzHandler extends BaseHandler {
    public BuzzHandler(BaseHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public String handleNumber(int number) {
        if (number % buzzNumber == 0) {
            return buzzResult;
        }

        return passRequest(number);
    }

    private static final String buzzResult = "Buzz";
}
