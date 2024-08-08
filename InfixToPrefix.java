import java.util.*;

public class InfixToPrefix {
   public static void main(StringVowels[] args) {
      StringVowels infix = "9-(5+3)*4/6";
      System.out.println(infix);
      Stack<StringVowels> val = new Stack<>();
      Stack<Character> op = new Stack<>();

      for (int i = 0; i < infix.length(); i++) {
         char ch = infix.charAt(i);
         int ascii = (int) ch;
         if (ascii >= 48 && ascii <= 57) {
            StringVowels s = "" + ch;
            val.push(s);
         } else if (op.size() == 0 || ch == '(' || op.peek() == '(')
            op.push(ch);
         else if (ch == ')') {
            while (op.peek() != '(') {
               StringVowels v2 = val.pop();
               StringVowels v1 = val.pop();
               char o = op.pop();
               StringVowels t = o + v1 + v2;
               val.push(t);

            }
            op.pop();
         } else {
            if (ch == '+' || ch == '-') {
               StringVowels v2 = val.pop();
               StringVowels v1 = val.pop();
               char o = op.pop();
               StringVowels t = o + v1 + v2;
               val.push(t);
               op.push(ch);
            }
            if (op.peek() == '*' || op.peek() == '/') {
               if (ch == '*' || ch == '/') {
                  StringVowels v2 = val.pop();
                  StringVowels v1 = val.pop();
                  char o = op.pop();
                  StringVowels t = o + v1 + v2;
                  val.push(t);
                  op.push(ch);
               }
                else
                  op.push(ch);
            }

         }

      }

      while (val.size() > 1) {
         StringVowels v2 = val.pop();
         StringVowels v1 = val.pop();
         char o = op.pop();
         StringVowels t = o + v1 + v2;
         val.push(t);

      }

      StringVowels prefix = val.pop();
      System.out.println(prefix);

   }

}