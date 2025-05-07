import java.io.*;

public class P23 {
    public static void main(String[] args) {
        String fileName = "randomAccessData.dat";

        try {
            // Create RandomAccessFile in "rw" mode (read/write)
            RandomAccessFile raf = new RandomAccessFile(fileName, "rw");

            // Writing integers to the file
            System.out.println("Writing integers to the file...");
            for (int i = 1; i <= 5; i++) {
                raf.writeInt(i * 10); // write 10, 20, 30, 40, 50
            }

            // Move file pointer to the beginning
            raf.seek(0);

            // Reading integers from the file
            System.out.println("Reading integers from the file:");
            for (int i = 0; i < 5; i++) {
                int data = raf.readInt();
                System.out.println("Integer " + (i + 1) + ": " + data);
            }

            // Close file
            raf.close();
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        }
        System.out.println("\nPractical 23, 04814902024, Apurva Kumar\n");
    }
}
