package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {

    @Test
    public void whenFirstMax() {
        assertThat(SqMax.max(4, 3, 2,1), is(4));
    }

    @Test
    public void whenSecondMax() {
        assertThat(SqMax.max(3, 4, 2, 1), is(4));
    }

    @Test
    public void whenThirdMax() {
        assertThat(SqMax.max(3, 2, 4,1), is(4));
    }

    @Test
    public void whenForthMax() {
        assertThat(SqMax.max(3,1,2, 4), is(4));
    }

    @Test
    public void whenTheSame() {
        assertThat(SqMax.max(4,4,4,4), is(4));
    }

}
