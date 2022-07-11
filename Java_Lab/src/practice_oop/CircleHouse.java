package practice_oop;

class CircleHouse extends AbstractHouse implements House {
    int radius;

    public CircleHouse(int radius, String name) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
