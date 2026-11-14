
import java.util.*;

public class MaximumProductDifference {
    public static void main(String[] args) {

        int[] nums = {5, 6, 2, 7, 4};

        Arrays.sort(nums);

        int n = nums.length;

        int a = nums[n - 1] * nums[n - 2];
        int b = nums[0] * nums[1];

        int ans = a - b;

        System.out.println(ans);
    }
}
