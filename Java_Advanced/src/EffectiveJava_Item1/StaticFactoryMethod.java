package EffectiveJava_Item1;

public class StaticFactoryMethod {

    public static void main(String[] args) {

        /*
        Consider static factory methods instead of constructors.
         */

    User user1 = new User();
        System.out.println("user1 = " + user1);

    User user2 = new User("Canada");
        System.out.println("user2 = " + user2);

    User user3 = new User("Ower", "ower@gmail.com", "USA");
        System.out.println("user3 = " + user3);


    User ower = User.createWithDefaultCountry("ower", "ower@gmail.com");
    User hasan = User.createWithDefaultCountry("hasan", "hasan@gmail.com");
    User boban = User.createWithDefaultCountry("boban", "boban@gmail.com");
        System.out.println("ower = " + ower);
        System.out.println("hasan = " + hasan);
        System.out.println("boban = " + boban);

    User user = User.createWithLoggedInstantiationTime("John", "john@domain.com", "Argentina");
        System.out.println("user = " + user);

    SingletonUser singletonUser = SingletonUser.getSingletonInstance("John", "john@domain.com", "France");
        System.out.println("singletonUser = " + singletonUser);


    }
}
