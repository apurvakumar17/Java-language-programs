import java.io.*;
import java.util.Scanner;

public class P26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "userInput.txt";

        System.out.println("Enter text to write to the file (type 'exit' to finish):");

        try (
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);
        ) {
            String line;
            while (true) {
                line = scanner.nextLine();
                if (line.equalsIgnoreCase("exit")) {
                    break;
                }
                bw.write(line);
                bw.newLine(); // add a new line after each input
            }

            System.out.println("Text successfully written to " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        } finally {
            scanner.close();
        }
        System.out.println("\nPractical 26, 04814902024, Apurva Kumar\n");
    }
}
