package ru.job4j.array;

/**
 * @author Dmitry Poklonov (d.poklonov@mail.ru)
 * @version $Id$
 * @since 0.1
 */

public class Matrix {
    /**
     * Отвечает на вопросы.
     *
     * @param size размер массива
     * @return Массив квадратов.
     */

    int[][] multiple(int size) {
        size = size + 1;
        int[][] matr = new int[size][size];
        for (int i = 1; i < matr.length; i++) {
            for (int j = 1; j < matr.length; j++) {
                matr[i][j] = i * j;
                System.out.print(matr[i][j] + "\t");
            }
            System.out.println();
        }

        return matr;
    }

    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        matrix.multiple(9);
    }
}