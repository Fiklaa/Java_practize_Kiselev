package second_one;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args){
        System.out.print("Введите слова через пробел: \n");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine().trim();
        String[] line_split = line.split("[ \t]+");
        System.out.printf("Вы ввели %d слов(а)", line_split.length);
    }
}
