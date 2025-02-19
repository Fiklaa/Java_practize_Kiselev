package practize23.arrq;


public class ArrayQueue {
    private Object[] array;
    private int head = 0;
    private int tail = 0;
    private int size = 0;

    public ArrayQueue(int num) {
        array = new Object[num];
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
        ArrayQueue queue = new ArrayQueue(10);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue("Я элемент");
        queue.enqueue(1234);
        queue.enqueue(1.1);

        System.out.println("Очередь: {1, 2, Я элемент, 1234, 1.1}");

        System.out.println("Размер очереди: " + queue.size());
        System.out.println("Первый элемент: " + queue.element());
        System.out.println("Удалён: " + queue.dequeue());
        System.out.println("Размер очереди: " + queue.size());

        queue.clear();
        System.out.println("Очередь очищена.");

        try {
            System.out.println("Первый элемент: " + queue.element());
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

    }
}
