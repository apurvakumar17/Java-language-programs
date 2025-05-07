import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two strings
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        // Demonstrate String methods
        System.out.println("\n--- String Methods Demonstration ---");

        System.out.println("Length of first string: " + str1.length());
        System.out.println("First character of first string: " + str1.charAt(0));
        System.out.println("Substring of first string (0 to 3): " + str1.substring(0, 3));
        System.out.println("First string in uppercase: " + str1.toUpperCase());
        System.out.println("Second string in lowercase: " + str2.toLowerCase());
        System.out.println("Are both strings equal? " + str1.equals(str2));
        System.out.println("Are both strings equal (ignore case)? " + str1.equalsIgnoreCase(str2));
        System.out.println("Index of 'a' in first string: " + str1.indexOf('a'));
        System.out.println("Replace 'a' with 'x' in first string: " + str1.replace('a', 'x'));
        System.out.println("Concatenated string: " + str1.concat(" " + str2));
        System.out.println("\nPractical 8, 04814902024, Apurva Kumar\n");

        scanner.close();
    }
}
