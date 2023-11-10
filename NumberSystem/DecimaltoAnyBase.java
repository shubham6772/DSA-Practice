package NumberSystem;

import java.util.Scanner;

public class DecimaltoAnyBase {

    public static void converter(int num, int base, int convBase) {

        int result = 0;
        int power = 0;
        while (num != 0) {
            int rem = num % convBase;
            num /= convBase;

            result += rem * (int) Math.pow(base, power);
            power++;
        }

        System.out.println(result);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        System.out.println("Enter the Base");
        int base = sc.nextInt();

        System.out.println("Enter the base you want to Conver");
        int convBase = sc.nextInt();

        converter(num, base, convBase);

        sc.close();

    }
}
