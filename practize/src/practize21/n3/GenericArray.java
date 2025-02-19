package practize21.n3;

import java.util.Arrays;

public class GenericArray<T> {
    private T[] array;

    @SuppressWarnings("unchecked")
    public GenericArray(int size) {
        array = (T[]) new Object[size];
    }

    public void set(int index, T value) {
        if (index >= 0 && index < array.length) {
            array[index] = value;
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    public static void main(String[] args) {
        GenericArray<Integer> intArray = new GenericArray<>(5);
        intArray.set(0, 10);
        intArray.set(1, 20);
        intArray.set(2, 30);
        System.out.println("Integer Array: " + intArray);

        GenericArray<String> stringArray = new GenericArray<>(3);
        stringArray.set(0, "Hello");
        stringArray.set(1, "World");
        System.out.println("String Array: " + stringArray);

        GenericArray<Double> doubleArray = new GenericArray<>(2);
        doubleArray.set(0, 1.5);
        doubleArray.set(1, 3.5);
        System.out.println("Double Array: " + doubleArray);
    }
}
