

import java.util.Scanner;

public class findthediffrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();

        int sum = 0;

        for (int i = 0; i < t.length(); i++) {
            sum += t.charAt(i);
        }

        for (int i = 0; i < s.length(); i++) {
            sum -= s.charAt(i);
        }

        System.out.println((char) sum);

        sc.close();
    }
}
