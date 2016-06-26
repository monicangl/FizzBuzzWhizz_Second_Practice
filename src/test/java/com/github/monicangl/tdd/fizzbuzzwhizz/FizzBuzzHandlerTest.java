package com.github.monicangl.tdd.fizzbuzzwhizz;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzHandlerTest {
    private FizzBuzzHandler fizzBuzzHandler = new FizzBuzzHandler(null);

    @Test
    public void should_be_able_to_return_FizzBuzz_if_times_of_three_and_times_of_five() {
        // given
        int number = 15;

        // when
        String result = fizzBuzzHandler.handleNumber(number);

        // then
        assertThat(result, is("FizzBuzz"));
    }

    @Test
    public void should_be_able_to_return_original_number_if_times_of_three_and_not_times_of_five() {
        // given
        int number = 3;

        // when
        String result = fizzBuzzHandler.handleNumber(number);

        // then
        assertThat(result, is(String.valueOf(number)));
    }

    @Test
    public void should_be_able_to_return_original_number_if_not_times_of_three_and_times_of_five() {
        // given
        int number = 5;

        // when
        String result = fizzBuzzHandler.handleNumber(number);

        // then
        assertThat(result, is(String.valueOf(number)));
    }

    @Test
    public void should_be_able_to_return_original_number_if_not_times_of_three_and_not_times_of_five() {
        // given
        int number = 1;

        // when
        String result = fizzBuzzHandler.handleNumber(number);

        // then
        assertThat(result, is(String.valueOf(number)));
    }
}
