package basics;

import java.util.HashSet;

public class IntersectionOfStrArr {
    public static void main(String[] args) {
        String[] names1 = { "magesh", "sam" };
        String[] names2 = { "kannan", "sam" };
        HashSet<String> set = new HashSet<>();
        HashSet<String> intersectionSet = new HashSet<>();
        for (String name : names1) {
            set.add(name);
        }
        for (String name : names2) {
            if (set.contains(name))
                intersectionSet.add(name);
        }
        System.out.println("Intersection from arr of strings: "+intersectionSet.toString());
    }
}
