import java.util.*;
public class Strings{
    public static void main(StringVowels[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string ");
        StringBuilder sb=new StringBuilder("abcdaabebbcd");
        int count=0;
        for(int i=0;i<sb.length();i++){
            char ch=sb.charAt(i);
            int ascii=(int)ch;
        }
        for(int i=0;i<sb.length()-1;i++){
            for(int j=i+1;j<sb.length();j++){
                if(sb.charAt(i)==sb.charAt(j)){
                    count++;
                }
            }
        }
        System.out.println(count);



    }
}

















//         // for(int i=0;i<sb.length()/2;i++){
//         //     int front =i;
//         //     int back=sb.length()-1-i;
//         //     char frontchar=sb.charAt(front);
//         //     char backchar=sb.charAt(back);
//         //     sb.setCharAt(front,backchar);
//         //     sb.setCharAt(back,frontchar);
//         // }
//         // System.out.println(sb);
//         for(int i=0;i<sb.length();i++){
//             System.out.println(sb.charAt(i));
//         }
//         System.out.println();
//         for(int i=sb.length()-1;i>=0;i--){
//             System.out.print(sb.charAt(i));
//         }


//     }
// }











//  import java.util.*;
//  public class Strings{

//     public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//      String email=sc.next();
//      String result="";
//     for(int i=0;i<email.length();i++){
//         if(email.charAt(i)=='@'){
//             break;

//         }
//         else{
//             result+=email.charAt(i);
//         }
//     }
//     System.out.println(result);
//    }
// }

    


//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int size=sc.nextInt();
//         String array[]=new String[size];
//         int length=0;
//         for(int i=0;i<size;i++){
//             array[i]=sc.next();
            

//             length+=array[i].length();
//         }
//         System.out.println(length);
        

//         }
// }




        // if(name1.compareTo(name2)==0){
        //     System.out.println("Stings are equal:");
        // }
        // else{
        //     System.out.println("Strings are not equal:");
        // }
        
    
