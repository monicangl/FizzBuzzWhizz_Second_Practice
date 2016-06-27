package com.github.monicangl.tdd.fizzbuzzwhizz;

public class FizzWhizzHandler extends BaseHandler {
    protected FizzWhizzHandler(BaseHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public String handleNumber(int number) {
        if (number % fizzNumber == 0 && number % whizzNumber == 0) {
            return fizzWhizzResult;
        }

        return passRequest(number);
    }

    private static final String fizzWhizzResult = "FizzWhizz";
}
