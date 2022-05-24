import java.util.Random;
import java.util.Scanner;

public class FindNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int realNumber = random.nextInt(101);
        System.out.println(realNumber);
        Scanner scan = new Scanner(System.in);
        System.out.println("Please try to guess the number between 1-100");
        int guess = scan.nextInt();
        int count = 0;

        while (guess != realNumber){
            if (guess < realNumber){
                System.out.println("Your guess is lower than the real number, please try again");
                guess = scan.nextInt();
                count++;
            } else if (guess > realNumber){
                System.out.println("Your guess is higher than the real number, please try again");
                guess = scan.nextInt();
                count++;
            }
        }
        System.out.println("Congrats, you have found "+ realNumber+ " in "+ ++count + " try");

    }

//    public static void findNumber(int realNumber){
//
//
//    }


}
