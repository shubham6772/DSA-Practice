package StarPatterns;

import java.util.*;

                                                                                    // *  
                                                                                    // *    *
                                                                                    // *    *   *
                                                                                    // *    *   *   *
                                                                                    // *    *   *   *   *  

public class LeftAngle {

    public static void printLeftPattern(int x) {

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }                                                              

            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows");
        int x = sc.nextInt();

        printLeftPattern(x);

        sc.close();
    }
}
