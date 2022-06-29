package equalsHascode;

public class EqualsHashcodeTest {

    public static void main(String[] args) {

        EqualsHashcodeTest cruequalsHashcodeTestTest = new EqualsHashcodeTest();
        Number one = new Number(1);
        Number two = new Number(1);
        cruequalsHashcodeTestTest.test1(one, two);

        Number three = new Number(1);
        Number four = new Number(2);
        cruequalsHashcodeTestTest.test2(three, four);
    }

    public void test1(Number one, Number two) {
        if (one.equals(two)) {
            System.out.println("Test1: One and Two are equal");
        } else {
            System.out.println("Test1: One and Two are not equal");
        }
    }

    public void test2(Number three, Number four) {
        if (three.equals(four)) {
            System.out.println("Test2: Three and Four are equal");
        } else {
            System.out.println("Test2: Three and Four are not equal");
        }
    }

    /*
        if a class overrides equals, it must override hashCode
        when they are both overridden, equals and hashCode must use the same set of fields
        if two objects are equal, then their hashCode values must be equal as well
        if the object is immutable, then hashCode is a candidate for caching and lazy initialization

        the equals() method must be reflexive, symmetric, transitive, consistent, and any non-null reference must return false.

         // reflexive property
         assertTrue( a.equals(a) );

         // symmetric property
         assertTrue( a.equals(b) == b.equals(a) );

         // transitive property
         if ( a.equals(b) && b.equals(c) ) {
           assertTrue( a.equals(c) );
         }

         // consistency property
         assertTrue( a.equals(b) == a.equals(b) );

         // non-null property
         assertFalse( a.equals(null) );
     */
}