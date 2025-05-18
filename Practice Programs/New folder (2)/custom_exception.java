class AgeException extends Exception {
    AgeException(String msg) {
        super(msg);
    }
}


public class custom_exception {
    public static void main(String[] args) {
        int Age = 12;
        if (Age < 18) {
            try {
                throw new AgeException("Access Denied");
            } catch (AgeException ae) {
                System.out.println(ae.getMessage());
            } finally {
                System.out.println("I will always get executed");
            }
        } else {
            System.out.println("You are welcome");
        }
    }
}
