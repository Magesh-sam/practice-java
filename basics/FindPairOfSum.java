package basics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class FindPairOfSum {
    public static void main(String[] args) {
        Random r = new Random();
        HashSet<String> sumPairArr = new HashSet<>();
        int[] arr = new int[10];
        int targetSum = 6;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(5) +1;
        }
        System.out.println("Generated Array: "+Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==targetSum){
                    sumPairArr.add(arr[i]+"-"+arr[j]);
                }
            }
        }
        System.out.println(sumPairArr.toString());
    }
}
