// User-defined exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Class to check eligibility
class Voter {
    public void checkEligibility(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age less than 18. Not eligible to vote.");
        } else {
            System.out.println("Eligible to vote.");
        }
    }
}

// Main class
public class P19 {
    public static void main(String[] args) {
        Voter voter = new Voter();
        int age = 16;  // Change this value to test different inputs

        try {
            voter.checkEligibility(age);
        } catch (InvalidAgeException e) {
            System.out.println("Caught user-defined exception: " + e.getMessage());
        }

        System.out.println("Program ends gracefully.");
        System.out.println("\nPractical 19, 04814902024, Apurva Kumar\n");
    }
}
