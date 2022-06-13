public class FighterWinner {
    public static void main(String[] args) {

        Fighter fighter1 = new Fighter();
        fighter1.setInfo("Tom", 10, 2);
        Fighter fighter2 = new Fighter();
        fighter2.setInfo("Harry", 5, 4);
        System.out.println(declareWinner(fighter1, fighter2, "Tom"));
    }

    public static String declareWinner(Fighter a, Fighter b, String firstAttacker) {
        if (firstAttacker.equals(b.name)) {
            a = b; // swap objects
            b = a;
        }
        while (true) {
            if ((b.health -= a.damagePerAttack) <= 0) {
                return a.name + " wins";  // a wins
            } else if ((a.health -= b.damagePerAttack) <= 0) {
                return b.name + " wins";  // b wins
            }
        }
    }

}
