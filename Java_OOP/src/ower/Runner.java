package ower;

import ower.childclasses.Bike;
import ower.childclasses.Car;
import ower.childclasses.Trunk;
import ower.parentclasses.Vehicle;

public class Runner {


    public static void main(String[] args) {

        Vehicle car = new Car("SW", "BMW", 2011);
        Vehicle bike = new Bike("CARRARO", 2019, "MOUNTAIN");
        Vehicle trunk = new Trunk("MERCEDES", 2000, 100L);

        System.out.println(car);
        System.out.println(bike);
        System.out.println(trunk);

        car.changeGear();
        bike.changeGear();
        trunk.changeGear();


    }
}
