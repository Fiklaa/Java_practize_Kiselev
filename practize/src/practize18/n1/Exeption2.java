package practize18.n1;

import java.util.Scanner;

public class Exeption2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);

        try {
            System.out.print("Введите число (нет) ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.err.println("Вы ввели не число!");
        } catch (Exception e) {
            System.err.println("Error!");
        }


    }
}