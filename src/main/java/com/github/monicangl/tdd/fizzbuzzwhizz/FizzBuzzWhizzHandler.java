package com.github.monicangl.tdd.fizzbuzzwhizz;

public class FizzBuzzWhizzHandler extends BaseHandler{

    protected FizzBuzzWhizzHandler(BaseHandler nextHandler) {
        super(nextHandler);
    }

    public String handleNumber(int number) {
        if (number % 3 == 0 && number % 5 == 0 && number % 7 == 0) {
            return "FizzBuzzWhizz";
        }

        return super.handleNumber(number);
    }
}
