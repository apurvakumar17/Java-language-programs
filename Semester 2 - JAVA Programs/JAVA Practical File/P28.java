import java.io.*;

public class P28 {
    public static void main(String[] args) {
        String sourceFile = "source.txt";       // Source file to read from
        String destinationFile = "copy.txt";    // Destination file to write to

        try (
            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(destinationFile);
        ) {
            int byteData;

            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }

            System.out.println("File copied successfully from " + sourceFile + " to " + destinationFile);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
        System.out.println("\nPractical 28, 04814902024, Apurva Kumar\n");
    }
}
