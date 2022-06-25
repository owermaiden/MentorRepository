package ower.childclasses;

import ower.parentclasses.Vehicle;

public class Trunk extends Vehicle {

    private Long capacity;

    public Trunk(String model, int year, Long capacity) {
        super(model, year);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Trunk{ " +
                super.toString() +
                ", capacity='" + capacity + '\'' +
                '}';
    }
}
