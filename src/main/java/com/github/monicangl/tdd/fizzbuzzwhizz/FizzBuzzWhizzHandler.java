package com.github.monicangl.tdd.fizzbuzzwhizz;

public class FizzBuzzWhizzHandler extends BaseHandler{

    protected FizzBuzzWhizzHandler(BaseHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public String handleNumber(int number) {
        if (number % fizzNumber == 0 && number % buzzNumber == 0 && number % whizzNumber == 0) {
            return fizzBuzzWhizzResult;
        }

        return passRequest(number);
    }

    private static final String fizzBuzzWhizzResult = "FizzBuzzWhizz";
}
