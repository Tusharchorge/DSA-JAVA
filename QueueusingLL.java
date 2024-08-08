public class QueueusingLL {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static class queue1 {
        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int x) {
            Node temp = new Node(x);
            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
        public int remove() {
            if (size == 0) {
                System.out.println("Queue is Empty!");
                return -1;
            }
            int val = head.val;
            head = head.next;
            size--;
            return val;
        }

        public int peek() {
            if (size == 0) {
                System.out.println("Queue is Empty!");
                return -1;
            }
            return head.val;
        }

        public void display() {
            if (size == 0) {
                System.out.print("Queue is Empty!");
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        public int size(){
            return size;
        }

    }

    public static void main(StringVowels[] args) {
        queue1 q = new queue1();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        System.out.println(q.peek());
        System.out.println(q.size());
        q.remove();
        q.display();


    }

}