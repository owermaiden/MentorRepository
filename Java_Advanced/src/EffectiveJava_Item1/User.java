package EffectiveJava_Item1;

import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;

public class User {

    private static final Logger LOGGER = Logger.getLogger(User.class.getName());
    private String name;
    private String email;
    private String country;

    // Constructor
    public User() {
    }

    public User(String country) {
        this.country = country;
    }

    public User(String name, String email, String country) {
        this.name = name;
        this.email = email;
        this.country = country;
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.country = "Canada";
    }

    // Static Factory Method
        // Use meaningful name and default variables
    public static User createWithDefaultCountry(String name, String email) {
        return new User(name, email, "Argentina");
    }

        // move some business logic out of constructors...
    public static User createWithLoggedInstantiationTime(
            String name, String email, String country) {
        LOGGER.log(Level.INFO, "Creating User instance at : {0}", LocalTime.now());
        return new User(name, email, country);
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
