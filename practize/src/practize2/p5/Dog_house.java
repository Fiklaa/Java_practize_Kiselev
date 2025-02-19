package practize2.p5;

import java.util.Scanner;

public class Dog_house {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во собак в питомнике: ");
        int kol = scan.nextInt();

        Dog[] house = new Dog[kol];

        for (int i = 0; i < kol; i++) {
            System.out.printf("Введите кличку и возраст %d собаки:\n", (i + 1));
            Dog new_dog = new Dog(scan.next(), scan.nextInt());
            house[i] = new_dog;
        }

        for (Dog good_boy : house) {
            String prov_name = good_boy.getName();
            int prov_age = good_boy.getAge();
            int prov_hum_age = good_boy.getHumanAge();
            System.out.printf("\n%s %d %d\n", prov_name, prov_age, prov_hum_age);
            good_boy.ToString();
            good_boy.setName("(Понял, вычёркиваю)");
            good_boy.setAge(-1);
            good_boy.ToString();
        }
    }
}
