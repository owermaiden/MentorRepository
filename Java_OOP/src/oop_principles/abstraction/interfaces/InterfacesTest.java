package oop_principles.abstraction.interfaces;

import oop_principles.inheritance.Bicycle;

public class InterfacesTest {
    public static void main (String[] args) {

        // creating an instance of Bike
        Bike bike = new Bike();
        bike.changeGear(2);
        bike.speedUp(3);
        bike.applyBrakes(1);

        System.out.println("Bike present state :");
        bike.printStates();

        // creating instance of the car.
        Car car = new Car();
        car.changeGear(1);
        car.speedUp(4);
        car.applyBrakes(3);

        System.out.println("Car present state :");
        car.printStates();
    }
}
