// Add Subarrays
import java.util.*;

public class addsubarrays {
    public static void printSubarrays(int numbers[]) {
        int ts = 0;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                int sum = 0; // resets for every subarray

                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                    sum += numbers[k]; // adds each element to this subarray's sum
                }

                ts++;
                System.out.println("=> sum: " + sum); // prints sum right next to subarray
            }
            System.out.println();
        }

        System.out.println("total subarrays = " + ts);
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        printSubarrays(numbers);
    }
}