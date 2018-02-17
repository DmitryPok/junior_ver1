package ru.job4j.point;
/**
 * Point.
 *
 * @author Dmitry Poklonov (d.poklonov@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Point {
    /**
     *
     * determine x.
     */
    private double x;
    /**
     * determine y.
     *
     */
    private double y;
    /**
     * @param x x.
     * @param y y.
     */
    public  Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    /**
     * @return x.
     */
    public double getX() {
        return this.x;
    }
    /**
     * @return y.
     */
    public double getY() {
        return this.y;
    }
    /**
     * @param a a
     * @param b b
     * @return true or false
     */
    public boolean is(int a, int b) {
        y = a * x + b;
        boolean tr = true;
        boolean fl = false;
        if ((a * x + b - y) == 0) {
            return tr;
        } else {
            return fl;
            }
    }
    /**
     * Calc destance between points.
     * @param point points.
     * @return distance
     */
    public double distance(Point point) {
          return  Math.sqrt(Math.pow(point.y - y, 2) + Math.pow(point.x - x, 2));
    }
}