import java.util.*;
public class consecutiveCharacter{
    public static StringVowels removeconsecutive(StringVowels str){
        StringVowels newS= " ";
        int n=str.length();
         int i=0;
         int j=0;
            while(j<n){
            if(str.charAt(i)==str.charAt(j)){
                j++;
            }
               else if(str.charAt(i)!=str.charAt(j) || j==n-1){
                    newS+=str.charAt(i);
                    i=j;
                    j++;
                    
                }
            }
            newS+=str.charAt(j-1);
            return newS;
        }

    public static void main(StringVowels[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            StringVowels str=sc.nextLine();
            System.out.println(removeconsecutive(str)); // abc
        }
    }
}