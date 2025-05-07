import java.io.*;

public class P17 {
    public static void main(String[] args) {
        // The file path to read
        String filePath = "example.txt";

        // Try reading the file
        try {
            // FileReader can throw FileNotFoundException (checked exception)
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);

            String line;
            System.out.println("File contents:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close(); // close the BufferedReader
            fr.close(); // close the FileReader

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: The file \"" + filePath + "\" does not exist.");
        } catch (IOException e) {
            System.out.println("IOException: An error occurred while reading the file.");
        }
        System.out.println("\nPractical 17, 04814902024, Apurva Kumar\n");
    }
}
