package practize11.n1;

import java.util.Arrays;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Random;

public class Tester {
    public static void main(String[] args) {
        Date curr = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat();
        Random rand = new Random();
        DevOps developer1 = new DevOps("Коля", curr);
        DevOps developer2 = new DevOps("Жора", curr);
        DevOps developer3 = new DevOps("Жоски чел", curr);

        DevOps[] developers = {developer1, developer2, developer3};

        for (int i = 0; i < developers.length; i++) {
            try {
                Thread.sleep(rand.nextInt(1000, 5000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Date endDate = new Date();
            developers[i].setSolveTask(endDate);
        }


        System.out.println(Arrays.toString(developers));

    }
}
