package ru.vsu.css.tupicyn.tasks.task_1;

public class Calculations {

    public int getDigits(Integer number) {
        number = number % 1000;
        return number;
    }

    public int calculateDigitsSum (int digits) {
        int sum = 0;
        for (int i = 1; i < 3; i++) {
            sum = digits % 10 + sum;
            digits = digits / 10;
        }
        return sum;
    }

    public int calculate (Integer number) {
        int digits = getDigits(number);
        return calculateDigitsSum(digits);
    }

}
