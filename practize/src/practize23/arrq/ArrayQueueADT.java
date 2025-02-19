package practize23.arrq;

import java.util.Scanner;

public class ArrayQueueADT {
    private Object[] array;
    private int head = 0;
    private int tail = 0;
    private int size = 0;

    public ArrayQueueADT(int capacity) {
        array = new Object[capacity];
    }

    public void enqueue(Object element) {
        if (size == array.length) {
            throw new IllegalStateException("Очередь заполнена");
        }
        array[tail] = element;
        tail = (tail + 1) % array.length;
        size++;
    }

    public Object element() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        return array[head];
    }

    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        Object result = array[head];
        head = (head + 1) % array.length;
        size--;
        return result;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        head = 0;
        tail = 0;
        size = 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayQueueADT queue = new ArrayQueueADT(10);
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

