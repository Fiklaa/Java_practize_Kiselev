package practize17__;


class Node {
    Node next;
    int data;

    public Node() {
        this.next = null;
        this.data = 0;
    }

    public Node(int data, Node link) {
        this.data = data;
        this.next = null;
    }
}


public class LinkedList {
    private Node first;
    private int Size;

    public LinkedList() {
        first = null;
        Size = 0;
    }

    public void insert(int data) {
        Node new_node = new Node(data, null);
        if (first == null) {
            first = new_node;
        } else {
            Node node = first;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new_node;
        }
        Size++;
    }

    public void remove(int data) {
        Node node = this.first;
        if (node == null) {
            System.out.println("Empty");
        } else {
            Node prev = null;
            while (node.next != null && node.data != data) {
                prev = node;
                node = node.next;
            }
            if (node.data == data) {
                if (prev != null) {
                    prev.next = node.next;
                } else {
                    this.first = node.next;
                }
            } else {
                System.out.println("No data!");
            }
        }
        Size--;
    }

    public void printList() {
        if (this.first == null) {
            System.out.println("List пустой");
        } else {
            Node node = this.first;
            System.out.print("List {elements:[");
            while (node != null) {
                System.out.print(node.data);
                node = node.next;
                if (node != null) {
                    System.out.print(", ");
                }
            }
            System.out.printf("] | size = %d}\n", Size);
        }

    }

    public static void main(String[] args) {
        LinkedList LL = new LinkedList();
        LL.insert(1);
        LL.insert(2);
        LL.insert(345);
        LL.insert(244);

        LL.printList();

        LL.remove(2);

        LL.printList();
    }
}