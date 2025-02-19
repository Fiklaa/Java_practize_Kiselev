package practize26;

import java.util.Iterator;

class CustomList<T> {
    private Node<T> head;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public int size() {
        return size;
    }

    public Iterator<T> iterator() {
        return new CustomListIterator();
    }

    private class CustomListIterator implements Iterator<T> {
        private Node<T> current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new IllegalStateException("No more elements");
            }
            T data = current.data;
            current = current.next;
            return data;
        }
    }

    public static void main(String[] args) {
        CustomList<Integer> customList = new CustomList<>();
        customList.add(1);
        customList.add(2);
        customList.add(3);

        Iterator<Integer> iterator = customList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
