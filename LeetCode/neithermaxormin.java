
import java.util.Scanner;

public class neithermaxormin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int min = nums[0];
        int max = nums[0];

        for (int i = 0; i < n; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }

            if (nums[i] > max) {
                max = nums[i];
            }
        }

        int answer = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] != min && nums[i] != max) {
                answer = nums[i];
                break;
            }
        }

        System.out.println(answer);

        sc.close();
    }
}
