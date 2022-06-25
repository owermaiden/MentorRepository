package ower.childclasses;

import ower.parentclasses.Vehicle;

public class Bike extends Vehicle {

    private String type;

    public Bike(String model, int year, String type) {
        super(model, year);
        this.type = type;
    }

    public void changeGear(){
        super.changeGear();
        System.out.println("Child change gear method");
    }


    @Override
    public String toString() {
        return "Bike{ " +
                super.toString() +
                ", type='" + type + '\'' +
                '}';
    }
}
