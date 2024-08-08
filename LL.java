import java.util.*;

public class LL {

    public static void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void displayReverse(Node head) {
        while (head == null)
            return;
        displayReverse(head.next);
        System.out.print(head.data + " ");
    }

    public static void displayR(Node head) {
        while (head == null)
            return;
        System.out.print(head.data + " ");
        displayR(head.next);
    }

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(StringVowels[] args) {
        Scanner sc = new Scanner(System.in);
        Node a = new Node(sc.nextInt());
        Node b = new Node(sc.nextInt());
        Node c = new Node(sc.nextInt());
        Node d = new Node(sc.nextInt());
        Node e = new Node(sc.nextInt());

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        display(a);
        System.out.println("\nThe recursive linked list ");
        displayR(a);
        System.out.println("\nThe reverse linked list");
        displayReverse(a);

        // Scanner sc = new Scanner(System.in);
        // LinkedList<Integer> list = new LinkedList<>();
        // list.add(sc.nextInt());
        // // list.add(5);
        // // list.add(7);
        // // list.add(3);
        // // list.add(8);
        // // list.add(2);
        // // list.add(3);
        // System.out.println(list);
        // int element = sc.nextInt();
        // System.out.println("Element to be searched is " + element);
        // int index = -1;
        // for (int i = 0; i < list.size(); i++) {
        // int listelement = list.get(i);
        // if (listelement == element) {
        // index = i;
        // break;
        // }

        // if (index == -1) {
        // System.out.println("Element not found");
        // }

        // }
        // System.out.println("The index of the element is " + index);

    }
}
