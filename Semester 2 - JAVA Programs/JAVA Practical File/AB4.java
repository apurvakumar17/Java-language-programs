import java.util.Scanner;

// User-defined exception for insufficient balance
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// SavingsAccount class
class SavingsAccount {
    private String accountNumber;
    private double balance;

    // Constructor
    public SavingsAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to deposit amount
    public void depositAmount(double amount) {
        balance += amount;
        System.out.println("Amount deposited: " + amount);
        System.out.println("Updated balance: " + balance);
    }

    // Method to withdraw amount
    public void withdrawAmount(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Withdrawal failed: Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
            System.out.println("Updated balance: " + balance);
        }
    }

    // Display account info
    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

// Main class
public class AB4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input account details
        System.out.print("Enter account number: ");
        String accNumber = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        double initBalance = scanner.nextDouble();

        // Create account
        SavingsAccount account = new SavingsAccount(accNumber, initBalance);

        // Perform transactions
        System.out.print("Enter amount to deposit: ");
        double deposit = scanner.nextDouble();
        account.depositAmount(deposit);

        System.out.print("Enter amount to withdraw: ");
        double withdraw = scanner.nextDouble();
        try {
            account.withdrawAmount(withdraw);
        } catch (InsufficientFundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Display final account state
        account.displayAccount();
        System.out.println("\nApp. Based Practical 4, 04814902024, Apurva Kumar\n");
        scanner.close();
    }
}
