import java.util.*;

public class highestAndLowest {

    public static void main(String[] args) {
        System.out.println(highestAndLowest("23947239573090"));
    }

    public static String highestAndLowest(String str){

        String[] strings = str.split("");

        ArrayList<Integer> list = new ArrayList<>();
        for (String s : strings) {
            list.add(Integer.valueOf(s));
        }
        return Collections.max(list) + " " + Collections.min(list);

    }
}
