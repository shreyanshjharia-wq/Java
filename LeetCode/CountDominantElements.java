
public class CountDominantElements {
    public static int countDominantElements(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums.length == 1) {
                count++;
            }
            else if (i == 0) {
                if (nums[i] >= nums[i + 1]) {
                    count++;
                }
            }
            else if (i == nums.length - 1) {
                if (nums[i] >= nums[i - 1]) {
                    count++;
                }
            }
            else {
                if (nums[i] >= (nums[i - 1] + nums[i + 1]) / 2.0) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 10, 2};

        System.out.println(countDominantElements(nums));
    }
}
