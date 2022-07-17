package practice_oop;

public abstract class AbstractHouse {
    String name;

    public AbstractHouse(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    abstract double area();
}
