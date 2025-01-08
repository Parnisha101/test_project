package ru.vsu.css.tupicyn.tasks.task_10;

import java.util.ArrayList;
import java.util.List;

public class Box {
    private final String boxName;
    private final int width;
    private final int length;
    private final int height;

    public Box(String boxName, int width, int length, int height) {
        this.boxName = boxName;
        this.width = width;
        this.length = length;
        this.height = height;
    }

    @Override
    public String toString() {
        return boxName;
    }
    
    public boolean isCompatible(Box otherBox) {
        var thisBoxList = new ArrayList<>(List.of(this.height, this.width, this.length));
        thisBoxList.sort(null);
        var otherBoxList = new ArrayList<>(List.of(otherBox.height, otherBox.width, otherBox.length));
        otherBoxList.sort(null);

        for (int i = 0; i < 3; i++) {
            if (thisBoxList.get(i) <= otherBoxList.get(i)) {
                return false;
            }
        }
        return true;
    }
}
