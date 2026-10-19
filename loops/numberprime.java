
public class numberprime {
    public static void main(String[] args) {
        int n = 7;
        boolean prime = n >= 2;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}