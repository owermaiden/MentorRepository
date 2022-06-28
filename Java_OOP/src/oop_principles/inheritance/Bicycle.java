package oop_principles.inheritance;

public class Bicycle {
    // the Bicycle class has two fields
    public int gear;
    public int speed;

    // Bicycle Class has one static field
    public static int numberOfBicycles;

    // the Bicycle class has one constructor
    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
        // We can call static method from constructors
        increaseNumberOfBicycles();
    }

    // the Bicycle class has three instance methods
    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    // toString() method to print info of Bicycle
    public String toString() {
        return ("No of gears are " + gear + "\n"
                + "speed of bicycle is " + speed);
    }

    // Bicycle Class has a static method
    public static void increaseNumberOfBicycles(){
        numberOfBicycles++;
    }
}
