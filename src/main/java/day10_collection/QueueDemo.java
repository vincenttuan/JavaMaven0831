package day10_collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(100);
        queue.add(80);
        queue.add(90);
        System.out.println("Queue: " + queue);
        
        while (!queue.isEmpty()) {
            int data = queue.poll();
            System.out.print("得到: " + data + ", ");
            System.out.println("Queue: " + queue);
        }
        System.out.println("Queue: " + queue);
    }
}
