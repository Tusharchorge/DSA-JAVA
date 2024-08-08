import java.util.*;
public class PrefixEvalution{
    public static void main(StringVowels[] args) {
        StringVowels str="-9/*+5346";
        System.out.println(str);
        Stack<Integer>val=new Stack<>();
        int n=str.length();
        for(int i=n-1;i>=0;i--){
            char ch=str.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                val.push(ascii-48);
            }
            else{
                int v1=val.pop();
                int v2=val.pop();
                if(ch=='+') val.push(v1+v2);
                if(ch=='-') val.push(v1-v2);
                if(ch=='*') val.push(v1*v2);
                if(ch=='/') val.push(v1/v2);
            }
        }
        System.out.println(val.peek());

    }
}