package ArraylistImplementation;

public class Runner {

    public static void main(String[] args) {

        MyArraylist list = new MyArraylist(5);

        list.put(10);
        list.put(20);
        list.put(30);
        list.put(40);
        list.put(50);
        list.put(60);

        list.print();
    }
}
