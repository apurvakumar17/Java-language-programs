import java.io.*;

public class byteFileInput {
    public static void main(String[] args)  throws IOException {
        FileInputStream fis = new FileInputStream("myName.bin");
        System.out.println("Read single byte: " + (char)fis.read());
        byte[] buffer = new byte[4];
        fis.read(buffer);
        // System.out.println("Read an array of bytes" + buffer);
        System.out.println("Read an array of byte: ");
        for (byte i: buffer) {
            System.out.println((char) i);
        }
        int chr;
        System.out.println("Read until End: ");
        while ((chr = fis.read()) != -1) {
            System.out.println((char)chr);
        }
        fis.close();
    }
}
