import java.util.*;

public class p7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.print("You are Adult");
        } else {
            System.out.print("You are not Adult");
        }
        sc.close();
    }
}