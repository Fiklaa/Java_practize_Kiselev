import java.util.Random;
import java.util.Scanner;
import java.util.Locale;

//  17 - 3 задания минимум на односвз двусвяз и цикл списки (реализовать и чтото с ним сделать);
// 20 - 3-4 шт; 21 - 3-4 шт; 22 - 3-4 шт; 23 - 3-4 шт; 24 - 3-4 шт; 25,26,27 - всё
public class Hello {

    public static boolean IsSimple(int ANum) {
        if (ANum < 2)
            return false;
        double s = Math.sqrt(ANum);
        for (int i = 2; i <= s; i++) {
            if (ANum % i == 0)
                return false;
        }
        return true;
    }


    public static void printTringale(int n, char sim) {
        int kol = 0;
        if (n % 2 == 0) {
            kol = n / 2;
            for (int i = 1; i <= kol; i++) {
                for (int j = 0; j < kol - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < i; k++) {
                    System.out.print(sim);
                }
                for (int k = 0; k < i; k++) {
                    System.out.print(sim);
                }
                System.out.print("\n");
            }
        } else {
            kol = (n / 2) + 1;
            for (int i = 1; i <= kol; i++) {
                for (int j = 0; j < kol - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < i; k++) {
                    System.out.print(sim);
                }
                for (int k = 0; k < i - 1; k++) {
                    System.out.print(sim);
                }
                System.out.print("\n");
            }
        }
    }


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        int flag = scan.nextInt();


        switch (flag) {
            case 1: {
                int a = scan.nextInt();
                int b = scan.nextInt() / 3;
                double res = ((a + b * 20) / 50.0);
                System.out.println((int) Math.ceil(res) * 100);
                break;}
            case 2: {
                int a = scan.nextInt();
                int b = scan.nextInt();
                int res = ((a / 100) * 50) - b;
                if (res > 0){
                    System.out.println((res / 20) * 3 + 2);
                } else {
                    System.out.println("ERROR");
                }
                break;}
            case 3: {
                int a = scan.nextInt();
                int b = scan.nextInt() / 3;
                int res = (a / 100) * 50 - (20 * b);
                System.out.println(Math.max(res, 0));
                break;}
            default: {System.out.println("ERROR"); break;}
        }


    }
}
