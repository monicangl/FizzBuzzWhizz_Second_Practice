package com.github.monicangl.tdd.fizzbuzzwhizz;

public class FizzWhizzHandler extends BaseHandler {
    protected FizzWhizzHandler(BaseHandler nextHandler) {
        super(nextHandler);
    }

    public String handleNumber(int number) {
        if (number % fizzNumber == 0 && number % whizzNumber == 0) {
            return fizzWhizzResult;
        }

        return super.handleNumber(number);
    }

    private String fizzWhizzResult = "FizzWhizz";
}
