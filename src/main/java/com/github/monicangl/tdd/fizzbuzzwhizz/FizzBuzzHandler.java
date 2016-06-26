package com.github.monicangl.tdd.fizzbuzzwhizz;

public class FizzBuzzHandler extends BaseHandler{
    protected FizzBuzzHandler(BaseHandler nextHandler) {
        super(nextHandler);
    }

    public String handleNumber(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }

        return super.handleNumber(number);
    }
}
