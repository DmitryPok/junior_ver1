package ru.job4j.calculator;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 *
 * @author Dmitry Poklonov (d.poklonov@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class CalculatorTest {
	/**
     * Test add.
     */
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
	/**
     * Test subtract.
     */
    @Test
	public void whenSubstractOneMinesOneThenZero() {
        Calculator calc = new Calculator();
        calc.substract(3D, 2D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }
	/**
     * Test div.
     */
    @Test
	public void whenDivOneDivOneThenOne() {
            Calculator calc = new Calculator();
            calc.div(4D, 2D);
            double result = calc.getResult();
            double expected = 2D;
            assertThat(result, is(expected));
        }
	/**
     * Test multiple.
     */
    @Test
	public void whenMultipleOneMultipleOneThen() {
                Calculator calc = new Calculator();
                calc.multiple(5D, 5D);
                double result = calc.getResult();
                double expected = 25D;
                assertThat(result, is(expected));
            }
}