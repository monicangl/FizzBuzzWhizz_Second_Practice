package com.github.monicangl.tdd.fizzbuzzwhizz;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * 如果是7的倍数, 返回Whizz;
 */
public class WhizzHandlerTest {
    private WhizzHandler whizzHandler;

    public WhizzHandlerTest() {
        this.whizzHandler = new WhizzHandler();
    }

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
