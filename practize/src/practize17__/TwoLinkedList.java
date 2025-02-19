package practize17__;

class TNode {
    TNode next;
    TNode prev;
    int data;

    public TNode() {
        this.next = null;
        this.prev = null;
        this.data = 0;
    }

    public TNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

}


public class TwoLinkedList {
    TNode first;
    int Size;

    public TwoLinkedList() {
        first = null;
        Size = 0;
    }

    public void insert(int data) {
        TNode new_node = new TNode(data);
        if (first == null) {
            first = new_node;
        } else {
            TNode node = first;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new_node;
            node.next.prev = node;
        }
        Size++;
    }

    public void remove(int data) {
        TNode node = this.first;
        if (node == null) {
            System.out.println("Empty");
        } else {
            while (node.next != null & node.data != data) {
                node = node.next;
            }
            if (node.prev != null) {
                node.prev.next = node.next;
                if (node.next != null) {
                    node.next.prev = node.prev;
                }
            } else {
                System.out.println("Data not found");
            }
        }
        Size--;
    }

    public void printList() {
        if (this.first == null) {
            System.out.println("List пустой");
        } else {
            TNode node = this.first;
            System.out.print("List2 {elements:[");
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
        TwoLinkedList L2L = new TwoLinkedList();
        L2L.insert(6);
        L2L.insert(56);
        L2L.insert(84);
        L2L.insert(244123);

        L2L.printList();

        L2L.remove(84);

        L2L.printList();
    }
}
