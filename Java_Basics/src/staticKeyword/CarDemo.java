package staticKeyword;

public class CarDemo {
    public static void main(String[] args) {

        Car honda = new Car("Honda", "1800cc");
        Car jaguar = new Car("Jaguar", "1600cc");

        System.out.println("honda = " + honda);

        // Static features Car Class has...
        System.out.println("Car.numberOfCars = " + Car.numberOfCars);
        System.out.println("Car.models = " + Car.models);
        Car.setNumberOfCars(4);
        System.out.println(Car.numberOfCars);
    }
}
