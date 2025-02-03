public class insertion_sort {
    public static void main(String[] args) {
        int arr1[] = {22,55,11,33,66,44};
        show(insertion_sort1(arr1));
    }
    public static int[] insertion_sort1(int arr[]) {
        int key, i, j;
        for (i = 1; i < arr.length; i++) {
            key = arr[i];
            for (j = i - 1; j >= 0 && arr[j] > key; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = key;
            show(arr);
        }
        return arr;
    }
    public static void show(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print("\n");
    }
    public static void my_insert_sort(int[] arr) {
        int key, i, j;
        for (i = 1; i < arr.length; i++) {
            key = arr[i - 1];
            for (j = i - 1; j >= 0; j++) {
                if (arr[j] < key) {
                    arr[j + 1] = 
                }
            }
        }
    }
}
