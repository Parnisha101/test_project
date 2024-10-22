package ru.vsu.css.tupicyn.tasks.task_3;

public class Rectangle {
    public double x0;
    public double x1;
    public double y0;
    public double y1;

    public Rectangle(double x0, double x1, double y0, double y1) {
        this.x0 = x0;
        this.x1 = x1;
        this.y0 = y0;
        this.y1 = y1;
    }

    public boolean isInRectangle(double x, double y) {
        return ((x0 <= x) & (x <= x1)) & ((y0 <= y) & (y <= y1));
    }
}
