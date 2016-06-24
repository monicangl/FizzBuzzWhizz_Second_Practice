package com.github.monicangl.tdd.fizzbuzzwhizz;

public class FizzBuzzWhizzGame {
    public String handleNumber(int number) {
        return fizzHandler.handleNumber(number);
    }

    private  IHandler whizzHandler = new WhizzHandler(null);
    private  IHandler buzzHandler = new BuzzHandler(whizzHandler);
    private  IHandler fizzHandler = new FizzHandler(buzzHandler);
}
