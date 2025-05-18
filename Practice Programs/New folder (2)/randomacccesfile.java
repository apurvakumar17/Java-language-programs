import java.io.*;

public class randomacccesfile {
    public static void main(String[] args) throws IOException{
        RandomAccessFile raf = new RandomAccessFile("myraffile.txt", "rw");
        for (int i = 0; i < 5; i++) {
            raf.writeInt(i * 10);
        }

        raf.seek(0);
        int n;
        for (int i = 0; i < 5; i++) {
            n = raf.readInt();
            System.out.println(n);
        }
        raf.close();
    }
}
