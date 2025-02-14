import java.util.Scanner;

public class p30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows of 2D array: ");
        int rows = sc.nextInt();
        System.out.print("Enter colums of 2D array: ");
        int cols = sc.nextInt();
        int[][] arr2d = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element (" + i + "," + j + ")" + ": ");
                arr2d[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            System.out.println(arr2d[i][0] + ", " + arr2d[i][1] + ", " + arr2d[i][2]);
        }
        sc.close();
    }
}
