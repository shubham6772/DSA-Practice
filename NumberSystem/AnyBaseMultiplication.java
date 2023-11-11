package NumberSystem;

import java.util.Scanner;

public class AnyBaseMultiplication {

    public static int singleDigitMultiplication(int first, int second, int base){
        
        int result = 0;  
        int carry = 0;
        int power = 0;

        while(first > 0 || carry > 0){
              int rem1 = first % 10;
              first /= 10;

              int d = rem1 * second + carry;
              
              carry = d / base;
              d  = d % base;

              result += d * (int) Math.pow(10, power);
              power++;
        }

        return result;
        

    }

    public static void multiplication(int first, int second, int base) {

        int result = 0;
        while (second !=0) {
            
            int rem = second % 10;
            second /= 10;

            result += singleDigitMultiplication(first, rem, base);

        }

        System.err.println(result);

        

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int fn = sc.nextInt();
        System.out.println("Enter the Second Number");
        int sn = sc.nextInt();

        System.out.println("Enter their base");
        int base = sc.nextInt();

        multiplication(fn, sn, base);

        sc.close();
    }
}
