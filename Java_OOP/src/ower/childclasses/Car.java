package ower.childclasses;

import ower.parentclasses.Vehicle;

public class Car extends Vehicle {

    private String type;
    private int gear;

    public Car(String type, String model, int year) {
        super(model, year);
        this.type = type;
    }

    @Override
    public void changeGear(){
        super.changeGear();
        System.out.println("Car change gear method");
    }


    @Override
    public String toString() {
        return "Car{ " +
                super.toString() +
                ", type='" + type + '\'' +
                '}';
    }
}
