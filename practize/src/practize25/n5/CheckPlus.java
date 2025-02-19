package practize25.n5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPlus {

    public static boolean containsDigitsWithoutPlus(Pattern pattern, String string) {
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            System.out.println("Найдена цифра без знака «+»: " + matcher.group());
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String string1 = "(1 + 8) - 9 / 4";
        String string2 = "6 / 5 - 2 * 9";
        String regex = "\\d(?!\\s*\\+)";
        Pattern pattern = Pattern.compile(regex);

        System.out.println("Проверка текста 1: " + containsDigitsWithoutPlus(pattern, string1));
        System.out.println("Проверка текста 2: " + containsDigitsWithoutPlus(pattern, string2));
    }
}