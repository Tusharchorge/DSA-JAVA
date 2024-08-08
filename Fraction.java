import java.util.*;

public class Fraction {
    public static int gcf(int num, int den) {
        int min = Math.min(num, den);
        for (int i = min; i >= 1; i--) {
            if (num % i == 0 && den % i == 0)
                return i;
        }
        return min;

    }

    public static fraction add(fraction f1, fraction f2) {
        int numerator = f2.den * f1.num + f1.den * f2.num;
        int denominator = f1.den * f2.den;
        fraction f3 = new fraction(numerator, denominator);
        return f3;
    }

    public static fraction multiply(fraction f1, fraction f2) {
        int numerator = f1.num * f2.num;
        int denominator = f1.den * f2.den;
        fraction f4 = new fraction(numerator, denominator);
        return f4;
    }

    public static fraction subtraction(fraction f1, fraction f2) {
        int numerator = f2.den * f1.num - f1.den * f2.num;
        int denominator = f1.den * f2.den;
        fraction f5 = new fraction(numerator, denominator);
        return f5;
    }

    public static class fraction {
        int num;
        int den;

        public fraction(int num, int den) {
            this.num = num;
            this.den = den;
            simply();
        }

        public void simply() {
            int hcf = gcf(num, den);
            num /= hcf;
            den /= hcf;

        }
    }

    public static void main(StringVowels[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter f1 numerator and denominator");
        fraction f1 = new fraction(sc.nextInt(), sc.nextInt());
        System.out.println(+f1.num + "/" + f1.den);
        System.out.println("Enter f2 numerator and denominator");
        fraction f2 = new fraction(sc.nextInt(), sc.nextInt());
        System.out.println(f2.num + "/" + f2.den);
        fraction f3 = add(f1, f2);
        fraction f4 = multiply(f1, f2);
        fraction f5 = subtraction(f1, f2);
        System.out.println("\nThe Addition");
        System.out.println(f3.num + "/" + f3.den);
        System.out.println("\nThe Subtraction");
        System.out.println(f5.num + "/" + f5.den);
        System.out.println("\nThe Muliplication");
        System.out.println(f4.num + "/" + f4.den);

    }
}