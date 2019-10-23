package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CheckPrimeNumberTest {

    @Test
    public void when5() {
        test(5, true);
    }

    @Test
    public void when4() {
        test(4, false);
    }

    @Test
    public void when1() {
        test(1, false);
    }

    @Test
    public void whenANegativeNumber() {
        test(-1, false);
    }

    @Test
    public void whenZero() {
        test(0, false);
    }

    private void test(int in, boolean expected) {
        CheckPrimeNumber prime = new CheckPrimeNumber();
        assertThat(prime.check(in), is(expected));
    }

}
