package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class MaxTest {

    @Test
    public void whenMax1To2Then2 () {
        assertThat(Max.max(1,2), is(2));
    }

    @Test
    public void whenMax2To2Then2 () {
        assertThat(Max.max(2,2), is(2));
    }

    @Test
    public void whenMax2To1Then2 () {
        assertThat(Max.max(2, 1), is(2));
    }

}
