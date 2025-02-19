package practize26;

import java.util.Stack;

public class InvertMass {
    public static void invertArray(int[] array) {
        Stack<Integer> stack = new Stack<>();

        for (int element : array) {
            stack.push(element);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Исходный массив:");
        for (int i : array) {
            System.out.print(i + " ");
        }

        invertArray(array);

        System.out.println("\nИнвертированный массив:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
