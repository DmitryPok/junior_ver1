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
        System.out.println(rst.length);

        // заполнить массив через цикл элементами от 1 до bound возведенные в квадрат
        for (int item = 1; item < rst.length; item++) {
            rst[item] = item * item;
            System.out.println(rst[item]);

        }

        return rst;

    }
    
}