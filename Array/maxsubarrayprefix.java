import java.util.*;

public class maxsubarrayprefix {

    public static void maxsubarraysum(int numbers[]) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int prefix[] = new int[numbers.length];

        // Create prefix array
        prefix[0] = numbers[0];

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        // Find maximum subarray sum
        for (int i = 0; i < numbers.length; i++) {

            int start = i;

            for (int j = i; j < numbers.length; j++) {

                int end = j;

                if (start == 0) {
                    currSum = prefix[end];
                } else {
                    currSum = prefix[end] - prefix[start - 1];
                }

                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Max sum = " + maxSum);
    }

    public static void main(String[] args) {

        int numbers[] = {1, -2, 6, -1, 3};

        maxsubarraysum(numbers);
    }
}