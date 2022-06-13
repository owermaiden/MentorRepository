package Refactor_Lab;

public class RefactoredThiefFoxV2 {

    public static void main(String[] args) {

        Fox fox1 = new Fox();
        fox1.setInfo(true,true, "BLACK",0);

        Fox fox2 = new Fox();
        fox2.setInfo(true,true,"BLACK",2);

        Fox fox3 = new Fox();
        fox3.setInfo(true,true,"BLACK",3);

        Fox fox4 = new Fox();
        fox4.setInfo(false,true,"GRAY",3);


        printFoxStatus(fox1, "\uD83E\uDD8A Fox1 is one of suspects! \uD83E\uDD14", "\uD83E\uDD8A Fox1 cleared of charges!");

        printFoxStatus(fox2, "\uD83E\uDD8A Fox2 is one of suspects! \uD83E\uDD14", "\uD83E\uDD8A Fox2 cleared of charges!");

        printFoxStatus(fox3, "\uD83E\uDD8A Fox3 is one of suspects! \uD83E\uDD14", "\uD83E\uDD8A Fox3 cleared of charges!");

        printFoxStatus(fox4, "\uD83E\uDD8A Fox4 is one of suspects! \uD83E\uDD14", "\uD83E\uDD8A Fox4 cleared of charges!");

    }

    private static void printFoxStatus(Fox fox, String s, String s2) {
        if (isSuspect(fox)) {
            System.out.println(s);
        } else {
            System.out.println(s2);
        }
    }

    public static boolean isSuspect(Fox fox){
        return fox.isWearCoat && fox.coatColor.equals("BLACK") && fox.hasATorch && fox.bagCount == 3;

    }
}

