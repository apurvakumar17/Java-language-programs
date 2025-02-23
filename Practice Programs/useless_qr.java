import java.util.Random;
public class useless_qr {
    public static void main(String args[]) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (random.nextInt(2) == 1) {
                    System.out.print("██");
                } else {
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
    }
}