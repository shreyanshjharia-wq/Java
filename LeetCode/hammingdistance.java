public class hammingdistance {

    public static int hammingDistance(int x, int y) {
        int n = x ^ y;

        int count = 0;

        while (n != 0) {
            n = n & (n - 1);
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        int x = 1;
        int y = 4;

        System.out.println(hammingDistance(x, y));
    }
}