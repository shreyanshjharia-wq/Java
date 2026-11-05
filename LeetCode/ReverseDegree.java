//3498. Reverse Degree of a String
//Input: s = "abc"
//Output: 148
//The reversed degree is 26 + 50 + 72 = 148.

public class ReverseDegree {

    public static int reverseDegree(String shrey) {

        int sum = 0;

        for (int i = 0; i < shrey.length(); i++) {

            int position = 26 - (shrey.charAt(i) - 'a');

            sum = sum + (position * (i + 1));
        }

        return sum;
    }

    public static void main(String[] args) {

        String shrey = "abc";

        System.out.println(reverseDegree(shrey));
    }
}
