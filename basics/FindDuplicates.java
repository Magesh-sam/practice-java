package basics;

import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 3, 4, 2, 5, 3, 4, 6, 7, 8, 9 };
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicateSet = new HashSet<>();
        
        for (int num : arr) {
            if (set.contains(num)) {
                duplicateSet.add(num);
            } else {
                set.add(num);
            }
        }
        System.out.println("Duplicates: " + duplicateSet.toString());
    }
}
