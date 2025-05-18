import java.io.*;

public class writeCharacter {
    public static void main(String[] args) throws IOException {
        File f = new File(Path.thisfolder + "\\myfile.txt"); 
        if(f.createNewFile()) {
            FileWriter fw = new FileWriter(f);
            fw.write("Hello I am Apurva Kumar");
            fw.close();
        } else {
            FileWriter fw = new FileWriter(f);
            fw.write("Hello I am Apurva Kumar");
            fw.close();
        }
    }
}
