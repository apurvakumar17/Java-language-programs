import java.util.Scanner;

class Fibonacci {
    public static int[] generateFibonacci(int n) {
        int[] fib = new int[n];
        if (n > 0) fib[0] = 0;
        if (n > 1) fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }
}

public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci terms: ");
        int n = sc.nextInt();
        
        int[] fibonacciSeries = Fibonacci.generateFibonacci(n);
        
        System.out.print("First " + n + " Fibonacci numbers: ");
        for (int i = 0; i < fibonacciSeries.length; i++) {
            System.out.print(fibonacciSeries[i] + " ");
        }
        sc.close();
        System.out.println("\nPractical 6, 04814902024, Apurva Kumar\n");
    }
}
