package classes;

public class OuterClass {

    static int numberOfCarsCreated = 0;

    public OuterClass() {
        numberOfCarsCreated++;
    }

    static class StaticInnerClass {


    }

}


