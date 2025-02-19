package practize23;

public class ArrQueue extends AbstractQueue {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] array = new Object[DEFAULT_CAPACITY];
    private int head = 0;
    private int tail = 0;

    @Override
    public void enqueue(Object element) {
        if (element == null) {
            throw new IllegalArgumentException("Элемент не может быть null");
        }
        if (size == array.length) {
            expandCapacity();
        }
        array[tail] = element;
        tail = (tail + 1) % array.length;
        size++;
    }

    private void expandCapacity() {
        Object[] newArray = new Object[array.length * 2];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[(head + i) % array.length];
        }
        array = newArray;
        head = 0;
        tail = size;
    }

    @Override
    public Object element() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        return array[head];
    }

    @Override
    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        Object result = array[head];
        head = (head + 1) % array.length;
        size--;
        return result;
    }
}
