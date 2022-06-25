package ower.childclasses;

import ower.parentclasses.Vehicle;

public class Car extends Vehicle {

    String type;

    public Car(String type, String model, int year) {
        super(model, year);
        this.type = type;
    }

    public void changeGear(){
        super.changeGear();
        System.out.println("Child change gear method");
    }


    @Override
    public String toString() {
        return "Car{ " +
                super.toString() +
                ", type='" + type + '\'' +
                '}';
    }
}
