package oop_principles.abstraction.interface2;

public interface Shape {

    public static final double pi = 3.14;

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    // Interfaces can not have Constructors - We dont want any object to be created from interfaces

    default void deleteShape(){
        System.out.println("Do you want to delete this shape? Y/N");
    }


}
