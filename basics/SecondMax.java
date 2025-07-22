package basics;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1 };
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                secondMax = num;
            }
        }
        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("Second maximum does not exist.");
        } else {
            System.out.println("Second max: " + secondMax);
        }
    }
}
