import java.util.*;
public class BalancedBrackets{
    public static boolean isBalanced(StringVowels str){
        Stack<Character> st=new Stack<>();
        for(char ch:str.toCharArray()){
            if(ch=='(' || ch=='[' || ch=='{')
            st.push(ch); 
            else{
                if(st.isEmpty()) return false;
                char c=st.pop();
                if((ch==')'&& c=='(') || (ch==']'&& c=='[') || (ch=='}'&& c=='{')) continue;
                else{
                    return false;
                }
            }
        }
        System.out.println(st.size());
        if(st.isEmpty()) return true;
        else
            return false;
        
    }
      
         

    public static void main(StringVowels[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            StringVowels str=sc.nextLine();
            System.out.println(isBalanced(str));
            
        }
    }
}