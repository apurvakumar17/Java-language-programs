import java.io.*;

public class P27 {
    public static void main(String[] args) {
        String fileName = "example2.txt"; // Make sure this file exists with some content

        try (
            FileInputStream fis = new FileInputStream(fileName);
        ) {
            int byteData;

            System.out.println("Contents of the file:");
            while ((byteData = fis.read()) != -1) {
                System.out.print((char) byteData);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        System.out.println("\nPractical 27, 04814902024, Apurva Kumar\n");
    }
}
