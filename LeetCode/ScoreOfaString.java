
public class ScoreOfaString{

    public static int scoreOfString(String shreyansh) {

        int score = 0;

        for (int i = 0; i < shreyansh.length() - 1; i++) {

            int diff = Math.abs(shreyansh.charAt(i) - shreyansh.charAt(i + 1));

            score = score + diff;
        }

        return score;
    }

    public static void main(String[] args) {

        String shreyansh = "hello";

        System.out.println(scoreOfString(shreyansh));
    }
}
