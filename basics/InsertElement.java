package basics;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 6, 7, 8 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index to insert: ");
        int index = sc.nextInt();
        System.out.print("Enter the number to insert: ");
        int number = sc.nextInt();
        sc.close();
        if (index <= arr.length) {
            int[] newArr = new int[arr.length + 1];
            int j = 0;
            for (int i = 0; i < arr.length + 1; i++) {
                if (i == index) {
                    newArr[i] = number;
                } else {
                    newArr[i] = arr[j++];
                }
            }
            System.out.println(Arrays.toString(newArr));
        } else {

            System.out.println("Can't insert the element at the index " + index);
        }
    }
}
