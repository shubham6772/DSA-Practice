package StarPatterns;

import java.util.*;

public class InvertedLeftAngle {

    
    public static void printRightPattern(int x) {
        for (int i = x; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.err.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows");
        int x = sc.nextInt();

        printRightPattern(x);
        sc.close();
    }
}
