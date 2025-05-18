import java.io.*;

public class copyTextFile {
    public static void main(String[] args) throws IOException {
        try (FileReader fr = new FileReader("myInfo.txt");
                FileWriter fw = new FileWriter("copiedMyInfo.txt")) {
            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }
        }

    }
}


