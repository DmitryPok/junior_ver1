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

        int[] rst = new int[bound +1];

        // заполнить массив через цикл элементами от 1 до bound возведенные в квадрат
        for (int i = 1; i < rst.length; i++) {
            rst[i] = i * i;
            rst[i - 1] = rst[i];
            System.out.println(rst[i]);
        }

        return rst;

    }

    public static void main(String[] args) {
        Square sqr = new Square();
        sqr.calculate(5);

    }
}