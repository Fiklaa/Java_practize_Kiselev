package practize8;

import java.util.Scanner;

public class NumLeftToRight {

    public static void func_n(int num, int k) {
        if (k == 0) return;
        System.out.print(num / k + " ");
        num %= k;
        k /= 10;
        func_n(num, k);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int k = 1;
        while (k <= num / 10) {
            k *= 10;
        }

        func_n(num, k);
        scan.close();
    }

}
