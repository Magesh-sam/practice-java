package basics;

public class FindMissingNum {
    public static int checkMissingNumber(int[] arr) {
        int i = 0;
        int j = 1;
        int missingNum = -1;
        while (j < arr.length) {
            if (arr[i] + 1 != arr[j]) {
                missingNum = arr[i] + 1;
                break;
            }
            i++;
            j++;
        }
        return missingNum;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 5 };
        int[] nums2 = { 1, 2, 3,4, 5 };
        int missingNum1 = checkMissingNumber(nums1);
        int missingNum2 = checkMissingNumber(nums2);
        if (missingNum1 == -1) {
            System.out.println("There is no missing number");
        } else {
            System.out.println("missing number is " + missingNum1);
        }
        if (missingNum2 == -1) {
            System.out.println("There is no missing number");
        } else {
            System.out.println("missing number is " + missingNum1);
        }
    }
}
