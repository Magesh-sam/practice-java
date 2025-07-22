package basics;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int length = in.nextInt();

        System.out.println("Enter the numbers: ");
        int[] nums = new int[length];
        for (int i = 0; i < length; i++) {
            nums[i] = in.nextInt();
        }

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        System.out.println("Sum of Array is " + sum);
        in.close();
    }

}
