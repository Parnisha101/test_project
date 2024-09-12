package ru.vsu.css.tupicyn.tasks.task_2;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Calculations calculations = new Calculations();
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        System.out.println(calculations.getMaxDigit(number));
        System.out.print(calculations.getMinDigit(number));
    }
}
