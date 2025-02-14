public class for_while_dowhile {
    public static void main (String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.print(i);
        }
        System.out.print(" By For Loop\n");
        int j = 0;
        while (j <= 10) {
            System.out.print(j);
            j++;
        }
        System.out.print(" By While Loop\n");
        int k = 0;
        do {
            System.out.print(k);
            k++;
        } while (k <= 10);
        System.out.print(" By Do-While Loop\n");
    }
}
