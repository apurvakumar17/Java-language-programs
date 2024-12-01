/*
 * 0,0  0,1  0,2  0,3
 * 1,0  1,1  1,2  1,3
 * 2,0  2,1  2,2  2,3
 * 3,0  3,1  3,2  3,3
 */

// 00 01 02 03 - 13 23 33 - 32 31 30 - 20 10 - 11 12 - 22 - 21

import java.util.*;

public class p31 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        /*System.out.print("Enter rows of 2D array: ");
        int row = sc.nextInt();
        System.out.print("Enter colums of 2D array: ");
        int col = sc.nextInt();
        int[][] spiral = new int[row][col];
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter element (" + i + "," + j + ")"+": ");
                spiral[i][j] = sc.nextInt();
            }
        }*/
        int[][] spiral = {{1, 2, 3, 4}, 
                          {12, 13, 14, 5}, 
                          {11, 16, 15, 6}, 
                          {10, 9, 8, 7}};
        int row = 4;
        int col = 4;

        int top = 0;
        int right = col - 1;
        int bottom = row - 1;
        int left = 0;
                //
        for (int i = 0; i < row; i++) {
            System.out.println(spiral[i][0] + ", " + spiral[i][1] + ", " + spiral[i][2] + ", " + spiral[i][3]);
        }
        System.out.println("");
        System.out.println("");

        /*---------------------First Outer Loop----------------------- */
        for (int i = left; i <= right; i++) {                             
            System.out.print(spiral[top][i] + " "); // 00 01 02 03         
        }                                                                  
        top++;
        for (int i = top; i <= bottom; i++) {
            System.out.print(spiral[i][right] + " "); //13 23 33
        }                                       
        right--;
        for (int i = right; i >= left; i--) {
            System.out.print(spiral[bottom][i] + " "); //32 31 30
        }
        bottom--;
        for (int i = bottom; i >= top; i--) {
            System.out.print(spiral[i][left] + " " ); //20 10
        }
        left++;


        /*---------------------Second Loop--------------------------- */
        for (int i = left; i <= right; i++) {
            System.out.print(spiral[top][i] + " "); // 11 12
        }
        top++;
        for (int i = top; i <= bottom; i++) {
            System.out.print(spiral[i][right] + " "); //22
        }
        right--;
        for (int i = right; i >= left; i--) {
            System.out.print(spiral[bottom][i] + " "); //32 31 30
        }
        bottom--;
        sc.close();
        //00 01 02 - 12 22 - 21 20 - 10 - 11
        // 00 01 02 03 - 13 23 33 - 32 31 30 - 20 10 - 11 12 - 22 - 21
        //1    //2
        /*for (int i = top; i <= bottom; i++ ) {
            System.out.print(spiral[i][bottom] + " ");
        }*/         
    }
    

}
