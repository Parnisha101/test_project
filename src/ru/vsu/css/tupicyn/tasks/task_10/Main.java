package ru.vsu.css.tupicyn.tasks.task_10;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Box box100 = new Box("box100",100, 100, 100);
        Box box50 = new Box("box50",50, 50, 50);
        Box box20 = new Box("box20",20, 20, 20);
        Box box20_30_20 = new Box("box20_30_20",20, 30, 20);
        Box box25_10_10 = new Box("box25_10_10", 25, 10, 10);
        var boxes = List.of(box20_30_20, box20, box100, box50, box25_10_10);

        var result = getCompatibleBoxes(boxes);

        var stringBuilder = new StringBuilder();
        for (var combination : result) {
            stringBuilder.append(MessageFormat.format("[{0}, {1}]\n", combination.get(0), combination.get(1)));
        }

        System.out.println(stringBuilder);
    }

    public static List<List<Box>> getCompatibleBoxes(List<Box> boxList) {
        List<List<Box>> result = new ArrayList<>();

        for (int i = 0; i < boxList.size(); i++) {
            for (int j = 0; j < boxList.size(); j++) {
                if (j == i) {
                    continue;
                }
                if (boxList.get(i).isCompatible(boxList.get(j))) {
                    var combo = new ArrayList<Box>();
                    combo.add(boxList.get(i));
                    combo.add(boxList.get(j));
                    result.add(combo);
                }
            }
        }
        return result;
    }
}



