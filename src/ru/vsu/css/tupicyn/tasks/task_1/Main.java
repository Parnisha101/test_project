package ru.vsu.css.tupicyn.tasks.task_1;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculations calculations = new Calculations();

        int number = scanner.nextInt();

        System.out.print(calculations.calculate(number));
    }

}
