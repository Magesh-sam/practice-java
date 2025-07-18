package basics;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] nums = { 1, 4, 2, 6, 3, 7 ,11};
        String[] names = { "sam", "alice", "john" };
        Arrays.sort(nums);
        Arrays.sort(names);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(names));
    }
}