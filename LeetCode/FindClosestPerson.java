
public class FindClosestPerson {

    public static int findClosest(int x, int y, int z) {

        int a = x - z;
        int b = y - z;

        if (a < 0) {
            a = -a;
        }

        if (b < 0) {
            b = -b;
        }

        if (a < b) {
            return 1;
        }
        else if (b < a) {
            return 2;
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {

        int x = 2;
        int y = 7;
        int z = 4;

        System.out.println(findClosest(x, y, z));
    }
}
