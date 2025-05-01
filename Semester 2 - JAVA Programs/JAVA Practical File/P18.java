class UncheckedExceptionDemo {
    public void divide(int a, int b) {
        int result = a / b;  // This may cause ArithmeticException if b is 0
        System.out.println("Result: " + result);
    }
}

public class P18 {
    public static void main(String[] args) {
        UncheckedExceptionDemo demo = new UncheckedExceptionDemo();

        try {
            demo.divide(10, 0);  // This will throw an unchecked exception
        } catch (ArithmeticException e) {
            System.out.println("Caught an unchecked exception: " + e);
        }

        System.out.println("Program continues after handling exception.");
        System.out.println("\nPractical 18, 04814902024, Apurva Kumar\n");
    }
}