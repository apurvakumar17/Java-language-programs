import java.util.*;
/*

 *             *
 * *         * *
 * * *     * * *
 * * * * * * * *
 * * * * * * * *
 * * *     * * *
 * *         * *
 *             *
 
 */

public class p20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height: ");
        int h = sc.nextInt();
        int sp = h - 2;
        int st = 1;
        if (h % 2 == 0) {
            for (int i = 1; i <= h / 2; i++) {
                for (int j = 1; j <= st; j++) {
                    System.out.print("* ");
                }
                for (int k = 1; k <= sp; k++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= st; j++) {
                    System.out.print("* ");
                }
                System.out.println("");
                sp = sp - 2;
                st++;
            }

            sp = 0;
            st = h / 2;
            for (int i = 1; i <= h / 2; i++) {
                for (int j = 1; j <= st; j++) {
                    System.out.print("* ");
                }
                for (int k = 1; k <= sp; k++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= st; j++) {
                    System.out.print("* ");
                }
                System.out.println("");
                st--;
                sp = sp + 2;
            }

        }

        sc.close();
    }
}
