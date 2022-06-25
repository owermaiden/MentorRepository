package ower.parentclasses;

public class Vehicle {

    private String model;
    private int year;

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void changeGear(){
        System.out.println("Parent change gear method");
    }


    @Override
    public String toString() {
        return "model='" + model + '\'' +
                ", year=" + year;
    }
}
