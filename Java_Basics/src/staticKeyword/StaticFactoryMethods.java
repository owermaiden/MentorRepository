package staticKeyword;

import java.util.ArrayList;

public class StaticFactoryMethods {

    public static void main(String[] args) {

        Shape square1 = new Shape(10, 10);

        var shape2 = Shape.createASquare();

    }
}
