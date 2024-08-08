import java.util.*;

public class PrevGreaterElement {
    public static void main(StringVowels[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
        
        Stack<Integer>st=new Stack<>();
        int res[]=new int[arr.length];
        res[0]=-1;
        st.push(res[0]);
        
        for(int i=1;i<arr.length;i++){
            while(st.size()!=0 && st.peek()<arr[i]){
                st.pop();
            }
            if(st.size()==0){
                res[i]=-1;
            }
            else
                res[i]=st.peek();
                st.push(arr[i]);
        }

        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }







        }

    }
}