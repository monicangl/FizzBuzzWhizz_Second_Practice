package com.github.monicangl.tdd.fizzbuzzwhizz;

public class ContainFizzHandler extends BaseHandler{
    protected ContainFizzHandler(BaseHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public String handleNumber(int number) {
        int temp = number;
        while (temp > 0) {
            if (temp % 10 == fizzNumber) {
                return containFizzResult;
            } else {
                temp /= 10;
            }
        }

        return passRequest(number);
    }

    private static final String containFizzResult = "Fizz";
}
