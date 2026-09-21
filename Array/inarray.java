// Input in Array
import java.util.*;

public class inarray {
    public static void main(String args[]) {

        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Physics Marks : " + marks[0]);
        System.out.println("Chemistry Marks : " + marks[1]);
        System.out.println("Maths Marks : " + marks[2]);
    }
}
