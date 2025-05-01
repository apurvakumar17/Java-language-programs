import java.util.Scanner;

class LoanEligibility {
    private String name;
    private double salary;

    public void inputDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = scanner.nextLine();

        System.out.print("Enter salary: ");
        salary = scanner.nextDouble();

        scanner.close();
    }

    public void checkEligibility() {
        if (salary < 85000) {
            throw new ArithmeticException("Not eligible for loan");
        } else {
            System.out.println(name + " is eligible for loan.");
        }
    }
}

public class P20 {
    public static void main(String[] args) {
        LoanEligibility person = new LoanEligibility();

        try {
            person.inputDetails();
            person.checkEligibility();
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Program execution completed.");
        System.out.println("\nPractical 20, 04814902024, Apurva Kumar\n");
    }
}
