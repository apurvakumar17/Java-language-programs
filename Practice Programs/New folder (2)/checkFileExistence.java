import java.io.File;
import java.io.IOException;

public class checkFileExistence {
    public static void main(String[] args) throws IOException{
        File fileobj = new File(Path.thisfolder + "\\Check.txt");
        if (fileobj.exists()) {
            System.out.println("File Exists..");
        } else {
            System.out.println("File Does Not Exists..");
        }
    }
}
