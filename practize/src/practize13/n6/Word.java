package practize13.n6;

import java.io.*;
import java.util.*;

public class Word {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите имя файла");

        String fileName = sc.nextLine();


        List<String> words = readWords(fileName);

        if (words.isEmpty()) {
            System.out.println("Файл пуст или не содержит слов");
            return;
        }

        String result = getLine(words);
        System.out.println("Результат:" + result);
    }

    public static List<String> readWords(String fileName) throws FileNotFoundException  {
        List<String> words = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\1\\Desktop\\" + fileName));
            String line;
            while ((line = br.readLine()) != null) {
                String[] splitWords = line.split("\\s+");
                words.addAll(Arrays.asList(splitWords));
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }
        return words;
    }

    public static String getLine(List<String> words) {
        if (words.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        LinkedList<String> result = new LinkedList<>();
        result.add(words.removeFirst());

        while (!words.isEmpty()) {
            boolean wordAdded = false;

            for (Iterator<String> iterator = words.iterator(); iterator.hasNext();) {
                String word = iterator.next();

                if (lastCharMatchesFirst(result.getFirst(), word)) {
                    result.addFirst(word);
                    iterator.remove();
                    wordAdded = true;
                    break;
                } else if (lastCharMatchesFirst(result.getLast(), word)) {
                    result.addLast(word);
                    iterator.remove();
                    wordAdded = true;
                    break;
                }
            }

            if (!wordAdded) {
                result.add(words.removeFirst());
            }
        }

        for (String word : result) {
            if (!sb.isEmpty()) {
                sb.append(" ");
            }
            sb.append(word);
        }

        return sb.toString();
    }

    private static boolean lastCharMatchesFirst(String word1, String word2) {
        char lastChar = Character.toLowerCase(word1.charAt(word1.length() - 1));
        char firstChar = Character.toLowerCase(word2.charAt(0));
        return lastChar == firstChar;
    }

}
