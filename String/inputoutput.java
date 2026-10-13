//package String;

import java.util.*;

public class inputoutput {
    public static void main(String[] args) {
        // Character array vs String
        char arr[] = {'a', 'b', 'c', 'd'};
        String str = "abcd";
        String str2 = new String("xyz");
        
        // Strings are immutable

        // Taking String input
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine(); // Reads the whole line including spaces
        
        System.out.println(name);
        
    }
}