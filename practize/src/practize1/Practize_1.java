package practize1;

import java.util.Scanner;

public class Practize_1 {

    public static void num1_4() {
        System.out.println("Практика 1 (№ 4)");
        Scanner scan = new Scanner(System.in);
        int suum = 0;
        int max_a = 0;
        int min_a = 99999;

        String mass = scan.nextLine();
        String[] arr = mass.split("\\s+");
        int[] input = new int[arr.length];

        for( int i = 0 ; i < arr.length ; i++){
            input[i] = Integer.parseInt(arr[i]);
        }

        for (int i:input) {
            suum += i;
            max_a = Math.max(i, max_a);
            min_a = Math.min(i, min_a);
        }
        System.out.printf("Сумма массива: %d, макс. число: %d, мин. число: %d\n", suum, max_a, min_a);

    }

    public static void num1_6(boolean flag) {
        System.out.println("Практика 1 (№ 6)");
        if (flag) {
            for (float i = 1; i < 10; i++) {
                System.out.printf("%.3f ", (1/i));
            }
        }
        else {
            for (int i = 1; i < 10; i++) {
                if (i == 1) System.out.print("1 ");
                else System.out.printf("1/%d ", i);
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        num1_4();
        num1_6(true);
    }
}
