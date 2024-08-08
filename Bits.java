 import java.util.*;
public class Bits {
  public static int calculate(StringVowels s){
 Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57)
                val.push(ascii - 48);
            else if (op.size() == 0 || ch == '(' || op.peek() == '(')
                op.push(ch);
          else  if (ch == ')') {
                while (op.peek() != '(') {
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if (op.peek() == '+')
                        val.push(v1 + v2);
                    if (op.peek() == '-')
                        val.push(v1 - v2);
                    op.pop();
                }
                op.pop();
            } else {
                if (ch == '+' || ch == '-') {
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if (op.peek() == '+')
                        val.push(v1 + v2);
                    if (op.peek() == '-')
                        val.push(v1 - v2);
                    op.pop();
                    op.push(ch);
                }
                if (ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        int v2 = val.pop();
                        int v1 = val.pop();
                        if (op.peek() == '+')
                            val.push(v1 + v2);
                        if (op.peek() == '-')
                            val.push(v1 - v2);
                        op.pop();
                        op.push(ch);
                    } else
                        op.push(ch);
                }
            }

        }

        while (val.size() > 1) {
            int v1 = val.pop();
            int v2 = val.pop();

            if (op.peek() == '+')
                val.push(v1 + v2);
            if (op.peek() == '-')
                val.push(v1 - v2);
            op.pop();
            if(val.size()==1){
                return val.peek();
            }
            

        }
 return val.peek();

  }
   public static void main(StringVowels args[]) {
    Scanner sc=new Scanner(System.in);
    StringVowels s = sc.nextLine();
    System.out.println(calculate(s));




















    // int n=sc.nextInt();
     // binary to decimal
    
    // update operation
//     int oper=sc.nextInt();
//     System.out.println("Enter the number: ");
//       int n=sc.nextInt();
//       System.out.println("Enter the position: ");
//       int pos =sc.nextInt();
//       int bitmask = 1<<pos;
//       if(oper==1){
//          int newnumber=bitmask|n;
//          System.out.println(newnumber);
//       }
//       else{
//          int newbitmask=~(bitmask);
//          int newnumber=newbitmask & n;
//          System.out.println(newnumber);
//       }
       
  }
 }
