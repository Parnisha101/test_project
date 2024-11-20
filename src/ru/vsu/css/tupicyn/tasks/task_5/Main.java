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
            print_chars(line, width);
            System.out.print("\n");
            if ((mark_count % 2) == 0) {
                print_chars(space_bar, width - mark_count);
                print_chars(mark, mark_count);
                System.out.print("\n");
            } else {
                print_chars(mark, mark_count);
                print_chars(space_bar, width - mark_count);
                System.out.print("\n");
            }
        }
        print_chars(line, width);
    }
    
    public static void print_chars (char chr, int chr_count) {
        for (int i = 0; i < chr_count; i++){
            System.out.print(chr);
        }
    }
}
