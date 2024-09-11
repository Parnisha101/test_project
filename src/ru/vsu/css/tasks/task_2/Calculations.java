package ru.vsu.css.tasks.task_2;

public class Calculations {

    public String numberToString (Integer number) {
        String numberStr = number.toString();
        numberStr = numberStr.replace("-", "");
        return  numberStr;
    }

    public int getMaxDigit (Integer number) {
        String numberStr = numberToString(number);
        int maxDigit = 0;
        for (int digitNo = 0; digitNo < numberStr.length(); digitNo++) {
            char digitChar = numberStr.charAt(digitNo);
            int digit = Integer.parseInt(Character.toString(digitChar));
            maxDigit = Integer.max(maxDigit, digit);
        }
        return maxDigit;
    }

    public int getMinDigit (Integer number) {
        String numberStr = numberToString(number);
        int minDigit = 9;
        for (int digitNo = 0; digitNo < numberStr.length(); digitNo++) {
            char digitChar = numberStr.charAt(digitNo);
            int digit = Integer.parseInt(Character.toString(digitChar));
            minDigit = Integer.min(minDigit, digit);
        }
        return minDigit;
    }
}
