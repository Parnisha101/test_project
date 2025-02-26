package ru.vsu.css.tupicyn.tasks.task_2025_05;

import java.text.MessageFormat;

public class Triangle {
    private Point point1;
    private Point point2;
    private Point point3;

    public Triangle (Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    @Override
    public String toString() {
        return MessageFormat.format("[{0}, {1}, {2}]", point1, point2, point3);
    }

    public Point getPointN (int n) {
        if (n == 1) return point1;
        if (n == 2) return point2;
        if (n == 3) return point3;
        throw new RuntimeException("non-existent point");
    }

    public void setPointN (Point point, int n) {
        if (n == 1) this.point1 = point;
        if (n == 2) this.point2 = point;
        if (n == 3) this.point3 = point;
    }

    private double getSideLength (Point point1, Point point2) {
        double x1 = point1.getX(); double y1 = point1.getY();
        double x2 = point2.getX(); double y2 = point2.getY();

        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public double getPerimetr () {
        double side12 = getSideLength(point1, point2);
        double side23 = getSideLength(point2, point3);
        double side13 = getSideLength(point1, point3);

        return side12 + side23 + side13;
    }

    public double getSpace () {
        double x1 = point1.getX(); double y1 = point1.getY();
        double x2 = point2.getX(); double y2 = point2.getY();
        double x3 = point3.getX(); double y3 = point3.getY();

        return 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
    }

    public boolean isInTriangle (Point point) {
        double xP = point.getX(); double yP = point.getY();
        double x1 = point1.getX(); double y1 = point1.getY();
        double x2 = point2.getX(); double y2 = point2.getY();
        double x3 = point3.getX(); double y3 = point3.getY();

        double barCorDenom = (y2 - y3) * (x1 - x3) + (x3 - x2) * (y1 - y3);
        double barCor1 = ((y2 - y3) * (xP - x3) + (x3 - x2) * (yP - y3)) / barCorDenom;
        if (barCor1 < 0) return false;

        double barCor2 = ((y2 - y1) * (xP - x3) + (x1 - x3) * (yP - y3)) / barCorDenom;
        if (barCor2 < 0) return false;

        double barCor3 = 1 - barCor1 - barCor2;
        return !(barCor3 < 0);
    }

}
