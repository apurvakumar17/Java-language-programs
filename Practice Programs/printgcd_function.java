import java.util.*;

public class printgcd_function{
    public static void printGCD(int n1, int n2) {
        int less = n1 > n2 ? n1:n2;
        for (int i = less; i >= 1; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                System.out.print("GCD of " + n1 + " and " + n1 + " is = " + i);
                return;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        printGCD(num1, num2);
        sc.close();
    }
}