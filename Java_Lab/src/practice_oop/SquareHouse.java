package practice_oop;

class SquareHouse extends AbstractHouse {
    int side;

    public SquareHouse(int side, String name) {
        super(name);
        this.side = side;
    }

    @Override
    public double area() {
        return side*side;
    }


}
