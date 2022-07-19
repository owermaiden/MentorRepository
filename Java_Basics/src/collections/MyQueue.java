package collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class MyQueue {

    public static void main(String[] args) {

        Queue<Integer> queue = new PriorityQueue();

        queue.add(10);
        queue.add(50);
        queue.add(60);
        queue.add(80);
        queue.add(20);

        System.out.println(queue);

        var queue2 = new LinkedList<Integer>();

        queue2.add(10);
        queue2.add(50);
        queue2.add(60);
        queue2.add(80);
        queue2.add(20);

        System.out.println(queue2);

        Queue<Integer> queue3 = new LinkedList<>();

        queue3.add(10);
        queue3.add(50);
        queue3.add(60);
        queue3.add(80);
        queue3.add(20);

        System.out.println(queue3);

        System.out.println("queue3.offer(24) = " + queue3.offer(24));
        System.out.println(queue3);

        queue3.poll();
        System.out.println(queue3);

    }
}
