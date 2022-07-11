package practice_oop;

class RectangleHouse extends AbstractHouse implements House {

    int width, length;

    public RectangleHouse(int width, int length, String name) {
        super(name);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
