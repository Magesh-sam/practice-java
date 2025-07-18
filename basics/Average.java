package basics;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers (separated by space): ");
        String[] numbers = sc.nextLine().split(" ");
        double sum = 0;
        for (String number : numbers) {
            sum += Double.parseDouble(number);
        }
        double average = sum / numbers.length;
        System.out.println("Average: " + average);
        sc.close();
    }
}