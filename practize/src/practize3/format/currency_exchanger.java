package practize3.format;

import java.util.Scanner;
import java.lang.reflect.Modifier;

public class currency_exchanger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите сумму в рублях: ");
        double rub = scan.nextInt();

        System.out.println("Выберите новую валюту (USD, EUR, JPY, TRY, KZT): ");
        String new_cur = scan.next();
        switch (new_cur) {
            case "USD": {System.out.printf("Введённая сумма будет состовлять %.2f USD", (rub*0.01)); break;}
            case "EUR": {System.out.printf("Введённая сумма будет состовлять %.2f EUR", (rub*0.0095)); break;}
            case "JPY": {System.out.printf("Введённая сумма будет состовлять %.2f JPY", (rub*1.54)); break;}
            case "TRY": {System.out.printf("Введённая сумма будет состовлять %.2f TRY", (rub*0.35)); break;}
            case "KZT": {System.out.printf("Введённая сумма будет состовлять %.2f KZT", (rub*5.14)); break;}
            default: {System.out.println("Нет такойй валюты)))\n (по крайней мере у нас)"); break;}
        }
    }
}
