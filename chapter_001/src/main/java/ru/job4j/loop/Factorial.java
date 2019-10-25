package ru.job4j.loop;

/**
 * Class Factorial.
 *
 * @author Arina Shamsemukhametova.
 */
public class Factorial {

    /**
     * Method calc.
     * Находит факториал числа.
     * @param n - число для рассчёта факториала.
     * @return факториал числа.
     */
    public int calc(int n) {
        int result = 1;
        for (int number = 1; number <= n; number++) {
            result *= number;
        }
        return result;
    }

}
