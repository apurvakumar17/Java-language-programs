public class uncheckedexc {
    public static void main(String[] args) {
        try {
            System.out.println(45/0);
        } catch(ArithmeticException e) {
            e.getStackTrace();
        }
    }
}
