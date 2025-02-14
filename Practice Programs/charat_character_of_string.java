import java.util.Scanner;

public class charat_character_of_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = sc.nextLine();
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'e' || word.charAt(i) == 'E') {
                result = result + 'i';
            } else {
                result = result + word.charAt(i);
            }
        }
        System.err.println("Old string: " + word);
        System.err.println("New string: " + result);
        sc.close();
    }
}
