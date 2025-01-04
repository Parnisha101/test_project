package ru.vsu.css.tupicyn.tasks.task_8;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        int[][] month = MonthOfYear(11, 2025);
        for (int i = 0; i < month.length; i++) {
            System.out.println(Arrays.toString(month[i]));
        }
    }

    public static int[][] MonthOfYear(int month, int year) {
        Calendar calendar = new GregorianCalendar(year, month - 1, 0);
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        int weekCount = (int) Math.ceil((double) (firstDayOfWeek + daysInMonth) /7);
        int[][] calendarArray = new int[weekCount][7];

        for (int i = 0; i < weekCount; i++) {
            for (int j = 0; j < 7; j++) {
                calendarArray[i][j] = 0;
            }
        }

        int dayCounter = 1;
        for (int i = 0; i < weekCount && dayCounter <= daysInMonth; i++) {
            for (int j = firstDayOfWeek; j < 7 && dayCounter <= daysInMonth; j++, dayCounter++) {
                calendarArray[i][j] = dayCounter;
            }
            firstDayOfWeek = 0;
        }

        Calendar calendar1 = month == 1
                ? new GregorianCalendar(year-1, Calendar.DECEMBER, 0)
                : new GregorianCalendar(year, month - 1, 0);

        int replacement = calendar1.getActualMaximum(Calendar.DAY_OF_MONTH);
        for (int i = 5; i >= 0; i--) {
            if (calendarArray[0][i] == 0) {
                calendarArray[0][i] = replacement;
                replacement--;
            }
        }
        replacement = 1;
        for (int i = 0; i < 7; i++) {
            if (calendarArray[weekCount-1][i] == 0) {
                calendarArray[weekCount-1][i] = replacement;
                replacement++;
            }
        }

        return calendarArray;
    }
}
