package practize7;

import java.util.Scanner;
import java.util.Locale;

public class MathTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        MathFunctions math = new MathFunctions();
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите реальную часть комплексного числа");
        double real = scan.nextDouble();
        System.out.println("Введите мнимую часть комплексного числа");
        double imaginary= scan.nextDouble();
        System.out.println("Введите степень числа");
        double exponent = scan.nextDouble();

        double[] ComplexPow = math.ComplexPow(real, imaginary, exponent);

        System.out.printf("Степень комплексного числа (%.2f + %.2fi) = (%.2f + %.2fi)\n", real, imaginary, ComplexPow[0], ComplexPow[1]);

        System.out.printf("Модуль комплексного числа (%.2f + %.2fi) = %.2f\n", real, imaginary, math.ComplexAbs(real, imaginary));

        System.out.println("Введите длину окружности:");
        double radius = scan.nextDouble();
        double dlina = 2 * MathCalculable.PI * radius;
        System.out.printf("Длина окружности радиусом %.2f равна %.2f", radius, dlina);
    }

}
