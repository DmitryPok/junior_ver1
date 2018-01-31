package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Array matrix test.
 */
public class MatrixTest {
    @Test
    public void whenMatrixSizeFour() {
        Matrix matr = new Matrix();
        int size = 4;
        int[][] result = matr.multiple(size);
        int[][] expected = {
                {0, 0, 0, 0, 0},
                {0, 1, 2, 3, 4},
                {0, 2, 4, 6, 8},
                {0, 3, 6, 9, 12},
                {0, 4, 8, 12, 16}
        };
        assertThat(result, is(expected));
    }
}