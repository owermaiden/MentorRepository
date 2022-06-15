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

        System.out.println("Sorted numbers3 " + Arrays.toString(numbers3));

        String[] names2 = {"Carol", "Bob", "Alice", "John", "Tim", "Kate", "Mary"};
        Arrays.sort(names2);

        System.out.println("Array sorted: " + Arrays.toString(names2));

        System.out.println("-----------------------------------------------");

        // How to compare 2 arrays if they are equal or not?

        int[] numbers4 = { 1, 2, 3 };
        int[] numbers5 = { 4, 5, 6 };
        System.out.println(Arrays.equals(numbers4, numbers5)); //false
        int[] numbers6 = { 1, 2, 3 };
        System.out.println(Arrays.equals(numbers4, numbers6)); //true


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
        System.out.println("Arrays.deeptoString(a) = " + Arrays.deepToString(a));

        System.out.println("-----------------------------------------------");

        // how to convert an Array to an Arraylist
            // String[] names = {"ermek", "boban", "aseel", "evgenia", "dilibaer", "hasan", "kurshad", "beyza"};
            // Method-1
            ArrayList<String> otherMethod = new ArrayList<>(Arrays.asList(names));
            System.out.println("Method-1 "+otherMethod);

            // Method 2
            ArrayList<String> list1 = new ArrayList<String>();
            Collections.addAll(list1, names);
            System.out.println("Method-2 "+list1);

            // Method 3
            ArrayList<String> list2 = new ArrayList<String>();
            for(String text : names) {
                list2.add(text);
            }
            System.out.println("Method-3 "+list2);

            //Method 4
            List<String> convertToArraylist = Arrays.asList(names);
            System.out.println("Method-4 "+convertToArraylist);

            //Method-5
            List<String> convertToArraylist2 = List.of(names);
            System.out.println("Method-5 "+convertToArraylist2);

        System.out.println("-----------------------------------------------");

        // Search something in Array
        // int numbers2[] = {1,2,3,4,5,6,7,8,9};
        var result = Arrays.binarySearch(numbers2, 5);
        var noItem = Arrays.binarySearch(numbers2, 66);
        System.out.println(result+ " is the index of searched item with binary search...");
        System.out.println(noItem+ " here binary search gives negative number because no matches found...");

        //String[] names2 = {"Carol", "Bob", "Alice", "John", "Tim", "Kate", "Mary"};
        int foundIndex = Arrays.binarySearch(names2, "Mary");
        System.out.println("Mary found at: " + foundIndex);

        int i = 0;
        for(String name : names2){
            if (name.equalsIgnoreCase("Mary")){
                System.out.println("Mary is found " + i);
            }
            i++;
        }

    }
}
