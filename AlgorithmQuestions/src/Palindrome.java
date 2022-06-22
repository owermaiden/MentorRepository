import java.util.ArrayList;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome("carac"));
        System.out.println(getPalindromes(new String[]{"hi", "myym", "carra", "palilap"}));
    }

    static ArrayList<String> getPalindromes(String[] array){

        ArrayList<String> result = new ArrayList<>();

        for (String s : array) {
            //call the method you have created for question-1
            if(isPalindrome(s)){
             result.add(s);
             }
        }
        return result;
    }

    static boolean isPalindrome(String str){

        if (str.isBlank()){
            return true;
        }

        str = str.toLowerCase().replace(" ", "");
        int strLength = str.length();
        for (int i = 0, j = strLength-1; i < strLength/2; i++, j--) {
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }

            //     c a r a c
            //       |   |
        }
        return true;
    }
}
