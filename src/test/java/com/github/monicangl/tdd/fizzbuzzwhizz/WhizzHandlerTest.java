package com.github.monicangl.tdd.fizzbuzzwhizz;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class WhizzHandlerTest {
    private WhizzHandler whizzHandler = new WhizzHandler(null);

    @Test
    public void should_be_able_to_return_Whizz_if_times_of_seven() {
        // given
        int number = 7;

        // when
        String result = whizzHandler.handleNumber(number);

        // then
        assertThat(result, is("Whizz"));
    }

    @Test
    public void should_be_able_to_return_original_number_if_not_times_of_seven() {
        // given
        int number = 1;

        // when
        String result = whizzHandler.handleNumber(number);

        // then
        assertThat(result, is(String.valueOf(number)));
    }
}
