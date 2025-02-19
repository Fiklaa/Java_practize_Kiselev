package practize8;

import java.util.Scanner;


public class ReversedNumber {
    public static long reverse(long n, long reversed) {
        if (n == 0) {
            return reversed;
        }
        long lastDigit = n % 10;
        reversed = reversed * 10 + lastDigit;
        return reverse(n / 10, reversed);
    }

    public static void main(String[] args) {
        long n;
        long reversed = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        n = scan.nextInt();
        System.out.printf("Число в развернутом виде: %d", reverse(n, reversed));

        scan.close();
    }
}