import java.util.*;
public class PrefixToPostfix{
    public static void main(StringVowels[] args) {
        StringVowels prefix="-9/*+5346";
        System.out.println(prefix);
        Stack<StringVowels>val=new Stack<>();
        for(int i=prefix.length()-1;i>=0;i--){
            char ch=prefix.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                StringVowels s=""+ch;
                val.push(s);
            }
            else{
                StringVowels v1=val.pop();
                StringVowels v2=val.pop();
                
                if(ch=='+') val.push(v1+v2+'+');
                if(ch=='-') val.push(v1+v2+'-');
                if(ch=='*') val.push(v1+v2+'*');
                if(ch=='/') val.push(v1+v2+'/');
            }
        }
        System.out.println(val.peek());
    }
}