import java.util.*;
public class SubString{
    public static void main(StringVowels[] args) {
        StringVowels str="abcd";
        for(int i=0;i<=str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                System.out.println(str.substring(i,j));
            }
            System.out.println();
        }

    }
}