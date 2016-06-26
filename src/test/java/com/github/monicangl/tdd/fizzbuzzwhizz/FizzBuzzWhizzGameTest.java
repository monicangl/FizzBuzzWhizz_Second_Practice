package com.github.monicangl.tdd.fizzbuzzwhizz;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzWhizzGameTest {
    private FizzBuzzWhizzGame fizzBuzzWhizzGame;

    public FizzBuzzWhizzGameTest() {
        this.fizzBuzzWhizzGame = new FizzBuzzWhizzGame();
    }

    @Test
    public void should_be_able_to_return_FizzBuzz_if_times_of_three_and_times_of_five() {
        // given
        int number = 15;

        // when
        String result = fizzBuzzWhizzGame.handleNumber(number);

        // then
        assertThat(result, is("FizzBuzz"));
    }

    @Test
    public void should_be_able_to_return_FizzWhizz_if_times_of_three_and_times_of_seven_and_not_times_of_five() {
        // given
        int number = 21;

        // when
        String result = fizzBuzzWhizzGame.handleNumber(number);

        // then
        assertThat(result, is("FizzWhizz"));
    }

    @Test
    public void should_be_able_to_return_BuzzWhizz_if_times_of_five_and_times_of_seven_and_not_times_of_three() {
        // given
        int number = 35;

        // when
        String result = fizzBuzzWhizzGame.handleNumber(number);

        // then
        assertThat(result, is("BuzzWhizz"));
    }

    @Test
    public void should_be_able_to_return_Fizz_if_times_of_three() {
        // given
        int number = 3;

        // when
        String result = fizzBuzzWhizzGame.handleNumber(number);

        // then
        assertThat(result, is("Fizz"));
    }

    @Test
    public void should_be_able_to_return_Buzz_if_times_of_five_and_not_times_of_three() {
        // given
        int number = 5;

        // when
        String result = fizzBuzzWhizzGame.handleNumber(number);

        // then
        assertThat(result, is("Buzz"));
    }

    @Test
    public void should_be_able_to_return_Whizz_if_times_of_seven_and_not_times_of_three_and_not_times_of_five() {
        // given
        int number = 7;

        // when
        String result = fizzBuzzWhizzGame.handleNumber(number);

        // then
        assertThat(result, is("Whizz"));
    }

    @Test
    public void should_be_able_to_return_original_number_if_not_times_of_three_and_not_times_of_five_and_not_times_of_seven() {
        // given
        int number = 1;

        // when
        String result = fizzBuzzWhizzGame.handleNumber(number);

        // then
        assertThat(result, is(String.valueOf(number)));
    }
}
