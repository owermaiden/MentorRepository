package staticKeyword;


import java.util.ArrayList;
import java.util.List;

public class Car {
    private String name;
    private String engine;

    // static fields
    public static int numberOfCars;
    public static List<String> models = new ArrayList<>();

    // static block
    static {

        // maybe we need a logic to instantiate static variables other than decleration...
        if (models.size() > 2){
            models.add("Honda");
        }
        models.add("Jaguar");
        models.add("Crysler");
    }

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }

    // static method
    public static void setNumberOfCars(int numberOfCars) {
        Car.numberOfCars = numberOfCars;
    }

    /*
        - static methods in Java are resolved at compile time. Since method overriding is part of Runtime Polymorphism,
        - static methods can't be overridden.
        - Abstract methods can't be static.
        - Static methods can't use this or super keywords.
        - The following combinations of the instance, class methods and variables are valid:
            - Instance methods can directly access both instance methods and instance variables.
            - Instance methods can also access static variables and static methods directly.
            - Static methods can access all static variables and other static methods.
            - Static methods can't access instance variables and instance methods directly. They need some object reference to do so.
     */

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
}


