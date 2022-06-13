public class JadenCase {
    public static void main(String[] args) {

        System.out.println(toJadenCase2("hi my name is ower"));
    }

    public static String toJadenCase2(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return "";
        }
        String result ="";
        String [] strings = phrase.split(" ");
        for (String str : strings){
            result += (str.charAt(0) + "") .toUpperCase() + str.substring(1) + " ";
        }
        return result.trim();
    }

}
