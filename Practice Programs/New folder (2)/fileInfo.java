import java.io.File;

public class fileInfo {
    public static void main(String[] args) {
        File f = new File(Path.thisfolder + "\\newFile.txt");
        if (f.exists()) {
            System.out.println("File Name: " + f.getName());
            System.out.println("File Path: " + f.getAbsolutePath());
            System.out.println("File Read: " + f.canRead());
            System.out.println("File Write: " + f.canWrite());
            System.out.println("File Size: " + f.length() + " Bytes");
            System.out.println("File Delete: " + f.delete());
        } else {
            System.out.println("File doesn't Exist..");
        }
    }
}
