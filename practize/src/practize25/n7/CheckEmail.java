package practize25.n7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckEmail {

    public static boolean isValidEmail(String email, Pattern pattern) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    /*
        ^ — начало строки.
        [a-zA-Z0-9!#$%&'*+/=?^_{|}~-]+` — локальная часть, которая может содержать буквы, цифры и некоторые специальные символы.
        (?:\.[a-zA-Z0-9!#$%&'*+/=?^_{|}~-]+)*` — дополнительно допустимы точки, за которыми следуют буквы, цифры или допустимые специальные символы.
        @ — символ «@».
        [a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])? — доменная часть: буквы и цифры с возможностью иметь дефисы внутри, но не на краях.
        (?:\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)* — доменная часть верхнего уровня: буквы, цифры, точки и дефисы.
        $ — конец строки.
     */
    public static void main(String[] args) {
        String regex = "^[a-zA-Z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-zA-Z0-9!#$%&'*+/=?^_`{|}~-]+)*@" +
                "[a-zA-Z0-9.-](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])" +
                "?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";
        String[] validEmails = {"user@example.com", "root@localhost"};
        String[] invalidEmails = {"myhost@@@com.ru", "@my.ru", "Julia String"};

        Pattern pattern = Pattern.compile(regex);

        for (String email : validEmails) {
            System.out.println("Проверка: " + email + " - " + isValidEmail(email, pattern));
        }

        for (String email : invalidEmails) {
            System.out.println("Проверка: " + email + " - " + isValidEmail(email, pattern));
        }
    }
}
