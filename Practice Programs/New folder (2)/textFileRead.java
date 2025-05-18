import java.io.*;

public class textFileRead {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("myName.txt");
        int c = fr.read();
        System.out.println("Read a single character: " + (char) c);
        char[] buffer = new char[5];
        int charsRead = fr.read(buffer); // Always check how many chars were read
        System.out.println("Read into an array:");
        for (int i = 0; i < charsRead; i++) {
            System.out.println(buffer[i]);
        }
        System.out.println("Read file until end:");
        while ((c = fr.read()) != -1) {
            System.out.print((char) c);
        }
        fr.close();
    }
}
