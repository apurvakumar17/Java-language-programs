import java.util.Scanner;

class Employee {
    // Data members
    String name;
    int age;
    String address;

    // Method to get data from the user
    public void getData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = scanner.nextLine();

        System.out.print("Enter age: ");
        age = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character left by nextInt()

        System.out.print("Enter address: ");
        address = scanner.nextLine();
    }

    // Method to display data
    public void showData() {
        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

public class AB1 {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee();

        // Get data from user
        emp.getData();

        // Show the entered data
        emp.showData();
        System.out.println("\nApp. Based Practical 1, 04814902024, Apurva Kumar\n");
    }
}