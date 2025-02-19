package practize8;

import java.util.Scanner;

public class DigSum {
    public static int cntOfNum(int number, int k, int s, int result) {
        if (number >= Math.pow(10, k)) {
            return result;
        }
        int kTmp = number;
        int total = 0;
        while (kTmp != 0) {
            total += kTmp % 10;
            kTmp /= 10;
        }
        if (total == s) {
            result += 1;
        }
        return cntOfNum(number + 1, k, s, result);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k, s;
        int result = 0;
        System.out.println("Введите количество знаков в числе: ");
        k = scan.nextInt();

        System.out.println("Введите число, которому должна равняться сумма цифр k-значного числа");
        s = scan.nextInt();

        System.out.printf("Количество %d-значных чисел, сумма цифр которых = %d: %d\n",
                k, s, cntOfNum((int) Math.pow(10, k - 1), k, s, result));

        scan.close();
    }
}