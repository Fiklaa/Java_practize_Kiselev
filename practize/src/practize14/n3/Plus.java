package practize14.n3;

import java.util.regex.*;

public class Plus {
    public static boolean containsDigitsWithoutPlus(Pattern pattern, String string) {
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            System.out.println("Цифра без «+»: " + matcher.group());
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String string1 = "(1 + 8) - 9 / 4";
        String string2 = "6 / 5 - 2 * 9";
        String regex = "\\d(?!\\s*\\+)";
        Pattern pattern = Pattern.compile(regex);

        System.out.println("Проверка 1 текста: " + containsDigitsWithoutPlus(pattern, string1));
        System.out.println("Проверка 2 текста: " + containsDigitsWithoutPlus(pattern, string2));
    }

}
