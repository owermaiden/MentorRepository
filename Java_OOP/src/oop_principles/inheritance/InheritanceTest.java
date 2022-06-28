package oop_principles.inheritance;

public class InheritanceTest {
    public static void main(String args[]) {

        MountainBike mb = new MountainBike(3, 100, 25);
        System.out.println(mb.toString());
        System.out.println("MountainBike.numberOfBicycles = " + MountainBike.numberOfBicycles);
        System.out.println("Bicycle.numberOfBicycles = " + Bicycle.numberOfBicycles);
    }
}
