package ru.vsu.css.tupicyn.tasks.task_11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Coding {
    private String engStep = "abcdefghijklmnopqrstuvwxyz";
    private String rusStep = "абвгдеёжзийклмнопрстуфхцчшщьыъэюя";

    private boolean isLowerCase(String symbol) {
        return symbol.equals(symbol.toLowerCase());
    }

    private boolean codeable(String symbol) {
        Pattern pattern = Pattern.compile("[a-zA-Zа-яА-Я]");
        Matcher matcher = pattern.matcher(symbol);
        return matcher.find();
    }

    private void setStep(int step) {
        for(int i = 0; i < step; i++) {
            char replacement = engStep.charAt(0);
            engStep = engStep.replaceFirst(String.valueOf(engStep.charAt(0)), "");
            engStep = engStep + replacement;

            replacement = rusStep.charAt(0);
            rusStep = rusStep.replaceFirst(String.valueOf(rusStep.charAt(0)), "");
            rusStep = rusStep + replacement;
        }
    }

    private void resetStep() {
        engStep = "abcdefghijklmnopqrstuvwxyz";
        rusStep = "абвгдеёжзийклмнопрстуфхцчшщьыъэюя";
    }

    private String encodeSymbol(String symbol) {
        if (codeable(symbol)) {
            boolean isLowerCase = isLowerCase(symbol);
            symbol = symbol.toLowerCase();
            try {
                String eng = "abcdefghijklmnopqrstuvwxyz";
                int index = eng.indexOf(symbol);
                symbol = String.valueOf(engStep.charAt(index));
            } catch (Exception e) {
                String rus = "абвгдеёжзийклмнопрстуфхцчшщьыъэюя";
                int index = rus.indexOf(symbol);
                symbol = String.valueOf(rusStep.charAt(index));
            }
            if (isLowerCase) return symbol;
            else return symbol.toUpperCase();
        } else return symbol;
    }

    public String encodeText(String text, int step) {
        setStep(step);
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            result = result + encodeSymbol(String.valueOf(text.charAt(i)));
        }
        resetStep();
        return result;
    }
}
