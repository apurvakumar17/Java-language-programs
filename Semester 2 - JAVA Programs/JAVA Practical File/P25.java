import java.io.*;

public class P25 {
    public static void main(String[] args) {
        // Ensure two arguments are passed
        if (args.length < 2) {
            System.out.println("Usage: java FileFilterAndWordCount <inputFile> <outputFile>");
            return;
        }

        String inputFile = args[0];
        String outputFile = args[1];
        int wordCount = 0;

        try (
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Count words
                String[] words = line.trim().split("\\s+");
                wordCount += words.length;

                // Check for "Computers" and write the line if it contains the word
                if (line.contains("Computers")) {
                    writer.write(line);
                    writer.newLine();
                }
            }

            System.out.println("Word count in " + inputFile + ": " + wordCount);
            System.out.println("Lines containing 'Computers' copied to " + outputFile);

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
        System.out.println("\nPractical 25, 04814902024, Apurva Kumar\n");
    }
}
