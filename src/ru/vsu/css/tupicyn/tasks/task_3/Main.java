package ru.vsu.css.tupicyn.tasks.task_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            System.out.println(getColor(x, y));
        }
    }

    public static final HorizontalParabola yellowParabola = new HorizontalParabola(-3.0, -4.0, 1);
    public static final Parabola grayParabola = new Parabola(3.0, 1.0, 1);
    public static final Rectangle mainRectangle = new Rectangle(-3.0, 5.0, -1.0, 8.0);
    public static final Rectangle secondaryRectangle = new Rectangle(-3.0, 4.0, 0.0, 7.0);
    public static final Rectangle shittyRctnglCrssngEvrthng = new Rectangle(1, 3, -3, 2);
    public static final Rectangle specialZoneDown = new Rectangle(-3.0, 0.0, -1.0, 0.0);
    public static final Rectangle specialZoneUp = new Rectangle(-3.0, 4.0, 8.0, 9.0);

    public static SimpleColor getColor(double x, double y) {
        boolean inSRCE = shittyRctnglCrssngEvrthng.isInRectangle(x, y);
        boolean inYellowParabola = yellowParabola.isInParabola(x, y);
        boolean inGrayParabola = grayParabola.isInParabola(x, y);
        boolean inMainRectangle = mainRectangle.isInRectangle(x, y);
        boolean inSecondaryRectangle = secondaryRectangle.isInRectangle(x, y);
        boolean inSpecialZoneDown = specialZoneDown.isInRectangle(x, y);
        boolean inSpecialZoneUp = specialZoneUp.isInRectangle(x, y);

        if (inSpecialZoneDown) return SimpleColor.GREEN;
        if (inSpecialZoneUp) return SimpleColor.ORANGE;
        if (inYellowParabola & !inSRCE) {
            return SimpleColor.YELLOW;
        }
        if (inSRCE) {
            if (inYellowParabola) {
                return SimpleColor.ORANGE;
        } else if (inMainRectangle) {
                if (inSecondaryRectangle) {
                    if (inGrayParabola) {
                        return SimpleColor.ORANGE;
                    } else {
                        return SimpleColor.GRAY;
                    }
                } else {
                    return SimpleColor.GREEN;
                }
            } else return SimpleColor.GREEN;
        }
        if (inMainRectangle & inSecondaryRectangle & inGrayParabola) return SimpleColor.BLUE;
        if (inMainRectangle & inSecondaryRectangle & (x < 3)) {
            return SimpleColor.GREEN;
        } else if (inMainRectangle & inSecondaryRectangle) {
            return SimpleColor.ORANGE;
        }
        if (inMainRectangle) return SimpleColor.YELLOW;
        if (inGrayParabola) return SimpleColor.GRAY;
        if ((x > 2) & (y > -2)) return SimpleColor.WHITE;
        return SimpleColor.ORANGE;
    }
}
