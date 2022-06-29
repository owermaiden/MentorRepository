package oop_principles.abstraction.interface2;

public class InterfaceTest {

    public static void main(String[] args) {

        Shape circle = new Circle(4.5);

        System.out.println("circle area = " + circle.calculateArea());
        System.out.println("circle perimeter = " + circle.calculatePerimeter());
        circle.deleteShape();

        Shape rectangle = new Rectangle(3.0, 5.0);
        System.out.println("rectangle area = " + rectangle.calculateArea());
        System.out.println("rectangle perimeter = " + rectangle.calculatePerimeter());
        rectangle.deleteShape();


    }
}
