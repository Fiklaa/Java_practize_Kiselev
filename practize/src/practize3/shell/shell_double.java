package practize3.shell;

import java.util.Scanner;
import java.util.Locale;

public class shell_double {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите число double: ");
        String kol = scan.next();

        Double db = Double.valueOf(kol);

        double dp_parse = db.doubleValue();

        int a = (int)dp_parse;

        System.out.println(Double.toString(dp_parse));

        double pii = 3.14;
        System.out.println(Double.toString(pii));

    }
}
