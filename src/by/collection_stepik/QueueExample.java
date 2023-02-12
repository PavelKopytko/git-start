package by.collection_stepik;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        Queue<String> queue1 = new PriorityQueue();

        //insert
        queue1.offer("a");
        queue1.offer("b");
        queue1.offer("c");
        queue1.add("d");
        System.out.println(queue1);



        System.out.println("remove() " + queue1.remove());
        System.out.println(queue1);

//        queue1.element();
        System.out.println("element() " + queue1.element());
        System.out.println(queue1);

        queue1.peek();
        System.out.println(queue1);
        String poll = queue1.poll();
        System.out.println(queue1);
        queue1.peek();
        System.out.println(queue1);
    }
}
