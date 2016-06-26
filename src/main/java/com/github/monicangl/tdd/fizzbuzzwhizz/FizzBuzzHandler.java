package com.github.monicangl.tdd.fizzbuzzwhizz;

public class FizzBuzzHandler extends BaseHandler{
    protected FizzBuzzHandler(BaseHandler nextHandler) {
        super(nextHandler);
    }

    public String handleNumber(int number) {
        if (number % fizzNumber == 0 && number % buzzNumber == 0) {
            return fizzBuzzResult;
        }

        return super.handleNumber(number);
    }

    private int fizzNumber = 3;
    private int buzzNumber = 5;
    private String fizzBuzzResult = "FizzBuzz";
}
