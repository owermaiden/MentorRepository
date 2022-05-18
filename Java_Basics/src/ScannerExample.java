import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        Scanner scanMe = new Scanner(System.in);
        String name, lastName;
        System.out.println("Please write your name:");
        name = scanMe.next();
        //name = scanMe.nextLine();
        System.out.println("Please write your last name:");
        lastName = scanMe.nextLine();
        System.out.print(name + " ups " + lastName);

    }
}
