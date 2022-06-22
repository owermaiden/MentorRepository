import java.util.ArrayList;

public class ReverseWords {

    public static void main(String[] args) {
        System.out.println(reverseWords("hello my name is ower"));

    }

    public static String reverseWords(String given){

        var wordsArray = given.split(" ");
        var resultString = new StringBuilder();

        for (int i = wordsArray.length -1 ; i >= 0; i--){
            resultString.append(wordsArray[i]).append(" ");
        }
        return resultString.toString();
    }
}
