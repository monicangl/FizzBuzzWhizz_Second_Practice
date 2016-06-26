package com.github.monicangl.tdd.fizzbuzzwhizz;

public class FizzBuzzWhizzGameRule {
    public void setFizzBuzzWhizzNumber(Integer[] numbers) {
        BaseHandler.setFizzNumber(numbers[0]);
        BaseHandler.setBuzzNumber(numbers[1]);
        BaseHandler.setWhizzNumber(numbers[2]);
    }

    public String handleNumber(int number) {
        return containFizzHandler.handleNumber(number);
    }
    private BaseHandler whizzHandler = new WhizzHandler(null);
    private BaseHandler buzzHandler = new BuzzHandler(whizzHandler);
    private BaseHandler fizzHandler = new FizzHandler(buzzHandler);
    private BuzzWhizzHandler buzzWhizzHandler = new BuzzWhizzHandler(fizzHandler);
    private FizzWhizzHandler fizzWhizzHandler = new FizzWhizzHandler(buzzWhizzHandler);
    private FizzBuzzHandler fizzBuzzHandler = new FizzBuzzHandler(fizzWhizzHandler);
    private FizzBuzzWhizzHandler fizzBuzzWhizzHandler = new FizzBuzzWhizzHandler(fizzBuzzHandler);

    private ContainFizzHandler containFizzHandler = new ContainFizzHandler(fizzBuzzWhizzHandler);
}
