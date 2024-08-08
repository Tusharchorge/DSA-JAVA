import java.util.*;
public class Oops{
        public static void main(StringVowels[] args) {
         Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
         for(int i=0;i<size;i++){
          arr[i]=sc.nextInt();    
        }
        Arrays.sort(arr);
         int min=arr[0];
         int max=arr[arr.length-1];
         int seclarge=arr[arr.length-2];
         System.out.print("The minimum number is "+min);
         System.out.println();
         System.out.print("The maximum number is "+max);
         System.out.println();
         System.out.println("The second largest number is "+seclarge);

        }


        }













//   import java.util.*;
//   class Pair{
//         int min;
//         int max;
//   }
//       public class Oops{
//                 static Pair getMinMax(int arr[],int n){
//                 Pair minmax=new Pair();
//                 Arrays.sort(arr);
//                 minmax.min=arr[0];
//                 minmax.max=arr[n-1];
//                 return minmax;
//                 }
        
// public static void main(String[]args){
//         int arr[]={1,3,4,2,5,7,6};
//         int size=arr.length;
//         Pair minmax=getMinMax(arr,size);
//         System.out.println(Arrays.toString(arr));
//         System.out.println("maximum number is "+minmax.min);
//         System.out.println("Minimum number is "+minmax.max);


// }
//         }
  
    


        // System.out.println("The Array is ");
        // for(int i=0;i<Arr.length;i++){
        // System.out.print(Arr[i]+" "); 
        // }
        // System.out.println();
        // System.out.println("The reverse array is ");
        // for(int i=Arr.length-1;i>=0;i--){
        //     System.out.print(Arr[i]+" ");
        // }
    
 










// import java.util.*;
//  public class Oops{
//   public static void main(String[] args) {
//   Scanner sc=new Scanner(System.in); 
//   System.out.println("Enter the size :");
//   int size=sc.nextInt();
//   int Arr[]=new int[size];
//   System.out.println("Enter the number :");
//   for(int i=0;i<size;i++){
//     Arr[i]=sc.nextInt();
//   }
//   System.out.println("The length of the array is "+Arr.length);
//     if(Arr.length==0){
//         System.out.println("Enter minimum one element");
//     } 
//     int min=Arr[0];
//     int max=Arr[0];
//     for(int i=1;i<size;i++){
//         min=Math.min(min, Arr[i]);
//         max=Math.max(max,Arr[i]);
//     }
//     System.out.println("Maximum element is "+max);
//     System.out.println("minimum element is "+min);



//   }
// }
 










//  import java.util.*;
//  public class Oops{
//   public static void main(String[] args) {
//   Scanner sc=new Scanner(System.in);
//   int input;
//   do{
//   System.out.println("Enter the size :");
//   int size=sc.nextInt();
//   int Arr[]=new int[size];
//   System.out.println("Enter the number :");
//   for(int i=0;i<size;i++){
//     Arr[i]=sc.nextInt();
//   }
//   System.out.println("The array is: ");
//   for(int i=0;i<size;i++){
//     System.out.println(Arr[i]+" ");
//   }
//   int max=Integer.MIN_VALUE;
//   int min=Integer.MAX_VALUE;
//   for(int i=0;i<size;i++){
//   if(Arr[i]>max){
//     max=Arr[i];    
//   }
//  if(Arr[i]<min){
//     min=Arr[i];

//   }
// }
// System.out.println("The maximum number is: "+max);
// System.out.println("The minimum number is: "+min);

// input=sc.nextInt();
// if(input==0){
//   System.out.println("exist ");
// }
// }
// while(input==1);
//   }





//  }
