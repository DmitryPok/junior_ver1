package ru.ru.job4j.loop;

/**
 * Triangle.
 *
 * @author Dmitry Poklonov (d.poklonov@mail.ru)
 * @version $Id$
 * @since 0.1
 */

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Loop test.
 */
public class CounterTest {

    /**
     *
     */
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        //напишите здесь тест, проверяющий, что сумма чётных чисел от 1 до 10 при вызове метода counter.add будет равна 30.
        Counter sum = new Counter();
        int result = sum.add(1, 10);
        assertThat(result, is(30));
    }
}