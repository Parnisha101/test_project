package ru.vsu.css.tupicyn.tasks.task_5;

import java.io.Console;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();
        function(width);
    }

    public static void function(int width) {
        char line = '_';
        char mark = '!';
        char space_bar = ' ';
        for (int mark_count = width; mark_count >= 0; mark_count--) {
            for (int i = 0; i < width; i++) {
                System.out.print(line);
            }
            System.out.print("\n");
            if ((mark_count % 2) == 0) {
                for (int i = 0; i < (width - mark_count); i++){
                    System.out.print(space_bar);
                }
                for (int i = 0; i < mark_count; i++){
                    System.out.print(mark);
                }
                System.out.print("\n");
            } else {
                for (int i = 0; i < mark_count; i++){
                    System.out.print(mark);
                }
                for (int i = 0; i < (width - mark_count); i++){
                    System.out.print(space_bar);
                }
                System.out.print("\n");
            }
        }
        for (int i = 0; i < width; i++) {
            System.out.print(line);
        }
    }
}
