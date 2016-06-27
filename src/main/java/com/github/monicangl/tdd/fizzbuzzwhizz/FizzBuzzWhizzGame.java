package com.github.monicangl.tdd.fizzbuzzwhizz;

import java.util.Vector;

public class FizzBuzzWhizzGame {
    public void countOff() {
        for (Student student : students) {
            System.out.println(student.countOffNumber(gameRule));
        }
    }

    public void setStudents(Vector<Student> students) {
        this.students = students;
    }
    public void setGameRule(FizzBuzzWhizzGameRule gameRule) {
        this.gameRule = gameRule;
    }

    private Vector<Student> students;
    private FizzBuzzWhizzGameRule gameRule;
}
