package basics;

public class SumOfArray {
    public static void main(String[] args) {
        int[] nums = {2,4,1,4,6,8,4,7,23,12,4};
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        System.out.println("Sum of Array is "+sum);
    }
}
