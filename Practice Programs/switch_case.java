import java.util.*;

public class switch_case {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Press button (1/2/3): ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.print("Hello");
                break;
            case 2:
                System.out.print("Namaste");
                break;
            case 3:
                System.out.print("Bonjour");
                break;
            default:
                System.out.println("Invalid Button");
        }
        sc.close();
    }
}