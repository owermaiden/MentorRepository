package oop_principles.inheritance;

public class Vehicle {

    public String typeOfVehicle;
    public int speed;

    public Vehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void speedUp(int increment) {
        speed += increment;
    }



}
