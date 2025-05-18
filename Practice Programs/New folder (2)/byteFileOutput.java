import java.io.*;

public class byteFileOutput {
    public static void main(String[] args) throws IOException{
        FileOutputStream fos = new FileOutputStream("myName.bin");
        String name = "Apurva Kumar";
        byte[] nickname = "Apu".getBytes();
        fos.write(65);
        fos.write(name.getBytes());
        fos.write(nickname);
        fos.close();
    }
}
