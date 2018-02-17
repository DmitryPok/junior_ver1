package ru.job4j.array;
/**
 * array.
 *
 * @author Dmitry Poklonov (d.poklonov@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Turn {
    /**
     * Back array.
     * @param  array array.
     * @return return arr value.
     */
    public int[] back(int[] array) {
        int chst = 0;
        int chen = 0;
        for (int ind = 0; ind < array.length; ind++) {
            array[ind] = array.length - ind;
        }
        return array;
    }
}