package practize23;

import practize23.arrq.LinkedQueue;

import java.util.Scanner;

public class MainQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите тип очереди:");
        System.out.println("1 - Связанная очередь (LinkedQueue)");
        System.out.println("2 - Очередь на массиве (ArrayQueue)");

        int type = scanner.nextInt();
        Queue queue = (type == 1) ? new LinkedQueue() : new ArrQueue();

        boolean running = true;

        while (running) {
            System.out.println("\nВыберите операцию:");
            System.out.println("1 - Добавить элемент");
            System.out.println("2 - Удалить элемент");
            System.out.println("3 - Посмотреть первый элемент");
            System.out.println("4 - Размер очереди");
            System.out.println("5 - Очистить очередь");
            System.out.println("6 - Выход");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Введите элемент для добавления: ");
                    Object element = scanner.next();
                    queue.enqueue(element);
                    break;
                case 2:
                    try {
                        System.out.println("Удалён элемент: " + queue.dequeue());
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Первый элемент: " + queue.element());
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Размер очереди: " + queue.size());
                    break;
                case 5:
                    queue.clear();
                    System.out.println("Очередь очищена.");
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
        scanner.close();
    }
}
