package basics;

import java.util.ArrayList;

public class ArrayToArrayList {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int num:arr){
            arrayList.add(num);
        }
        System.out.println(arrayList);
    }
}
