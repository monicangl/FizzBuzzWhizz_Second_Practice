package com.github.monicangl.tdd.fizzbuzzwhizz;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzWhizzHandlerTest {
    private FizzBuzzWhizzHandler fizzBuzzWhizzHandler = new FizzBuzzWhizzHandler(null);

    @Test
    public void should_be_able_to_return_FizzBuzzWhizz_if_times_of_three_and_times_of_five_and_times_of_seven() {
        // given

        // when
        int number = 105;
        String result = fizzBuzzWhizzHandler.handleNumber(number);

        // then
        assertThat(result, is("FizzBuzzWhizz"));
    }

    @Test
    public void should_be_able_to_return_original_number_if_not_times_of_three_and_not_times_of_five_and_not_times_of_seven() {
        // given

        // when
        int number = 1;
        String result = fizzBuzzWhizzHandler.handleNumber(number);

        // then
        assertThat(result, is(String.valueOf(number)));
    }

    @Test
    public void should_be_able_to_return_original_number_if_times_of_three_and_not_times_of_five_and_not_times_of_seven() {
        // given

        // when
        int number = 3;
        String result = fizzBuzzWhizzHandler.handleNumber(number);

        // then
        assertThat(result, is(String.valueOf(number)));
    }

//    @Test
//    public void should_be_able_to_return_original_number_if_times_of_five_and_not_times_of_three_and_not_times_of_seven() {
//        // given
//
//        // when
//        int number = 5;
//        String result = fizzBuzzWhizzHandler.handleNumber(number);
//
//        // then
//        assertThat(result, is(String.valueOf(number)));
//    }
//
//    @Test
//    public void should_be_able_to_return_original_number_if_times_of_seven_and_not_times_of_three_and_not_times_of_five() {
//        // given
//
//        // when
//        int number = 7;
//        String result = fizzBuzzWhizzHandler.handleNumber(number);
//
//        // then
//        assertThat(result, is(String.valueOf(number)));
//    }

    @Test
    public void should_be_able_to_return_original_number_if_times_of_three_and_times_of_five_and_not_times_of_seven() {
        // given

        // when
        int number = 15;
        String result = fizzBuzzWhizzHandler.handleNumber(number);

        // then
        assertThat(result, is(String.valueOf(number)));
    }
}
