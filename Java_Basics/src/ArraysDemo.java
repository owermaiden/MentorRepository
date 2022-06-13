import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysDemo {

    public static void main(String[] args) {

        // decleration types...
        int[] numbers1 = {1,2,3,4,5,6,7,8,9};
        int numbers2[] = {1,2,3,4,5,6,7,8,9};
        var numbers3 = new int[]{9,8,7,6,5,4,3,2,1};
        Integer[] numbersWrapped = {1,2,3,4,5,6};
        String[] names = {"ermek", "boban", "aseel", "evgenia", "dilibaer", "hasan", "kurshad", "beyza"};

        // how to iterate arrays
        for (int i = 0; i < numbers1.length; i++) {
            System.out.println("for loop prints this -> "+numbers1[i]);
        }

        System.out.println("-----------------------------------------------");

        for (int nbr : numbers1){
            System.out.println("for each loop prints this -> "+nbr);
        }

        System.out.println("-----------------------------------------------");

        // how to sort an array
        Arrays.sort(numbers3);
        for (int nbr: numbers3) {
            System.out.println("sorted array printed here -> "+ nbr);
        }

        System.out.println("-----------------------------------------------");

        System.out.println("Arrays.toString(numbers3) = " + Arrays.toString(numbers3));

        System.out.println("-----------------------------------------------");

        // 2-Dimentional Array
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6, 9},
                {7},
        };

        // calculate the length of each row
        System.out.println("Length of row 1: " + a[0].length);
        System.out.println("Length of row 2: " + a[1].length);
        System.out.println("Length of row 3: " + a[2].length);

        System.out.println("-----------------------------------------------");

        // How to print an array to console
        System.out.println("Arrays.toString(numbers3) = " + Arrays.toString(a));

        System.out.println("-----------------------------------------------");

        // how to convert an Array to an Arraylist

        // Method-1
        List<String> convertToArraylist = Arrays.asList(names);
        System.out.println(convertToArraylist);

        List<String> convertToArraylist2 = List.of(names);
        System.out.println(convertToArraylist2);

        // Method 2
        List<String> list1 = new ArrayList<String>();
        Collections.addAll(list1, names);
        System.out.println(list1);

        // Method 3
        List<String> list2 = new ArrayList<String>();
        for(String text : names) {
            list2.add(text);
        }
        System.out.println(list2);

        System.out.println("-----------------------------------------------");

        // Search something in Array
        // int numbers2[] = {1,2,3,4,5,6,7,8,9};
        var result = Arrays.binarySearch(numbers2, 5);
        var noItem = Arrays.binarySearch(numbers2, 12);
        System.out.println(result+ " is the index of searched item with binary search...");
        System.out.println(noItem+ " here binary search gives negative number because no matches found...");



    }
}
