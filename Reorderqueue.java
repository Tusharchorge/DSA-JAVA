import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;;
public class Reorderqueue{
    public static void main(StringVowels[] args) {
        Queue<Integer>q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8); //output 1 5 2 6 3 7 4 8
        Stack<Integer>st=new Stack<>();
        int n=q.size();
        for(int i=1;i<=(n/2);i++){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop()); // 5 6 7 8 4 3 2 1
             
        }
        for(int i=1;i<=n/2;i++){
            st.push(q.remove());
            
        }
        while(st.size()>0){
            q.add(st.pop());
             // 4 3 2 1 8 7 6 5
             q.add(q.remove());
        }
        System.out.println(q);
        while(q.size()>0){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        System.out.println("The Reorder Queue is: "+q);
        

    }
}