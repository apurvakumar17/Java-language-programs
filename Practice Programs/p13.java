import java.util.*;

public class p13 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Following is the table of "+n+":-");
        for (int i = 1; i < 11; i++) {
            System.out.println(n+"X"+i+"="+i*n);
        }
        sc.close();
    }
}
