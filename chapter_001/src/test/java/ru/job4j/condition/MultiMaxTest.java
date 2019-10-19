package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class MultiMaxTest {

    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        assertThat(check.max(1, 4, 2), is(4));
    }

    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax();
        assertThat(check.max(4, 1, 2), is(4));
    }

    @Test
    public void whenThirdMax() {
        MultiMax check = new MultiMax();
        assertThat(check.max(2, 1, 4), is(4));
    }

    @Test
    public void whenTheSame() {
        MultiMax check = new MultiMax();
        assertThat(check.max(4, 4, 4), is(4));
    }

}
