package com.github.monicangl.tdd.fizzbuzzwhizz;

public class Teacher {
    public void say(Integer[] numbers) {
        if (numbers.length < 3) {
            throw new IllegalWordsException("words less than three.");
        }

        if (numbers.length > 3) {
            throw new IllegalWordsException("words more than three.");
        }

        for(int number : numbers) {
            if (number <= 0 || number >=10) {
                throw new IllegalWordsException("words should be single digit.");
            }
        }

        if (numbers[0] == numbers[1]
                || numbers[0] == numbers[2]
                || numbers[1] == numbers[2]
                ) {
            throw new IllegalWordsException("words should be different from each other.");
        }

        this.numbers = numbers;
    }

    public Integer[] getNumbers() {
        return numbers;
    }

    private Integer[] numbers;
}
