package practice_oop;

class SquareHouse extends AbstractHouse implements House {
    int side;

    public SquareHouse(int side, String name) {
        super(name);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
