package JetBrainsAcademy.Theards;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSafetyTest {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer, String> synchronizedNumbers = new ConcurrentHashMap<>();
        ArrayList<Integer> vector = new ArrayList<>();
        Thread writer = new Thread(() -> addPositiveNumbers(vector));
        writer.start();
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(5);
        queue.offer(4);
        System.out.println(queue);

        addNegativeNumbers(vector); // add negative numbers from the main thread

        writer.join(); // wait for the writer thread

        System.out.println(vector.size()); // the size is always 200_000
    }
    private static void addPositiveNumbers(ArrayList<Integer> target) {
        for (int i = 0; i < 100_000; i++) {
            target.add(i);
        }
    }
    private static void addNegativeNumbers(ArrayList<Integer> target) {
        for (int i = -100_000; i < 0; i++) {
            target.add(i);
        }
    }

    private static void addPositiveNumbers(Map<Integer, String> target) {
        for (int i = 0; i < 100_000; i++) {
            target.put(i, "Number is " + i);
        }
    }

    private static void addNegativeNumbers(Map<Integer, String> target) {
        for (int i = -100_000; i < 0; i++) {
            target.put(i, "Number is " + i);
        }
    }

}
