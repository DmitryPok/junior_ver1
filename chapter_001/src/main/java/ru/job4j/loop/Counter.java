package ru.job4j.loop;
/**
 * Loop.
 *
 * @author Dmitry Poklonov (d.poklonov@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Counter {
    /**
     * count all .
     * @param start start.
     * @param finish finish.
     * @return return sum value.
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int ind = start; ind <= finish; ind++) {
            if (ind % 2 == 0) {
                sum = sum + ind;
            }
        }
        return sum;
    }
}