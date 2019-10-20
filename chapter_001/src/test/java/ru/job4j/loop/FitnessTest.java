package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FitnessTest {

    @Test
    public void whenIvanGreatNik() {
        test(95, 90, 0);
    }

    @Test
    public void whenIvanLessByOneNik() {
        test(90, 95, 1);
    }

    @Test
    public void whenIvanLessByFewNik() {
        test(50, 90, 2);
    }

    private void test (int ivan, int nik, int expected) {
        Fitness fit = new Fitness();
        assertThat(fit.calc(ivan, nik), is(expected));
    }

}
