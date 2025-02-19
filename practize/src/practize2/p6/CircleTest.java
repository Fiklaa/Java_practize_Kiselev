package practize2.p6;

import java.util.Locale;
import java.util.Scanner;

public class CircleTest {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во окружностей: ");
        int kol = scan.nextInt();

        Circle[] mass = new Circle[kol];

        for (int i = 0; i < kol; i++) {
            System.out.printf("Введите радиус %d окружности:\n", (i + 1));
            Circle new_circle = new Circle(scan.nextDouble());
            mass[i] = new_circle;
        }

        for (Circle prov_circle : mass) {
            double sqr = prov_circle.getSquare();
            double lngth = prov_circle.getLength();
            double prov_r = prov_circle.getRadius();
            System.out.printf("Окружность с радиусом %.2f, площадью %.2f, длинной окр %.2f\n", prov_r, sqr, lngth);
            prov_circle.ToString();

        }

        System.out.println("Введите радиусы окружностей для проверки:");
        Circle a = new Circle(1);
        Circle b = new Circle(1);
        a.setRadius(scan.nextDouble());
        b.setRadius(scan.nextDouble());
        if (a.IsEqual(b)) {
            System.out.println("Окружности одинаковые");
        } else {
            System.out.println("Окружности разные");
        }
    }
}
