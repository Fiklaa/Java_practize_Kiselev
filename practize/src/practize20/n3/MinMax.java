package practize20.n3;

import java.util.Random;
import java.util.Scanner;

public class MinMax<T extends Comparable<T>> {
    private final T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }
    public T getMin() {
        T min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min.compareTo(array[i]) > 0) {
                min = array[i];
            }
        }
        return min;
    }
    public T getMax() {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max.compareTo(array[i]) < 0) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Введите количество элементов в массиве");
        while (!sc.hasNextInt()) {
            System.out.println("Ошика! Введите количество элементов в массиве");
            sc.next();

        }
        n = sc.nextInt();

        Integer[] arr = new Integer[n];


        System.out.println("Количество элементов в массиве: " + n);

        System.out.println("Массив:");
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(n);
            System.out.print(arr[i] + " ");
        }
        MinMax<Integer> minMax = new MinMax<>(arr);

        System.out.println("\nMin: " + minMax.getMin());
        System.out.println("Max: " + minMax.getMax());

    }
}