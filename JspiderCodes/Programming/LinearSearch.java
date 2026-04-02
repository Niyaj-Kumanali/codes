package JspiderCodes.Programming;
// Used to unSorted Array

public class LinearSearch {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 100, 6, 7, 17, 88};
        int key = 7;

        System.out.println(linearSearch(arr, key));
    }
}
