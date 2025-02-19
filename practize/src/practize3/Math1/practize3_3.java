package practize3.Math1;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class practize3_3 {
    public static void main(String[] args) {
        boolean flag;
        do {
            flag = true;
            int[] mass = new int[4];

            for (int i = 0; i < 4; i++) {
                mass[i] = ThreadLocalRandom.current().nextInt(10, 99);
            }
            System.out.println(Arrays.toString(mass));

            for (int i = 0; i < 3; i++) {
                if (mass[i] >= mass[i + 1]) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println("Массив строго возрастающая последовательность");
            } else {
                System.out.println("Массив не строго возрастающая последовательность");
            }
        } while (!flag);
    }
}
