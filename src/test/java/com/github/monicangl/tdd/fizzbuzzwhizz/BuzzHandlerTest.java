package com.github.monicangl.tdd.fizzbuzzwhizz;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * 如果是5的倍数, 返回Buzz;
 */
public class BuzzHandlerTest {
    private BuzzHandler buzzHandler = new BuzzHandler(null);

    @Test
    public void should_be_able_to_return_buzz_if_times_of_five() {
        // given
        int number = 5;

        // when
        String result = buzzHandler.handleNumber(number);

        // then
        assertThat(result, is("Buzz"));
    }

    @Test
    public void should_be_able_to_return_original_number_if_not_times_of_five() {
        // given
        int number = 1;

        // when
        String result = buzzHandler.handleNumber(number);

        // then
        assertThat(result, is(String.valueOf(number)));
    }
}
