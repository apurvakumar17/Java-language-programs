import java.io.*;

public class readCharacter {
    public static void main(String[] args) throws IOException{
        File f = new File(Path.thisfolder + "\\myfile.txt");
        if(f.exists()) {
            FileReader fr = new FileReader(f);
            int chr;
            while ((chr = fr.read()) != -1) {
                System.out.print((char) chr);
            }
            fr.close();
        } else {
            System.out.println("File do not exist!");
        }
    }
}
