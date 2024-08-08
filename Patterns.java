 import java.util.*;
 public class Patterns{
     public static void main(StringVowels args[]){
            int n=4;
            for(int i=1;i<=n;i++){
              for(int j=1;j<=n-i;j++){
                System.out.print(" ");
              }
              for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
              }
              System.out.println();
            }
            
            for(int i=n;i>=1;i--){
              for(int j=1;j<=n-i;j++){
                System.out.print(" ");
              }
              for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
              }
              System.out.println();
            }

            
     }
    }

//  //          *Butterfly pattern*

//          for(int i=1;i<=n;i++) {
//             for(int j=1; j<=i;j++) {
//                 System.out.print("*");
//             }
//             for(int j=1;j<=2*(n-i);j++) {
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i;j++) {
//                 System.out.print("*");
//             }

//             System.out.println();
            
//         }
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//             System.out.print("*");

//             }
//             for(int j=1;j<=2*(n-i);j++) {
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//           }
//         }
//       }
 
      
//      // Pyramid pattern
// //        for(int i=1;i<=n;i++)
// //        {
// //         for(int j=1;j<=n-i;j++){
// //             System.out.print(" ");
//         }
//         for(int j=1;j<=i;j++){
//             System.out.print( i + " ");
        
//        }
//        System.out.println();
    

        //rhombus pattern
    //     for(int i=1;i<=n;i++)
    //    {
    //     for(int j=1;j<=n-i;j++){
    //       System.out.print(" ");
    //     }
    //     for(int j=1;j<=n;j++){
    //       System.out.print( "*" );
        
    //    }
    //       System.out.println();
    // }

       //palindrom pattern
    //    for(int i=1;i<=n;i++)
    //   {
    //       for(int j=1;j<=n-i;j++){
    //        System.out.print(" ");
    //      }
    //      for(int j=i;j>=1;j--){
    //        System.out.print(j);
        
    //     }
    //     for(int j=2;j<=i;j++){
    //        System.out.print(j);
        
    //     }
          // System.out.println();
     //}

     
     