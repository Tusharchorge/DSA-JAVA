import java.util.*;
public class SortArray{
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
    public static void sortarr(int arr[]){
        int front=0;
        int back=arr.length-1;
        while(front<back){
            if(arr[front]==1 && arr[back]==0){
                swap(arr, front, back);
                front++;
                back--;
            }
            if(arr[front]==0){
                front++;
            }
            if(arr[back]==1){
            back--;
            }
        }
            if(arr[front]==1 && arr[back]==1){
                arr[front]=0;
                front++;
                back--;

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
         sortarr(arr);
         printarr(arr);
    }

}