package com.github.monicangl.tdd.fizzbuzzwhizz;

public class FizzHandler extends BaseHandler {
    public FizzHandler(BaseHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public String handleNumber(int number) {
        if (number % fizzNumber == 0) {
            return fizzResult;
        }

        return super.handleNumber(number);
    }

    private int fizzNumber = 3;
    private String fizzResult = "Fizz";
}
