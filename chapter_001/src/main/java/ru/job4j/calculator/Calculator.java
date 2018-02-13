package ru.job4j.calculator;


/**
 * Calculate.
 *
 * @author Dmitry Poklonov (d.poklonov@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Calculator {

	/**
	 * result.
	 */
    private double result;
	 /**
     * add.
	  * @param first first
	  * @param second second
     */
    public void add(double first, double second) {
        this.result = first + second;
    }
	 /**
     * subs.
	  * @param first first
	  * @param second second
     */
	public void substract(double first, double second) {
        this.result = first - second;
    }
	 /**
     * div.
	  * @param first first
	  * @param second second
     */
	public void div(double first, double second) {
        this.result = first / second;
    }
	 /**
     * mult.
	  * @param first first
	  * @param second second
     */
	public void multiple(double first, double second) {
        this.result = first * second;
    }
	 /**
     * get.
	  * @return result
     */
    public double getResult() {
        return this.result;
    }
}