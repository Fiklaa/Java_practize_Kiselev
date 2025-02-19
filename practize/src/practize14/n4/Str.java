package practize14.n4;

import java.util.regex.*;

public class Str {
    public static boolean isValidString(Pattern pattern, String string) {
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }

    public static void main(String[] args) {

        String correctString = "abcdefghijklmnopqrstuv18340";
        String incorrString1 = "abcdefghijklmnoasdfasdpqrstuv18340";
        String incorrString2 = "abcdefghijklmnopqrstuv1834";

        String regex = "\\babcdefghijklmnopqrstuv18340\\b";

        Pattern pattern = Pattern.compile(regex);

        System.out.println("Строка: " + correctString);
        System.out.println("Результат: " + isValidString(pattern, correctString));

        System.out.println("Строка: " + incorrString1);
        System.out.println("Результат: " + isValidString(pattern, incorrString1));

        System.out.println("Строка: " + incorrString2);
        System.out.println("Результат: " + isValidString(pattern, incorrString2));
    }
}