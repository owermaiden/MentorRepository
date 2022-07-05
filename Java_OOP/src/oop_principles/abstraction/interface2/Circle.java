package oop_principles.abstraction.interface2;

public class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Shape.getPi() * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * pi * radius;
    }

}
