package ru.ru.job4j.loop;

/**
 * Factorial.
 *
 * @author Dmitry Poklonov (d.poklonov@mail.ru)
 * @version $Id$
 * @since 0.1
 */

public class Board {

    /**
     * determine lenght, width.
     */
    private int length, width;
/**
 * Point board.
 * @param  length length.
 * @param  width width.
 * @return return sum value.
 */
    public String paint(int length, int width) {
        String lineSep = System.getProperty("line.separator");
        String line = "";
        for (int lenInd = 0; lenInd < length; lenInd++) {
            for (int widInd = 0; widInd < width; widInd++) {
                if (lenInd % 2 == 0 ^ widInd % 2 == 0) {
                        line = line + " ";
                } else {
                    line = line + "x";
                }
            }
            line = line + lineSep;
        }
        return line;
    }
    
}