package basics;

public class CheckTwoArrayEqual {
    public static boolean isEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length)
            return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEqual(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length)
            return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!(arr1[i].equals(arr2[i]))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 1, 2, 3 };
        int[] arr3 = { 4, 5, 6 };
        String[] names1 = { "magesh", "kannan" };
        String[] names2 = { "magesh", "kannan" };
        String[] names3 = { "magesh", "sam" };
        System.out.println("is arr1 equal to arr2 :" + isEqual(arr1, arr2));
        System.out.println("is arr1 equal to arr3 :" + isEqual(arr1, arr3));
        System.out.println("is names1 equal to names2 :" + isEqual(names1, names2));
        System.out.println("is names1 equal to names3 :" + isEqual(names1, names3));
    }
}
