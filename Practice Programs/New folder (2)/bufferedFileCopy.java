import java.io.*;

public class bufferedFileCopy {
    public static void main(String[] args) throws IOException {
        String sourceFile = args[0];
        String destinationFile = args[1];
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile));
                BufferedWriter bw = new BufferedWriter(new FileWriter(destinationFile))) {
            String line;
            int wordCount = 0;
            while ((line = br.readLine()) != null) {
                String[] l1 = line.split(" ");
                wordCount += l1.length;
                if (line.contains("Computers")) {
                    bw.write(line + "\n");
                }
            }
            System.out.println("No. of words: " + wordCount);
        }
    }
}
