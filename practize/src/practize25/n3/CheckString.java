package practize25.n3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckString {
    public static boolean isValidString(Pattern pattern, String string) {
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }

    public static void main(String[] args) {

        String correctString = "abcdefghijklmnopqrstuv18340";
        String incorrectString1 = "abcdefghijklmnoasdfasdpqrstuv18340";
        String incorrectString2 = "abcdefghijklmnopqrstuv1834";

        String regex = "\\babcdefghijklmnopqrstuv18340\\b";

        Pattern pattern = Pattern.compile(regex);

        System.out.println("Проверка строки: " + correctString);
        System.out.println("Результат: " + isValidString(pattern, correctString));

        System.out.println("Проверка строки: " + incorrectString1);
        System.out.println("Результат: " + isValidString(pattern, incorrectString1));

        System.out.println("Проверка строки: " + incorrectString2);
        System.out.println("Результат: " + isValidString(pattern, incorrectString2));
    }
}
