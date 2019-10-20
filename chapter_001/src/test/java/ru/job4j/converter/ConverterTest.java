package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void rubleToEuro() {
        test(2, Converter.rubleToEuro(140));
    }

    @Test
    public void rubleToDollar() {
        test(3, Converter.rubleToDollar(180));
    }

    @Test
    public void dollarToRuble() {
        test(180, Converter.dollarToRuble(3));
    }

    @Test
    public void euroToRuble() {
        test(140, Converter.euroToRuble(2));
    }

    private void test(int expected, int out) {
        Assert.assertEquals(expected, out);
    }

}
