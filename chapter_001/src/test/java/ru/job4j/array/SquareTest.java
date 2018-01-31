package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Array sort test.
 */
public class SquareTest {
    @Test
    public void whenGetItemMakemulti() {
        Square square = new Square();
        int bound = 6;
        int[] result = square.calculate(bound);
        int[] expected = {0, 1, 4, 9, 16, 25};
        assertThat(result, is(expected));
    }

}
