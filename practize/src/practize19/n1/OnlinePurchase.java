package practize19.n1;

import java.util.Scanner;

public class OnlinePurchase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите ФИО: ");
            String fullName = scanner.nextLine();

            System.out.print("Введите номер ИНН: ");
            String inn = scanner.nextLine();

            validateINN(inn);

            System.out.println("Заказ оформлен успешно для клиента: " + fullName);

        } catch (InvalidINNException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }

    public static void validateINN(String inn) throws InvalidINNException {
        if (inn.length() != 10 && inn.length() != 12) {
            throw new InvalidINNException("ИНН должен содержать 10 или 12 цифр.");
        }

        if (!inn.matches("\\d+")) {
            throw new InvalidINNException("ИНН должен состоять только из цифр.");
        }

        if (!inn.startsWith("12")) {
            throw new InvalidINNException("Неправильное контрольное число ИНН");
        }

        System.out.println("ИНН действителен.");
    }

    static class InvalidINNException extends Exception {
        public InvalidINNException(String message) {
            super(message);
        }
    }
}

