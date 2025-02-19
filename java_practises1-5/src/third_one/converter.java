package third_one;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class converter {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        float number = 0;
        boolean valid = false;

        while (!valid){
            try {
                System.out.println("Введите число:");
                number = scanner.nextFloat();
                valid = true;
            }
            catch (InputMismatchException e){
                System.out.println("Ошибка, введено не число");
                scanner.next();
            }
        }

        NumberFormat defaultFormat = NumberFormat.getInstance();
        System.out.println("Формат для текущей локали: " + defaultFormat.format(number));

        NumberFormat GermanFormat = NumberFormat.getInstance(Locale.GERMAN);
        System.out.println("Формат для Германии: " + GermanFormat.format(number));

        NumberFormat EnglishFormat = NumberFormat.getInstance(Locale.ENGLISH);
        System.out.println("Формат для Англии: " + EnglishFormat.format(number));
    }

}
