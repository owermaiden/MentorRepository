package practice_oop;

class RectangleHouse extends AbstractHouse {

    private int width, length;

    public RectangleHouse(int width, int length, String name) {
        super(name);
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return width*length;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }
}
