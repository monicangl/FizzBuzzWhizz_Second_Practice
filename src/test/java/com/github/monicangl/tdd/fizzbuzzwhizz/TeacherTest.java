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
    public void should_be_able_to_raise_exception_if_number_not_bigger_than_zero_and_less_than_ten() throws Exception {
        // when
        Integer numbers[] = {1, 2, 10};
        teacher.say(numbers);
    }

    @Test(expected = IllegalWordsException.class)
    public void should_be_able_to_raise_exception_if_number_not_different() throws Exception {
        // when
        Integer numbers[] = {1, 2, 1};
        teacher.say(numbers);
    }
}
