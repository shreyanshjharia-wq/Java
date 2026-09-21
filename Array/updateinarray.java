
import java.util.*;

public class updateinarray {
    public static void main(String args[]) {

        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Physics Marks : " + marks[0]);
        System.out.println("Chemistry Marks : " + marks[1]);
        System.out.println("Maths Marks : " + marks[2]);

        marks[0] = 90; // Updating Physics Marks
        marks[1] = marks[2] + 1; // Updating Chemistry Marks
       

        System.out.println("Updated Physics Marks : " + marks[0]);
        System.out.println("Updated Chemistry Marks : " + marks[1]);
       

  
    }
}
