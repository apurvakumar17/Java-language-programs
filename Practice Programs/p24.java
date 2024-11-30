import java.util.Scanner;

public class p24 {
    public static int printProduct(int a, int b) {
        int product = a * b;
        return product;
    }
    public static int printSum(int a, int b) {
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Sum of " + num1 + " and " + num2 + " is = " + printSum(num1, num2));
        System.out.println("Product of " + num1 + " and " + num2 + " is = " + printProduct(num1, num2));
        sc.close();
    }
}
