package oop_principles.abstraction.interface2;

public interface Shape {

    double pi = 3.14;

    double calculateArea();
    double calculatePerimeter();

    default void deleteShape(){
        System.out.println("Do you want to delete this shape? Y/N");
    }


}
