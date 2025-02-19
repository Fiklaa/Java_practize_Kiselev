package practize18.n3;

import java.util.Scanner;

public class Texter3 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Введите число (нет) ");
        String intString = myScanner.next();
        int i = 0;
        
        try {
            i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.err.println("Вы ввели не число!");
        } catch (Exception e) {
            System.err.println("Error!");
        } finally {
            System.out.println(i);
            System.out.println("Число - это 1, 2, 3, 4, и тд");
        }
    }
}
