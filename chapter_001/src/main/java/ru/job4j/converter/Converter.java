package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro (int rubles) {
        return rubles / 70;
    }

    public static int euroToRuble (int euro) {
        return euro * 70;
    }

    public static int rubleToDollar (int rubles) {
        return rubles / 60;
    }

    public static int dollarToRuble (int dollars) {
        return dollars * 60;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. " + "Test result: " + passed);
        in = 140;
        expected = 2;
        out = rubleToDollar(in);
        passed = expected == out;
        System.out.println("140 rubles are 2 dollars. " + "Test result: " + passed);
        in = 2;
        expected = 120;
        out = dollarToRuble(in);
        passed = expected == out;
        System.out.println("2 dollars are 120 rubles. " + "Test result: " + passed);
        in = 2;
        expected = 140;
        out = euroToRuble(in);
        passed = expected == out;
        System.out.println("2 euro are 140 rubles. " + "Test result: " + passed);
    }

}
