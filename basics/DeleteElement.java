package basics;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        boolean isAvailable = false;
        int index = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to delete");
        int userNumber = sc.nextInt();
        sc.close();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == userNumber) {
                isAvailable = true;
                index = i;
                break; 
            }
        }

        if (isAvailable) {
            int[] newArr = new int[arr.length - 1];
            int j = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i == index) continue;
                newArr[j++] = arr[i];
            }
            System.out.println(Arrays.toString(newArr));
        } else {
            System.out.println(userNumber + " not found in the array");
        }
    }
}
