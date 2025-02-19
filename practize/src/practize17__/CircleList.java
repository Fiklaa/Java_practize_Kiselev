package practize17__;


class CNode {

    int data;
    CNode next;

    public CNode() {
        this.next = null;
        this.data = 0;
    }

    public CNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircleList {
    private CNode head = null;
    private CNode tail = null;
    private int Size;

    public void insert(int data) {
        CNode newNode = new CNode(data);

        if (head == null) {
            head = newNode;
            tail = newNode;

            newNode.next = head;
        } else {
            newNode.next = head;
            tail.next = newNode;
            tail = newNode;
        }
        Size++;
    }

    public void remove(int key) {
        if (head == null) {
            return;
        }

        CNode curr = head;
        CNode prev = null;
        while (curr.next != head) {
            if (curr.data == key) {
                if (prev == null) {
                    CNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = curr.next;
                    last.next = head;
                    return;
                } else {
                    prev.next = curr.next;
                    if (curr == tail) {
                        tail = prev;
                    }
                    Size--;
                    return;
                }
            }
            prev = curr;
            curr = curr.next;
        }

        if (curr == head && curr.data == key) {
            prev.next = head;

            tail = prev;
        }
        Size--;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List пустой");
            return;
        }

        System.out.print("List3 {elements:[");

        CNode curr = head;
        do {
            System.out.print(curr.data);
            curr = curr.next;
            if (curr != head) {
                System.out.print(", ");
            }
        } while (curr != head);
        System.out.printf("] | size = %d}\n", Size);
    }

    public static void main(String[] args) {
        CircleList L3L = new CircleList();

        L3L.insert(16);
        L3L.insert(2411);
        L3L.insert(33);
        L3L.insert(4111);

        L3L.printList();

        L3L.remove(2411);

        L3L.printList();
    }
}

