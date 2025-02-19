package practize7;

import java.util.Scanner;

public class ProcessStringTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProcessStringFunctions strr = new ProcessStringFunctions();
        System.out.println("Введите строку:");
        String testString = scanner.nextLine();

        int chars_cnt = strr.countAmountChars(testString);
        System.out.println("Количество символов в строке: " + chars_cnt);

        String newPosChars = strr.oddPosChars(testString);
        System.out.println("Символы на нечетных позициях: " + newPosChars);

        String reverseStr = strr.reverseString(testString);
        System.out.println("Инвертированная строка: " + reverseStr);
    }
}
