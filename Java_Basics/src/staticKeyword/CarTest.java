package staticKeyword;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CarTest {

    @Test
    public void whenNumberOfCarObjectsInitialized_thenStaticCounterIncreases() {
        new Car("Jaguar", "V8");
        new Car("Bugatti", "W16");
        assertEquals(2, Car.numberOfCars);

        Car.setNumberOfCars(3);
        assertEquals(3, Car.numberOfCars);
    }
}
