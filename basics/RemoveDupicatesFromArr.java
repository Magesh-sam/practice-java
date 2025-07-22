package basics;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDupicatesFromArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,4,5,6};
        HashSet<Integer> set = new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        System.out.println(Arrays.toString(set.toArray()));
    }
}
