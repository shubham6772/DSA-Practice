import java.util.Scanner;

public class GCD {
    
    public static void gcd (int x, int y){
        
        while (x % y != 0) {
           int rem = x % y;
            x = y ;
            y = rem;
        }

        System.out.println(y);

    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter First Value");
        int x = sc.nextInt();
        System.out.println("Enter Second Value");
        int y = sc.nextInt();

        gcd(x, y);

        sc.close();
    }
}

