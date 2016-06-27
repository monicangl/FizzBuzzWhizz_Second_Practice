package com.github.monicangl.tdd.fizzbuzzwhizz;

import org.junit.Test;

public class TeacherTest {
    private Teacher teacher = new Teacher();

    @Test(expected = IllegalWordsException.class)
    public void should_be_able_to_raise_exception_if_less_than_three_numbers() throws Exception {
        // when
        Integer numbers[] = {1, 2};
        teacher.say(numbers);
    }

    @Test(expected = IllegalWordsException.class)
    public void should_be_able_to_raise_exception_if_more_than_three_numbers() throws Exception {
        // when
        Integer numbers[] = {1, 2, 3, 4};
        teacher.say(numbers);
    }

    @Test(expected = IllegalWordsException.class)
    public void should_be_able_to_raise_exception_if_number_not_bigger_than_zero() throws Exception {
        // when
        Integer numbers[] = {0, 2, 3};
        teacher.say(numbers);
    }

    @Test(expected = IllegalWordsException.class)
    public void should_be_able_to_raise_exception_if_number_not_less_than_ten() throws Exception {
        // when
        Integer numbers[] = {3, 5, 10};
        teacher.say(numbers);
    }

    @Test(expected = IllegalWordsException.class)
    public void should_be_able_to_raise_exception_if_fizz_number_same_as_buzz_number() throws Exception {
        // when
        Integer numbers[] = {1, 1, 2};
        teacher.say(numbers);
    }

    @Test(expected = IllegalWordsException.class)
    public void should_be_able_to_raise_exception_if_fizz_number_same_as_whizz_number() throws Exception {
        // when
        Integer numbers[] = {1, 3, 1};
        teacher.say(numbers);
    }

    @Test(expected = IllegalWordsException.class)
    public void should_be_able_to_raise_exception_if_buzz_number_same_as_whizz_number() throws Exception {
        // when
        Integer numbers[] = {1, 3, 3};
        teacher.say(numbers);
    }
}
