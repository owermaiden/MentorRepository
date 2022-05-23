public class Loops {
    public static void main(String[] args) {
        String name = "John Doe";

        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }

        int x = 0;  // we need an external iterator...
        do {
            System.out.println(name.charAt(x++));
        } while (x < name.length());

        int z = 0;
        while (z < name.length()){
            System.out.println(name.charAt(z++));
        }
    }


}
