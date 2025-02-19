package practize13.n1;

import java.util.Scanner;

public class StringTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = "I like Java!!!";
        s = scan.nextLine();
        System.out.println(s + "--");

        System.out.println(s.charAt(s.length() - 1));

        System.out.println(s.endsWith("!!!"));

        System.out.println(s.startsWith("I like"));

        System.out.println(s.contains("Java"));

        System.out.println(s.indexOf("Java"));

        System.out.println(s.replace("a", "o"));

        System.out.println(s.toUpperCase());

        System.out.println(s.toLowerCase());

        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("Java") + 4));
    }
}
