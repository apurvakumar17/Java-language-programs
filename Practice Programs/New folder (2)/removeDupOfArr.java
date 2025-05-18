public class removeDupOfArr {
    public static void main(String[] args) {
        /*int[] arr = {1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8};
        int len = arr.length;
        int i = 0;
        while(i < len - 1) {
            if (arr[i] == arr[i + 1]) {
                len--;
                for (int k = i + 1; k < len; k++) {
                    arr[k] = arr[k + 1];
                }
            } else {
                i++;
            }
        }
        for (int e = 0; e < len; e++) {
            System.out.print(arr[e] + ", ");
        }*/

        int[] arr = {1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8};
        int len = arr.length;
        int i = 0;
        while (i < len - 1) {
            if (arr[i] == arr[i + 1]) {
                len--;
                for (int j = i + 1; j < len; j++) {
                    arr[j] = arr[j + 1];
                }
            } else {
                i++;
            }
        }
        for (int e = 0; e < len; e++) {
            System.out.print(arr[e] + ", ");
        }
    }
}
