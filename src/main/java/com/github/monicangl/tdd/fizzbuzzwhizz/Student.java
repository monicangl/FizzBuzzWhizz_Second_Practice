package com.github.monicangl.tdd.fizzbuzzwhizz;

public class Student {
    public Student(int position) {
        this.position = position;
    }

    public String countOffNumber(FizzBuzzWhizzGameRule fizzBuzzWhizzGameRule) {
        return fizzBuzzWhizzGameRule.handleNumber(position);
    }

    private int position;
}
