import java.util.*;
public class demmo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        char p = sc.next().charAt(0);
        char q = sc.next().charAt(0);
        char c = 'c';
        char f ='f';
        
       if(a==c){
            System.out.println("Yes");
         }
        else if (q==f){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}