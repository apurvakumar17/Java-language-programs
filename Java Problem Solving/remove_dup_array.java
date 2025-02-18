public class remove_dup_array {
    public static void show(int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + ", ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 5};
        show(arr);
        int i1 = 0;
        int i2;
        int len = arr.length;
        for (i2 = 1; i2 < len; i2++) {
            if (arr[i1] != arr[i2]) {
                i1++;
                arr[i1] = arr[i2];
            }
        }
        show(arr);
    }
}
