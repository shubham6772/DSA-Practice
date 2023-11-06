import java.util.Scanner;

public class LCM {
    

     public static void lcm(int x, int y){
        int original1 = x;
        int original2 = y;
        while(x % y != 0){
           int rem = x % y;
           x = y;
           y = rem;

        }

        int gcd = y;
        int lcm = (original1 * original2) / gcd;
        System.out.println(lcm);
     }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter First Value");
         int x = sc.nextInt();
         System.out.println("Enter Second Value");
         int y = sc.nextInt();

         lcm(x, y);

         sc.close();
    }
}
