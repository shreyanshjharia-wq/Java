import java.util.*;

public class ArrayStrings {
    public static void main(String[] args) {

        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};

        String s1 = "";
        String s2 = "";

        for (int i = 0; i < word1.length; i++) {
            s1 = s1 + word1[i];
        }

        for (int i = 0; i < word2.length; i++) {
            s2 = s2 + word2[i];
        }

        System.out.println(s1.equals(s2));
    }
}
