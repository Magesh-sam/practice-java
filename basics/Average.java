package basics;

import java.util.Scanner;

public class Average {

    public static double sum(double[] nums) {
        double sum = 0;
        for (double num : nums) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int length = in.nextInt();

        System.out.println("Enter the numbers: ");
        double[] nums = new double[length];
        for (int i = 0; i < length; i++) {
            nums[i] = in.nextDouble();
        }

        double average = sum(nums) / nums.length;
        System.out.println("Average of an array is: " + average);
        in.close();
    }
}