import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraylistDemo {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        Integer[] numbers2 = {40,60,30,80};
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers);

        System.out.println("numbers.get(2) = " + numbers.get(2));

        System.out.println("numbers.indexOf(20) = " + numbers.indexOf(20));

        System.out.println("numbers.contains(10) = " + numbers.contains(10));

        numbers.remove(2);
        System.out.println(numbers);

        numbers.clear();
        System.out.println("numbers = " + numbers);

        numbers.addAll(List.of(numbers2));
        System.out.println(numbers);

        // how to convert Arraylist to Array
        Integer[] convertedNumbers = numbers.toArray(new Integer[3]);
        System.out.println(Arrays.toString(convertedNumbers));

        // How to sort Arraylist...
        Collections.sort(numbers);
        System.out.println("sorted numbers "+numbers);

        // Frequency
        List<Integer> freqNumbers = new ArrayList<>(Arrays.asList(10,20,20,30,40,40));
        for(Integer each : freqNumbers){
            if( Collections.frequency(freqNumbers, each) == 1){
                System.out.println("each = " + each);
            }
        }

        // homework
        numbers.removeIf(number -> number == 60);
        numbers.ensureCapacity(100);

    }
}
