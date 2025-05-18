import java.io.*;

public class textFileWrite {
    public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("myInfo.txt");
        int ch = 66;
        fw.write(ch);
        char[] buffer = {'a', 'p', 'u', 'r', 'v', 'a'};
        fw.write(buffer);
        String name = " Kumar";
        fw.write(name);
        fw.close();
    }
}
