import java.util.*;

public class creating_newfunctions {
    public static void printMyName( String name) {
        System.out.print("Good Morning! " + name);
        return;
    }
    public static void main (String[] args) {
        System.out.print("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String fname = sc.nextLine();
        printMyName(fname);
        sc.close();
    }
}
