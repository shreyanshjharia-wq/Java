// Practice: comparing strings using equals()

public class Stringfunction {
    public static void main(String[] args) {
        String S1 = "Tony";
        String S2 = "Tony";
        String S3 = new String("Tony");
        
        if (S1.equals(S3)){
            System.out.println("String are equal");
    }
    else{
        System.out.println("String are not equals");
    }
    }
    
}
