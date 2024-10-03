package ru.vsu.css.tupicyn.tasks.task_1;

public class Calculations {

    public int getDigits(Integer number) {
        number = number % 1000;
        return number;
    }

    public int calculateDigitsSum (int digits) {
        int sum = digits / 100;
        sum = sum + digits / 10 % 10;
        sum = sum + digits % 10;
        return sum;
    }

    public int calculate (Integer number) {
        int digits = getDigits(number);
        return calculateDigitsSum(digits);
    }

}
