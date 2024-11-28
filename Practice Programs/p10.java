import java.util.*;

public class p10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide");
        System.out.print("Enter choice: ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Sum is: ");
                System.out.print(a + b);
                break;
            case 2:
                System.out.println("Subtraction is: ");
                System.out.print(a - b);
                break;
            case 3: 
                System.out.println("Multiplication is: ");
                System.out.print(a * b);
                break;
            case 4: 
                System.out.println("Division is: ");
                System.out.print(a / b);
                break;
            default: 
                System.out.println("Invalid Choice");
        }
        sc.close();
    }
}
