import java.util.*;

public class ReverseString {
    public static int[] mergetwoArray(int arr[], int brr[],int n,int m) {
         for(int j=0,i=n-1;j<m;j++){
            arr[i]=brr[j];
            i++;
         }
         Arrays.sort(arr);
         return arr;
        }

    public static void print(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "");
        }
        System.out.println();
    }

    public static void main(StringVowels[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int brr[] = new int[m];
        for (int i = 0; i < brr.length; i++) {
            brr[i] = sc.nextInt();
        }
        // output 1,2,2,3,3,4,5,6,7,8  
        int b[] = mergetwoArray(arr, brr, n, m);;
        print(brr);
    }







    // int count=0;
    // StringBuilder sb= new StringBuilder(s);
    // sb.reverse();
    // System.out.println(sb);
    // for(int i=0;i<s.length();i++){
    // if(s.charAt(i)==sb.charAt(i)){
    // count++;
    // }
    // }
    // System.out.println(count);
}
