public class DublicatedLetters {
    public static void main(String[] args) {

        System.out.println(getDublicatedLetterNumber("aabbcde"));
    }

    static int getDublicatedLetterNumber(String str){

        str = str.toLowerCase();
        String temp = "";
        String output = "";

        for (char ch:str.toCharArray()){

            // if ch is repeated it will not get into if block
            if (!temp.contains(ch+"")){
                temp += ch;

            // if ch is repeated more than once it will get into if-else block only for the first time...
            } else if (!output.contains(ch+"")){
                output += ch;
            }
        }
        return output.length();
    }

}
