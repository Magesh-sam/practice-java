package basics;

import java.util.HashSet;

public class FindDuplicateStrings {
    public static void main(String[] args) {
        String[] arr = {"hello","hi","hello","welclome","hi"};
        HashSet<String> set = new HashSet<>();
        HashSet<String> Dset = new HashSet<>();
        for(String item:arr){
            if(set.contains(item)){
                Dset.add(item);
            }else{
                set.add(item);
            }
        }
        System.out.println("Duplicates: "+Dset.toString());
    }
}
