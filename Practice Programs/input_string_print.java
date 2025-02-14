import java.util.*;

public class input_string_print {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.next(); //Apurva Kumar
        System.out.print("Your name is ");
        System.out.print(name); //Apurva
        sc.close();
    }
}