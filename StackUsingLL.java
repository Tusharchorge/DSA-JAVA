public class StackUsingLL {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static class LLstack {
        Node head = null;
        int size = 0;

        void displayrec(Node h) {
            if (h == null)
                return;
            displayrec(h.next);
            System.out.print(h.val + " ");
        }

        void display() {
            displayrec(head);
            System.out.println();
        }

        void displayrev() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        int pop() {
            if (head == null) {
                System.out.println("Stack is Empty!");
                return -1;

            }
            int x = head.val;
            head = head.next;
            return x;

        }

        int size() {
            return size;
        }

        int peek() {
            if (head == null) {
                System.out.println("Stack is Empty!");
                return -1;

            }
            return head.val;
        }
    }

    public static void main(StringVowels[] args) {
        LLstack st = new LLstack();
        st.push(1);
        st.display();
        st.push(2);
        st.display();
        st.push(3);
        st.display();
        st.push(4);
        st.display();
        st.push(5);
        st.display();
        st.push(6);
        st.display();
        System.out.println("The size of stack: " + st.size());
        st.pop();
        st.display();
       System.out.println(st.peek());
         

    }
}