package NumberSystem;

import java.util.Scanner;

public class AnyBaseAddition {

    public static void add(int first, int second, int base) {

        int carry = 0;
        int result = 0;
        int power = 0;

        while (first > 0 || second > 0 || carry > 0) {
            int rem1 = first % 10;
            int rem2 = second % 10;
            first /= 10;
            second /= 10;

            int d = rem1 + rem2 + carry;
            carry = d / base;
            d = d % base;

            result += d * (int) Math.pow(10, power);
            power++;
           
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the First Number");
        int fn = sc.nextInt();
        System.out.println("Enter the Second Number");
        int sn = sc.nextInt();

        System.err.println("Enter their base");
        int base = sc.nextInt();

        add(fn, sn, base);

        sc.close();
    }
}
