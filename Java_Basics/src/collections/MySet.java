package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MySet {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);

        System.out.println(set);

        var set2 = new HashSet<Integer>();

        set2.addAll(set);
        System.out.println(set2);

        System.out.println(Arrays.toString(set.toArray()));

        Integer[] numbers = set2.toArray(new Integer[0]);
        System.out.println(Arrays.toString(numbers));
    }
}
