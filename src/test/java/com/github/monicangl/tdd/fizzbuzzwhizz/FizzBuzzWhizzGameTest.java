package com.github.monicangl.tdd.fizzbuzzwhizz;

import org.junit.Before;
import org.junit.Test;

import java.util.Vector;

public class FizzBuzzWhizzGameTest {
    private FizzBuzzWhizzGame fizzBuzzWhizzGame = new FizzBuzzWhizzGame();

    @Before
    public void setUp()
    {
        Teacher teacher = new Teacher();
        Integer numbers[] = {3, 5, 7};
        teacher.say(numbers);

        FizzBuzzWhizzGameRule fizzBuzzWhizzGameRule = new FizzBuzzWhizzGameRule();
        fizzBuzzWhizzGameRule.setFizzBuzzWhizzNumber(teacher.getNumbers());
        fizzBuzzWhizzGame.setGameRule(fizzBuzzWhizzGameRule);

        Vector<Student> students = new Vector<>();
        for (int i = 0; i < 100; ++i) {
            students.insertElementAt(new Student(i + 1), i);
        }
        fizzBuzzWhizzGame.setStudents(students);
    }

    @Test
    public void should_be_able_to_count_off() {
        fizzBuzzWhizzGame.countOff();
    }
}
