package com.github.monicangl.tdd.fizzbuzzwhizz;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FizzHandlerTest {

    private FizzHandler fizzHandler = new FizzHandler(null);

    @Test
    public void should_be_able_to_return_original_number_if_not_times_of_three() {
        // given
        int number = 1;

        // when
        String result = fizzHandler.handleNumber(number);

        // then
        assertThat(result, is(String.valueOf(number)));
    }

    @Test
    public void should_be_able_to_return_Fizz_if_times_of_three() {
        // given
        int number = 3;

        // when
        String result = fizzHandler.handleNumber(number);

        // then
        assertThat(result, is("Fizz"));
    }
}
