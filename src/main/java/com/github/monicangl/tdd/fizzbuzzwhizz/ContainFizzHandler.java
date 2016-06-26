package com.github.monicangl.tdd.fizzbuzzwhizz;

public class ContainFizzHandler extends BaseHandler{
    protected ContainFizzHandler(BaseHandler nextHandler) {
        super(nextHandler);
    }

    public String handleNumber(int number) {
        int temp = number;
        while (temp > 0) {
            if (temp % 10 == fizzNumber) {
                return containFizzResult;
            } else {
                temp /= 10;
            }
        }

        return super.handleNumber(number);
    }

    private String containFizzResult = "Fizz";
}
