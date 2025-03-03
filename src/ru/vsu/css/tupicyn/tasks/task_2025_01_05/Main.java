package ru.vsu.css.tupicyn.tasks.task_2025_01_05;

public class Main {

    public static void main (String[] args) {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(0, 3);
        Point point3 = new Point(4, 0);
        Triangle triangle = new Triangle(point1, point2, point3);

        System.out.println(triangle.getPerimetr());
        System.out.println(triangle.getSpace());
    }
}
