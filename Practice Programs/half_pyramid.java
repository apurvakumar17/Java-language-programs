import java.util.*;

public class half_pyramid {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height: ");
        int h = sc.nextInt();
        int sp = h - 1;
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("  ");
            }
            sp--;
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
