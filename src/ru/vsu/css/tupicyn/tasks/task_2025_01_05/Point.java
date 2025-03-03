package ru.vsu.css.tupicyn.tasks.task_2025_01_05;

import java.text.MessageFormat;

public class Point {
    private double x;
    private double y;

    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return MessageFormat.format("[{0}, {1}]", x, y);
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
