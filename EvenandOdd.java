import java.util.*;
public class EvenandOdd{
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void swap(int arr[],int i ,int j){
       
            int temp=arr[i];
            arr[i] =arr[j];
            arr[j]=temp;
    }
    static void reverse(int arr[]){
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int[] sortarr(int[]arr){
        int ans[]=new int[arr.length];
        int z=0;
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[z++]=arr[left]*arr[left];
                left++;
            }
            else{
                ans[z++]=arr[right]*arr[right];
                right--;
            }
        }
        return ans;
    }
    public static void EvenOdd(int arr[]){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]%2==1 && arr[right]%2==0){
                swap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;

            }
            if(arr[right]%2==1){
                right--;
            }
        }
    }
    public static void main(StringVowels[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter size of array: ");
            int n=sc.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter the elements: ");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
             int ans[]=sortarr(arr);
            printarr(ans);
             reverse(ans);
             

    }
}