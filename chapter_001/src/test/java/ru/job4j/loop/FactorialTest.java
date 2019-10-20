package ru.job4j.loop;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        test(5, 120);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        test(0, 1);
    }

    @Test
    public void whenCalculateFactorialForOneThenOne() {
        test(1, 1);
    }

    private void test(int in, int expected) {
        Factorial factorial = new Factorial();
        assertThat(factorial.calc(in), is(expected));
    }

}
