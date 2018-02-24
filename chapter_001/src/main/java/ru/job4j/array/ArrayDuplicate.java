package ru.job4j.array;
import java.util.Arrays;
/**
 * array.
 *
 * @author Dmitry Poklonov (d.poklonov@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class  ArrayDuplicate {
    /**
     * Array duplicate.
     *
     * @param array array.
     * @return return rotarr value.
     */
    public String[] remove(String[] array) {
        int uniq = array.length;
        for (int out = 0; out < uniq; out++) {
            for (int in = out + 1; in < uniq; in++) {
                if (array[out].equals(array[in])) {
                    array[in] = array[uniq - 1];
                    uniq--;
                    in--;
                    }
                }
            }
        return Arrays.copyOf(array, uniq);
    }

    public static void main(String[] args) {
        ArrayDuplicate dupl = new ArrayDuplicate();
        String[] first = {"Привет", "Мир", "Привет", "Супер", "Мир"};
        for (int ind = 0; ind < first.length; ind++) {
            System.out.print(first[ind]);
        }
        System.out.println();
        for (int ind = 0; ind < dupl.remove(first).length; ind++) {
            System.out.print(dupl.remove(first)[ind]);
        }
        System.out.println();
    }
}