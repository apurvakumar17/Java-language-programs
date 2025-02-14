import java.util.*;

public class taking_user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: "); //Apurva Kumar
        String fullname = sc.nextLine();
        System.out.print(fullname); //Apurva Kumar
        sc.close();
    }
}