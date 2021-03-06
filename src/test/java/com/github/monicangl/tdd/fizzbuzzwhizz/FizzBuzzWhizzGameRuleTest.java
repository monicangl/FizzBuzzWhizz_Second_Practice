package com.github.monicangl.tdd.fizzbuzzwhizz;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzWhizzGameRuleTest {
    private FizzBuzzWhizzGameRule fizzBuzzWhizzGameRule = new FizzBuzzWhizzGameRule();

    @BeforeClass
    public static void setUpBeforeClass() {
        BaseHandler.setFizzNumber(3);
        BaseHandler.setBuzzNumber(5);
        BaseHandler.setWhizzNumber(7);
    }

    @Test
    public void should_be_able_to_return_Fizz_if_contain_three() {
        // given
        int number = 13;

        // when
        String result = fizzBuzzWhizzGameRule.handleNumber(number);

        // then
        assertThat(result, is("Fizz"));
    }

    @Test
    public void should_be_able_to_return_FizzBuzzWhizz_if_not_contain_three_and_times_of_three_and_times_of_five_and_times_of_seven() {
        // given
        int number = 105;

        // when
        String result = fizzBuzzWhizzGameRule.handleNumber(number);

        // then
        assertThat(result, is("FizzBuzzWhizz"));
    }

    @Test
    public void should_be_able_to_return_FizzBuzz_if_not_contain_three_and_times_of_three_and_times_of_five_and_not_times_of_seven() {
        // given
        int number = 15;

        // when
        String result = fizzBuzzWhizzGameRule.handleNumber(number);

        // then
        assertThat(result, is("FizzBuzz"));
    }

    @Test
    public void should_be_able_to_return_FizzWhizz_if_not_contain_three_and_times_of_three_and_times_of_seven_and_not_times_of_five() {
        // given
        int number = 21;

        // when
        String result = fizzBuzzWhizzGameRule.handleNumber(number);

        // then
        assertThat(result, is("FizzWhizz"));
    }

    @Test
    public void should_be_able_to_return_BuzzWhizz_if_not_contain_three_and_times_of_five_and_times_of_seven_and_not_times_of_three() {
        // given
        int number = 70;

        // when
        String result = fizzBuzzWhizzGameRule.handleNumber(number);

        // then
        assertThat(result, is("BuzzWhizz"));
    }

    @Test
    public void should_be_able_to_return_Fizz_if_not_contain_three_and_times_of_three_and_not_times_of_five_and_not_times_of_seven() {
        // given
        int number = 6;

        // when
        String result = fizzBuzzWhizzGameRule.handleNumber(number);

        // then
        assertThat(result, is("Fizz"));
    }

    @Test
    public void should_be_able_to_return_Buzz_if_not_contain_three_and_times_of_five_and_not_times_of_three_and_not_times_of_seven() {
        // given
        int number = 5;

        // when
        String result = fizzBuzzWhizzGameRule.handleNumber(number);

        // then
        assertThat(result, is("Buzz"));
    }

    @Test
    public void should_be_able_to_return_Whizz_if_not_contain_three_and_times_of_seven_and_not_times_of_three_and_not_times_of_five() {
        // given
        int number = 7;

        // when
        String result = fizzBuzzWhizzGameRule.handleNumber(number);

        // then
        assertThat(result, is("Whizz"));
    }

    @Test
    public void should_be_able_to_return_original_number_if_not_contain_three_and_not_times_of_three_and_not_times_of_five_and_not_times_of_seven() {
        // given
        int number = 1;

        // when
        String result = fizzBuzzWhizzGameRule.handleNumber(number);

        // then
        assertThat(result, is(String.valueOf(number)));
    }
}
