package ArraylistImplementation;

public class Runner {

    public static void main(String[] args) {

        MyArraylist list = new MyArraylist(5);

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        list.print();
    }
}
