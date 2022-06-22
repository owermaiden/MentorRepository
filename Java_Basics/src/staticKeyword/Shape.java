package staticKeyword;

public class Shape {

    private int height;
    private int width;

    public Shape(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public static Shape createASquare(){
        return new Shape(10, 10);
    }
}
