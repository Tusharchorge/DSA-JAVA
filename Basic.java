import java.util.*;

public class Basic {
    public static void main(StringVowels[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        for (int i = 0; i <= sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;
            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);
            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
        }
        System.out.println(sb);

    }
}

// double radius=sc.nextDouble();
// double Area=3.14*radius*radius;
// System.out.println("The radius is "+ radius);
// System.out.println("The area of a circle is "+ Area);
// System.out.println("Enter the number ");
// int number=sc.nextInt();
// System.out.println("The table of "+number+" is");
// for(int i=1;i<=10;i++){
// System.out.println(number*i);
// }
// System.out.println("Enter the first number ");
// Double num1=sc.nextDouble();
// System.out.println("Enter the second number ");
// double num2=sc.nextDouble();
// System.err.println("Enter the operator ");
// char operator=sc.next().charAt(0);
// switch (operator) {
// case '+':System.out.println(num1+num2);
// break;
// case '-':System.out.println(num1-num2);
// break;
// case '*':System.out.println(num1*num2);
// break;
// case '/':System.out.println(num1/num2);
// break;
// case '%':System.out.println(num1%num2);
// break;
// default:
// break;
// }
// int n=sc.nextInt();
// int sum=0;
// for(int i=2;i<=n;i++){
// if(i%2==0){
// sum=sum+i;
// }
// }
// System.out.println(sum);
// int n=sc.nextInt();
// for(int i=1;i<=n;i++){
// for(int j=1;j<=n-i;j++){
// System.out.print(" ");
// }
// for(int j=1;j<=i;j++){
// System.out.print("*"+" ");
// }
// System.out.println();
// }
// for(int i=n-1;i>=1;i--){
// for(int j=1;j<=n-i;j++){
// System.out.print(" ");
// }
// for(int j=1;j<=i;j++){
// System.out.print("*"+" ");
// }
// System.out.println();

// }
// }
// }
