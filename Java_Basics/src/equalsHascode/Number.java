package equalsHascode;

public class Number {

    private int value;

    public Number(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    // The method does override or implement a method declared in a supertype.
    @Override
    public boolean equals(Object o) {

        // null check
        if (o == null) {
            return false;
        }

        // this instance check
        if (this == o) {
            return true;
        }

        // instanceof Check and actual value check
        if ((o instanceof Number) && (((Number) o).getValue() == this.value)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = (int) (value / 11);
        return result;
    }
}
