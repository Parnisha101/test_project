package ru.vsu.css.tupicyn.tasks.task_6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("x: ");
            double x = scanner.nextDouble();
            System.out.print("n: ");
            double n = scanner.nextDouble();
            System.out.print("e: ");
            double e = scanner.nextDouble();
            System.out.println("------");
            results(x, n, e);
            System.out.println("------");
        }
    }

    public static double a_N(double x, double N, double a_N0) {
        if (N == 1) {
            return -x;
        } else return a_N0 * x / N;
    }

    public static void results(double x, double n, double e) {
        double result_1 = 0;
        double result_2 = 0;
        double result_3 = 0;
        double result_4 = Math.log((1 - Math.pow(x, 2))/(1 + x));
        double a_N0 = 0;
        for (double N = 1; N<n; N++) {
            result_1 = result_1 + a_N(x, N, a_N0);
            if (Math.abs(a_N(x, N, a_N0)) > e) {
                result_2 = result_2 + a_N(x, N, a_N0);
            }
            if (Math.abs(a_N(x, N, a_N0)) > e/10) {
                result_3 = result_3 + a_N(x, N, a_N0);
            }
            a_N0 = a_N(x, N, a_N0);
        }
        System.out.println("Result 1: " + result_1);
        System.out.println("Result 2: " + result_2);
        System.out.println("Result 3: " + result_3);
        System.out.println("Result 4: " + result_4);
    }
}
