import java.io.*;

public class AB3 {
    public static void main(String[] args) {
        System.out.println("Enter lines of text (type 'STOP' to end):");

        try (
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ) {
            String input;

            while (true) {
                input = reader.readLine();

                if (input.equalsIgnoreCase("STOP")) {
                    break;
                }

                System.out.println("You entered: " + input);
            }

            System.out.println("Input stopped.");

        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
        System.out.println("\nApp. Based Practical 3, 04814902024, Apurva Kumar\n");
    }
}
