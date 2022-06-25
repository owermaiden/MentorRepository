package ower.parentclasses;

public class Vehicle {

    private String model;
    private int year;

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void changeGear(){
        System.out.print("Parent change gear method owerriden by ");
    }


    @Override
    public String toString() {
        return "model='" + model + '\'' +
                ", year=" + year;
    }
}
