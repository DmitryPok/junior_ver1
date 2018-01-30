package ru.ru.job4j.array;

import org.junit.Test;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Array test.
 */
public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn arr = new Turn();
        int[] smallArr = new int[] {1, 2, 3, 4};
        int[] result = arr.back(smallArr);
        int[] expected = new int[] {4, 3, 2, 1};
        assertThat(result, is(expected));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn arr = new Turn();
        int[] bigArr = new int[] {1, 2, 3, 4, 5};
        int[] result = arr.back(bigArr);
        int[] expected = new int[] {5, 4, 3, 2, 1};
        assertThat(result, is(expected));
    }
}