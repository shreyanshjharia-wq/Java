public class Sortcolors{
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        // Count 0s, 1s, and 2s
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count0++;
            } else if (nums[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        int i = 0;

        // Insert 0s
        for (int j = 0; j < count0; j++) {
            nums[i++] = 0;
        }

        // Insert 1s
        for (int j = 0; j < count1; j++) {
            nums[i++] = 1;
        }

        // Insert 2s
        for (int j = 0; j < count2; j++) {
            nums[i++] = 2;
        }

        // Print sorted array
        for (int j = 0; j < nums.length; j++) {
            System.out.print(nums[j] + " ");
        }
    }
}
