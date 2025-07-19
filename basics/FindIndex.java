package basics;

import java.util.Scanner;

public class FindIndex {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int userNumber = sc.nextInt();
        boolean isFound = false;
        int index = -1;
        sc.close();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == userNumber) {
                isFound = true;
                index = i;
                break;
            }
        }
        if (isFound)

        System.out.println("Item found at index: " + index);
        else
        System.out.println("Item not found!!!");
    }
}
