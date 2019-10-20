package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void manWeight() {
        test(86.25, Fit.manWeight(175));
    }

    @Test
    public void womanWeight() {
        test(57.5, Fit.womanWeight(160));
    }

    private void test(double expected, double out) {
        Assert.assertEquals(expected, out, 0.01);
    }

}
