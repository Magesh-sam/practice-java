package basics;

import java.util.Scanner;

public class CheckArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int userNumber = sc.nextInt();
        sc.close();
        int[] arr = { 12, 31, 53, 23, 51, 20, 75, 45, 60, 89, 94 };
        boolean isFound = false;
        for (int item : arr) {
            if (item == userNumber) {
                isFound = true;
                break;
            }
        }
        if (isFound)
            System.out.println("your number exists in the array");
        else
            System.out.println("your number does not exist in the array");
        
    }
}