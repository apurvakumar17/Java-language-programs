import java.util.Scanner;

public class AB2 {
    // Method to perform addition
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to perform subtraction
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Method to perform multiplication
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method to perform division
    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice, num1, num2;

        // Menu-driven program
        while (true) {
            System.out.println("\n--- Basic Calculator ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            // Exit condition
            if (choice == 5) {
                System.out.println("Exiting the program.");
                break;
            }

            // Input for two integers
            System.out.print("Enter the first number: ");
            num1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            num2 = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Result (Addition): " + add(num1, num2));
                    break;
                case 2:
                    System.out.println("Result (Subtraction): " + subtract(num1, num2));
                    break;
                case 3:
                    System.out.println("Result (Multiplication): " + multiply(num1, num2));
                    break;
                case 4:
                    try {
                        System.out.println("Result (Division): " + divide(num1, num2));
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }
        System.out.println("\nApp. Based Practical 2, 04814902024, Apurva Kumar\n");
        scanner.close();
    }
}
