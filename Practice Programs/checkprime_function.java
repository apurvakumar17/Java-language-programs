import java.util.*;

public class checkprime_function {
    public static void checkPrime(int a) {
        int isprime = 0;
        if (a <= 1) {
            System.out.println(a + " is not a prime");
            return; // Numbers <= 1 are not prime
        }
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                isprime = 1;
                break;
            }
        }
        if (isprime == 1) {
            System.err.println(a + " is not prime");
        } else {
            System.out.println(a + " is a prime");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int x = 10;
        while (x >= 0) {
            System.out.print("Enter a number: ");
            num = sc.nextInt();
            checkPrime(num);
            x--;
        }
        sc.close();
    }
}
