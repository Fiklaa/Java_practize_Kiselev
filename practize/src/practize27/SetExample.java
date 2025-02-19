package practize27;

import java.util.PriorityQueue;

public class SetExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i = 10; i > 0; i--) {
            priorityQueue.add(i);
        }

        System.out.println("Извлеченные элементы:");
        for (int i = 0; i < 3; i++) {
            System.out.println(priorityQueue.poll());
        }
    }
}
