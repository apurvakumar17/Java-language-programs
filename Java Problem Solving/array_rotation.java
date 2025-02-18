import java.util.Scanner;
public class array_rotation {
    public static void show(int[] arr) {
        for (int i = 0; i < 9; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String args[]) {
        int[] arr = new int[9];
        int n;
        for (int i = 1; i < 10; i++) {
            arr[i - 1] = i;
        }
        show(arr);
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the no. of elements: ");
        n = sc.nextInt();
        int temp;
        while (n != 0) {
            temp = arr[0];
            int i2;
            for (i2 = 0; i2 < 8; i2++) {
                arr[i2] = arr[i2 + 1];
            }
            arr[i2] = temp;
            n--;
        }
        show(arr);
        sc.close();
    }
}
