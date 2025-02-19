package second_one;

import java.util.Scanner;
import java.util.Arrays;

public class ReverseArray {
    public static void Reverse(String[] array){
        int n = array.length;
        int i;
        for (i = 0; i < n / 2; i++){
            String temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива >>> ");
        int size = scanner.nextInt();
        scanner.nextLine();

        String[] array = new String[size];

        System.out.println("Введите элементы массива:");
        int i;
        for (i = 0; i < size; i++){
            array[i] = scanner.nextLine();
        }

        System.out.println("Исходный массив: " + Arrays.toString(array));
        Reverse(array);
        System.out.println("Преобразованный массив: " + Arrays.toString(array));
    }
}
