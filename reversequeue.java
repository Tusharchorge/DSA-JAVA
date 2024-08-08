import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class reversequeue {
    public static void main(StringVowels[] args) {
        Queue<Integer>q=new LinkedList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println("Orignal queue: " + q);
        Stack<Integer> st = new Stack<>();
        while (q.size() > 0) {
            st.push(q.remove());
        }
        while (st.size() > 0) {
            q.add(st.pop());
        }
        System.out.print("reverse order queue: " + q);

    }
}