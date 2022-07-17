package oop_principles.inheritance;

public class Car {
    public int fuel;
    public Car() {
        fuel = 0;
    }
    public Car(int g) {
        fuel = g;    }
    public void display() {
        System.out.print(fuel + " ");
    }
}

class RaceCar extends Car {
    public RaceCar(int g) {
        super(2 * g);
    }

    public void addFuel() {
        fuel++;
    }
}

class Main {
    public static void main(String[] args) {
        Car fastCar = new RaceCar(5);
        fastCar.display();
        ((RaceCar)fastCar).addFuel();
        fastCar.display();
    }
}
