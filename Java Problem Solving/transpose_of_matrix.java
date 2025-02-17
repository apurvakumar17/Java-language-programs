import java.util.Scanner;

public class transpose_of_matrix {
    public static void main(String args[]) {
        int i, j;
        //only for square matrix currently :(
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        i = sc.nextInt();
        System.out.print("Enter number of columns: ");
        j = sc.nextInt();
        int[][] mat = new int[i][j];
        int x, y;
        for (x = 0; x < i; x++) {
            System.out.print("Enter row" + (x + 1) + ": ");
            for (y = 0; y < j; y++) {
                mat[x][y] = sc.nextInt();
            }
        }
        for (x = 0; x < i; x++) {
            for (y = 0; y < j; y++) {
                System.out.print(mat[y][x] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
