package org.example.assignment3.ex45;

import org.example.assignment3.ex42.ex42Test;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex45TestTest {
    @Test
    void initial_returns_true_value() {
        ex45Test beep = new ex45Test();

        boolean actual = beep.replaceAll("src/main/java/org/example/assignment3/ex45/ex45test.txt", "Pokemon", "Digimon");
        boolean expected = true;

    }
}