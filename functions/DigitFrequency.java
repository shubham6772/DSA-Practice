package functions;

import java.util.*;

public class DigitFrequency {

    public static void digitFreq(int num, int freq) {
        int result = 0;
        while (num != 0) {
            int digit = num % 10;
            num = num / 10;

            if (freq == digit) {
                result++;
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        int x = sc.nextInt();
        System.out.println("Enter the number which Frequency you want");
        int freq = sc.nextInt();

        digitFreq(x, freq);

        sc.close();
    }
}
