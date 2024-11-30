public class p21 {
    public static void main (String[] args) {
        int h = 5;
        int sp = h - 1;
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            sp--;
            for (int k = 1; k <= i; k++) {
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
}

/* 

    1
   2 2
  3 3 3 
 4 4 4 4 
5 5 5 5 5

  
 */