package practize11.n2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateCompareApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");


        LocalDate inputDate;
        LocalDate currentDate;
        String userInput;

        System.out.println("Введите дату в формате ГГГГ-MM-ДД:");
        userInput = scan.nextLine();

        String[] words = userInput.split("-");

        String allWords = String.join("", words);

        inputDate = LocalDate.parse(userInput, formatter);

        DateTimeFormatter dateFormatter = DateTimeFormatter.BASIC_ISO_DATE;
        DateValidator validator = new DateValidatorUsingLocalDate(dateFormatter);

        currentDate = LocalDate.now();

        if (validator.isValid(allWords)) {
            if (inputDate.isBefore(currentDate)) {
                System.out.println("Введенная дата раньше текущей даты.");
            } else if (inputDate.isAfter(currentDate)) {
                System.out.println("Введенная дата позже текущей даты.");
            } else {
                System.out.println("Введенная дата совпадает с текущей датой.");
            }
        }
        else {
            System.out.println("Введена неправильная дата!");
        }
        scan.close();

    }

    static class DateValidatorUsingLocalDate implements DateValidator {
        private final DateTimeFormatter dateFormatter;

        public DateValidatorUsingLocalDate(DateTimeFormatter dateFormatter) {
            this.dateFormatter = dateFormatter;
        }

        @Override
        public boolean isValid(String dateStr) {
            try {
                LocalDate.parse(dateStr, this.dateFormatter);
            } catch (DateTimeParseException e) {
                return false;
            }
            return true;
        }
    }
}
