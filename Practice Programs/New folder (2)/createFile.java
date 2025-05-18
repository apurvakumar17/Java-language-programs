import java.io.File;
import java.io.IOException;

public class createFile {
    public static void main(String[] args) {
        File fileobj = new File(Path.thisfolder + "\\newFile.txt");
        try {
            if (fileobj.createNewFile()) {
                System.out.println("File Created..");
            } else {
                System.out.println("File Already Exists..");
            }
        } catch (IOException ioe) {
            ioe.getStackTrace();
        }
    }
}
