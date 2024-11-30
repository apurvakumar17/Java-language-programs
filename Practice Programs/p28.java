import java.util.*;

public class p28 {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 99;
        marks[2] = 98;
        for (int i = 0; i < 3; i++) {
            System.out.println(marks[i]);
        }
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            marks[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(marks[i]);
        }

        int[] topperMarks = {99,100,101};
        for (int i = 0; i < 3; i++) {
            System.out.println(topperMarks[i]);
        }
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        
        System.out.print("Enter number to find in array: ");
        int x = sc.nextInt();
        int found = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (x == numbers[i]) {
                System.out.println("Number found at " + i + "!!");
                found = 1;
                break;
            }
        } 
        if (found == 0) {
            System.out.println("Number not found !!");
        }
        sc.close();
    }
}
