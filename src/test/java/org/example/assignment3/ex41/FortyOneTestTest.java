package org.example.assignment3.ex41;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FortyOneTestTest {

    @Test
    void reader_returns_true_value() {
             FortyOneTest beep = new FortyOneTest();

            boolean actual = beep.reader("src/main/java/org/example/assignment3/ex41/test41A.txt");
            boolean expected = true;

    }
    @Test
    void reader_returns_true_value_again() {
        FortyOneTest beep = new FortyOneTest();

        boolean actual = beep.reader("src/main/java/org/example/assignment3/ex41/test41B.txt");
        boolean expected = true;

    }
}