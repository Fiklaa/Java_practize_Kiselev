package practize25.n2;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class SplitString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку для разбивки: ");
        String input = scanner.nextLine();

        String regex = "";
        boolean isValidRegex = false;

        while (!isValidRegex) {
            System.out.print("Введите регулярное выражение для разбивки строки: ");
            regex = scanner.nextLine();
            try {
                Pattern.compile(regex);
                isValidRegex = true;
            } catch (PatternSyntaxException e) {
                System.out.println("Некорректное регулярное выражение. Попробуйте снова.");
            }
        }

        String[] elements = input.split(regex);

        System.out.println("Результат разбиения строки:");
        for (String element : elements) {
            System.out.println(element.isEmpty() ? "(пустой элемент)" : element);
        }

        scanner.close();
    }
}