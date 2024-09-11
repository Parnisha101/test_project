package ru.vsu.css.tasks.task_1;

public class Calculations {

    public String getDigitsInOrder (Integer number) {
        String digits = number.toString();
        digits = new StringBuilder(digits).reverse().toString();
        return digits;
    }

    public int calculateDigitsSum (String digits) {
        int digits_length = digits.length();
        int sum = 0;
        if (digits_length < 3) {
            for (int digitNo = 0; digitNo < digits_length; digitNo++) {
                char digitChar = digits.charAt(digitNo);
                int digit = Integer.parseInt(Character.toString(digitChar));
                sum = sum + digit;
            }
        } else for (int digitNo = 0; digitNo < 3; digitNo++) {
            char digitChar = digits.charAt(digitNo);
            int digit = Integer.parseInt(Character.toString(digitChar));
            sum = sum + digit;
        }
        return sum;
    }

    public int calculate (Integer number) {
        String digits = getDigitsInOrder(number);
        return calculateDigitsSum(digits);
    }

}
