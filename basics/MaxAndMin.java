package basics;

import java.util.Arrays;
import java.util.Random;

public class MaxAndMin {
    public static void main(String[] args) {
        Random r = new Random();
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = r.nextInt(100)+1;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num:nums){
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        System.out.println(Arrays.toString(nums));
        System.out.println("Min: "+min+" Max: "+max);
    }

}
