package ru.job4j.array;

/**
 * array.
 *
 * @author Dmitry Poklonov (d.poklonov@mail.ru)
 * @version $Id$
 * @since 0.1
 */

public class RotateArray {

    /**
     * Bublesort array.
     *
     * @param array array.
     * @return return rotarr value.
     */
    public int[][] rotate(int[][] array) {
        final int hight = array.length;
        final int width = array[0].length;
        int[][] rotarr = new int[width][hight];
        for (int row = 0; row < hight; row++) {
            for (int column = 0; column < width; column++) {
                rotarr[column][hight - 1 - row] = array[row][column];
            }
        }
        return rotarr;
    }

}