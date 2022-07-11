package practice_oop;

/*
A real estate agent asked you to write a program. He said that he has properties in the shapes of squares, rectangles,
circles, etc., and that he wants to market them by filtering according to the square meters in line with the wishes of his customers.

Tips:

- Define a "House" interface to calculate the area and subclasses to calculate the area of each shape.
- Create all houses with the information given below and put them in an Arraylist...
- Write a method that will take all the name and features of real estate agent's properties as separate lists and return a property name list
  whose areas are equal or more than the request of a client.

Example:
input :
properties of real estate agent :
    square houses
        House-1 with 20 m side,
        House-2 with 25 m side,
        House-3 with 30 m side.

    rectangle houses
        House-1 with 20 x 30,
        House-2 with 20 x 25.

    Circle Houses
        House-1 with 15 m radius,
        House-2 with 20 m radius,
        House-3 with 10 m radius

customer request : Houses with area under 600 square meters will not be accepted...

output :
["squareHouse-1, circleHouse-2,....."]
*/


public interface House {
    double getArea();
    String getName();
}








