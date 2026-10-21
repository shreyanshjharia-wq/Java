
import java.util.Arrays;

public class maxproductof3no {
    public static void main(String[] args) {
        int[] nums = {-7, -6, 1, 2, 5};

        Arrays.sort(nums);

        int n = nums.length;

        int first = nums[n - 1] * nums[n - 2] * nums[n - 3];

        int second = nums[0] * nums[1] * nums[n - 1];

        System.out.println(Math.max(first, second));
    }
}