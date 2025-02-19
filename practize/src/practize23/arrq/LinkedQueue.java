package practize23.arrq;

import practize23.AbstractQueue;

public class LinkedQueue extends AbstractQueue {
    private static class Node {
        Object data;
        Node next;

        Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node head = null;
    private Node tail = null;

    @Override
    public void enqueue(Object element) {
        if (element == null) {
            throw new IllegalArgumentException("Элемент не может быть null");
        }
        Node newNode = new Node(element, null);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    @Override
    public Object element() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        return head.data;
    }

    @Override
    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        Object result = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return result;
    }
}
