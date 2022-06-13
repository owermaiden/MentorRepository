package ArraylistImplementation;


public class MyArraylist {
    private int[] items;
    private int count;

    public MyArraylist(int length) {
        items = new int[length];
    }

    public void put(int item) {
        resizeIfRequired();
        items[count++] = item;
    }

    private void resizeIfRequired() {
        if (items.length == count) {
            int[] newItems = new int[count * 2];

            for (int i = 0; i < count; i++)
                newItems[i] = items[i];

            items = newItems;
        }
    }

    public void print() {
        for (int i = 0; i < count; i++)
            System.out.print(items[i]+ ", ");
    }


//    public void insertAt(int item, int index) {
//        if (index < 0 || index > count)
//            throw new IllegalArgumentException();
//
//        // Note that I've extracted the logic for
//        // resizing the array into this private
//        // method so we can reuse in insert() and
//        // insertAt() methods.
//        //
//        // This also made our code cleaner and
//        // more readable.
//        resizeIfRequired();
//
//        for (int i = count - 1; i >= index; i--)
//            items[i + 1] = items[i];
//
//        items[index] = item;
//        count++;
//    }
//
//    public void reverse() {
//        int[] newItems = new int[count];
//
//        for (int i = 0; i < count; i++)
//            newItems[i] = items[count - i - 1];
//
//        items = newItems;
//    }
//
//    public int max() {
//        // O(n): Because we have to iterate over
//        // the entire array to find the largest
//        // number. This number may be at the end
//        // of the array (worst case scenario).
//        int max = 0;
//        for (int item : items)
//            if (item > max)
//                max = item;
//
//        return max;
//    }
//
//    public MyArraylist intersect(MyArraylist other) {
//        var intersection = new MyArraylist(count);
//
//        for (int item : items)
//            if (other.indexOf(item) >= 0)
//                intersection.put(item);
//
//        return intersection;
//    }
//
//    public void removeAt(int index) {
//        if (index < 0 || index >= count)
//            throw new IllegalArgumentException();
//
//        for (int i = index; i < count; i++)
//            items[i] = items[i + 1];
//
//        count--;
//    }
//
//    public int indexOf(int item) {
//        for (int i = 0; i < count; i++)
//            if (items[i] == item)
//                return i;
//
//        return -1;

//    }
}
