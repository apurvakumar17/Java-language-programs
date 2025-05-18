public class primeNoPrinter {
    public static void main(String[] args) {
        System.out.println("Prime No.: ");
        boolean isPrime = true;
        for (int i = 1; i < 101; i++) {
            for (int j = 2; j <= (i / 2); j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.print(i + ", ");
            }
            isPrime = true;
        }
    }
}
