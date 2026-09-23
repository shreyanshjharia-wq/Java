import java.util.Scanner;

public class demo {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       String F1 = sc.next();
       String F2 = sc.next();
       String S1 = sc.next();
       String S2 = sc.next();
       if(S1==S2){
           System.out.print("ARE Brothers");
       }
       else{
        System.out.println("NOT");
       }
       
    }
}
