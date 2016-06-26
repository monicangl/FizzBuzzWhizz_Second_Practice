package com.github.monicangl.tdd.fizzbuzzwhizz;

public class FizzBuzzWhizzGame {
    public FizzBuzzWhizzGame(FizzBuzzWhizzGameRule fizzBuzzWhizzGameRule) {
        this.fizzBuzzWhizzGameRule = fizzBuzzWhizzGameRule;
    }

    public String handleNumber(int number) {
        return fizzBuzzWhizzGameRule.handleNumber(number);
    }

    private FizzBuzzWhizzGameRule fizzBuzzWhizzGameRule;
}
