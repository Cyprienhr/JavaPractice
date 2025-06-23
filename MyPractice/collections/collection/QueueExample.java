package collections.collection;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Task1");
        queue.add("Task2");
        queue.add("Task3");

        System.out.println("Queue: " + queue);
        System.out.println("Next task: " + queue.poll());  // Removes and returns head
        System.out.println("Now queue: " + queue);

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);

        System.out.println("Top priority: " + pq.peek());  // 10, smallest comes first
        System.out.println("Removed: " + pq.poll());       // 10 removed
        System.out.println("Now queue: " + pq);            // 20, 30

        ArrayDeque<String> deque = new ArrayDeque<>();

        deque.addLast("A");  // Add to rear
        deque.addFirst("B"); // Add to front

        System.out.println("Deque: " + deque);
        System.out.println("Removed from front: " + deque.pollFirst());
        System.out.println("Removed from rear: " + deque.pollLast());
    }
}
