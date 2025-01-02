package ru.vsu.css.tupicyn.tasks.task_7;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // testArray заменить на любой другой массив при тесте
        int[] testArray = new int[] {3, 3, 4, 8, 8, 10, 7, 4,
                10, 7, 7, 4, 3, 3, 8, 9, 1};
        System.out.println(Arrays.toString(solution(testArray)));
    }

    public static int[] solution(int[] nums) {
        int pit_first = 0;
        int pit_last = 0;
        int pit_first_max = 0;
        int pit_last_max = 0;
        int pit_len = 0;
        int pit_len_max = 0;
        for (int num_current = 0; num_current < nums.length-1; num_current++) {
            int num_next = num_current + 1;
            if (num_next == nums.length-1) {
                pit_last = num_next;
                pit_len = pit_last - pit_first;
                if (pit_len_max < pit_len) {
                    pit_len_max = pit_len;
                    pit_first_max = pit_first;
                    pit_last_max = pit_last;
                }
            }
            if (nums[num_current] < nums[num_next]) {
                if (nums[num_next] > nums[num_next+1]) {
                    pit_last = num_next;
                    pit_len = pit_last - pit_first;
                    if (pit_len_max < pit_len) {
                        pit_len_max = pit_len;
                        pit_first_max = pit_first;
                        pit_last_max = pit_last;
                    }
                    pit_first = num_next;
                }
            }
        }
        int len = pit_last_max - pit_first_max + 1;
        int[] pit = new int[len];
        System.arraycopy(nums, pit_first_max, pit, 0, len);
        return pit;
    }
}
