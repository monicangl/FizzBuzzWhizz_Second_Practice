package com.github.monicangl.tdd.fizzbuzzwhizz;

public class WhizzHandler extends BaseHandler {
    public WhizzHandler(BaseHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public String handleNumber(int number) {
        if (number % whizzNumber == 0) {
            return whizzResult;
        }

        return passRequest(number);
    }

    private String whizzResult = "Whizz";
}
