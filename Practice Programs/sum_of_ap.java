import java.util.*;

public class sum_of_ap {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int result = 0;
        for (int i = 1; i <= n; i++ ) {
            result = result + i;
        }
        System.out.print("Result = ");
        System.out.print(result); 
        sc.close();
    }
}
