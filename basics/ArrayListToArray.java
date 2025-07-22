package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ArrayListToArray {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0;i<5;i++){
            arrayList.add(r.nextInt(10)+1);
        }
        int[] arr = new int[arrayList.size()];
        for(int i=0;i<arrayList.size();i++){
            arr[i] = arrayList.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
