import java.util.*;
public class StringVowels{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(); //MyNmsntny //AEIOU aeiou
        StringBuilder sb=new StringBuilder();
        StringBuilder st=new StringBuilder();
         for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                sb.append(ch);
            }
            else{
                st.append(ch);
            }
         }
         s=st.toString();

System.out.println(sb);
System.out.println(s);
        





    }
}
