// Subarray Sum: Maximum and Minimum
import java.util.*;

public class subarraysummaxmin  {
    public static void printSubarrays(int numbers[]) {
        int ts = 0;
        int maxSum = Integer.MIN_VALUE; // -\infty se start
        int minSum = Integer.MAX_VALUE; // +\infty se start

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                int sum = 0;

                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                    sum += numbers[k];
                }

                ts++;
                System.out.println("=> sum: " + sum);

                // Update Maximum Sum
                if (sum > maxSum) {
                    maxSum = sum;
                }

                // Update Minimum Sum
                if (sum < minSum) {
                    minSum = sum;
                }
            }
            System.out.println();
        }

        System.out.println("total subarrays = " + ts);
        System.out.println("Maximum Subarray Sum = " + maxSum);
        System.out.println("Minimum Subarray Sum = " + minSum);
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        printSubarrays(numbers);
    }
}
