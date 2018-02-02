package ru.job4j.array;

/**
 * @author Dmitry Poklonov (d.poklonov@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Square {

    /**
     * Отвечает на вопросы.
     *
     * @param bound размер массива
     * @return Массив квадратов.
     */

    public int[] calculate(int bound) {

        int[] rst = new int[bound];
        int[] rsl = new int[bound - 1];
        System.out.println(rst.length);

        // заполнить массив через цикл элементами от 1 до bound возведенные в квадрат
        for (int rslStep = 0; rslStep < rsl.length; rslStep++) {
            for (int rstStep = 1; rstStep < rst.length; rstStep++) {
                rst[rstStep] = rstStep * rstStep;
            }
            rsl[rslStep] = rst[rslStep + 1];

        }
        for (int item = 0; item < rsl.length; item++) {
            System.out.println(rsl[item]);
        }

        return rsl;

    }

    public static void main(String[] args) {
        Square sqr = new Square();
        sqr.calculate(9);

    }
}