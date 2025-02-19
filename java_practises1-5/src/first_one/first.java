package first_one;

import java.util.Scanner;

public class first {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива:\n");

        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Введите элементы массива: ");
        int i = 0;
        while (i < size){
            arr[i] = scanner.nextInt();
            i ++;
        }

        System.out.print("Ваш массив: \n");
        i = 0;
        while (i < size){
            System.out.print(arr[i] + " ");
            i ++;
        }
        int sum = 0;
        i = 0;
        while (i < size){
            sum += arr[i];
            i ++;
        }
        System.out.printf("\nСумма массива равна %d", sum);

        int maxi = arr[0];
        i = 0;
        while (i < size){
            maxi = Math.max(maxi, arr[i]);
            i ++;
        }
        System.out.printf("\nМаксимальный элемент: %d", maxi);
        int mini = arr[0];
        i = 0;
        do {
            mini = Math.min(mini, arr[i]);
            i ++;
        } while (i < size);
        System.out.printf("\nМинимальный элемент: %d", mini);
    }
}



/*
public class Main{
    public static void main(String[] args){
        int[] numbers = {5, 10, 15, 25};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        double avg = (double) sum / numbers.length;
        System.out.printf("Сумма элементов массива: %d%n", sum);
        System.out.printf("Среднее арифметическое: %.2f", avg);
    }
}
 */