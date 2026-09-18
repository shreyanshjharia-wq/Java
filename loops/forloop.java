import java.util.*;
public class forloop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        for (int counter = 1; counter <= range; counter++) {
            System.out.println(counter);
        }
        System.out.println();
    }
}