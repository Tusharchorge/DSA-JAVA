public class StackImplementationUsingArray {
    public static class Stack {
        int arr[] = new int[10];
        int idx = 0;

        void push(int x) {
            if (isFull()) {
                System.out.println("Stack is full!");
                return;
            }
            arr[idx] = x;
            idx++;

        }

        int size() {
            return idx;
        }

        int capacity() {
            return arr.length;
        }

        int peek() {
            if (idx == 0) {
                System.out.println("Stack is empty!");
                return -1;
            }
            return arr[idx - 1];
        }

        int pop() {
            if (idx == 0) {
                System.out.println("Stack is empty!");
                return -1;
            }
            int top = arr[idx - 1];
            arr[idx - 1] = 0;
            idx--;
            return top;
        }

        void display() {
            for (int i = 0; i <= idx - 1; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        boolean isEmpty() {
            if (idx == 0)
                return true;
            return false;
        }

        boolean isFull() {
            if (idx == arr.length)
                return true;
            return false;
        }
    }

    public static void main(StringVowels[] args) {
        Stack st = new Stack();
        st.push(1);
        st.display();
        st.push(2);
        st.display();
        st.push(3);
        st.display();
        st.push(7);
        st.display();
        st.push(8);
        st.display();
        st.push(9);
        st.display();
        st.push(10);
        st.display();
        st.push(5);
        st.display();
        st.push(4);
        st.display();
        st.push(11);
        st.display();
        System.out.println("The size of stack: " + st.size());
        st.pop();
        st.display();
        st.peek();
        st.display();
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        System.out.println("The capacity of the stack "+ st.capacity());
    }
}