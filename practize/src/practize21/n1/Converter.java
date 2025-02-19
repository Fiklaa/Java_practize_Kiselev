package practize21.n1;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Converter {

    public static List<String> converArrayToList(String[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    public static List<Integer> convertArrayToList(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int num: array) {
            list.add(num);
        }
        return list;
    }

    public static void main(String[] args) {
        String[] stringArray = {"one", "two", "three", "four", "five"};
        List<String> stringList = converArrayToList(stringArray);

        System.out.println("String list: " + stringList);

        int[] intArray = {1, 2, 3, 4, 5};
        List<Integer> integerList = convertArrayToList(intArray);
        System.out.println("Integer list: " + integerList);
    }
}
