import java.util.*;

public class RemoveConsecutiveSubsequencesInArray {
    public static int[] remove(int arr[]) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
        if (st.isEmpty() || st.peek() != arr[i]) {
            st.push(arr[i]);
        } else if (arr[i] == st.peek()) {
            if (i==n-1 || arr[i] != arr[i + 1]) {
                st.pop();
            }
        }
    }
        int res[] = new int[st.size()];
        int m = res.length;
        for (int i = m - 1; i >= 0; i--) {
            res[i] = st.pop();
        }

        return res;
    }

    public static void main(StringVowels[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the Array");
            int size = sc.nextInt();
            int arr[]=new int[size];
            System.out.println("Enter the elements ");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("After removing consecutive subsequenses ");
            int res[] = remove(arr);
            for (int i = 0; i < res.length; i++) {
                System.out.print(res[i] + " ");
            }
        }
    }
}