import java.util.*;
public class NextgreaterElement{
    public static void main(StringVowels[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array ");
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Stack<Integer> st=new Stack<>();
            int res[]=new int[n];
            res[n-1]=-1;
            st.push(arr[n-1]);
            for(int i=n-2;i>=0;i--){
                while( st.size()>0 && st.peek()<=arr[i]){
                    st.pop();
                }
                    if(st.size()==0) {
                        res[i]=-1; 
                    }
                    else
                        res[i]=st.peek();
                        st.push(arr[i]);
                }
                System.out.println("The next Greater element of corresponding element ");
                for(int i=0;i<res.length;i++){
                    System.out.print(res[i]+" ");
                }
        }
    }
        }
