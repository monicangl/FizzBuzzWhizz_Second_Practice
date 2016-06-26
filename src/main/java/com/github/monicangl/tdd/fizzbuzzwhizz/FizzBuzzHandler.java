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

    private String fizzBuzzResult = "FizzBuzz";
}
