public class ArrayImplementationUsingCircularQueue {
    public static class Queue {
        int f = -1;
        int r = -1;
        int size = 0;
        int arr[] = new int[6];

        public void add(int val) {
            if (size == arr.length) {
                System.out.println("Queue is full!");
                return;
            }
            if (size == 0) {
                f = r = 0;
                arr[0] = val;
            } else if (r < arr.length - 1) {
                arr[++r] = val;
            } else if (r == arr.length - 1) {
                r = 0;
                arr[0] = val;
            }

            size++;

        }

        public int remove() {
            if (size == 0) {
                System.out.println("Queue is empty!");
                return -1;
            } else if (f == arr.length - 1) {
                int val = arr[f];
                f = 0;
                return val;
            }
            int val = arr[f];
            f++;
            size--;
            return val;
        }

        public int element() {
            return arr[f];
        }

        public void display() {
            if (size == 0) {
                System.out.println("Queue is empty!");
            }

            if (f < r) {
                for (int i = f; i <= r; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();

            }
            if (r < f) {
                for (int i = f; i < arr.length - 1; i++) {
                    System.out.print(arr[i] + " ");
                }
                for (int i = 0; i <= r; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();

        }

        public int size() {
            return size;
        }

        public boolean isEmpty() {
            if (size == 0)
                return true;
            else
                return false;
        }

    }

    public static void main(StringVowels[] args) {
        Queue q = new Queue();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.size());
        q.remove();
        q.remove();
        q.display();
        System.out.println(q.size());
        q.add(10);
        q.add(6);
        q.add(7);
        q.add(8);
        System.out.println(q.size());
        q.display();
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        System.out.println(q.element());

    }
}