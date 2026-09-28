import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char x = sc.next().charAt(0);

        if (x >= '0' && x <= '9') {
            System.out.println("IS DIGIT");
        } 
        else {
            System.out.println("ALPHA");

            if (x >= 'A' && x <= 'Z') {
                System.out.println("IS CAPITAL");
            } 
            else {
                System.out.println("IS SMALL");
            }
        }
    }
}
