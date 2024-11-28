import java.util.*;

public class p6 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.print("Sum is: ");
        int sum = a+b;
        System.out.print(sum);
        sc.close();
    }
}