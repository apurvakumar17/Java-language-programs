import java.util.*;

public class p8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();

        if (a == b) {
            System.out.print("Numbers are same");
        } else {
            if (a > b) {                                            //else if replacement
                System.out.print("First number is greater");
            } else {
                System.out.print("Second number is greater");
            }
        }
        sc.close();
    }
}