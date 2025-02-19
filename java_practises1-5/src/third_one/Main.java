package third_one;

import java.util.Arrays;
import java.util.Random;


public class Main {
    public static void main(String[] args){
        Random random = new Random();
        int[] arr = new int[4];
        int i;
        for (i = 0; i < arr.length; i++){
            arr[i] = 10 + random.nextInt(90);
        }

        System.out.printf("Массив со случайными числами: %s", Arrays.toString(arr));
        boolean isTrue = true;
        for (i = 1; i < arr.length; i++){
            if (arr[i] <= arr[i - 1]){
                isTrue = false;
                break;
            }
        }

        if (isTrue)
            System.out.print("\nМассив является строго возрастающей последовательностью");
        else
            System.out.print("\nМассив не является строго возрастающей последовательностью");
    }
}
