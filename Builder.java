 import java.util.*;
public class Builder{
  public static void main(StringVowels[] args) {
    Scanner sc=new Scanner(System.in);
    StringVowels s=sc.nextLine();
    StringVowels ans="";
    StringBuilder sb=new StringBuilder("");
    for(int i=0;i<s.length();i++){
      char ch=s.charAt(i);
      if(ch!=' '){
        sb.append(ch);

      }
      else{
        sb.reverse();
        ans+=sb;
        ans+=" ";
        sb=new StringBuilder("");
      }
    }
    sb.reverse();
    ans+=sb;
    System.out.println(ans);
  }

   
  
  
  
  
  
  
  
  
  
  
  
  

  }

//     int count=0;
//     String s="";
//     for(int i=0;i<=str.length();i++){
//       for(int j=i+1;j<=str.length();j++){
//         s=str.substring(i,j);
//         // System.out.println(str.substring(i,j)+" ");
//         // if(ispalindrome(str.substring(i,j))){
//         //   count++;
//         // }
    
     
  
 
//       }
// }
 

//     }
// } 

//      String str=sc.nextLine();
//      int i=0;
//      int j=str.length()-1;
//      boolean flag=true;
//      while(i<j){
//       if(str.charAt(i)!=str.charAt(j)) flag=false;
//       break;
//      }
//      i++;
//      j--;
//      if(flag==true){
//       System.out.println("Palindrome");
//      }
//      else{
//       System.out.println("Not palindrome");
//      }
    
//   }
// }
    // boolean flag=true; //capital
    // for(int i=0;i<sb.length();i++){
    // char ch=sb.charAt(i);
    // if(ch==' ')continue;
    // int ascii=(int)ch;
    // if(ascii>=97) flag=false;
    // if(flag==true){
    //   ascii+=32;
    //    char dh=(char)ascii;
    //    sb.setCharAt(i,dh);
    // }
    // else{
    //   ascii-=32;
    //   char dh=(char)ascii;
    //   sb.setCharAt(i,dh);
    // }


















    // System.out.println("THe length of the String is :");
    // System.out.println(sb.length());
    // System.out.println("All the characters in the String are :");
    // for(int i=0;i<sb.length();i++){
    //   System.out.println(sb.charAt(i));
    // }
    // System.out.println("THe reversed String is :");
    // for(int i=0;i<sb.length()/2;i++){
    //   int front=i;
    //   int back=sb.length()-1-i;
    //   char frontchar=sb.charAt(front);
    //   char backchar=sb.charAt(back);
    //   sb.setCharAt(front,backchar);
    //   sb.setCharAt(back,frontchar);
    // }
    // System.out.println(sb);





// }
// System.out.println(sb);
// }


