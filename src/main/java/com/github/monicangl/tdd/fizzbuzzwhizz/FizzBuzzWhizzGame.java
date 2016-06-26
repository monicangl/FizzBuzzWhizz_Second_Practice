package com.github.monicangl.tdd.fizzbuzzwhizz;

public class FizzBuzzWhizzGame {
    public String handleNumber(int number) {
        return fizzBuzzHandler.handleNumber(number);
    }

    private BaseHandler whizzHandler = new WhizzHandler(null);
    private BaseHandler buzzHandler = new BuzzHandler(whizzHandler);
    private BaseHandler fizzHandler = new FizzHandler(buzzHandler);
    private BuzzWhizzHandler buzzWhizzHandler = new BuzzWhizzHandler(fizzHandler);
    private FizzWhizzHandler fizzWhizzHandler = new FizzWhizzHandler(buzzWhizzHandler);
    private FizzBuzzHandler fizzBuzzHandler = new FizzBuzzHandler(fizzWhizzHandler);
}
