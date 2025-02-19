package practize11.n4;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalendarApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int year, month, day, hours, minutes;

        int[] day_month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        while(true) {

            System.out.println("Введите год:");
            year = scan.nextInt();
            if (year < 0) {
                System.out.println("Неверный год!");
                continue;
            }

            System.out.println("Введите месяц (1-12):");
            month = scan.nextInt();
            if (month > 12 || month < 1) {
                System.out.println("Неверный месяц!");
                continue;
            }

            System.out.println("Введите день:");
            day = scan.nextInt();
            if (day < 1 || day > day_month[month - 1]) {
                System.out.println("Неверный день месяца!");
                continue;
            }

            System.out.println("Введите часы:");
            hours = scan.nextInt();
            if (hours > 24 || hours < 0) {
                System.out.println("Неверные часы!");
                continue;
            }

            System.out.println("Введите минуты:");
            minutes = scan.nextInt();
            if (minutes > 24 || minutes < 0) {
                System.out.println("Неверные минуты!");
                continue;
            }
            break;
        }

        Calendar calendarApp_day = Calendar.getInstance();
        calendarApp_day.set(year, month - 1, day, hours, minutes);
        Date date = calendarApp_day.getTime();

        System.out.println("Созданная дата (Date): " + date);

        System.out.println("Созданная дата (Calendar): " + calendarApp_day.getTime());

        scan.close();
    }
}
