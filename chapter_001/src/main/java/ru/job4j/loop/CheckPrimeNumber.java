package ru.job4j.loop;

public class CheckPrimeNumber {

    public boolean check(int num) {
        boolean prime = true;
        if (num == 1 || num == 0 || num < 0) {
            prime = false;
        }
        for (int number = 2; number <= num / 2; number++) {
            if (num % number == 0) {
                prime = false;
            }
        }
        return prime;
    }

}
