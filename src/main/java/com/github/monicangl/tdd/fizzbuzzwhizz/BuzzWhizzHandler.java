package com.github.monicangl.tdd.fizzbuzzwhizz;

public class BuzzWhizzHandler extends BaseHandler {
    protected BuzzWhizzHandler(BaseHandler nextHandler) {
        super(nextHandler);
    }

    public String handleNumber(int number) {
        if (number % buzzNumber == 0 && number % whizzNumber == 0) {
            return buzzWhizzResult;
        }

        return super.handleNumber(number);
    }

    private String buzzWhizzResult = "BuzzWhizz";
}
