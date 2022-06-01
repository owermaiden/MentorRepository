public class NestedForLoop {

    public static void main(String[] args) {

        String something = "Korshad";

        for (int i = 0; i < something.length(); i++) {

            for (int j = 0; j < something.length(); j++) {
                System.out.print("*"); // 3
                System.out.println("0"); // 2
            }
        }
    }
}
