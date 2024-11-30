
/*
        1
      2 1 2 
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5

*/
public class p22 {
    public static void main (String[] args) {
        int h = 5;
        int sp = h - 1;
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("  ");
            }
            sp--;
            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }
            for (int k = 2; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println("");
        }
    }
}
