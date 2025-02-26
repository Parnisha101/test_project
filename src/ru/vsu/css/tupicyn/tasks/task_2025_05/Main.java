package ru.vsu.css.tupicyn.tasks.task_2025_05;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Point point1 = new Point(10, 10);
        Point point2 = new Point(20, 10);
        Point point3 = new Point(30, 20);
        Triangle triangle = new Triangle(point1, point2, point3);

        System.out.println(triangle);
    }
}
