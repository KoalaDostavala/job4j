package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void squareOne() {
        double expected = SqArea.square(6, 2);
        Assert.assertEquals(expected, 2, 0.01);
    }

    @Test
    public void squareTwo() {
        double expected = SqArea.square(4,1);
        Assert.assertEquals(expected, 1, 0.01);
    }

}
