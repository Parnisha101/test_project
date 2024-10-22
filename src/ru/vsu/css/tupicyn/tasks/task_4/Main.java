package ru.vsu.css.tupicyn.tasks.task_4;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int i = scanner.nextInt();
            System.out.println(fib(i));
            System.out.println("___________");
        }
    }

    public static long fib(int n) {
//        var mathContext = MathContext.DECIMAL128;
//        var sqrt5 = BigDecimal.valueOf(5).sqrt(mathContext);
//        var fi = BigDecimal.valueOf(1)
//                .add(sqrt5)
//                .divide(BigDecimal.valueOf(2), mathContext);
//        return fi
//                .pow(n)
//                .divide(sqrt5, mathContext)
//                .toBigInteger();
        return (long) ((Math.pow(((1+Math.sqrt(5))/2), n) - Math.pow(((1-Math.sqrt(5))/2), n)) / Math.sqrt(5));
    }
}
