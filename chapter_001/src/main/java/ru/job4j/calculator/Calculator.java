package ru.job4j.calculator;

public class Calculator {

    public static double add (double first, double second) {
        return first + second;
    }

    public static double div (double first, double second) {
        return first / second;
    }

    public static double multiply (double first, double second) {
        return first * second;
    }

    public static double subtract (double first, double second) {
        return first - second;
    }

    public static void main(String[] args) {
        double result = add(1, 1);
        System.out.println("add(1, 1) " + " = " + result);
        result = div(4, 2);
        System.out.println("div(4, 2)" + " = " + result);
        result = multiply(2, 1);
        System.out.println("multiply(2, 1)" + " = " + result);
        result = subtract(10, 5);
        System.out.println("subtract(10, 5)" + " = " + result);
    }

}
