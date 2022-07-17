package practice_oop;

class CircleHouse extends AbstractHouse {

    int radius;

    public CircleHouse(int radius, String name) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }


}
