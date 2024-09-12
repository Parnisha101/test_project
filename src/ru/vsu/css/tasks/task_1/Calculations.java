package ru.vsu.css.tasks.task_1;

public class Calculations {

    public String getDigits(Integer number) {
        number = number % 1000;
        return number.toString();
    }

    public int calculateDigitsSum (String digits) {
        int digits_length = digits.length();
        int sum = 0;
        for (int digitNo = 0; digitNo < digits_length; digitNo++) {
            char digitChar = digits.charAt(digitNo);
            int digit = Integer.parseInt(Character.toString(digitChar));
            sum = sum + digit;
        }
        return sum;
    }

    public int calculate (Integer number) {
        String digits = getDigits(number);
        return calculateDigitsSum(digits);
    }

}
