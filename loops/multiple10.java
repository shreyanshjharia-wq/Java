import java.util.*;

// Keep entering numbers until user enters a multiple of 10

public class multiple10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        do {
            System.out.println("Enter your number:");
            n = sc.nextInt();

            System.out.println(n);

            if (n % 10 == 0) {
                break;
            }

        } while (true);
    }
}