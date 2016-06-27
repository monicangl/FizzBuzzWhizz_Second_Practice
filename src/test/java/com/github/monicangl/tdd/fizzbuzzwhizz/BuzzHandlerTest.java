package com.github.monicangl.tdd.fizzbuzzwhizz;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BuzzHandlerTest {
    private BuzzHandler buzzHandler = new BuzzHandler(null);

    @BeforeClass
    public static void setUpBeforeClass() {
        BaseHandler.setFizzNumber(3);
        BaseHandler.setBuzzNumber(5);
        BaseHandler.setWhizzNumber(7);
    }

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
