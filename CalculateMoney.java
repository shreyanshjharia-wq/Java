public class CalculateMoney {
    public static void main(String[] args) {
        Solution obj = new Solution();

        int n = 10;

        System.out.println(obj.totalMoney(n));
    }
}

class Solution {
    public int totalMoney(int n) {
        int total = 0;
        int monday = 1;
        int day = 1;

        for (int i = 1; i <= n; i++) {
            total += day;
            day++;

            if (i % 7 == 0) {
                monday++;
                day = monday;
            }
        }

        return total;
    }
}
