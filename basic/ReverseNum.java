import java.util.Scanner;

public class ReverseNum {

    public static void reverseNum(int value) {
        int reverse = 0;
        int compare = value;

        while (value != 0) {
            int rem = value % 10;
            reverse = reverse * 10 + rem;
            value = value / 10;
        }

        // for Palindrom

        if (reverse != 0) {
            if (compare == reverse) {
                System.err.println("Palindrom");
            } else {
                System.err.println("Not Palindrom");
            }

        }

        // for Reverse
        System.out.println(reverse);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number you want to reverse: ");
        int value = sc.nextInt();
        reverseNum(value);
        sc.close();
    }
}
