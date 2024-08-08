  import java.util.*;
public class Functions{
  public static void main(StringVowels[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number ");
    int n=sc.nextInt();
    int factorial=1;
    if(n<0){
      System.out.println("invalid number ");
    }
    for(int i=n;i>=1;i--){
      factorial=factorial*i;

    }
    System.out.println("factorial of the " + n + " is "+ factorial);
  }

}


  

  
// public  static void printFactorial(int n) {
//        //loop
//        if(n < 0) {
//            System.out.println("Invalid Number");
//            return;
//        }
//        int factorial = 1;


//        for(int i=n; i>=1; i--) {
//            factorial = factorial * i;
//        }


//        System.out.println("factorial of the number:" + factorial);
//        return;
//    }
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the the number:");
//        int n = sc.nextInt();


//        printFactorial(n);
//    
// //  }

    //   
  //   public static void main(String[] args) {
  //     Scanner sc=new Scanner(System.in);
  //     int n=sc.nextInt();
  //     int sum=0;
  //     for(int i=0;i<=n;i++){
        
  //       if(i%2==1){
  //         sum=sum+i;
  //         System.out.println(sum);

  //       }
        
  //     }
      
  //   }
  // }


      