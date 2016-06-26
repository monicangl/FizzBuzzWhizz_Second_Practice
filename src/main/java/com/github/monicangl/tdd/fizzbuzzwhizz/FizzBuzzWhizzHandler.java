package com.github.monicangl.tdd.fizzbuzzwhizz;

public class FizzBuzzWhizzHandler extends BaseHandler{

    protected FizzBuzzWhizzHandler(BaseHandler nextHandler) {
        super(nextHandler);
    }

    public String handleNumber(int number) {
        if (number % fizzNumber == 0 && number % buzzNumber == 0 && number % whizzNumber == 0) {
            return fizzBuzzWhizzResult;
        }

        return super.handleNumber(number);
    }

    private int fizzNumber = 3;
    private int buzzNumber = 5;
    private int whizzNumber = 7;
    private String fizzBuzzWhizzResult = "FizzBuzzWhizz";
}
