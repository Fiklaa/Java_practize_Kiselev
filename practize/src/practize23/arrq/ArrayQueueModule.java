package practize23.arrq;

import java.util.Scanner;

public class ArrayQueueModule {
    private static final int DEFAULT_CAPACITY = 10;
    private static Object[] array = new Object[DEFAULT_CAPACITY];
    private static int head = 0;
    private static int tail = 0;
    private static int size = 0;

    public static void enqueue(Object element) {
        if (size == array.length) {
            throw new IllegalStateException("Очередь заполнена");
        }
        array[tail] = element;
        tail = (tail + 1) % array.length;
        size++;
    }

    public static Object element() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        return array[head];
    }

    public static Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        Object result = array[head];
        head = (head + 1) % array.length;
        size--;
        return result;
    }

    public static int size() {
        return size;
    }

    public static boolean isEmpty() {
        return size == 0;
    }

    public static void clear() {
        head = 0;
        tail = 0;
        size = 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
                    enqueue(element);
                    break;
                case 2:
                    try {
                        System.out.println("Удалён элемент: " + dequeue());
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Первый элемент: " + element());
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Размер очереди: " + size());
                    break;
                case 5:
                    clear();
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
