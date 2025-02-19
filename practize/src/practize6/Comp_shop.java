package practize6;

import practize4.*;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

interface ShopTask{
    void AddComp(int i);
    void DelComp(int i);
    void SearchCompMark();
}

class MEldaradoVideoDns implements ShopTask {
    Computer[] mass = new Computer[5];

    public MEldaradoVideoDns() {
        for (int i = 0; i < 5; i++) {
            this.mass[i] = new Computer();
        }
    }

    private Comp_Mark getMark() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите марку компьютера:");
        Comp_Mark name = Comp_Mark.ACER;
        String mark = scan.next();

        switch (mark) {
            case ("ACER") -> { name = Comp_Mark.ACER; }
            case ("HONOR") -> { name = Comp_Mark.HONOR; }
            case ("HP") -> { name = Comp_Mark.HP; }
            case ("ASUS") -> { name = Comp_Mark.ASUS; }
            case ("LENOVO") -> { name = Comp_Mark.LENOVO; }
        }

        return name;
    }

    private CPU getCPU() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите характеристики CPU");
        System.out.print("Архитектура: ");
        String arch = scan.next();
        System.out.print("Тактовая частота: ");
        double clock_speed = scan.nextDouble();
        System.out.print("Кол-во ядер: ");
        int cores = scan.nextInt();

        CPU processor = new CPU(arch, clock_speed, cores);
        return processor;
    }

    private Memory getMemmory() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите характеристики ОЗУ");
        System.out.print("Тип: ");
        String tpy = scan.next();
        System.out.print("Объём: ");
        int cap = scan.nextInt();

        Memory memo = new Memory(tpy, cap);
        return memo;
    }

    private Monitor getMonitor() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите характеристики Монитора");
        System.out.print("Разрешение: ");
        String res = scan.next();
        System.out.print("Диагональ: ");
        double dig = scan.nextDouble();

        Monitor mon = new Monitor(res, dig);
        return mon;
    }

    @Override
    public void AddComp(int i) {
        System.out.println("Добавим компьютер: ");
        this.mass[i] = new Computer(getMark(), getCPU(), getMemmory(), getMonitor());
    }

    @Override
    public void DelComp(int i) {
        System.out.println("Удалим компьютер: ");
        this.mass[i].DelCommpF();
    }

    public void SearchCompMark() {
        System.out.println("Поиск по бренду: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();

        for (int i = 0; i < 5; i++) {
            if (Objects.equals(this.mass[i].getMark(), name)) {
                System.out.println("Нашли для Вас вариант:");
                System.out.println(this.mass[i].toString());
                return;
            }
        }
        System.out.println("К сожалению ничего не смогли найти(");
    }

}

public class Comp_shop {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        MEldaradoVideoDns shop = new MEldaradoVideoDns();

        System.out.println("Добро пожаловать в магазин техники!");
        shop.AddComp(0);
        shop.SearchCompMark();
        shop.DelComp(0);

    }
}
