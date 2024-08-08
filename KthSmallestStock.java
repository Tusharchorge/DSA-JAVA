import java.util.*;
public class KthSmallestStock{
     
    public static int kthSmallest(int[] arr, int K)
    {
        Arrays.sort(arr);

         
        return arr[K - 1];
    }

     
    public static void main(String[] args)
    {
        int arr[] = new int[] { 1,2,3,4,5,6,7,8,9 };
        int K = 4;

        System.out.print("K'th smallest element is "
                         + kthSmallest(arr, K));
    }
}

















    // public static int KthSmallest(int arr[],int k) {
    //   Arrays.sort(arr);
    //   return arr[k - 1];
         
    // }
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int size=sc.nextInt();
    //     int arr[]=new int[size];
    //     int k=sc.nextInt();

    //     for(int i=0;i<size;i++){
    //         arr[i]=sc.nextInt();
    //     }
    //      System.out.println(KthSmallest(arr, k));
    // }

