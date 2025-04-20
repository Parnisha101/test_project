package ru.vsu.css.tupicyn.tasks.task_2025_02_17;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> nums = new MyList<>(1, -2, -33, 4, -6, -6, -8, 10, -2, -3, -8);
        System.out.println(task(nums));
    }

    public static int task(MyList<Integer> list) {
        int targetIndex = list.size() - 1;
        int targetCounter = 0;
        int counter = 0;

        for (int currentIndex = 0; currentIndex < list.size(); currentIndex++) {
            if (list.get(currentIndex) > 0) {
                for (int nextIndex = currentIndex + 1; nextIndex < list.size(); nextIndex++) {
                    if (list.get(nextIndex) < 0) counter++;
                    else break;
                }
                if (targetCounter <= counter) {
                    targetCounter = counter;
                    targetIndex = currentIndex;
                    counter = 0;
                }
            }
        }

        return list.get(targetIndex);
    }
}
