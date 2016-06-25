package com.github.monicangl.tdd.fizzbuzzwhizz;

public class WhizzHandler extends BaseHandler {
    public WhizzHandler(BaseHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public String handleNumber(int number) {
        if (number % 7 == 0) {
            return "Whizz";
        }

        return super.handleNumber(number);
    }
}
