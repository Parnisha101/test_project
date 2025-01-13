package ru.vsu.css.tupicyn.tasks.task_11;

public class Main {

    public static void main(String[] args) {
        String text = "abcDEF 123 абвГДЕ";
        int step = 2;
        Coding coding = new Coding();
        System.out.println(coding.encodeText(text, step));
        text = "cdeFGH 123 вгдЕЁЖ";
        System.out.println(coding.decodeText(text, step));
    }
}
