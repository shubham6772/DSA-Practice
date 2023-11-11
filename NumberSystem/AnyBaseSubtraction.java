package NumberSystem;

import java.util.Scanner;

public class AnyBaseSubtraction {


    public static void subtract(int first, int second, int base){

        int result = 0;
        int carry = 0;
        int power = 0;

         while (second > 0) {
             
             int rem1 = first % 10;
             int rem2 = second % 10;
             first /= 10;
             second /= 10;

             int d = 0;
             rem1 = rem1 + carry;

             if(rem1 >= rem2){
                  carry = 0;
                  d = rem1 - rem2;
             }
             else{
                carry = -1;
                d = rem1 + base - rem2;
             }

             result += d * (int) Math.pow(10, power);
             power++;
            
         }

         System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int fn = sc.nextInt();
        System.out.println("Enter the Second Number");
        int sn = sc.nextInt();

        System.out.println("Enter their Base");
        int base = sc.nextInt();

        subtract(fn, sn, base);

        sc.close();
    }
}
