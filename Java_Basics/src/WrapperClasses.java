import java.util.ArrayList;

public class WrapperClasses {

    public static void main(String[] args) {

        // Autoboxing Example--------------------------------------------
        char ch = 'a';

        // Autoboxing- primitive to Character object conversion
        Character a = ch;

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        // Autoboxing because ArrayList stores only objects
        arrayList.add(30);

        // printing the values from object
        System.out.println("AutoBoxed number = " + arrayList.get(0));

        // Unboxing Example--------------------------------------------------

        // creates objects of wrapper class
        Integer aObj = Integer.valueOf(23);
        Double bObj = Double.valueOf(5.55);

        // converts into primitive types
        int c = aObj.intValue();
        double d = bObj.doubleValue();

        System.out.println("The value of c: " + c);
        System.out.println("The value of d: " + d);

        // Convert String to Integer----------------------------------------------------------
        String number = "100";
        System.out.println("numberConverted = " + Integer.parseInt(number));

        String number2 = "55";
        System.out.println("convertedNumber = " + Integer.valueOf(number2));

        // Convert Integer to String---------------------------------------------------------
        Integer number3 = 44;
        System.out.println("ConvertedToString = "+ number3.toString());
    }
}
