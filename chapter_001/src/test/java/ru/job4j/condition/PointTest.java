package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distanceOne() {
        double expected = Point.distance(0,0,2,0);
        Assert.assertEquals(expected, 2, 0.01);
    }

    @Test
    public void distanceTwo() {
        double expected = Point.distance(4,8,6,2);
        Assert.assertEquals(expected, 6.32, 0.01);
    }

}
