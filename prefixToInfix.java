import java.util.*;

public class prefixToInfix {
    public static void main(StringVowels[] args) {
        StringVowels prefix = "-9/*+5346";
        System.out.println(prefix);
        Stack<StringVowels> val = new Stack<>();
        for (int i = prefix.length() - 1; i >= 0; i--) {
            char ch = prefix.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) {

                val.push(ch + "");
            } else {
                StringVowels v1 = val.pop();
                StringVowels v2 = val.pop();
                char o = ch;
                StringVowels t =   v1 + o + v2  ;
                val.push(t);
            }
        }
        System.out.println(val.peek());
    }

}