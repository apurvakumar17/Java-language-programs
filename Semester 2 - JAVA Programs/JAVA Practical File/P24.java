import java.io.*;
import java.util.Scanner;

public class P24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collect student data from user
        System.out.print("Enter Enrollment No: ");
        String enrollNo = scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Percentage: ");
        String percentage = scanner.nextLine();

        System.out.print("Enter Phone No: ");
        String phone = scanner.nextLine();

        // Combine data into a single string
        String studentData = "Enrollment No: " + enrollNo + "\n"
                           + "Name: " + name + "\n"
                           + "Percentage: " + percentage + "\n"
                           + "Phone No: " + phone + "\n";

        String fileName = "student.txt";

        // Write data to file using BufferedOutputStream
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            bos.write(studentData.getBytes());
            bos.close();
            fos.close();
            System.out.println("\nStudent data written to file.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Read data from file using BufferedInputStream
        System.out.println("\nReading student data from file:");
        try {
            FileInputStream fis = new FileInputStream(fileName);
            BufferedInputStream bis = new BufferedInputStream(fis);

            int ch;
            while ((ch = bis.read()) != -1) {
                System.out.print((char) ch);
            }

            bis.close();
            fis.close();
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }

        scanner.close();
        System.out.println("\nPractical 24, 04814902024, Apurva Kumar\n");
    }
}
