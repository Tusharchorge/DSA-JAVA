import java.util.*;
public class SpanStocks{
     
    public static void main(StringVowels[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
             int arr[]= new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Stack<Integer> st=new Stack<>();
            int res[]=new int[n];
            res[0]=1;
            st.push(0);
            for(int i=1;i<n;i++){
                while(st.size()>0 && arr[st.peek()]<=arr[i]){
                    st.pop();
                }
                if(st.size()>0)
                res[i]=i-st.peek();
                else
                    res[i]=i+1;
                    st.push(i);
            }
            
   for(int i=0;i<res.length;i++){
            System.out.println(res[i]+" ");
   }
        }
          catch (Exception e) {
             
        }
}
}