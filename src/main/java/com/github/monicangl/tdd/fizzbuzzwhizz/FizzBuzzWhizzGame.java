package com.github.monicangl.tdd.fizzbuzzwhizz;

public class FizzBuzzWhizzGame {
    public String handleNumber(int number) {
        return fizzHandler.handleNumber(number);
    }

    private BaseHandler whizzHandler = new WhizzHandler(null);
    private BaseHandler buzzHandler = new BuzzHandler(whizzHandler);
    private BaseHandler fizzHandler = new FizzHandler(buzzHandler);
}
