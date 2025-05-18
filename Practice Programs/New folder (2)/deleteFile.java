import java.io.File;
import java.io.IOException;

public class deleteFile {
    public static void main(String[] args) throws IOException{
        File fileobj = new File(Path.thisfolder + "\\myfile.txt");
        if (fileobj.delete()) {
            System.out.println("File Deleted..");
        } else {
            System.out.println("File Does Not Exists..");
        }
    }
}
