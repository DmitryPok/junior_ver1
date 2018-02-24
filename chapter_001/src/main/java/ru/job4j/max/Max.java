package ru.job4j.max;
/**
 * Calculate.
 *
 * @author Dmitry Poklonov (d.poklonov@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Max {
    /**
     * try to equal two int.
     * @param first first
     * @param second second
     * @return return max value
     */
    public int max(int first, int second) {return (first > second) ?  first : second; }

    public int max(int first, int second, int third)  { return max(third, max(first, second));
    }
    }