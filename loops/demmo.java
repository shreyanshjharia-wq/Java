import java.util.*;
public class demmo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a*3<=b){
        System.out.println("Rain");
        }
        else {
            System.out.println("Dry");
        }
    }
}