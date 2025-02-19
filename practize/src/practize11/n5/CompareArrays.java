package practize11.n5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class CompareArrays {

    public static void measureInsertPerformance(List<Integer> arrayList, List<Integer> linkedList) {
        int valueToInsert = 1000;
        long startTime, endTime;

        startTime = System.nanoTime();
        arrayList.add(arrayList.size() / 2, valueToInsert);
        endTime = System.nanoTime();
        System.out.println("ArrayList insert time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        linkedList.add(linkedList.size() / 2, valueToInsert);
        endTime = System.nanoTime();
        System.out.println("LinkedList insert time: " + (endTime - startTime) + " ns");
    }

    public static void measureRemovePerformance(List<Integer> arrayList, List<Integer> linkedList) {
        long startTime, endTime;

        startTime = System.nanoTime();
        arrayList.remove(arrayList.size() / 2);
        endTime = System.nanoTime();
        System.out.println("ArrayList remove time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        linkedList.remove(linkedList.size() / 2);
        endTime = System.nanoTime();
        System.out.println("LinkedList remove time: " + (endTime - startTime) + " ns");
    }

    public static void measureAddPerformance(List<Integer> arrayList, List<Integer> linkedList) {
        int valueToAdd = 5000;
        long startTime, endTime;

        startTime = System.nanoTime();
        arrayList.add(valueToAdd);
        endTime = System.nanoTime();
        System.out.println("ArrayList add time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        linkedList.add(valueToAdd);
        endTime = System.nanoTime();
        System.out.println("LinkedList add time: " + (endTime - startTime) + " ns");
    }

    public static void measureSearchPerformance(List<Integer> arrayList, List<Integer> linkedList) {
        int searchValue = 10000;
        long startTime, endTime;

        startTime = System.nanoTime();
        arrayList.contains(searchValue);
        endTime = System.nanoTime();
        System.out.println("ArrayList search time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        linkedList.contains(searchValue);
        endTime = System.nanoTime();
        System.out.println("LinkedList search time: " + (endTime - startTime) + " ns");
    }

    public static void main(String[] args) {
        int n = 100000;
        Random random = new Random();

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            int value = random.nextInt(n);
            arrayList.add(value);
            linkedList.add(value);
        }

        System.out.println("Insert operation:");
        measureInsertPerformance(arrayList, linkedList);

        System.out.println("\nRemove operation:");
        measureRemovePerformance(arrayList, linkedList);

        System.out.println("\nAdd operation:");
        measureAddPerformance(arrayList, linkedList);

        System.out.println("\nSearch operation:");
        measureSearchPerformance(arrayList, linkedList);
    }
}
