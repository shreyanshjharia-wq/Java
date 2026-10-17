
public class validpaindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        s = s.toLowerCase();
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                str = str + ch;
            }
        }

        boolean palindrome = true;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                palindrome = false;
                break;
            }
        }

        System.out.println(palindrome);
    }
}
