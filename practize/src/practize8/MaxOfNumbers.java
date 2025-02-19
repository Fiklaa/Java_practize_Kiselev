package practize8;

import java.util.Scanner;

public class MaxOfNumbers {
    public static void main(String[] args) {
        System.out.println("Введите последовательность через enter:");
        System.out.println("Максимум: " + f());
    }

    public static int f() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n == 0) {
            return 0;
        } else {
            return Math.max(n, f());
        }
    }
}
