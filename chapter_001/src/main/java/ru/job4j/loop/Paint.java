package ru.job4j.loop;
/**
 * Paint.
 *
 * @author Dmitry Poklonov (d.poklonov@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Paint {
    /**
     * determine lenght, width.
     */
    private int hight, width;
    /**
     * Point board.
     * @param  hight Hight.
     * @return return line value.
     */
    public String piramid(int hight) {
        String lineSep = System.getProperty("line.separator");
        String line = "";
        for (int lenInd = 0; lenInd < hight; lenInd++) {
            for (int widInd = 0; widInd <= hight * 2; widInd++) {
                if (widInd > hight - 2 - lenInd && widInd < hight + lenInd) {
                        line = line + "^";
                } else if (widInd < hight * 2 - 1) {
                        line = line + " ";
                }
            }
            if (lenInd < hight - 1) {
             line = line + lineSep;
                }
        }
        return line;
    }
    public static void main(String[] args) {
        Paint pira = new Paint();
        System.out.println(pira.piramid(3));
    }
}