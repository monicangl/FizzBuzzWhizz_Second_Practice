package com.github.monicangl.tdd.fizzbuzzwhizz;

public class BuzzWhizzHandler extends BaseHandler {
    protected BuzzWhizzHandler(BaseHandler nextHandler) {
        super(nextHandler);
    }

    public String handleNumber(int number) {
        if (number % 5 == 0 && number % 7 == 0) {
            return "BuzzWhizz";
        }

        return super.handleNumber(number);
    }
}
