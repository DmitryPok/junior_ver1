package ru.ru.job4j.array;

import org.junit.Test;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Array sort test.
 */
public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort arr = new BubbleSort();
        int[] array = new int[]{1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        int[] result = arr.sort(array);
        int[] expected = new int[]{0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        assertThat(result, is(expected));
    }
}