package third_one;

import java.util.Scanner;

public class Main2 {
    static final double USD = 1.0;
    static final double EUR = 0.94;
    static final double RUB = 97.50;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double PriseUSD = 100.0;

        System.out.println("Добро пожаловать в интернет-магазин!");
        System.out.println("Цена товара: $" + PriseUSD);

        System.out.println("Выберите валюту для оплаты: ");
        System.out.println("1. USD (доллар)");
        System.out.println("2. EUR (евро)");
        System.out.println("3. RUB (рубль)");

        int curr = scanner.nextInt();
        double final_price = 0.0;

        if (curr == 1) {
            final_price = PriseUSD * USD;
            System.out.println("Цена в USD: $" + final_price);
        } else if (curr == 2) {
            final_price = PriseUSD * EUR;
            System.out.println("Цена в EUR: €" + final_price);
        } else if (curr == 3) {
            final_price = PriseUSD * RUB;
            System.out.println("Цена в RUB: ₽" + final_price);
        } else {
            System.out.println("Неверный выбор валюты.");
        }

        scanner.close();
    }
}
