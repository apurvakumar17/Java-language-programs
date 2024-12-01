public class p32 {
    //-------------refined version of p31.java------------------//
    public static void main(String[] args) {
        int[][] spiral = {
            {1, 2, 3, 4},
            {12, 13, 14, 5},
            {11, 16, 15, 6},
            {10, 9, 8, 7}
        };
        int row = 4;
        int col = 4;

        int top = 0;
        int right = col - 1;
        int bottom = row - 1;
        int left = 0;

        System.out.println("Original 2D Array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(spiral[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nSpiral Traversal:");

        // Spiral traversal using while loop
        while (top <= bottom && left <= right) {
            // Traverse from left to right
            for (int i = left; i <= right; i++) {
                System.out.print(spiral[top][i] + " ");
            }
            top++;

            // Traverse from top to bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(spiral[i][right] + " ");
            }
            right--;

            if (top <= bottom) { // Check to avoid duplicate traversal
                // Traverse from right to left
                for (int i = right; i >= left; i--) {
                    System.out.print(spiral[bottom][i] + " ");
                }
                bottom--;
            }

            if (left <= right) { // Check to avoid duplicate traversal
                // Traverse from bottom to top
                for (int i = bottom; i >= top; i--) {
                    System.out.print(spiral[i][left] + " ");
                }
                left++;
            }
        }
    }
}
