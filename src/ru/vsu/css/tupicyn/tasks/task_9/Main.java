package ru.vsu.css.tupicyn.tasks.task_9;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        var weights = List.of(1, 2, 3, 4, 5, 6);
        int sumWeight = 6;

        var result = selectionCount(weights, sumWeight);

        var stringBuilder = new StringBuilder();
        for (var combination : result) {
            stringBuilder.append(MessageFormat.format("[{0}, {1}]\n", combination.get(0), combination.get(1)));
        }

        System.out.println(stringBuilder);
    }

    public static List<List<Integer>> selectionCount(List<Integer> weights, int sumWeight) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < weights.size(); i++) {
            for (int j = i + 1; j < weights.size(); j++) {
                //Для вывода повторяющихся вариантов вроде 1-2 2-1 нужно j=i+1 заменить j=0
                //Раскомментировать if
                /*
                if (j == i) {
                    continue;
                }
                */

                if (weights.get(i) + weights.get(j) == sumWeight) {
                    var combo = new ArrayList<Integer>();
                    combo.add(weights.get(i));
                    combo.add(weights.get(j));
                    result.add(combo);
                }
            }
        }
        return result;
    }
}
