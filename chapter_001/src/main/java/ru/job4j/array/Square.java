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
        for (int i = 0; i < rst.length; i++) {
            rst[i] = (i + 1) * (i + 1);
            System.out.println(rst[i]);
        }
        return rst;
    }
    public static void main(String[] args) {
        Square sqr = new Square();
        sqr.calculate(5);
    }
}