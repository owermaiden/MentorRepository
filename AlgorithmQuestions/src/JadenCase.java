public class JadenCase {
    public static void main(String[] args) {

        System.out.println(toJadenCase2("hi my name is ower"));
    }

    public static String toJadenCase2(String givenSentence) {
        if (givenSentence == null || givenSentence.isEmpty()) {
            return "";
        }

        String result ="";
        String [] words = givenSentence.split(" ");

        for (String str : words){

            result += (str.charAt(0) + "") .toUpperCase() + str.substring(1) + " ";

        }

        return result.trim();
    }

}
