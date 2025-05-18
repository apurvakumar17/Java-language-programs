import java.io.*;

public class copyByteFile {
    public static void main(String[] args) throws IOException{
        System.out.println("Source File: " + args[0]);
        System.out.println("Output File" + args[1]);

        String src = args[0];
        String out = args[1];

        try (FileInputStream fis = new FileInputStream(src); FileOutputStream fos = new FileOutputStream(out)) {
            int chr;
            while((chr = fis.read()) != -1) {
                fos.write(chr);
            }
        }
    }
}
