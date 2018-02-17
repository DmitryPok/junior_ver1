package ru.job4j.loop;
/**
 * Factorial.
 *
 * @author Dmitry Poklonov (d.poklonov@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Factorial {
    /**
     * Factorial .
     * @param n n.
     * @return return sum value.
     */
    public int fact(int n) {
        int fac = 0;
        for (int ind = 0; ind <= n; ind++) {
            if (ind == 0) {
                fac = 1;
                ind = 1;
            }
            fac = fac * ind;
            }
        return fac;
        }
    }

