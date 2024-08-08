import java.util.*;

public class PostfixToInfix {
    public static void main(StringVowels[] args) {
        StringVowels prefix = "953+4*6/-";
        System.out.println(prefix);
        Stack<StringVowels> val = new Stack<>();
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) {

                val.push(ch + "");
            } else {
                StringVowels v2 = val.pop();
                StringVowels v1 = val.pop();
                char o = ch;
                StringVowels t = "(" + v1 + o + v2 + ")";
                val.push(t);
            }
        }
        System.out.println(val.peek());
    }
}