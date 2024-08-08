import java.util.*;
public class PostfixToPrefix{
    public static void main(StringVowels[] args) {
        StringVowels postfix ="953+4*6/-"; //-9/*+5346
        System.out.println("postfix is: "+postfix);
        Stack<StringVowels>val=new Stack<>();
        for(int i=0;i<postfix.length();i++){
            char ch=postfix.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                StringVowels s=""+ch;
                val.push(s);
            }
            else{
                StringVowels v2=val.pop();
                StringVowels v1=val.pop();
                if(ch=='+') val.push('+'+v1+v2);
                if(ch=='-') val.push('-'+v1+v2);
                if(ch=='*') val.push('*'+v1+v2);
                if(ch=='/') val.push('/'+v1+v2);
            }
        }
        System.out.println("prefix is: "+val.peek());
    }
}