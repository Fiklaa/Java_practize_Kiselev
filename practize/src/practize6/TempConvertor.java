package practize6;

import java.util.Scanner;
import java.util.Locale;

interface Convertable{
    double convert(double temperature);
}

class CtoK implements Convertable {
    @Override
    public double convert(double temperature){
        return temperature + 273.15;
    }
}

class CtoF implements Convertable {
    @Override
    public double convert(double temperature){
        return (temperature * 9/5) + 32;
    }
}

public class TempConvertor {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите температуру в Цельсиях:");
        double temperature = scanner.nextDouble();

        Convertable Kelvin = new CtoK();
        Convertable Fahrenheit = new CtoF();

        System.out.printf("%.1f С в Кельвинах: %.1f\n", temperature, Kelvin.convert(temperature));
        System.out.printf("%.1f С в Ференгейтах: %.1f\n", temperature, Fahrenheit.convert(temperature));

    }

}
