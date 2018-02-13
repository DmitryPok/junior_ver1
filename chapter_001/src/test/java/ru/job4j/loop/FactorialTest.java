package ru.ru.job4j.loop;

/**
 * Loop.
 *
 * @author Dmitry Poklonov (d.poklonov@mail.ru)
 * @version $Id$
 * @since 0.1
 */
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    /**
     * Loop test.
     */
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
    //напишите здесь тест, проверяющий, что факториал для числа 5 равен 120.
        Factorial factorial = new Factorial();
        int result = factorial.fact(5);
        assertThat(result, is(120));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
    //напишите здесь тест, проверяющий, что факториал для числа 0 равен 1.
        Factorial factorial = new Factorial();
        int result = factorial.fact(0);
        assertThat(result, is(1));
    }
    }
