package ru.vsu.css.tupicyn.tasks.task_2025_03_16;

public class Main1 {
    public static void main(String[] args){
        MyList<String> strings = new MyList<>("a", "b", "c", "d");
        MyList<String> result = new MyList<>();
        for (String element : strings) {
            result.addFirst(element);
        }
        strings = result;
        System.out.println(strings);
    }
}
