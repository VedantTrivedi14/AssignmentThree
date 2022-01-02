package com.example.debug;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void multiplication_isCorrect() {
        assertEquals(12, 4 * 3);
    }

    @Test
    public void division_isCorrect() {
        assertEquals(4, 8 / 2);
    }

    @Test
    public void subtract_isCorrect() {
        assertEquals(12, 15 - 3);
    }
}
