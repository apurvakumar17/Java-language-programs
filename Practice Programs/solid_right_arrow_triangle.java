import java.util.*;

public class solid_right_arrow_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height: ");
        int h = sc.nextInt();
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i = h; i >= 1; i--) {
            for (int j = i; j >=1; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
