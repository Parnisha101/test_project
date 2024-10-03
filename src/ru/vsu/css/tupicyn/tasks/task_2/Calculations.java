package ru.vsu.css.tupicyn.tasks.task_2;

public class Calculations {

    public int getMaxDigit (Integer number) {
        number = Math.abs(number);
        int maxDigit = 0;
        while (number > 0) {
            maxDigit = Integer.max(maxDigit, number%10);
            number = number / 10;
        }
        return maxDigit;
    }

    public int getMinDigit (Integer number) {
        int minDigit = 9;
        while (number > 0) {
            minDigit = Integer.min(minDigit, number%10);
            number = number / 10;
        }
        return minDigit;
    }
}
