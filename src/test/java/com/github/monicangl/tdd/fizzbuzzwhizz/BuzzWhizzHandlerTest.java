package com.github.monicangl.tdd.fizzbuzzwhizz;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BuzzWhizzHandlerTest {
    private BuzzWhizzHandler buzzWhizzHandler = new BuzzWhizzHandler();

    @Test
    public void should_be_able_to_return_BuzzWhizz_if_times_of_five_and_times_of_seven() {
        // given
        int number = 35;

        // when
        String result = buzzWhizzHandler.handleNumber(number);

        // then
        assertThat(result, is("BuzzWhizz"));
    }

    @Test
    public void should_be_able_to_return_original_number_if_times_of_five_and_not_times_of_seven() {
        // given
        int number = 5;

        // when
        String result = buzzWhizzHandler.handleNumber(number);

        // then
        assertThat(result, is(String.valueOf(number)));
    }

    @Test
    public void should_be_able_to_return_original_number_if_not_times_of_five_and_not_times_of_seven() {
        // given
        int number = 1;

        // when
        String result = buzzWhizzHandler.handleNumber(number);

        // then
        assertThat(result, is(String.valueOf(number)));
    }
}
