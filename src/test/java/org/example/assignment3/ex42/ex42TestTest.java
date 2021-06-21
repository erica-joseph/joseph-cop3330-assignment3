package org.example.assignment3.ex42;

import org.example.assignment3.ex41.FortyOneTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex42TestTest {

    @Test
    void reader_returns_true_value() {
        ex42Test beep = new ex42Test();

        boolean actual = beep.reader("src/main/java/org/example/assignment3/ex42/test42A.txt");
        boolean expected = true;

    }

}