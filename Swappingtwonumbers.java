import java.util.*;
public class Swappingtwonumbers{
    public static void sortedArray(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
               arr[i]=0;
                count++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(i<count){
                System.out.print(arr[i]=0);
            }
            else{
                 System.out.print(arr[i]=1);
            }
        }
    }
    

public static void main(StringVowels[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the elements: ");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
System.out.println("the sorted array: ");
sortedArray(arr);
    }
}








        // System.out.println("Enter b");
        // int b=sc.nextInt();
        //  if(a<=b || a>=b){
        //    a=a^b;
        //    b=a^b;
        //    a=a^b;
             
        //  }
//     System.out.println("After swapping a is: "+a);

//     }
// }
    
    
