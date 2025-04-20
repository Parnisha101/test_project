package ru.vsu.css.tupicyn.tasks.task_2025_03_16;

import java.util.LinkedList;
import java.util.List;

public class Main2 {
    public static void main(String[] args){
        LinkedList<String> strings = new LinkedList<>(List.of("a", "b", "c", "d"));
        LinkedList<String> result = new LinkedList<>();
        for (String element : strings) {
            result.addFirst(element);
        }
        strings = result;
        System.out.println(strings);
    }
}
