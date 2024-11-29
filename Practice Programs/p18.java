public class p18 {
    public static void main(String[] args) {
        int a = 5;
        int sp = a - 1;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("  ");
            }
            sp--;
            for (int k = 1; k <= i; k++) {
                System.out.print(k+" ");
            }
            System.out.println("");
        }
    }
}
