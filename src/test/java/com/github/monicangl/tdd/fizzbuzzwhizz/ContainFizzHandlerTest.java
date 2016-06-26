package com.github.monicangl.tdd.fizzbuzzwhizz;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContainFizzHandlerTest {
    private ContainFizzHandler containFizzHandler = new ContainFizzHandler(null);

    @Test
    public void should_be_able_to_return_Fizz_if_contain_three() {
        // given
        int number = 3;

        // when
        String result = containFizzHandler.handleNumber(number);

        // then
        assertThat(result, is("Fizz"));
    }

    @Test
    public void should_be_able_to_return_original_number_if_not_contain_three() {
        // given
        int number = 1;

        // when
        String result = containFizzHandler.handleNumber(number);

        // then
        assertThat(result, is(String.valueOf(number)));
    }
}
