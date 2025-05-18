import java.util.Scanner;

public class throw_exp {
    public static void main(String[] args) {
        int Age;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Age: ");
            Age = sc.nextInt();
            if (Age < 18) {
                try {
                    throw new ArithmeticException("Access Denied");
                } catch (ArithmeticException ae) {
                    System.out.println(ae.getMessage());
                } finally {
                    sc.close();
                }
            } else {
                System.out.println("You are Welcome");
            }

            //sc.close(); //comment this to experience that code continues to run after no exception.
        }

        
    }
}
