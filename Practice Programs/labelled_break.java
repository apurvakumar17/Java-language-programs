public class labelled_break {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            System.out.print("I am first1..");
            for (int j = 0; j < 5; j++) {
                System.out.print("I am second1..");
                if (j == 3) break;
                System.out.println("I am second2..");
            }
            System.out.println("I am first2..");
        }

        System.out.println("\n--LABELLED BREAK--");

        outer: for(int i = 0; i < 3; i++) {
            inner: for(int j = 0; j < 100; j++) {
                System.out.println(j);
                if (j == 10) {
                    break outer;
                }
            }
        }
        System.out.println("Loop Complete!");
    }
}
