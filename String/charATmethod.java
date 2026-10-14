
import java.util.*;
public class charATmethod {


    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        String firstName = "Shreyansh";
        String lastName = "Jharia";
        String fullName = firstName + " " + lastName;

        printLetters(fullName);
    }
}