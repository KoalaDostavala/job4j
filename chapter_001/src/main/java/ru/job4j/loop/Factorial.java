package ru.job4j.loop;

public class Factorial {

    public int calc(int n) {
        int result = 1;
        for (int number = 1; number <= n; number++) {
            result *= number;
        }
        return result;
    }

}
