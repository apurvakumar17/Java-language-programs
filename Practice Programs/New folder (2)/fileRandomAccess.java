import java.io.*;

public class fileRandomAccess {
    public static void main(String[] args) throws IOException{
        RandomAccessFile raf = new RandomAccessFile("input.txt", "rw");
        int ch;
        System.out.println("Before: ");
        while((ch = raf.read()) != -1) {
            System.out.print((char)ch);
        }
        int num = 65;
        raf.write(num);
        raf.seek(0);
        System.out.println("\nAfter: ");
        while((ch = raf.read()) != -1) {
            System.out.print((char)ch);
        }
        raf.close();
    }
}
