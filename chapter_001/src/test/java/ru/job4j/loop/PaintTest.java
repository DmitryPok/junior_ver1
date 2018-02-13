package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Loop test.
 */
public class PaintTest {
    @Test
    public void whenPiramidWithHeightTwoThenStringWithTwoRows() {
        Paint paint = new Paint();
        String result = paint.piramid(2);
        String ln = System.lineSeparator();
        String expected = String.format(" ^ %s^^^", ln);
        assertThat(result, is(expected));
    }

    @Test
    public void whenPiramidWithHeightThreeThenStringWithThreeRows() {
        Paint paint = new Paint();
        String result = paint.piramid(3);
        String ln = System.lineSeparator();
        String expected = String.format("  ^  %s ^^^ %s^^^^^", ln, ln);
        assertThat(result, is(expected));
    }
}