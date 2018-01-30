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
        int[] expected = {1, 4, 9, 16, 25};
        assertThat(result, is(expected));
    }

    @Test
    public void whenRotateThreeRowThreeColArrayThenRotatedArray() {
        RotateArray rotor = new RotateArray();
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] result = rotor.rotate(array);
        int[][] expected = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        //напишите здесь тест, проверяющий поворот массива размером 3 на 3.
    }
}