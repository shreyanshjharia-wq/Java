import java.util.*;

public class MergeSortedArray {

    public static void merge(int[] arr1, int m, int[] arr2, int n) {

        int r1 = m - 1;
        int r2 = n - 1;
        int w = m + n - 1;

        while (w >= 0) {

            if (r1 >= 0 && r2 >= 0) {
                arr1[w] = arr1[r1] > arr2[r2]
                        ? arr1[r1--]
                        : arr2[r2--];
            }
            else if (r1 >= 0) {
                arr1[w] = arr1[r1--];
            }
            else {
                arr1[w] = arr2[r2--];
            }

            w--;
        }
    }

    public static void main(String[] args) {

        int arr1[] = {1, 2, 3, 0, 0, 0};
        int m = 3;

        int arr2[] = {2, 5, 6};
        int n = 3;

        merge(arr1, m, arr2, n);

        System.out.println("Merged Array:");

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}