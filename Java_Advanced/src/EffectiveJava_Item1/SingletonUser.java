package EffectiveJava_Item1;

public class SingletonUser {

    private static volatile SingletonUser instance = null;

    private String name;
    private String email;
    private String country;

    private SingletonUser(String name, String email, String country) {
        this.name = name;
        this.email = email;
        this.country = country;
    }

    // getters - setters

    public static SingletonUser getSingletonInstance(String name, String email, String country) {
        if (instance == null) {
            synchronized (User.class) {
                if (instance == null) {
                    instance = new SingletonUser(name, email, country);
                }
            }
        }
        return instance;
    }
}
