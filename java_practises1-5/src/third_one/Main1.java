package third_one;

import java.util.*;

public class Main1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n, i;
        while (true) {
            try {
                System.out.println("Введите размер массива: ");
                n = scanner.nextInt();
                if (n > 0) {
                    break;
                } else {
                    System.out.println("Размер массива должен быть больше нуля");
                }
            } catch (InputMismatchException e) {
                System.out.println("Некорректный ввод. Попробуйте еще раз");
                scanner.next();
            }
        }

        Random random = new Random();
        int[] arr = new int[n];

        for (i = 0; i < n; i++){
            arr[i] = random.nextInt(n + 1);
        }

        System.out.printf("Введенный массив: %s", Arrays.toString(arr));
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (i = 0; i < n; i++){
            if (arr[i] % 2 == 0){
                arr1.add(arr[i]);
            }
        }

        System.out.println("\nМассив с четными элементами:");
        if (!arr1.isEmpty())
            System.out.println(arr1);
        else
            System.out.println("Четные элементы отсутсвуют");
    }
}
