package practize18.n2;


import java.util.Scanner;

public class TexterEx2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DemoEx td = new DemoEx();
        try {
            System.out.println("Введите строку");
            td.printMessage(scan.next());
        } catch (NullPointerException e) {
            System.err.println("На вход программе было подано значение null");
        }
        System.out.println("Всё в порядке");
        try {
            td.printMessage(null);
        } catch (NullPointerException e) {
            System.err.println("_На вход программе было подано значение null");
        }
    }
}